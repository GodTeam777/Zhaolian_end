package com.zhaolian.demo.service.front.jun.Impl;

import ch.qos.logback.core.joran.spi.InterpretationContext;

import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.data.entity.UsersExample;
import com.zhaolian.demo.data.dao.BankMapper;
import com.zhaolian.demo.data.dao.EducationMapper;
import com.zhaolian.demo.data.dao.IdcardMapper;
import com.zhaolian.demo.data.dao.UsersMapper;

import com.zhaolian.demo.data.dao.*;
import com.zhaolian.demo.data.entity.*;
import com.zhaolian.demo.service.front.jun.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.math.BigDecimal;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class UserServiceimpl implements IUserService {

    @Resource
    MoneyproMapper moneyproMapper;
    @Resource
    ProorderMapper proorderMapper;
    @Resource
    BighuankuanMapper bighuankuanMapper;
    @Resource
    BigdaiMapper bigdaiMapper;
    @Resource
    BigdaiorderMapper bigdaiorderMapper;
    @Resource
    SmallhuankuanMapper smallhuankuanMapper;
    @Resource
    SmadaiLilvMapper smadaiLilvMapper;
    @Resource
    HomeMapper homeMapper;
    @Resource
    EducationMapper educationMapper;
    @Resource
    UsersMapper Usersdao;
    @Resource
    IdcardMapper idcardMapper;
    @Resource
    BankMapper bankMapper;
    @Resource
    CarMapper carMapper;
    @Resource
    SamlldaiOrderMapper samlldaiOrderMapper;
    private InterpretationContext EmptyUtil;

    //根据id查询用户
    public Users UserSelectByid(Users user){
        UsersExample ex=new UsersExample();
        ex.createCriteria().andUsersidEqualTo(user.getUsersid());
        user=Usersdao.selectByExample(ex).get(0);

        Idcard idcard=idcardMapper.selectByPrimaryKey(user.getCardid());
        user.setPetname("http://localhost:10086/img/"+idcard.getFan());


        IdcardExample iex=new IdcardExample();
        iex.createCriteria().andCardidEqualTo(user.getCardid());
        user.setCardid(new BigDecimal( idcardMapper.selectByExample(iex).get(0).getIdcard()));
        return user;
    }
    //登录
    @Override
    public Users UserLogin(String UName,Integer UPass) {
        UsersExample ex=new UsersExample();
        ex.createCriteria().andPetnameEqualTo(UName).andUspwsEqualTo(new BigDecimal(UPass)).andTypeEqualTo(new BigDecimal(1));
        Users user=Usersdao.selectByExample(ex).get(0);

        Idcard idcard=idcardMapper.selectByPrimaryKey(user.getCardid());
        user.setPetname("http://localhost:10086/img/"+idcard.getFan());

        IdcardExample iex=new IdcardExample();
        iex.createCriteria().andCardidEqualTo(user.getCardid());
        user.setCardid(new BigDecimal(idcardMapper.selectByExample(iex).get(0).getIdcard()));
        return user;
    }
    //注册
    @Override
    public int UserRegister(Users users, Idcard card, Bank b) {
        int i=0;
        //身份证
        //插入
        Idcard idcard=new Idcard();
        idcard.setName(card.getName());
        idcard.setIdcard(card.getIdcard());
        idcard.setFront(card.getFront());



        //头像
        idcard.setFan("moren.jpg");
        i=idcardMapper.insertSelective(idcard);
        if(i==0){
            return i;
        }
        //查询
        IdcardExample ides=new IdcardExample();
        ides.createCriteria().  andIdcardEqualTo(card.getIdcard());
        //插入成功的身份证idcard
        idcard=idcardMapper.selectByExample(ides).get(0);
//        //用户
        //插入
        Users user=new Users();
        user.setUname(users.getUname());
        user.setPetname(users.getPetname());
        user.setUspws(users.getUspws());
        user.setSex(users.getSex());
        user.setBirthday(users.getBirthday());

        user.setCardid(idcard.getCardid());

        user.setType(new BigDecimal(1));
        user.setStatus(new BigDecimal(1));
        user.setSmalldai(new BigDecimal(5000));
        user.setZfpws(users.getZfpws());
        user.setPhone(users.getPhone());
        i=Usersdao.insertSelective(user);

        if(i==0){
            return i;
        }
        //查询
        UsersExample usersExample=new UsersExample();
        usersExample.createCriteria().andCardidEqualTo(idcard.getCardid());
        //插入完后的用户user
        user=Usersdao.selectByExample(usersExample).get(0);

        SmadaiLilv smadaiLilv=new SmadaiLilv();
        smadaiLilv.setUsid(user.getUsersid());
        smadaiLilv.setLilv(new BigDecimal(0.097));
        //插入利率
        smadaiLilvMapper.insert(smadaiLilv);

        //银行卡
        //插入
        Bank bank=new Bank();
        bank.setBid(b.getBid());
        bank.setBankcard(b.getBankcard());
        bank.setBrankphone(b.getBrankphone());
        bank.setUsersid(user.getUsersid());
        i=bankMapper.insertSelective(bank);
        if(i==0){
            return i;
        }

        return i;
    }
    //修改登录密码
    @Override
    public int updateLoginpws(Users user){
        return Usersdao.updateByPrimaryKeySelective(user);
    }
    //修改支付
    @Override
    public int updatezfpws(Users user){
        return Usersdao.updateByPrimaryKeySelective(user);
    }
    //修改个人信息
    @Override
    public int updateuserinfo(HttpSession session, Users user, Idcard idcard){
        Users u= (Users) session.getAttribute("myuser");
        System.out.println("修改： "+user.toString());
        int i=0;
        if(idcard!=null){
            Idcard cid=idcardMapper.selectByPrimaryKey(Usersdao.selectByPrimaryKey(u.getUsersid()).getCardid());
            Idcard c=new Idcard();
            c.setCardid(cid.getCardid());
            c.setFan(idcard.getFan());

            if(cid.getFan()!=""&&cid.getFan()!="moren.jpg"){
                String path=System.getProperty("user.dir")+"\\upload\\"+cid.getFan();
                File file=new File(path);
                file.delete();
            }
            cid.setFan(idcard.getFan());


            System.out.println("业务层身份证信息："+c.toString());
            idcardMapper.updateByPrimaryKeySelective(c);
        }

        System.out.println("业务层执行修改用户信息");
        i=Usersdao.updateByPrimaryKeySelective(user);
        return i;
    }

    //添加银行卡
    @Override
    public int AddBankCard(Bank bank){
        return bankMapper.insertSelective(bank);
    }
    //查询银行卡
    @Override
    public List<Bank> selectBank(Users user){
        BankExample ex=new BankExample();
//        ex.createCriteria().andUsersidEqualTo(user.getUsersid());
        ex.createCriteria().andUsersidEqualTo(new BigDecimal(33));
        List<Bank> list=bankMapper.selectByExample(ex);
        return list;
    }



    //学历是否提交验证
    @Override
    public Education select_att_education(BigDecimal eduid){
        return educationMapper.selectByPrimaryKey(eduid);
    }

    //提交学历验证
    @Override
    public int att_education(HttpSession session,Education education){
        Users users= (Users) session.getAttribute("myuser");

        System.out.println("认证："+users.toString());
        BigDecimal id=new BigDecimal(0);
        String path="";
        if(users.getEdusersid()!=null){
            id=users.getEdusersid();
        }

        int i=educationMapper.insertSelective(education);
        EducationExample ex=new EducationExample();
        ex.createCriteria().andSpathEqualTo(education.getSpath());
        education=educationMapper.selectByExample(ex).get(0);
        Users user=(Users)session.getAttribute("myuser");

        Users u=new Users();
        u.setUsersid(user.getUsersid());
        u.setEdusersid(education.getEdusersid());
        Usersdao.updateByPrimaryKeySelective(u);

        if(new Integer(id.toString())>0) {
            education = educationMapper.selectByPrimaryKey(id);
            path = System.getProperty("user.dir") + "\\upload\\" + education.getSpath();
            File file = new File(path);
            file.delete();
            educationMapper.deleteByPrimaryKey(id);
        }
        return i;
    }

    //房屋是否提交验证
    @Override
    public Home select_att_house(BigDecimal hid){
        return homeMapper.selectByPrimaryKey(hid);
    }
    //提交房屋验证
    @Override
    public int att_house(HttpSession session,Home home){
        Users users= (Users) session.getAttribute("myuser");

        System.out.println("认证："+users.toString());
        BigDecimal id=new BigDecimal(0);
        String path="";
        if(users.getHid()!=null){
            id=users.getHid();
        }

        int i=homeMapper.insertSelective(home);

        HomeExample hex=new HomeExample();
        hex.createCriteria().andHpathEqualTo(home.getHpath());
        home=homeMapper.selectByExample(hex).get(0);

        Users u=new Users();
        u.setUsersid(users.getUsersid());
        u.setHid(home.getHid());
        Usersdao.updateByPrimaryKeySelective(u);
        if(new Integer(id.toString())>0) {
            home = homeMapper.selectByPrimaryKey(id);
            path = System.getProperty("user.dir") + "\\upload\\" + home.getHpath();
            File file = new File(path);
            file.delete();
            homeMapper.deleteByPrimaryKey(id);
        }
        return i;
    }

    //车辆是否提交验证
    @Override
    public Car select_att_car(BigDecimal cid){
        return carMapper.selectByPrimaryKey(cid);
    }
    //提交车辆验证
    @Override
    public int att_car(HttpSession session,Car car){
        Users users= (Users) session.getAttribute("myuser");
        System.out.println("认证："+users.toString());
        BigDecimal id=new BigDecimal(0);
        String path="";
            if(users.getCid()!=null){
                 id=users.getCid();
            }

        int i=carMapper.insertSelective(car);

        CarExample cex=new CarExample();
        cex.createCriteria().andCpathEqualTo(car.getCpath());
        car=carMapper.selectByExample(cex).get(0);

        Users u=new Users();
        u.setUsersid(users.getUsersid());
        u.setCid(car.getCid());
        Usersdao.updateByPrimaryKeySelective(u);

        if(new Integer(id.toString())>0) {
            car = carMapper.selectByPrimaryKey(id);
            path = System.getProperty("user.dir") + "\\upload\\" + car.getCpath();
            File file = new File(path);
            file.delete();
            carMapper.deleteByPrimaryKey(id);
        }
        return i;
    }



    //小额贷款订单查询1
    @Override
    public List<SamlldaiOrder>  selectSamllOrder(Users users,Integer pageno,Integer pagesize){
        Map<String,Object> map=new HashMap<>();
        map.put("usersid",users.getUsersid());
        int start = (pageno - 1) * pagesize + 1;
        int end = pageno * pagesize;
        map.put("startIndex", start);
        map.put("endIndex", end);
        List<SamlldaiOrder> list= samlldaiOrderMapper.selectByPage(map);
        return list;
    }
    //小额贷款订单总数
    public int geySamllOrderTotal(Users users){
        return samlldaiOrderMapper.getTotalCount(users.getUsersid());
    }


    //根据id查询小额贷款订单2
    @Override
    public List<Map>  selectSamllOrderByid(BigDecimal id){
        SamlldaiOrder samlldaiOrder= samlldaiOrderMapper.selectByPrimaryKey(id);
        List<Map> list=new ArrayList<>();
        Map<String,Object> map=null;
        Date date=samlldaiOrder.getDaiDate();
        int y=date.getYear()+1900;
        int M=date.getMonth()+1;
        int d=date.getDate()+2;
        for (int o = 1; o <=Integer.parseInt(samlldaiOrder.getYihuan().toString()) ; o++) {
            map = new HashMap<>();
            map.put("order", samlldaiOrder.getSdoid());
            map.put("yinhuan","已还");
            M += 1;
            if (M > 12) {
                y += 1;
                M = 1;
            }
            map.put("yinhuanDate",y+"-"+M+"-"+d);
            list.add(map);
        }
        for (int i = 1; i <=(Integer.parseInt(samlldaiOrder.getMou().toString())-Integer.parseInt(samlldaiOrder.getYihuan().toString())) ; i++) {
            map=new HashMap<>();
            map.put("order",samlldaiOrder.getSdoid());
            map.put("yinhuan",samlldaiOrder.getOnemoney());
            M+=1;
            if(M>12){
                y+=1;
                M=1;
            }
            map.put("yinhuanDate",y+"-"+M+"-"+d);
            list.add(map);
        }

        return list;
    }

    //查询小额贷款历史订单3
    @Override
    public List<Smallhuankuan>  selectsmallhuankuan(HttpSession session,Integer pageno,Integer pagesize){
        Users users= (Users) session.getAttribute("myuser");
        SamlldaiOrderExample sex=new SamlldaiOrderExample();
        sex.createCriteria().andUsersidEqualTo(users.getUsersid());
        List<SamlldaiOrder> list= samlldaiOrderMapper.selectByExample(sex);
        List<Smallhuankuan> alldata=new ArrayList<>();
        for (SamlldaiOrder samlldaiOrder:list){
            SmallhuankuanExample smallhuankuanExample=new SmallhuankuanExample();
            smallhuankuanExample.createCriteria().andSdoidEqualTo(samlldaiOrder.getSdoid());
            List<Smallhuankuan> huankuan=smallhuankuanMapper.selectByExample(smallhuankuanExample);
            for (int i = 0; i <huankuan.size() ; i++) {
                alldata.add(huankuan.get(i));
            }
        }
        return alldata;
    }

    //小额贷款提前还款4
    @Override
    public int addrepayment(Smallhuankuan smallhuankuan,SamlldaiOrder samlldaiOrder){
        smallhuankuanMapper.insertSelective(smallhuankuan);
        SamlldaiOrder order=samlldaiOrderMapper.selectByPrimaryKey(samlldaiOrder.getSdoid());
        samlldaiOrder.setYihuan(new BigDecimal(Integer.parseInt(samlldaiOrder.getYihuan().toString())+Integer.parseInt(order.getYihuan().toString())));
        int i=samlldaiOrderMapper.updateByPrimaryKeySelective(samlldaiOrder);
        return i;
    }

    //大额贷款订单查询1
    @Override
    public List<Map>  selectBigdaiorder(Users users){
        BigdaiorderExample bex=new BigdaiorderExample();
        bex.createCriteria().andUsersidEqualTo(users.getUsersid());
        List<Bigdaiorder> list= bigdaiorderMapper.selectByExample(bex);
        List<Map> allData=new ArrayList<>();
        Map<String,Object> map=null;
        for (Bigdaiorder bigdaiorder:list){
                map=new HashMap<>();
                Bigdai bigdai=bigdaiMapper.selectByPrimaryKey(bigdaiorder.getBdid());
                 map.put("boid",bigdaiorder.getBoid());
                 map.put("bdname",bigdai.getBdname());
                 map.put("daimoney",bigdaiorder.getBigmoney());
                 map.put("mou",bigdaiorder.getBigdaiDate());
                 map.put("yihuan",bigdaiorder.getYihuan());
                 map.put("daiDate",bigdaiorder.getDaiDate());
                 map.put("onemoney",bigdaiorder.getOnemoney());
                 map.put("status",bigdaiorder.getStatus());
                 allData.add(map);
        }

        return allData;
    }
    //根据id查询大额贷款订单2
    @Override
    public List<Map>  selectBigdaiorderByid(BigDecimal id){
        Bigdaiorder bigdaiorder= bigdaiorderMapper.selectByPrimaryKey(id);
        List<Map> list=new ArrayList<>();
        Map<String,Object> map=null;
        System.out.println(bigdaiorder.getDaiDate());
        Date date=bigdaiorder.getDaiDate();
        int y=date.getYear()+1900;
        int M=date.getMonth()+1;
        int d=date.getDate()+2;
        for (int o = 1; o <=Integer.parseInt(bigdaiorder.getYihuan().toString()) ; o++) {
            map = new HashMap<>();
            map.put("order", bigdaiorder.getBoid());
            map.put("yinhuan","已还");
            M += 1;
            if (M > 12) {
                y += 1;
                M = 1;
            }
            map.put("yinhuanDate",y+"-"+M+"-"+d);
            list.add(map);
        }
        for (int i = 1; i <=(Integer.parseInt(bigdaiorder.getBigdaiDate().toString())-Integer.parseInt(bigdaiorder.getYihuan().toString())) ; i++) {
            map=new HashMap<>();
            map.put("order",bigdaiorder.getBoid());
            map.put("yinhuan",bigdaiorder.getOnemoney());
            M+=1;
            if(M>12){
                y+=1;
                M=1;
            }
            map.put("yinhuanDate",y+"-"+M+"-"+d);
            list.add(map);
        }

        return list;
    }
    //查询大额贷款历史订单3
    @Override
    public List<Bighuankuan>  selectbighuankuan(Users users,Integer pageno,Integer pagesize){
        BigdaiorderExample bex=new BigdaiorderExample();
        bex.createCriteria().andUsersidEqualTo(users.getUsersid());
        List<Bigdaiorder> list= bigdaiorderMapper.selectByExample(bex);
        List<Bighuankuan> alldata=new ArrayList<>();
        for (Bigdaiorder bigdaiorder:list){
            BighuankuanExample bighuankuanExample=new BighuankuanExample();
            bighuankuanExample.createCriteria().andBoidEqualTo(bigdaiorder.getBoid());
            List<Bighuankuan> huankuan=bighuankuanMapper.selectByExample(bighuankuanExample);
            for (int i = 0; i <huankuan.size() ; i++) {
                alldata.add(huankuan.get(i));
            }
        }
        return alldata;
    }
    //大额贷款提前还款4
    @Override
    public int addbigrepayment(Bighuankuan bighuankuan,Bigdaiorder bigdaiorder){
        bighuankuanMapper.insertSelective(bighuankuan);
        Bigdaiorder order=bigdaiorderMapper.selectByPrimaryKey(bigdaiorder.getBoid());
        bigdaiorder.setYihuan(new BigDecimal(Integer.parseInt(bigdaiorder.getYihuan().toString())+Integer.parseInt(order.getYihuan().toString())));
        int i=bigdaiorderMapper.updateByPrimaryKeySelective(bigdaiorder);
        return i;
    }

    //购买理财产品记录
    @Override
    public List<Map> selectproOrder(Users users,int pageno,int pagesize){
        Map<String,Object> map=new HashMap<>();
        int start = (pageno - 1) * pagesize + 1;
        int end = pageno * pagesize;
        map.put("usersid",users.getUsersid());
        map.put("startIndex",start);
        map.put("endIndex",end);
        List<Proorder> list=proorderMapper.UserselectByPage(map);
        List<Map> alldata=new ArrayList<>();
        Map<String,Object> data=null;
        for (Proorder proorder:list){
            data=new HashMap<>();
            Moneypro moneypro=moneyproMapper.selectByPrimaryKey(proorder.getMpid());
            Date date=new Date();//当前日期
            Date LicaiDate=proorder.getLicaiDate();//买入时间

            //计算当前收益
            double a = (int) ((date.getTime() - LicaiDate.getTime()) / (1000*3600*24));//相差天数
            double yesterday=(new Double(proorder.getMoney().toString())*new Double(moneypro.getIncome().toString()))/365/100;
            double sum=(yesterday)*a;//计算当前收益

            //计算预计到截止日期的收益
            Date statrDate=proorder.getLicaiDate();
            Date endDate=proorder.getShouDate();
              int b = (int) ((endDate.getTime() - statrDate.getTime()) / (1000*3600*24));
            double yujisum=yesterday*b;//预计到截止日期的收益
            double amount=a+new Double(proorder.getMoney().toString());
            if(new Integer(proorder.getStatus().toString())==1){
                sum=yujisum;
            }
            if(a==0){
                yesterday=0.00;
            }
            data.put("amount",amount);//总资产
            data.put("yesterday",yesterday);//昨日收益
            data.put("Expected",yujisum);//预计到截止日期的收益
            data.put("runningyield",sum);//当前收益
            data.put("mptype",moneypro.getMptype());//产品类型
            data.put("lilv",moneypro.getIncome());//年利率

            data.put("poid",proorder.getPoid());//订单编号
            data.put("mpname",moneypro.getMpname());//产品名
            data.put("money",proorder.getMoney());//买入金额
            data.put("licaiDate",proorder.getLicaiDate());//购买时间
            data.put("zhifutype",proorder.getZhifutype());//支付方式
            data.put("shouDate",proorder.getShouDate());//截至时间
            data.put("status",proorder.getStatus());//状态
            alldata.add(data);
        }
        return alldata;
    }
    //购买理财产品记录总数
    @Override
    public int geyproOrderTotal(Users users){
        return proorderMapper.UsergetTotalCount(users.getUsersid());
    }


    //活期理财产品体现
    @Override
    public int updateproOrder(String id){
        Proorder proorder=new Proorder();
        proorder.setPoid(new BigDecimal(id));
        proorder.setStatus(new BigDecimal(1));
        proorder.setShouDate(new Date());
//        System.out.println("修改："+proorder.toString());
        return proorderMapper.updateByPrimaryKeySelective(proorder);
    }
}

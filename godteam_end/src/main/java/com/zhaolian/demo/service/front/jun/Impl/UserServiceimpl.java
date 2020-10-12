package com.zhaolian.demo.service.front.jun.Impl;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import com.zhaolian.demo.data.dao.*;
import com.zhaolian.demo.data.entity.*;
import com.zhaolian.demo.service.front.jun.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;
@Service
public class UserServiceimpl implements IUserService {

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
        ides.createCriteria().andIdcardEqualTo(card.getIdcard());
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

}

package com.zhaolian.demo.web.control.front.jun;


import com.zhaolian.demo.data.entity.*;
import com.zhaolian.demo.service.front.jun.IUserService;
import com.zhaolian.demo.web.control.front.util.PageBean;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class UsersControl {
    @Resource
    IUserService userService;


    String img1="";
    String img2="";


    //注册
    @RequestMapping("register")
    public @ResponseBody int UsersReigster(@RequestBody Map data) throws ParseException {
        Idcard idcard=new Idcard();
        idcard.setName((String) data.get("name"));
        idcard.setIdcard((String) data.get("idcard"));
        idcard.setFront(this.img1);

        Users user=new Users();
        user.setUname((String) data.get("uname"));
        user.setPetname((String) data.get("petname"));
        user.setUspws(new BigDecimal((String)data.get("uspws")));
        user.setSex((String) data.get("sex"));
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        user.setBirthday(format.parse((String) data.get("birthday")));
        user.setZfpws(new BigDecimal((String)data.get("zfpws")));
        Long l= (Long) data.get("phone");
        user.setPhone(l.toString());

        Bank bank=new Bank();
        bank.setBid(new BigDecimal((String)data.get("bid")));
        bank.setBankcard(new BigDecimal((String)data.get("bankcard")));

        bank.setBrankphone((String) data.get("brankphone"));
        int i=userService.UserRegister(user,idcard,bank);
        System.out.println(i);
        this.img1="";
        this.img2="";
        return i;
    }

    //登录
    @RequestMapping("Login")
        public @ResponseBody
    Users UsersLogin(HttpSession session,@RequestBody Map data) {
        this.img1="";
        this.img2="";
        System.out.println("进入控制器");
        System.out.println("传输的数据："+data.toString());
        Users user=null;
        try {
             user=userService.UserLogin((String)data.get("petname"),Integer.parseInt((String)data.get("uspws")));
            System.out.println("会话："+session.toString());
            session.setAttribute("myuser",user);
            System.out.println(user.toString());
        }catch (Exception e){
          e.printStackTrace();
            user=new Users();
            user.setUsersid(new BigDecimal(-1));
            return user;
        }
            return user;
    }

    //注销
    @RequestMapping("logout")
    public void LoginOut(HttpSession session){
        Users users=new Users();
        users.setUsersid(new BigDecimal(-1));
        session.setAttribute("myuser",users);
    }

    //刷新页面
    @RequestMapping("refresh")
    public @ResponseBody
    Users Usersrefresh(HttpSession session) {
        this.img1="";
        this.img2="";
        System.out.println("进入控制器:刷新页面");
        System.out.println("会话："+session.toString());
        Users user= (Users) session.getAttribute("myuser");
        if(user==null){
            user=new Users();
            user.setUsersid(new BigDecimal(-1));
        }else{
            user=userService.UserSelectByid(user);
            session.setAttribute("myuser",user);
        }
        return user;
}

    @RequestMapping("updatedlmm")
    //修改密码（登录密码）
    public @ResponseBody int updateLoginpws(@RequestBody Map data,HttpSession session){
        Users myuser= (Users) session.getAttribute("myuser");
        int i=0;
        System.out.println(myuser.toString());
      if(myuser.getUspws().toString().equals(data.get("OPassword").toString())){
          Users user=new Users();
          user.setUsersid(myuser.getUsersid());
          user.setUspws(new BigDecimal((String)data.get("NewPassword")));
          i=userService.updateLoginpws(user);
          return i;
      }
        return i;
    }


    //添加银行卡
    @RequestMapping("AddBankCard")
    public @ResponseBody int AddBankCard(@RequestBody Map data,HttpSession session){
        Users users= (Users) session.getAttribute("myuser");
        Bank bank=new Bank();
        bank.setUsersid(users.getUsersid());
        bank.setBankcard(new BigDecimal(data.get("brankcard").toString()));
        bank.setBid(new BigDecimal(data.get("region").toString()));
        bank.setBrankphone(data.get("brankphone").toString());
        System.out.println("添加银行卡："+bank.toString());
        return userService.AddBankCard(bank);
    }



    //修改密码（支付密码）
    @RequestMapping("updatezfpws")
    public @ResponseBody int updatezfpws(@RequestBody Map data,HttpSession session){
        System.out.println("修改登录密码");
        Users myuser= (Users) session.getAttribute("myuser");
        int i=0;
        if(myuser.getZfpws().toString().equals(data.get("Ozfpws").toString())){
            Users user=new Users();
            user.setUsersid(myuser.getUsersid());
            user.setZfpws(new BigDecimal((String)data.get("Newzfpwsd")));
            i=userService.updatezfpws(user);
            return i;
        }
        return i;
    }

    //修改个人信息
    @RequestMapping("UpdateUserinfo")
    public @ResponseBody int updateuserinfo(@RequestBody Map data,HttpSession session) throws ParseException {
        System.out.println("进入修改控制器");
        Idcard idcard=null;
        if(this.img1!=""){
            idcard=new Idcard();
            idcard.setFan(this.img1);
        }
        Users myuser= (Users) session.getAttribute("myuser");
        System.out.println("修改： "+myuser.toString());
        Users user=new Users();
        user.setUsersid(myuser.getUsersid());
        user.setUname((String) data.get("name"));
        user.setSex((String) data.get("radio"));
        user.setPhone((String) data.get("phone"));
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Date date=format.parse((String) data.get("birthday"));
        date.setDate(new Integer(date.getDate())+1);
        user.setBirthday(date);
        System.out.println(user.toString());
        return userService.updateuserinfo(session,user,idcard);
    }

    //图片上传
    @RequestMapping("upload")
    public @ResponseBody
        String upload(@RequestParam("file") MultipartFile upload,HttpSession session) {
        //获得项目相对路径
        String path=System.getProperty("user.dir");
//        File file=new File(path);
//        System.out.println("文件夹路径："+path);
//        if(file.exists()) {
//            System.out.println("文件夹存在");
//        }else{
//            System.out.println("文件夹不存在,创建文件夹");
//        }
        String originalFileName = upload.getOriginalFilename();//获取原始图片的扩展名
        String newFileName = UUID.randomUUID()+originalFileName;//生成新的图片名字（存入数据库）
        String newFilePath=path+"/upload/"+newFileName; //新文件的路径
//        System.out.println("图片名字："+originalFileName);
//        System.out.println("新名字："+newFileName);
//        System.out.println("要保存的路径："+newFilePath);
        if(this.img1==""){
            System.out.println("第一张图片");
            this.img1=newFileName;
        }else{
            System.out.println("第二张图片");
            this.img2 = newFileName;
        }
        try {
            System.out.println("保存图片");
            upload.transferTo(new File(newFilePath));//将传来的文件写入新建的文件
            System.out.println("上传图片成功进行上传文件测试");
            return newFileName;
        }catch (IllegalStateException e ) {
            //处理异常
            System.out.println("错误一");
        }catch(IOException e1){
            //处理异常
            System.out.println("错误二");
        }
        return "失败";
    }

    //查询银行卡
    @RequestMapping("selectBank")
    public @ResponseBody
    List<Bank> selectBank(HttpSession session){
        Users user= (Users) session.getAttribute("myuser");
        List<Bank> Banks=userService.selectBank(user);
        return Banks;
    }


    //学历是否提交验证
    @RequestMapping("select_att_education")
    public @ResponseBody Education  select_att_education(HttpSession session){
        Users users= (Users) session.getAttribute("myuser");
        Education education=null;
        if(users.getEdusersid()!=null){
            if(new Integer(users.getEdusersid().toString())>0) {
                education = userService.select_att_education(users.getEdusersid());
                education.setSpath("http://localhost:10086/img/"+education.getSpath());
                System.out.println("学历信息："+education.toString());
                return education;
            }
        }
        return education;
    }
    //提交学历验证
    @RequestMapping("att_education")
    public @ResponseBody int att_education(@RequestBody Map data,HttpSession session) throws ParseException {
        Education education=new Education();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        education.setSpath(this.img1);
        education.setSchoolname((String) data.get("schoolname"));

        date=format.parse((String) data.get("startDate"));
        date.setDate(new Integer(date.getDate())+1);
        education.setBeginDate(date);

        date=format.parse((String) data.get("endDate"));
        date.setDate(new Integer(date.getDate())+1);
        education.setEndDate(date);

        education.setNdate(new Date());

        education.setDegree((String) data.get("degree"));
        education.setStatus(new BigDecimal(0));
        System.out.println(education.toString());
        int i=userService.att_education(session,education);
        return i;
    }

    //房屋是否提交验证
    @RequestMapping("select_att_house")
    public @ResponseBody
    Home select_att_house(HttpSession session){
        Users users= (Users) session.getAttribute("myuser");
        Home home=null;
        if(users.getHid()!=null){
            if(new Integer(users.getEdusersid().toString())>0) {
                home = userService.select_att_house(users.getHid());
                home.setHpath("http://localhost:10086/img/"+home.getHpath());
                System.out.println("学历信息："+home.toString());
                return home;
            }
        }
        return home;
    }
    //提交房屋验证
    @RequestMapping("att_house")
    public @ResponseBody int att_house(@RequestBody Map data,HttpSession session) throws ParseException {
        Home home=new Home();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        home.setHpath(this.img1);
        home.setHname((String) data.get("hname"));

        date=format.parse((String) data.get("hdate"));
        date.setDate(new Integer(date.getDate())+1);
        home.setHdate(date);

        home.setHaddress((String) data.get("haddress"));
        home.setStatus(new BigDecimal(0));
        System.out.println(home.toString());
        int i=userService.att_house(session,home);
        return i;
    }

    //车辆是否提交验证
    @RequestMapping("select_att_car")
    public @ResponseBody
    Car select_att_car(HttpSession session){
        Users users= (Users) session.getAttribute("myuser");
        Car car=null;
        if(users.getCid()!=null){
            if(new Integer(users.getCid().toString())>0) {
                car = userService.select_att_car(users.getCid());
                car.setCpath("http://localhost:10086/img/"+car.getCpath());
                System.out.println("学历信息："+car.toString());
                return car;
            }
        }
        return car;
    }
    //提交车辆验证
    @RequestMapping("att_car")
    public @ResponseBody int att_car(@RequestBody Map data,HttpSession session) throws ParseException {
        Car car=new Car();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        car.setCpath(this.img1);
        car.setCarbrand((String) data.get("carbran"));
        car.setCarid((String) data.get("carid"));
        car.setCaraddress((String) data.get("caraddress"));
        car.setNdate(new Date());
        car.setStatus(new BigDecimal(0));
        System.out.println(car.toString());
        int i=userService.att_car(session,car);
        return i;
    }



    //查询小额贷款订单
    @RequestMapping("selectSaollOrder")
    public @ResponseBody PageBean<SamlldaiOrder> selectSaollOrder(@RequestBody Map data,HttpSession session){
        Users users= (Users) session.getAttribute("myuser");
        int no= (int) data.get("pageno");
        int size= (int) data.get("pagesize");
        List<SamlldaiOrder> list=userService.selectSamllOrder(users,no,size);
        System.out.println(list.toString());
        PageBean<SamlldaiOrder> pb=new PageBean();
        pb.setData(list);
        pb.setPageNo(no);
        pb.setPageSize(size);
        pb.setTotalRecords(userService.geySamllOrderTotal(users));
        System.out.println(pb);
        return pb;
    }

    //根据id查询小额贷款订单
    @RequestMapping("selectSaollOrderByid")
    public @ResponseBody List<Map> selectSaollOrderByid(@RequestBody Map data){
        List<Map> list=userService.selectSamllOrderByid(new BigDecimal(data.get("id").toString()));
        System.out.println(list.toString());
        return list;
    }

    //查询小额历史订单
    @RequestMapping("selectsmallhuankuan")
    public @ResponseBody List<Smallhuankuan> selectsmallhuankuan(@RequestBody Map data,HttpSession session){
        List<Smallhuankuan> list=userService.selectsmallhuankuan(session,1,2);
        return list;
    }

    //小额贷款提前还款
    @RequestMapping("addrepayment")
    public @ResponseBody int addrepayment(@RequestBody Map data,HttpSession session){
        Smallhuankuan smallhuankuan=new Smallhuankuan();
        smallhuankuan.setSdoid(new BigDecimal(data.get("id").toString()));
        smallhuankuan.setZhifutype((String) data.get("zftype"));
        smallhuankuan.setMoney(new BigDecimal(data.get("sum").toString()));
        Date date=new Date();
        int y=date.getYear()+1900;
        int M=date.getMonth()+1;
        int d=date.getDate();
        int h=date.getHours();
        int m=date.getMinutes();
        int s=date.getSeconds();
        String datetime=y+""+M+""+d+""+h+""+m+""+s;
        smallhuankuan.setHuanDate(date);
        smallhuankuan.setLiushui(new BigDecimal(datetime));

        SamlldaiOrder samlldaiOrder=new SamlldaiOrder();
        samlldaiOrder.setSdoid(new BigDecimal(data.get("id").toString()));
        samlldaiOrder.setYihuan(new BigDecimal(data.get("yihuannum").toString()));
        System.out.println("添加:"+smallhuankuan.toString());
        System.out.println("修改:"+samlldaiOrder.toString());
        int i=userService.addrepayment(smallhuankuan,samlldaiOrder);

        return i;
    }


    //查询大额贷款订单
    @RequestMapping("selectBigdaiOrder")
    public @ResponseBody List<Map> selectBigdaiOrder(@RequestBody Map data,HttpSession session){
        Users users= (Users) session.getAttribute("myuser");
        List<Map> list=userService.selectBigdaiorder(users);
        System.out.println(list.toString());
        return list;
    }

    //根据id查询大额贷款订单
    @RequestMapping("selectBigdaiOrderByid")
    public @ResponseBody List<Map> selectBigdaiOrderByid(@RequestBody Map data){
        List<Map> list=userService.selectBigdaiorderByid(new BigDecimal(data.get("id").toString()));
        System.out.println(list.toString());
        return list;
    }

    //查询大额历史订单
    @RequestMapping("selectbighuankuan")
    public @ResponseBody List<Bighuankuan> selectbighuankuan(@RequestBody Map data,HttpSession session){
        Users users= (Users) session.getAttribute("myuser");
        List<Bighuankuan> list=userService.selectbighuankuan(users,1,2);
        return list;
    }

    //大额贷款提前还款
    @RequestMapping("addbigrepayment")
    public @ResponseBody int addbigrepayment(@RequestBody Map data,HttpSession session){
        Bighuankuan bighuankuan=new Bighuankuan();
        bighuankuan.setBoid(new BigDecimal(data.get("id").toString()));
        bighuankuan.setZhifutype((String) data.get("zftype"));
        bighuankuan.setMoney(new BigDecimal(data.get("sum").toString()));
        Date date=new Date();
        int y=date.getYear()+1900;
        int M=date.getMonth()+1;
        int d=date.getDate();
        int h=date.getHours();
        int m=date.getMinutes();
        int s=date.getSeconds();
        String datetime=y+""+M+""+d+""+h+""+m+""+s;
        bighuankuan.setHuanDate(date);
        bighuankuan.setLiushui(new BigDecimal(datetime));

        Bigdaiorder bigdaiorder=new Bigdaiorder();
        bigdaiorder.setBoid(new BigDecimal(data.get("id").toString()));
        bigdaiorder.setYihuan(new BigDecimal(data.get("yihuannum").toString()));
        System.out.println("添加:"+bighuankuan.toString());
        System.out.println("修改:"+bigdaiorder.toString());
        int i=userService.addbigrepayment(bighuankuan,bigdaiorder);

        return i;
    }


    //理财产品购买记录
    @RequestMapping("selectproOrder")
    public @ResponseBody PageBean<Map> selectproOrder(@RequestBody Map data,HttpSession session){
        Users users= (Users) session.getAttribute("myuser");
        int no= (int) data.get("pageno");
        int size= (int) data.get("pagesize");
        List<Map> list=userService.selectproOrder(users,no,size);
        PageBean<Map> pb=new PageBean<>();
        pb.setData(list);
        pb.setPageNo(no);
        pb.setPageSize(size);
        pb.setTotalRecords(userService.geyproOrderTotal(users));
        return pb;
    }


    @RequestMapping("Test")

    public @ResponseBody
    File Test(HttpSession sessios) {
        String path=System.getProperty("user.dir")+"\\upload\\"+"375bb4cd-5394-4216-a0e1-de174f6c297cmy.jpg";
        File file=new File(path);
        file.delete();
//        System.out.println("第三步");
//        System.out.println(data.get("petname"));
//        System.out.println(data.get("uspws"));
//        System.out.println(this.img1);
//        System.out.println(this.img2);
//        this.img1="";
//                this.img2="";
        System.out.println("返回："+path);
        return file;
    }

}

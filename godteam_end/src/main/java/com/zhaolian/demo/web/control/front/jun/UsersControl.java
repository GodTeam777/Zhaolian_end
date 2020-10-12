package com.zhaolian.demo.web.control.front.jun;


import com.zhaolian.demo.data.entity.Bank;
import com.zhaolian.demo.data.entity.Idcard;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.front.jun.IUserService;
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
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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


    @RequestMapping("updatezfpws")
    //修改密码（支付密码）
    public @ResponseBody int updatezfpws(@RequestBody Map data,HttpSession session){
        System.out.println("修改登录密码");
        Users myuser= (Users) session.getAttribute("myuser");
        int i=0;
        if(myuser.getZfpws()==data.get("Ozfpws")){
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

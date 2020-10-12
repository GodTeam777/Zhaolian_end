package com.zhaolian.demo.web.control.front.jun;


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
import java.util.Map;
import java.util.UUID;

@Controller
public class UsersControl {
    @Resource
    IUserService userService;


    String img1="";
    String img2="";

    @RequestMapping("Login")
        public @ResponseBody
    Users UsersLogin(HttpSession session,@RequestBody Map data) {
        System.out.println("进入控制器");
        System.out.println("传输的数据："+data.toString());
        Users user=userService.UserLogin((String)data.get("petname"),Integer.parseInt((String)data.get("uspws")));
        System.out.println("会话："+session.toString());
        session.setAttribute("myuser",user);
        System.out.println(user.toString());
            return user;
    }


    @RequestMapping("refresh")
    public @ResponseBody
    String Usersrefresh(HttpSession session) {
        System.out.println("进入控制器:刷新页面");
        System.out.println("会话："+session.toString());
        return "user";
}


    @RequestMapping("upload")
    public @ResponseBody
    String upload(@RequestParam("file") MultipartFile file, HttpSession session, @RequestBody Map data) {
        System.out.println("进入控制器");
        System.out.println(file.toString());
        System.out.println(data.get("file"));
        return "user";
    }

    @RequestMapping("Test")
    public @ResponseBody
        String Test(@RequestParam("file") MultipartFile upload,HttpSession session) {
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
        }else {
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


    @RequestMapping("Testt")
    public @ResponseBody
    File Test(HttpSession sessios) {
        String path=System.getProperty("user.dir")+"\\upload\\"+"c909bf30-849c-448c-bc5b-3d374401a987luluxiu.jpg";
        File file=new File(path);
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

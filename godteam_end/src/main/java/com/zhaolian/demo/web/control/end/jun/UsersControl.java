package com.zhaolian.demo.web.control.end.jun;


import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.front.jun.IUserService;
import org.apache.catalina.User;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

@Controller
public class UsersControl {
    @Resource
    IUserService userService;

    @RequestMapping("Login")
        public @ResponseBody
    Users UsersLogin(HttpSession session,@RequestBody Map data) {
        System.out.println("进入控制器");
        System.out.println("传输的数据："+data.toString());
//        Users user=userService.UserLogin((String)data.get("petname"),Integer.parseInt((String)data.get("uspws")));
        Users user=new Users();
        int i=4;
        user.setUsersid(new BigDecimal(4));
        user.setUname("王五");
        System.out.println("会话："+session.toString());
        session.setAttribute("myuser",user);
        System.out.println(user.toString());
            return user;
    }


    @ModelAttribute
    public void aa(HttpSession session){

    }

    @RequestMapping("refresh")
    public @ResponseBody
    Users Usersrefresh(HttpSession session) {
        System.out.println("进入控制器:刷新页面");
        System.out.println("会话："+session.toString());
    Users user=(Users) session.getAttribute("myuser");
        System.out.println("会话数据");
        System.out.println(session.getAttribute("myuser"));
        return user;
}


    @RequestMapping("upload")
    public @ResponseBody
    String upload(@RequestParam("file") MultipartFile file, HttpSession session, @RequestBody Map data) {
        System.out.println("进入控制器");
        System.out.println(file.toString());
        System.out.println(data.get("file"));
        return "user";
    }

    @RequestMapping(value = "Test",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public @ResponseBody
        String Test(@RequestParam("file") MultipartFile upload,HttpServletRequest request) {
        String path=request.getSession().getServletContext().getRealPath("upload");
        File file=new File(path);

        String originalFileName = upload.getOriginalFilename();//获取原始图片的扩展名
        String newFileName = UUID.randomUUID()+originalFileName;
        String newFilePath=path+"\\"+newFileName; //新文件的路径
        System.out.println("图片名字："+originalFileName);
        System.out.println("新名字："+newFileName);
        System.out.println("要保存的路径："+newFilePath);


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
        //request.getSession().getServletContext().getRealPath("Upload")
        return "hhhhhh";
    }
}

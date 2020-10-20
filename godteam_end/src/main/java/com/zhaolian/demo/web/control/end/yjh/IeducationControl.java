package com.zhaolian.demo.web.control.end.yjh;

import com.zhaolian.demo.data.entity.Education;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.end.yjh.impl.Educationimpl;
import com.zhaolian.demo.service.util.PageBean;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;

@Controller
public class IeducationControl {
    @Resource
    Educationimpl service;


    //跨域分页
    @RequestMapping(value="queryPages")
    public @ResponseBody
    PageBean<Education>
    queryPages(PageBean page){
        PageBean<Education> pageBeans =
                this.service.queryReturnPage(page.getPageNo(),
                        page.getPageSize());
        return pageBeans;

    }
    //审核认证通过
    @RequestMapping(value="update",method = RequestMethod.POST)
    public @ResponseBody
    Education update(@RequestBody String content) throws UnsupportedEncodingException {
        String myContent = URLDecoder.decode(content,"utf-8");
        System.out.println("原始字符："+myContent);
        int pos = myContent.lastIndexOf("=");
        String result = myContent.substring(0, pos);
        JSONObject jsonObject = JSONObject.fromObject(result);
        Education edu= (Education) JSONObject.toBean(jsonObject,Education.class);
        System.out.println("JSON转换后的对象："+edu.toString());
        Users user=new Users();
        user.setEdusersid(edu.getEdusersid());
        System.out.println("获取的值"+edu.getEdusersid());
        //审核通过额度赋值为10000元
        user.setSmalldai(new BigDecimal(10000));
        this.service.EducationAdd(edu,user);
        return edu;
    }
    //审核认证不通过
    @RequestMapping(value="updatefalse",method = RequestMethod.POST)
    public @ResponseBody
    Education updatefalse(@RequestBody String content) throws UnsupportedEncodingException {
        String myContent = URLDecoder.decode(content,"utf-8");
        System.out.println("原始字符："+myContent);
        int pos = myContent.lastIndexOf("=");
        String result = myContent.substring(0, pos);
        JSONObject jsonObject = JSONObject.fromObject(result);
        Education edu= (Education) JSONObject.toBean(jsonObject,Education.class);
        System.out.println("JSON转换后的对象："+edu.toString());
        //不通过执行修改状态为1
        this.service.EducationAdd(edu,null);
        return edu;
    }
}

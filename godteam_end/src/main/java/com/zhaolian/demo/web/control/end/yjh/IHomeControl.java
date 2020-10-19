package com.zhaolian.demo.web.control.end.yjh;

import com.zhaolian.demo.data.entity.Home;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.end.yjh.impl.IHomeimpl;
import com.zhaolian.demo.service.util.PageBean;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;

@Controller
public class IHomeControl {
    @Resource
    IHomeimpl service;


    //房屋分页
    @RequestMapping(value="queryPagesHome")
    public @ResponseBody
    PageBean<Home>
    queryPages(PageBean page){
        System.out.println("===========启动控制器=========");
        PageBean<Home> pageBeans =
                this.service.queryReturnPage(page.getPageNo(),
                        page.getPageSize());
        return pageBeans;
    }


    //审核认证通过
    @RequestMapping(value="updateHome",method = RequestMethod.POST)
    public @ResponseBody
    Home update(@RequestBody String content) throws UnsupportedEncodingException {
        String myContent = URLDecoder.decode(content,"utf-8");
        System.out.println("原始字符："+myContent);
        int pos = myContent.lastIndexOf("=");
        String result = myContent.substring(0, pos);
        JSONObject jsonObject = JSONObject.fromObject(result);
        Home home= (Home) JSONObject.toBean(jsonObject,Home.class);
        System.out.println("JSON转换后的对象："+home.toString());
        Users user=new Users();
        user.setHid(home.getHid());
        //审核通过额度赋值为50000元
        user.setSmalldai(new BigDecimal(30000));
        this.service.HomeUpdateandAdd(home,user);
        return home;
    }
    //审核认证不通过
    @RequestMapping(value="updateHomefalse",method = RequestMethod.POST)
    public @ResponseBody
    Home updatehomefalse(@RequestBody String content) throws UnsupportedEncodingException {
        String myContent = URLDecoder.decode(content,"utf-8");
        System.out.println("原始字符："+myContent);
        int pos = myContent.lastIndexOf("=");
        String result = myContent.substring(0, pos);
        JSONObject jsonObject = JSONObject.fromObject(result);
        Home home= (Home) JSONObject.toBean(jsonObject,Home.class);
        System.out.println("JSON转换后的对象："+home.toString());
        this.service.HomeUpdateandAdd(home,null);
        return home;
    }
}

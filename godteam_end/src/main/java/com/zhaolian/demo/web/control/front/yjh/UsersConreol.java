package com.zhaolian.demo.web.control.front.yjh;

import com.zhaolian.demo.data.entity.Education;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.front.yjh.IUsers;
import com.zhaolian.demo.service.front.yjh.impl.IUsersimpl;
import com.zhaolian.demo.service.util.PageBean;
import com.zhaolian.demo.web.util.SearchUsersDTO;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UsersConreol{
    @Resource
    IUsersimpl serve;

    //跨域分页
    @RequestMapping(value="queryPagesUsers",method = RequestMethod.POST)
    public @ResponseBody
    PageBean<Users>
    queryPages(@RequestBody Map<String,Object> news_map){
        System.out.println("===========启动控制器=========");
        Integer pageNo = (Integer)news_map.get("pageNumber");
        Integer pageSize = (Integer)news_map.get("pageSize");
        SearchUsersDTO dto=new SearchUsersDTO();
        dto.setSearch_name(String.valueOf(news_map.get("search_name")));
        PageBean<Users> pageBeans =
                this.serve.getByPage(dto,pageNo,pageSize);
        System.out.println("控制器查询记录==========="+pageBeans.toString());
        return pageBeans;
        }



        //按编号查询一条记录
        @RequestMapping(value="queryUserById",method = RequestMethod.GET)
        public @ResponseBody  Users select (String id){
            System.out.println("传递的id:"+id);
        Users user=this.serve.selectByid(new Integer(id));
        return user;
        }
        //修改小额贷款额度
    @RequestMapping(value="updatedaikuan",method = RequestMethod.POST)
    public @ResponseBody
     Map<String, Object> updatedaikuan(@RequestBody String smalldai) throws UnsupportedEncodingException {
        System.out.println(smalldai);
        String myContent = URLDecoder.decode(smalldai,"utf-8");
        int pos = myContent.lastIndexOf("=");
        String result = myContent.substring(0, pos);
        JSONObject jsonObject = JSONObject.fromObject(result);

         Users user = (Users) JSONObject.toBean(jsonObject, Users.class);
        //调用业务层
        boolean isFlag= this.serve.updatedaikuan(user);
        //存入map 用于前端判断
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("flag", isFlag);
        return paramsMap;

    }
    //禁用货款
    @RequestMapping(value="Updatejinyong",method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> Updatejinyong(@RequestBody String status) throws UnsupportedEncodingException {
        String myContent = URLDecoder.decode(status,"utf-8");
        int pos = myContent.lastIndexOf("=");
        String result = myContent.substring(0, pos);
        JSONObject jsonObject = JSONObject.fromObject(result);

        Users user = (Users) JSONObject.toBean(jsonObject, Users.class);
        //调用业务层
        boolean isFlag= this.serve.updatedaikuan(user);
        //存入map 用于前端判断
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("flag", isFlag);
        return paramsMap;

    }







}

package com.zhaolian.demo.web.control.front.yjh;

import com.zhaolian.demo.data.entity.Education;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.front.yjh.IUsers;
import com.zhaolian.demo.service.front.yjh.impl.IUsersimpl;
import com.zhaolian.demo.service.util.PageBean;
import com.zhaolian.demo.web.util.SearchUsersDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UsersConreol{
    @Resource
    IUsersimpl serve;

    //跨域分页
    @RequestMapping(value="queryPagesUsers")
    public @ResponseBody
    PageBean<Users>
    queryPages(SearchUsersDTO dto, PageBean page){
        System.out.println("===========启动控制器=========");
        PageBean<Users> pageBeans =
                this.serve.getByPage(dto,page.getPageNo(),
                        page.getPageSize());
        System.out.println("控制器查询记录==========="+pageBeans.toString());
        return pageBeans;
    }




}

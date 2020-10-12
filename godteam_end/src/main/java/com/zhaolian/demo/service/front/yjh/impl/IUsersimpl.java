package com.zhaolian.demo.service.front.yjh.impl;

import com.zhaolian.demo.data.dao.*;
import com.zhaolian.demo.data.entity.*;
import com.zhaolian.demo.service.front.yjh.IUsers;
import com.zhaolian.demo.service.util.PageBean;
import com.zhaolian.demo.web.util.SearchUsersDTO;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IUsersimpl  implements IUsers {

    @Resource
    UsersMapper Usersdao;

    @Resource
    IdcardMapper Idcarddao;

    @Resource
    EducationMapper Educationdao;

    @Resource
    CarMapper Cardao;

    @Resource
    HomeMapper homedao;


    @Override
    public PageBean<Users> getByPage(SearchUsersDTO dto, Integer pageNo, Integer pageSize) {
        PageBean<Users> pb = new PageBean<Users>();
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("dto", dto);
        int start = (pageNo - 1) * pageSize + 1;
        int end = pageNo * pageSize;
        parms.put("startIndex", start);
        parms.put("endIndex", end);

        List<Users>  data=this.Usersdao.selectByPage(parms);
        pb.setData(data);
        pb.setPageNo(pageNo);
        pb.setPageSize(pageSize);
        //统计按条件查询的总记录数
        pb.setTotalRecords(this.Usersdao.getTotalCount(dto));
        return pb;
    }

    @Override
    public Users selectAll(Users user) {
        Users all=this.Usersdao.selectByPrimaryKey(user.getUsersid());


            //根据个人信息id查询车辆信息
            this.Cardao.selectByPrimaryKey(all.getCid());
            //根据个人信息id查询房产信息
            this.homedao.selectByPrimaryKey(all.getHid());

     return  all;
    }
}

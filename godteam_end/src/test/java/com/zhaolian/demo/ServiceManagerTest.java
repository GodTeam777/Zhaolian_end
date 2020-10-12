package com.zhaolian.demo;

import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.web.dto.xuan.ServiceManageDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class ServiceManagerTest {
    @Resource
    UsersMapper user;

    @Test
    public void test(){
        ServiceManageDTO dto = new ServiceManageDTO();

        dto.setSearch_name("z");
        System.out.println("数据层getByPage DTO"+dto.toString());
        //dto, pageNo, pageSize, sort, order
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("dto", dto);
        int pageNo = 1;
        int pageSize = 2;
        //第一页：pageNo:1
        //每页2条记录:pageSize:2
        int start = (pageNo - 1) * pageSize + 1;
        int end = pageNo * pageSize;

        params.put("startIndex", start);
        params.put("endIndex", end);


        List<Users> all = this.user.selectServiceByPage(params);
        System.out.println("分页结果："+all.size());
        for (Users topic : all) {
            System.out.println("姓名："+topic.getPetname());
            System.out.println("用户名："+topic.getPetname());

        }
    }
}

package com.zhaolian.demo;

import com.zhaolian.demo.data.entity.Idcard;
import com.zhaolian.demo.data.entity.SamlldaiOrder;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.front.yjh.IUsers;
import com.zhaolian.demo.service.front.yjh.impl.ISamlldaiOrderimpl;
import com.zhaolian.demo.service.front.yjh.impl.Idcardimpl;
import com.zhaolian.demo.service.util.PageBean;
import com.zhaolian.demo.web.util.SearchUsersDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class yjhTest {


//    @Resource
//    IUsers serve;

//    @Resource
//    Idcardimpl Idcarserve;


    @Resource
    ISamlldaiOrderimpl server;
    @Test
    void Mytest(){
//        SearchUsersDTO dto=new SearchUsersDTO();
//        dto.setSearch_name("小东北");
//        //查询第一页，每页2条记录
//        PageBean<Users> pb =
//                serve.getByPage(dto, 1, 100);
//        for (Users s:  pb.getData()) {
//            System.out.println("记录----------------"+s.toString());
//        }


//         Users user=new Users();
//         user.setUsersid(new BigDecimal(36));
//        Users all= serve.selectAll(user);
//        System.out.println("查询结果id:"+all.getEdusersid());

//       Idcard all= (Idcard) Idcarserve.selectByid(3);
//        System.out.println(all);

//      List<SamlldaiOrder>  all=server.selectByid(4);
//        System.out.println("查询到的记录"+all.toString());

    }



}

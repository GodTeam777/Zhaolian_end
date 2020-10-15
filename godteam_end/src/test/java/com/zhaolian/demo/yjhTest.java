package com.zhaolian.demo;

import com.zhaolian.demo.data.dao.EducationMapper;
import com.zhaolian.demo.data.entity.Education;
import com.zhaolian.demo.data.entity.Idcard;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.end.yjh.Ieducation;
import com.zhaolian.demo.service.end.yjh.impl.Idcardimpl;
import com.zhaolian.demo.service.front.yjh.impl.INewesimpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootTest
public class yjhTest {
//    @Resource
//    INewesimpl serve;

//    @Resource
//    IUsers serve;

//    @Resource
//    Idcardimpl Idcarserve;


//    @Resource
//    ISamlldaiOrderimpl server;

//    @Resource
//    ISmadaiLilv server;

    @Resource
    EducationMapper dao;

    @Test
    void Mytest() {
//        SearchUsersDTO dto = new SearchUsersDTO();
////        dto.setSearch_name("小东北");
//        //查询第一页，每页2条记录
//        PageBean<Users> pb =
//                serve.getByPageAdmin(dto, 1, 100);
//        for (Users s : pb.getData()) {
//            System.out.println("记录----------------" + s.toString());
//        }


//         Users user=new Users();
//         user.setUsersid(new BigDecimal(36));
//        Users all= serve.selectAll(user);
//        System.out.println("查询结果id:"+all.getEdusersid());

//       Idcard all= (Idcard) Idcarserve.selectByid(3);
//        System.out.println(all);

//      List<SamlldaiOrder>  all=server.selectByid(4);
//        System.out.println("查询到的记录"+all.toString());

//        SmadaiLilv a= server.selectlilv(4);
//        System.out.println(a);

//        Education user=new Education();
//        user.setEdusersid(new BigDecimal(62));
//        user.setStatus(new BigDecimal(1));
//        this.serve.updatedaikuan(user);


//                SearchUsersDTO dto=new SearchUsersDTO();
//        dto.setSearch_name("沫");
//        //查询第一页，每页2条记录
//        PageBean<Users> pb =
//                serve.getByPageService(dto, 1, 100);
//        for (Users s:  pb.getData()) {
//            System.out.println("记录----------------"+s.toString());

//        SearchUsersDTO dto = new SearchUsersDTO();
//        dto.setSearch_name("法");
//        //查询第一页，每页2条记录
//        PageBean<Users> pb =
//                serve.getByPageAdmin(dto, 1, 100);
//        for (Users s : pb.getData()) {
//            System.out.println("记录----------------" + s.toString());
//        }

//        NewesExample user=new NewesExample();
//     List<Newes> all=serve.select(user);
//        System.out.println(all.toString());
//        Education my=new Education();
//        my.setStatus(new BigDecimal(2));
//        my.setEdusersid(new BigDecimal(46));
//        this.dao.updateByPrimaryKeySelective(my);
    }
}

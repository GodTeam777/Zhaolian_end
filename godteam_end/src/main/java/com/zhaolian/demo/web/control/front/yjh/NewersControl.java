package com.zhaolian.demo.web.control.front.yjh;

import com.zhaolian.demo.data.entity.Newes;
import com.zhaolian.demo.data.entity.NewesExample;
import com.zhaolian.demo.service.front.yjh.impl.INewesimpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class NewersControl {
    @Resource
    INewesimpl serve;
     //类型1
    @RequestMapping(value = "selectAll",method = RequestMethod.GET )
    @ResponseBody
    List<Newes> selectAll(){
        System.out.println("=================启动控制器=======================");
        NewesExample newer= new NewesExample();
        List<Newes> all= this.serve.select(newer);
        System.out.println("查询记录"+all.toString());
        return all;
    }
    //类型2
    @RequestMapping(value = "selectAllType",method = RequestMethod.GET )
    @ResponseBody
    List<Newes> selectAllType(){
        System.out.println("=================启动控制器=======================");
        NewesExample newer= new NewesExample();
        List<Newes> all= this.serve.selectByType(newer);
        System.out.println("查询记录"+all.toString());
        return all;
    }
    //类型3
    @RequestMapping(value = "selectByTypeAll",method = RequestMethod.GET )
    @ResponseBody
    List<Newes> selectByTypeAll(){
        System.out.println("=================启动控制器=======================");
        NewesExample newer= new NewesExample();
        List<Newes> all= this.serve.selectType(newer);
        System.out.println("查询记录"+all.toString());
        return all;
    }

}

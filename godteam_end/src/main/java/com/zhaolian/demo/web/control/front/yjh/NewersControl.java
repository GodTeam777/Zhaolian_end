package com.zhaolian.demo.web.control.front.yjh;

import com.zhaolian.demo.data.entity.Newes;
import com.zhaolian.demo.data.entity.NewesExample;
import com.zhaolian.demo.data.entity.Users;
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


    //全部查询新闻
    @RequestMapping(value="queryMyAll",method = RequestMethod.GET)
    public @ResponseBody
    List<Newes> selectMyAll(){
        NewesExample newer= new NewesExample();
        List<Newes> all= this.serve.selectAll(newer);
        return all;
    }


    //按编号查询一条记录
    @RequestMapping(value="queryById",method = RequestMethod.GET)
    public @ResponseBody
    Newes select (String id){
        Newes newer=this.serve.SelectByid(new Integer(id));
        return newer;
    }

     //类型1
    @RequestMapping(value = "selectAll",method = RequestMethod.GET )
    @ResponseBody
    List<Newes> selectAll(){
        NewesExample newer= new NewesExample();
        List<Newes> all= this.serve.select(newer);
        return all;
    }
    //类型2
    @RequestMapping(value = "selectAllType",method = RequestMethod.GET )
    @ResponseBody
    List<Newes> selectAllType(){
        NewesExample newer= new NewesExample();
        List<Newes> all= this.serve.selectByType(newer);
        return all;
    }
    //类型3
    @RequestMapping(value = "selectByTypeAll",method = RequestMethod.GET )
    @ResponseBody
    List<Newes> selectByTypeAll(){
        NewesExample newer= new NewesExample();
        List<Newes> all= this.serve.selectType(newer);
        return all;
    }

}

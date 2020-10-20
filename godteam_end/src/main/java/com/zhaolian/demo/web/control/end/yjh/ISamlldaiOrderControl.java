package com.zhaolian.demo.web.control.end.yjh;

import com.zhaolian.demo.data.entity.SamlldaiOrder;
import com.zhaolian.demo.service.end.yjh.impl.ISamlldaiOrderimpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ISamlldaiOrderControl {
    @Resource
    ISamlldaiOrderimpl servere;


    //根据id查询货贷信息
    @RequestMapping(value="selectSamlldaiOrderByid",method = RequestMethod.GET)
    public @ResponseBody
    List<SamlldaiOrder> selectByid(String id){
        List<SamlldaiOrder>  all=this.servere.selectByid(new Integer(id));
        return all;
    }


}

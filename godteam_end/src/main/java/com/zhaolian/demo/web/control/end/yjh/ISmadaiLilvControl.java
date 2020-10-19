package com.zhaolian.demo.web.control.end.yjh;

import com.zhaolian.demo.data.entity.SmadaiLilv;
import com.zhaolian.demo.service.end.yjh.impl.ISmadaiLilvimpl;
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
public class ISmadaiLilvControl {

    @Resource
    ISmadaiLilvimpl server;
    //按编号查询利率
    @RequestMapping(value ="ISmadaiLilv")
    @ResponseBody
    SmadaiLilv selectByid(String id){
     SmadaiLilv all=   this.server.selectlilv(new Integer(id));
     return  all;
    }
    //修改利率
    @RequestMapping(value = "updatelilv" ,method = RequestMethod.POST)
    @ResponseBody
    Map<String, Object> updatelilv(@RequestBody String lilv) throws UnsupportedEncodingException {
        System.out.println("++++++++++:"+lilv);
        String myContent = URLDecoder.decode(lilv,"utf-8");
        int pos = myContent.lastIndexOf("=");
        String result = myContent.substring(0, pos);
        JSONObject jsonObject = JSONObject.fromObject(result);
        SmadaiLilv smadaiLilv = (SmadaiLilv) JSONObject.toBean(jsonObject, SmadaiLilv.class);
        boolean isFlag=this.server.updatelilv(smadaiLilv);
        //存入map
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        paramsMap.put("flag", isFlag);
        return paramsMap;
    }
}

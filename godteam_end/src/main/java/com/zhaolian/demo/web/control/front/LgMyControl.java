package com.zhaolian.demo.web.control.front;

import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.SamlldaiOrder;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.front.lg.ISmallDaiService;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LgMyControl {

    @Resource
    UsersMapper userDao;
    @Resource
    ISmallDaiService smallDaiService;

    @ModelAttribute
    public void myInit(HttpSession session){

    }

    @RequestMapping("/smalldai_home")
    public @ResponseBody
    Map smalldaihome(HttpSession session){
        Users user1 = userDao.selectByPrimaryKey(new BigDecimal(4));
        session.setAttribute("myuser",user1);
        Users user =(Users) session.getAttribute("myuser");
        Map list=smallDaiService.smallDai_home(user);
        return list;
    }

    //获得银行卡信息
    @RequestMapping("/mybankcard")
    public @ResponseBody
    List<Object> mybankcard(HttpSession session){
        Users user =(Users) session.getAttribute("myuser");
        List<Object> list=smallDaiService.smalldai_brank(user);
        return list;
    }
    //验证支付密码
    @RequestMapping("/zhifupswp")
    public @ResponseBody
    String zhifupswp(HttpSession session, @RequestBody Map data){
        Users user =(Users) session.getAttribute("myuser");
        System.out.println("前台传过来的支付密码"+data.get("zhifupws"));
        System.out.println("用户的支付密码"+(user.getZfpws().toString()));
        if ((user.getZfpws().toString()).equals(data.get("zhifupws"))){
            return "1";
        }else {
            return "0";
        }
    }

    //记录小额贷款
    @RequestMapping("/smalldaio")
    public @ResponseBody
    boolean smalldaio(HttpSession session, @RequestBody Map datas){
        Map data=(Map) datas.get("form");
        Users user =(Users) session.getAttribute("myuser");
        System.out.println("贷款记录+"+data.toString());
        //System.out.println((BigDecimal)data.get("smalldai"));
        SamlldaiOrder so=new SamlldaiOrder();
        so.setDaiDate(new Date());
        so.setDaimoney(new BigDecimal(data.get("smalldai").toString()));
        so.setOnemoney(new BigDecimal(data.get("meiri").toString()));
        so.setMou(Short.parseShort(data.get("dai_date").toString()));

        so.setHuanCard(data.get("brank2").toString());
        so.setShouCard(data.get("brank1").toString());
        so.setUsersid(user.getUsersid());
        so.setYihuan(new BigDecimal(0));
        return this.smallDaiService.smalldai(user,so);
    }

    //保存后端频道
    @RequestMapping("/websocket_end")
    public @ResponseBody
    String end_web(HttpSession session,@RequestBody String data) {
        Map m=(Map) session.getAttribute("mymapso");
        if (m==null){
            Map<String,String> maps=new HashMap<String, String>();
            maps.put("endweb",data);
            session.setAttribute("mymapso",maps);
        }else{
            m.put("endweb",data);
            session.setAttribute("mymapso",m);
        }
        return "";
    }

    //保存前端频道
    @RequestMapping("/websocket_front")
    public @ResponseBody
    String end_front(HttpSession session,@RequestBody String data) {
        Map m=(Map) session.getAttribute("mymapso");
        if (m==null){
            Map<String,String> maps=new HashMap<String, String>();
            maps.put("frontweb",data);
            session.setAttribute("mymapso",maps);
        }else{

        }
        return "";
    }
}

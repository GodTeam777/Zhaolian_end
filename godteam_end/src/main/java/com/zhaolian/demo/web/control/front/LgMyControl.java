package com.zhaolian.demo.web.control.front;

import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.SamlldaiOrder;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.front.lg.IMoneyProService;
import com.zhaolian.demo.service.front.lg.ISmallDaiService;
import com.zhaolian.demo.data.dao.CarMapper;
import com.zhaolian.demo.data.dao.EducationMapper;
import com.zhaolian.demo.data.dao.HomeMapper;
import com.zhaolian.demo.data.entity.*;
import com.zhaolian.demo.service.front.lg.IBigDaiService;
import com.zhaolian.demo.service.util.PageBean;
import com.zhaolian.demo.web.dto.lg.BigDaiDTO;
import com.zhaolian.demo.web.dto.lg.ProDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import java.util.Map;

import java.util.*;

@Controller
public class LgMyControl {

    @Resource
    UsersMapper userDao;
    @Resource
    ISmallDaiService smallDaiService;

    @Resource
    IBigDaiService bigDaiService;
    @Resource
    EducationMapper eduDao;
    @Resource
    CarMapper carDao;
    @Resource
    HomeMapper homeDao;
    @Resource
    IMoneyProService moneyPro;


    @ModelAttribute
    public void myInit(HttpSession session){

    }

    @RequestMapping("/smalldai_home")
    public @ResponseBody
    Map smalldaihome(HttpSession session){

//        Users user1 = userDao.selectByPrimaryKey(new BigDecimal(4));
//        session.setAttribute("myuser",user1);
        Users user =(Users) session.getAttribute("myuser");
        System.out.println("aaa:"+user.toString());
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


    //记录大额贷款
    @RequestMapping("/bigdaiall_home")
    public @ResponseBody
    PageBean smalldaio(@RequestBody Map query){
        System.out.println("大额贷款传递的值："+query.toString());
        BigDaiDTO dto=new BigDaiDTO();
        if(query.get("seach_type")!=null&&query.get("seach_type").toString()!=""){
        dto.setSeach_type(query.get("seach_type").toString());}
        if(query.get("seach_date")!=null&&query.get("seach_date").toString()!=""){
        dto.setSeach_date(new BigDecimal(query.get("seach_date").toString()));}
        if(query.get("seach_lilv1")!=null&&query.get("seach_lilv1").toString()!=""){
        dto.setSeach_lilv1(new BigDecimal(query.get("seach_lilv1").toString()));}
        if(query.get("seach_lilv2")!=null&&query.get("seach_lilv2").toString()!=""){
        dto.setSeach_lilv2(new BigDecimal(query.get("seach_lilv2").toString()));}
        if(query.get("seach_money1")!=null&&query.get("seach_money1").toString()!=""){
        dto.setSeach_money1(new BigDecimal(query.get("seach_money1").toString()));}
        if(query.get("seach_money2")!=null&&query.get("seach_money2").toString()!=""){
        dto.setSeach_money2(new BigDecimal(query.get("seach_money2").toString()));}
        Integer pageNo=(Integer) query.get("pageNo");
        Integer pageSize=(Integer)query.get("pageSize");
        return bigDaiService.allBigdai(dto,pageNo,pageSize);
    }

    //查看大额贷款详情
    @RequestMapping("/bigdaiall_info")
    public @ResponseBody
    Map smalldaiinfo(@RequestBody Map query){
        return bigDaiService.bigdaiinfo(new BigDecimal(query.get("bid").toString()));
    }

    @RequestMapping("/user_Renzhen")
    public @ResponseBody
    Map userRenzhen(HttpSession session){
        Map map=new HashMap();
        Users user =null;

        user =(Users) session.getAttribute("myuser");
            Education edu=eduDao.selectByPrimaryKey(user.getEdusersid());
            Car car=carDao.selectByPrimaryKey(user.getCid());
            Home home=homeDao.selectByPrimaryKey(user.getHid());
            map.put("edu",edu);
            map.put("car",car);
            map.put("home",home);

        return map;
    }

    @RequestMapping("/bigdaiimp")
    public @ResponseBody
    boolean bigdaiimp(HttpSession session,@RequestBody Map datas){
        Map form=(Map) datas.get("form");
        System.out.println("大额带跨的数据："+form.toString());
        Users  user =(Users) session.getAttribute("myuser");
        Bigdaiorder boder=new Bigdaiorder();
            boder.setBdid(new BigDecimal(form.get("bdid").toString()));
            boder.setBigmoney(new BigDecimal(form.get("smalldai").toString()));
            boder.setBigdaiDate(new BigDecimal(form.get("dai_date").toString()));
            boder.setOnemoney(new BigDecimal(form.get("meiri").toString()));
            boder.setShouCard(new BigDecimal(form.get("brank1").toString()));
            boder.setHuanCard(new BigDecimal(form.get("brank2").toString()));
        boder.setDaiDate(new Date());
        boder.setYihuan(new BigDecimal(0));
        boder.setStatus(new BigDecimal(0));
        boder.setUsersid(user.getUsersid());
        System.out.println("分装的数据+"+boder);
        return bigDaiService.bigdaiimp(user,boder);
    }

    @RequestMapping("/gundong_big")
    public @ResponseBody
    List gundong(@RequestBody Map datas){
        return bigDaiService.bigdaihository(new BigDecimal(datas.get("bid").toString()));
    }

    //理财产品
    @RequestMapping("/moneypro_home")
    public @ResponseBody
    PageBean moneypro(@RequestBody Map query){
        System.out.println("理财产品携带的值："+query.toString());
        ProDTO dto=new ProDTO();
        if(query.get("seach_mptype")!=null&&query.get("seach_mptype").toString()!=""){
            dto.setSeach_mptype(query.get("seach_mptype").toString());
        }
        if(query.get("seach_lilv1")!=null&&query.get("seach_lilv1").toString()!=""){
            dto.setSeach_lilv1(new BigDecimal(query.get("seach_lilv1").toString()));
        }
        if(query.get("seach_lilv2")!=null&&query.get("seach_lilv2").toString()!=""){
            dto.setSeach_lilv2(new BigDecimal(query.get("seach_lilv2").toString()));
        }
        if(query.get("seach_money")!=null&&query.get("seach_money").toString()!=""){
            dto.setSeach_money(new BigDecimal(query.get("seach_money").toString()));
        }
        if(query.get("seach_zhouqi")!=null&&query.get("seach_zhouqi").toString()!=""){
            dto.setSeach_zhouqi(new BigDecimal(query.get("seach_zhouqi").toString()));
        }
        Integer pageNo=(Integer) query.get("pageNo");
        Integer pageSize=(Integer)query.get("pageSize");
        return moneyPro.allpro(dto,pageNo,pageSize);
    };

    @RequestMapping("/moneypro_info")
    public @ResponseBody
    Moneypro moneyproinfo(@RequestBody Map query){
        //return moneyPro.proinfo(new BigDecimal(1));
        return moneyPro.proinfo(new BigDecimal(query.get("mpid").toString()));
    }
    @RequestMapping("/moneypro_gund")
    public @ResponseBody
    Map moneyprogund(@RequestBody Map query){
        //return moneyPro.getorder(new BigDecimal(1));
        return moneyPro.getorder(new BigDecimal(query.get("mpid").toString()));
    }

    @RequestMapping("/addmoneypro")
    public @ResponseBody
    boolean addmoneypro(@RequestBody Map query){
        Proorder order=new Proorder();
        order.setMoney(new BigDecimal(query.get("money").toString()));
        order.setMpid(new BigDecimal(query.get("mpid").toString()));
        order.setUsersid(new BigDecimal(query.get("usersid").toString()));
        order.setLicaiDate(new Date());
        order.setZhifutype(query.get("zhifutype").toString());
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date());
        rightNow.add(Calendar.MONTH, Integer.parseInt(query.get("zhouqi").toString()));
        Date dt1 = rightNow.getTime();
        order.setShouDate(dt1);
        order.setStatus(new BigDecimal(0));
        return moneyPro.charu(order);
    }
}

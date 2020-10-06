package com.zhaolian.demo.web.websocket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class Axiospoll {

    //保存对话列表
    Map<String, List> mesl=new HashMap<String, List>();

    //用户端发送消息
    @RequestMapping("/sendmsg_front")
    public @ResponseBody void sendmsg(HttpSession session, @RequestBody Map msg){
        System.out.println("获得数据"+msg.toString());
        //判断对话列表是否为空
        if (session.getAttribute("axiosmes")!=null) {
            //获得对话集合
            Map mes = (Map) session.getAttribute("axiosmes");
            //判断该用户是不是第一次发送消息
            if (mes.containsKey(msg.get("formName").toString())) {
                //代表不是第一次发消息
                //获得原有的对话
                List<AxiosMessage> is=(List<AxiosMessage>)mes.get(msg.get("formName").toString());
                //在原有的对话上添加新的对话
                AxiosMessage am=new AxiosMessage();
                am.setFormName(msg.get("formName").toString());
                am.setToName(msg.get("toName").toString());
                am.setMsg(msg.get("msg").toString());
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                am.setDate(sdf.format(new Date()));
                is.add(am);//添加
                //保存进对话集合
                mes.put("name",msg.get("formName").toString());
                mes.put("value",is);
            }else{
                //代表是第一次发消息
                List<AxiosMessage> is=new ArrayList<AxiosMessage>();
                AxiosMessage am=new AxiosMessage();
                am.setFormName(msg.get("formName").toString());
                am.setToName(msg.get("toName").toString());
                am.setMsg(msg.get("msg").toString());
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                am.setDate(sdf.format(new Date()));
                is.add(am);//添加
                mes.put(msg.get("formName").toString(),is);
            }
            //覆盖之前的会话
            session.setAttribute("axiosmes",mes);
        }else{
        //代表对话列表是空,创建一个对话集合
            Map mes = new HashMap();
            List<AxiosMessage> is=new ArrayList<AxiosMessage>();
            AxiosMessage am=new AxiosMessage();
            am.setFormName(msg.get("formName").toString());
            am.setToName(msg.get("toName").toString());
            am.setMsg(msg.get("msg").toString());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            am.setDate(sdf.format(new Date()));
            is.add(am);//添加
            mes.put(msg.get("formName").toString(),is);
            //覆盖之前的会话
            session.setAttribute("axiosmes",mes);
        }
    }


    //接收消息
    @RequestMapping("/getmsg")
    public @ResponseBody  Map getmsg(HttpSession session){
        if (session.getAttribute("axiosmes") == null) {
            return null;
        }else{
            Map mes = (Map) session.getAttribute("axiosmes");
            return mes;
        }
    }

    //客服发送消息
    @RequestMapping("/sendmsg_end")
    public @ResponseBody void sendmsg_end(HttpSession session,@RequestBody Map msg){
        //当会话不为空
        if (session.getAttribute("axiosmes") != null) {
            Map mes = (Map) session.getAttribute("axiosmes");
            //获得客服选择发给的对话
            List<AxiosMessage> is=(List<AxiosMessage>) mes.get(msg.get("toName").toString());
            //把客服发送的对话存入相应的对话集合
            AxiosMessage am=new AxiosMessage();
            am.setFormName(msg.get("formName").toString());
            am.setToName(msg.get("toName").toString());
            am.setMsg(msg.get("msg").toString());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            am.setDate(sdf.format(new Date()));
            is.add(am);//添加
            mes.put(msg.get("toName").toString(),is);
            //覆盖之前的会话
            session.setAttribute("axiosmes",mes);
        }else{
            //这里代表没人给客服发消息
        }
    }
}

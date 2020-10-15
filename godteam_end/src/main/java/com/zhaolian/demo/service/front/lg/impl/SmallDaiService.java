package com.zhaolian.demo.service.front.lg.impl;

import com.zhaolian.demo.data.dao.*;
import com.zhaolian.demo.data.entity.*;
import com.zhaolian.demo.service.front.lg.ISmallDaiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SmallDaiService implements ISmallDaiService {
    @Resource
    SmadaiLilvMapper Lilv;
    @Resource
    SamlldaiOrderMapper smaorderDao;
    @Resource
    BankMapper bankDao;
    @Resource
    AllbrankMapper allbankDao;
    @Resource
    UsersMapper userDao;
    //获得小额贷款额度，可借额度，利率，15日应还金额
    @Override
    public Map smallDai_home(Users users) {
        SmadaiLilvExample ex=new SmadaiLilvExample();
        ex.createCriteria().andUsidEqualTo(users.getUsersid());
        //得到利率
        List<SmadaiLilv> lilv =Lilv.selectByExample(ex);
        //查询小额贷款的订单
        SamlldaiOrderExample smadaiex=new SamlldaiOrderExample();
        smadaiex.createCriteria().andUsersidEqualTo(users.getUsersid());
        List<SamlldaiOrder> smadaiorderlist = smaorderDao.selectByExample(smadaiex);

        Map smadai=new HashMap<String,Object>();
        //贷款额度
        smadai.put("user",users);
        //贷款利率
        smadai.put("lilv",lilv.get(0));
        //当前可借额度
        BigDecimal smalldaicount=new BigDecimal(0);
        for (int i = 0; i <smadaiorderlist.size() ; i++) {
            int num1=smadaiorderlist.get(i).getMou();
            int num2=Integer.parseInt(smadaiorderlist.get(i).getYihuan().toString());
            if(num1>num2){
                smalldaicount=smalldaicount.add(smadaiorderlist.get(i).getDaimoney());
            }
        }
        smadai.put("newedu",users.getSmalldai().subtract(smalldaicount));
        //每月15日应还
        BigDecimal smalldaionecount=new BigDecimal(0);
        for (SamlldaiOrder order : smadaiorderlist
        ) {
            int num1=order.getMou();
            int num2=Integer.parseInt(order.getYihuan().toString());
            if(num1>num2){
                smalldaionecount=smalldaionecount.add(order.getOnemoney());
            }
        }
        smadai.put("onehuan",smalldaionecount);
        return smadai;
    }

    //获得用户绑定的银行卡信息
    @Override
    public List<Object> smalldai_brank(Users users) {
        BankExample bankex=new BankExample();
        bankex.createCriteria().andUsersidEqualTo(users.getUsersid());
        List<Bank> list=bankDao.selectByExample(bankex);
        List<Object> msg=new ArrayList<Object>();
        for (Bank bank:list
             ) {
            List<Object> childen=new ArrayList<Object>();
            childen.add(allbankDao.selectByPrimaryKey(bank.getBid()));
            childen.add(bank);
            System.out.println(childen.toString());
            msg.add(childen);
        }
        return msg;
    }

    //小额贷款实现
    @Override
    public boolean smalldai(Users users, SamlldaiOrder so) {
        boolean msg=false;
        int u2=smaorderDao.insertSelective(so);
        if (u2==1){
            msg=true;
        }
        return msg;
    }
}

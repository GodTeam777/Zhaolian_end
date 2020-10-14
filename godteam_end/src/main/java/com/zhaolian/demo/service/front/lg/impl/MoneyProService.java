package com.zhaolian.demo.service.front.lg.impl;

import com.zhaolian.demo.data.dao.MoneyproMapper;
import com.zhaolian.demo.data.dao.ProorderMapper;
import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.Moneypro;
import com.zhaolian.demo.data.entity.Proorder;
import com.zhaolian.demo.data.entity.ProorderExample;
import com.zhaolian.demo.service.front.lg.IMoneyProService;
import com.zhaolian.demo.service.util.PageBean;
import com.zhaolian.demo.web.dto.lg.ProDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class MoneyProService implements IMoneyProService {

    @Resource
    MoneyproMapper MpDao;
    @Resource
    ProorderMapper proDao;
    @Resource
    UsersMapper userDao;
    @Override
    public PageBean allpro(ProDTO dto, Integer pageNo, Integer pageSize) {
        Map parm=new HashMap();
        parm.put("dto",dto);
        Integer startIndex=(pageNo-1)*pageSize+1;
        Integer endIndex=pageNo*pageSize;
        parm.put("startIndex",new BigDecimal(startIndex));
        parm.put("endIndex",new BigDecimal(endIndex));
        List<Moneypro> list =MpDao.lgselectByPage(parm);
        PageBean pages=new PageBean();
        pages.setData(list);
        Map mapC=new HashMap();
        mapC.put("dto",dto);
        mapC.put("startIndex",1);
        mapC.put("endIndex",150);
        pages.setTotalRecords(MpDao.lgselectByPage(mapC).size());
        pages.setPageNo(pageNo);
        pages.setPageSize(pageSize);
        return pages;
    }


    @Override
    public Moneypro proinfo(BigDecimal mpid) {
        return MpDao.selectByPrimaryKey(mpid);
    }

    @Override
    public Map getorder(BigDecimal mpid) {
        Map maps=new HashMap();
        //得到该产品历史购买的记录
        ProorderExample px=new ProorderExample();
        px.createCriteria().andMpidEqualTo(mpid);
        List<Proorder> list=proDao.selectByExample(px);
        List<Map> mygund=new ArrayList<Map>();
        for (Proorder pd:list
             ) {
            Map gunditems=new HashMap();
            gunditems.put("name",userDao.selectByPrimaryKey(pd.getUsersid()).getUname());
            gunditems.put("money",pd.getMoney());
            mygund.add(gunditems);
        }
        maps.put("mygund",mygund);
        //得到产品一周的成交量记录
        List chenjiao=new ArrayList();
        for (int i = 7; i > 0; i--) {
                Date date=new Date();
                Map prams=new HashMap();
                //String dates, String datesOne,BigDecimal mpid
                prams.put("mpid",mpid);
                //获取前面的时间
                Calendar calendar1 = Calendar.getInstance();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                calendar1.add(Calendar.DATE, (1-i));
                calendar1.getTime();
                String dates=sdf.format(calendar1.getTime())+" 00:00:00";
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(Calendar.DATE, (2-i));
                calendar2.getTime();
                String datesOne=sdf.format(calendar2.getTime())+" 00:00:00";
                prams.put("dates",dates);
                prams.put("datesOne",datesOne);
                chenjiao.add(proDao.getsumbyid(prams));
        }
        maps.put("chenjiao",chenjiao);
        return maps;
    }

    @Override
    public boolean charu(Proorder order) {
        boolean msg=false;
        int u2=proDao.insertSelective(order);
        if (u2==1){
            msg=true;
        }
        return msg;
    }
}

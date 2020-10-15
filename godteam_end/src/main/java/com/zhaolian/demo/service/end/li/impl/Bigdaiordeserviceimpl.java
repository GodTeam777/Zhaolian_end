package com.zhaolian.demo.service.end.li.impl;

import com.zhaolian.demo.data.dao.BigdaiMapper;
import com.zhaolian.demo.data.dao.BigdaiorderMapper;
import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.*;
import com.zhaolian.demo.service.end.li.Bigdaiordeservice;
import com.zhaolian.demo.web.util.BigdaiordeDTO;
import com.zhaolian.demo.web.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service(value = "Bigdaioderserviceimpl")
public class Bigdaiordeserviceimpl implements Bigdaiordeservice {
    @Resource
    BigdaiorderMapper dao;
    @Resource
    UsersMapper usersMapper;
    @Resource
    BigdaiMapper bigdaiMapper;
    @Override
    public PageBean<Map> getByPage(BigdaiordeDTO dto, int pageNo, int pageSize) {
//        System.out.println("进入业务层分页和高级查询方法getByPage");

////        System.out.println("数据层getByPage   DTO"+dto.toString());
        Map<String, Object> parms = new HashMap<>();
////        parms.put("dto",dto);

        int start = (pageNo - 1) * pageSize + 1;
        int end = pageNo * pageSize;
        parms.put("startIndex", start);
        parms.put("endIndex", end);
////        pd.setRows(this.dao.selectBigdaiorderByPage(parms));
////
        List<Bigdaiorder> list = null;
        Map<String, Object> map = null;
        List<Map> alldata = null;
        PageBean<Map> pd = new PageBean<>();
        BigdaiorderExample bigdaiorderExample=new BigdaiorderExample();
        bigdaiorderExample.setOrderByClause("Boid desc");
        list = dao.selectByExample(bigdaiorderExample);
        if (dto != null) {
            if(dto.getBdname()!=null&&dto.getBdname()!=""){
                List<Bigdaiorder> max=new ArrayList<Bigdaiorder>();
                BigdaiExample bex=new BigdaiExample();
                bex.createCriteria().andBdnameLike("%"+dto.getBdname()+"%");
                List<Bigdai> bis=bigdaiMapper.selectByExample(bex);
                for (int i = 0; i <list.size() ; i++) {
                    for (int j = 0; j <bis.size() ; j++) {
                        if(bis.get(j).getBdid().equals(list.get(i).getBdid())){
                            max.add(list.get(i));
                        }
                    }
                }
                list=max;
            };
            if(dto.getStatus()!=null&&dto.getStatus()!=""){
                List<Bigdaiorder> max=new ArrayList<Bigdaiorder>();
                for (int i = 0; i <list.size() ; i++) {
                    if(list.get(i).getStatus().equals(dto.getStatus())){
                        max.add(list.get(i));
                    }
                }
                list=max;
            };
            if(dto.getUuname()!=null&&dto.getUuname()!=""){
                List<Bigdaiorder> max=new ArrayList<Bigdaiorder>();
                UsersExample ux=new UsersExample();
                ux.createCriteria().andUnameLike("%"+dto.getUuname()+"%");
                List<Users> uslist=usersMapper.selectByExample(ux);
                for (int i = 0; i <list.size() ; i++) {
                    for (int j = 0; j <uslist.size() ; j++) {
                        if(uslist.get(j).getUsersid().equals(list.get(i).getUsersid())){
                            max.add(list.get(i));
                        }
                    }
                }
                list=max;
            }
            List<Bigdaiorder> res=new ArrayList<Bigdaiorder>();
            for (int i = 0; i <list.size() ; i++) {
                if(i>=(start-1)&&i<=(end-1)){
                    res.add(list.get(i));
                }
            }

            pd.setTotal(list.size());
            list=res;
            alldata = new ArrayList<Map>();
            for (Bigdaiorder bigdaiorder : list) {
                map = new HashMap<String, Object>();
                Users users = usersMapper.selectByPrimaryKey(bigdaiorder.getUsersid());
                Bigdai bigdai = bigdaiMapper.selectByPrimaryKey(bigdaiorder.getBdid());
                map.put("boid", bigdaiorder.getBoid());
                map.put("bigmoney", bigdaiorder.getBigmoney());
                map.put("bigdaiDate", bigdaiorder.getBigdaiDate());
                map.put("yihuan", bigdaiorder.getYihuan());
                map.put("huanCard", bigdaiorder.getHuanCard());
                map.put("shouCard", bigdaiorder.getShouCard());
                map.put("daiDate",bigdaiorder.getDaiDate());
                map.put("onemoney", bigdaiorder.getOnemoney());
                map.put("status", bigdaiorder.getStatus());
                map.put("bdname", bigdai.getBdname());
                map.put("uname", users.getUname());
                alldata.add(map);
            }
        } else {
            List<Bigdaiorder> res=new ArrayList<Bigdaiorder>();
            for (int i = 0; i <list.size() ; i++) {
                if(i>=(start-1)&&i<=(end-1)){
                    res.add(list.get(i));
                }
            }
            pd.setTotal(list.size());
            list=res;
            alldata = new ArrayList<Map>();
            for (Bigdaiorder bigdaiorder : list) {
                map = new HashMap<String, Object>();
                Users users = usersMapper.selectByPrimaryKey(bigdaiorder.getUsersid());
                Bigdai bigdai = bigdaiMapper.selectByPrimaryKey(bigdaiorder.getBdid());
                map.put("boid", bigdaiorder.getBoid());
                map.put("bigmoney", bigdaiorder.getBigmoney());
                map.put("bigdaiDate", bigdaiorder.getBigdaiDate());
                map.put("yihuan", bigdaiorder.getYihuan());
                map.put("huanCard", bigdaiorder.getHuanCard());
                map.put("shouCard", bigdaiorder.getShouCard());
                map.put("daiDate", bigdaiorder.getDaiDate());
                map.put("onemoney", bigdaiorder.getOnemoney());
                map.put("status", bigdaiorder.getStatus());
                map.put("bdname", bigdai.getBdname());
                map.put("uname", users.getUname());
                alldata.add(map);
            }
        }

        pd.setPageSize(pageSize);
            pd.setRows(alldata);
            return pd;
        }


    @Override
    public   Integer updateByPrimaryKeySelective(Bigdaiorder record){
        int a= dao.updateByPrimaryKeySelective(record);
        return a;
    };
    @Override
    public  Integer deleteByPrimaryKey(BigDecimal bdid){
        int a=  dao.deleteByPrimaryKey(bdid);
        return a;
    };
}

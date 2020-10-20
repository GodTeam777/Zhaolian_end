package com.zhaolian.demo.service.end.li.impl;

import com.zhaolian.demo.data.dao.BigdaiVlidateMapper;
import com.zhaolian.demo.data.dao.MoneyproMapper;
import com.zhaolian.demo.data.dao.ProorderMapper;
import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.*;
import com.zhaolian.demo.service.end.li.Prooderservice;
import com.zhaolian.demo.web.util.BigdaiordeDTO;
import com.zhaolian.demo.web.util.PageBean;
import com.zhaolian.demo.web.util.ProoderDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "Prooderserviceimpl")
public class Prooderserviceimpl implements Prooderservice {
    @Resource
    ProorderMapper dao;
    @Resource
    UsersMapper usersMapper;
    @Resource
    MoneyproMapper moneyproMapper;
    @Override
    public PageBean<Map> getByPage(ProoderDTO dto, int pageNo, int pageSize) {
//        System.out.println("进入业务层分页和高级查询方法getByPage");

////        System.out.println("数据层getByPage   DTO"+dto.toString());
        java.util.Map<String, Object> parms = new HashMap<>();
////        parms.put("dto",dto);

        int start = (pageNo - 1) * pageSize + 1;
        int end = pageNo * pageSize;
        parms.put("startIndex", start);
        parms.put("endIndex", end);
////        pd.setRows(this.dao.selectBigdaiorderByPage(parms));
////
        List<Proorder> list = null;
        java.util.Map<String, Object> map = null;
        List<java.util.Map> alldata = null;
        PageBean<java.util.Map> pd = new PageBean<>();
        ProorderExample proorder=new ProorderExample();
        proorder.setOrderByClause("poid desc");
        list = dao.selectByExample(proorder);
        if (dto != null) {
            if(dto.getMpname()!=null&&dto.getMpname()!=""){
                List<Proorder> max=new ArrayList<Proorder>();
                MoneyproExample bex=new MoneyproExample();
                bex.createCriteria().andMpnameLike("%"+dto.getMpname()+"%");
                List<Moneypro> bis=moneyproMapper.selectByExample(bex);
                for (int i = 0; i <list.size() ; i++) {
                    for (int j = 0; j <bis.size() ; j++) {
                        if(bis.get(j).getMpid().equals(list.get(i).getMpid())){
                            max.add(list.get(i));
                        }
                    }
                }
                list=max;
            };
            if(dto.getStatus()!=null&&dto.getStatus()!=""){
                List<Proorder> max=new ArrayList<Proorder>();
                for (int i = 0; i <list.size() ; i++) {
                    if(list.get(i).getStatus().toString().equals(dto.getStatus())){
                        max.add(list.get(i));
                    }
                }
                list=max;
            };
            if(dto.getUname()!=null&&dto.getUname()!=""){
                List<Proorder> max=new ArrayList<Proorder>();
                UsersExample ux=new UsersExample();
                ux.createCriteria().andUnameLike("%"+dto.getUname()+"%");
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
            List<Proorder> res=new ArrayList<Proorder>();
            for (int i = 0; i <list.size() ; i++) {
                if(i>=(start-1)&&i<=(end-1)){
                    res.add(list.get(i));
                }
            }

            pd.setTotal(list.size());
            list=res;
            alldata = new ArrayList<java.util.Map>();
            for (Proorder bigdaiorder : list) {
                map = new HashMap<String, Object>();
                Users users = usersMapper.selectByPrimaryKey(bigdaiorder.getUsersid());
                Moneypro moneypro = moneyproMapper.selectByPrimaryKey(bigdaiorder.getMpid());
                map.put("poid", bigdaiorder.getPoid());
                map.put("money", bigdaiorder.getMoney());
                map.put("licaiDate", bigdaiorder.getLicaiDate());
                map.put("zhifutype", bigdaiorder.getZhifutype());
                map.put("shouDate", bigdaiorder.getShouDate());
                map.put("status", bigdaiorder.getStatus());
                map.put("bdname", moneypro.getMpname());
                map.put("uname", users.getUname());
                alldata.add(map);
            }
        } else {
            List<Proorder> res=new ArrayList<Proorder>();
            for (int i = 0; i <list.size() ; i++) {
                if(i>=(start-1)&&i<=(end-1)){
                    res.add(list.get(i));
                }
            }
            pd.setTotal(list.size());
            list=res;
            alldata = new ArrayList<java.util.Map>();
            for (Proorder bigdaiorder : list) {
                map = new HashMap<String, Object>();
                Users users = usersMapper.selectByPrimaryKey(bigdaiorder.getUsersid());
                Moneypro moneypro = moneyproMapper.selectByPrimaryKey(bigdaiorder.getMpid());
                map.put("poid", bigdaiorder.getPoid());
                map.put("money", bigdaiorder.getMoney());
                map.put("licaiDate", bigdaiorder.getLicaiDate());
                map.put("zhifutype", bigdaiorder.getZhifutype());
                map.put("shouDate", bigdaiorder.getShouDate());
                map.put("status", bigdaiorder.getStatus());
                map.put("bdname", moneypro.getMpname());
                map.put("uname", users.getUname());
                alldata.add(map);
            }
        }

        pd.setPageSize(pageSize);
        pd.setRows(alldata);
        return pd;
    }

    @Override
    public Integer updateByPrimaryKeySelective(Proorder record) {
int a=dao.updateByPrimaryKeySelective(record);
        return a;
    }
}

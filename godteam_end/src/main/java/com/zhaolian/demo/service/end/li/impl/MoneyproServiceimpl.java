package com.zhaolian.demo.service.end.li.impl;

import com.zhaolian.demo.data.dao.MoneyproMapper;
import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.Moneypro;
import com.zhaolian.demo.service.end.li.MoneyproService;
import com.zhaolian.demo.web.util.BigdaiDTO;
import com.zhaolian.demo.web.util.MoneyproDTO;
import com.zhaolian.demo.web.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
@Service(value = "MoneyproServiceimpl")
public class MoneyproServiceimpl implements MoneyproService {
@Resource
    MoneyproMapper dao;

    @Override
    public PageBean<Moneypro> getByPage(MoneyproDTO dto, int pageNo, int pageSize) {
        System.out.println("进入业务层分页和高级查询方法getByPage");
        PageBean<Moneypro> pd=new PageBean<>();
        System.out.println("数据层getByPage   DTO"+dto.toString());
        Map<String,Object> parms=new HashMap<>();
        parms.put("dto",dto);
        int start=(pageNo-1)*pageSize+1;
        int end=pageNo*pageSize;
        parms.put("startIndex",start);
        parms.put("endIndex",end);
        pd.setRows(this.dao.selectmoneyproByPage(parms));
        pd.setTotal(this.dao.getmoneyproCount(dto));
        pd.setPageSize(pageSize);
        return pd;
    }

    @Override
    public int updateByPrimaryKeySelective(Moneypro moneypro) {
        Moneypro  mo=dao.selectByPrimaryKey(moneypro.getMpid());
        if(mo.getMppath()!="" && moneypro.getMppath()!=null){
            System.out.println("要删除的图片"+mo.getMppath());
            System.out.println("要删除的图片"+moneypro.getMppath());
            File file=new File(System.getProperty("user.dir")+"/upload/"+mo.getMppath());
            file.delete();
        }
      int a=  dao.updateByPrimaryKeySelective(moneypro);
        return a;
    }

    @Override
    public int insert(Moneypro moneypro) {
        Moneypro  mo=dao.selectByPrimaryKey(moneypro.getMpid());
        int a=dao.insert(moneypro);
        return a;
    }

    @Override
    public int deleteByPrimaryKey(BigDecimal bdid) {
        dao.deleteByPrimaryKey(bdid);
        return 1;
    }
}

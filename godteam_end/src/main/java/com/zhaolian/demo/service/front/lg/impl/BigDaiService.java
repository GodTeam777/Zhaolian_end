package com.zhaolian.demo.service.front.lg.impl;

import com.zhaolian.demo.data.dao.BigdaiMapper;
import com.zhaolian.demo.data.dao.BigdaiVlidateMapper;
import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.BigdaiExample;
import com.zhaolian.demo.service.front.lg.IBigDaiService;
import com.zhaolian.demo.service.util.PageBean;
import com.zhaolian.demo.web.dto.lg.BigDaiDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BigDaiService implements IBigDaiService {
    @Resource
    BigdaiMapper bigdaiDao;
    @Resource
    BigdaiVlidateMapper bdvDao;
    //查询所有大额贷款产品
    @Override
    public PageBean allBigdai(BigDaiDTO dto, Integer pageNo, Integer pageSize) {
        Map parm=new HashMap();
        parm.put("dto",dto);
        Integer startIndex=(pageNo-1)*pageSize+1;
        Integer endIndex=pageNo*pageSize;
        parm.put("startIndex",new BigDecimal(startIndex));
        parm.put("endIndex",new BigDecimal(endIndex));
        List<Bigdai> allbig=bigdaiDao.lgselectByPage(parm);
        PageBean pages=new PageBean();
        List<Map> allbigandvidate=new ArrayList<Map>();
        for (Bigdai bd:allbig
             ) {
            Map<String,Object> maps=new HashMap<String, Object>();
            maps.put("big",bd);
            maps.put("vlidate",bdvDao.selectByPrimaryKey(bd.getVid()));
            allbigandvidate.add(maps);
        }
        pages.setData(allbigandvidate);
        Map mapC=new HashMap();
        mapC.put("dto",dto);
        mapC.put("startIndex",1);
        mapC.put("endIndex",150);
        pages.setTotalRecords(bigdaiDao.lgselectByPage(mapC).size());
        pages.setPageNo(pageNo);
        pages.setPageSize(pageSize);
        return pages;
    }
}

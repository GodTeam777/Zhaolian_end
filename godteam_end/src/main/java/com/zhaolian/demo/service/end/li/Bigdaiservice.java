package com.zhaolian.demo.service.end.li;

import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.web.util.BigdaiDTO;
import com.zhaolian.demo.web.util.PageBean;

import java.math.BigDecimal;

public interface Bigdaiservice {
    int daiinsert(Bigdai record);

    public PageBean<Bigdai> getByPage(BigdaiDTO dto, int pageNo, int pageSize);

    public  Integer updateByPrimaryKeySelective(Bigdai record);

    public  int deleteByPrimaryKey(BigDecimal bdid);

    public  int insert(Bigdai record);

}

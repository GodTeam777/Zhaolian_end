package com.zhaolian.demo.service.end.li;

import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.Bigdaiorder;
import com.zhaolian.demo.web.util.BigdaiordeDTO;
import com.zhaolian.demo.web.util.PageBean;

import java.math.BigDecimal;
import java.util.Map;

public interface Bigdaiordeservice {

    public PageBean<Map> getByPage(BigdaiordeDTO dto, int pageNo, int pageSize);

    public  Integer updateByPrimaryKeySelective(Bigdaiorder record);

    public  Integer deleteByPrimaryKey(BigDecimal bdid);
}

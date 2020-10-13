package com.zhaolian.demo.service.front.lg;

import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.service.util.PageBean;
import com.zhaolian.demo.web.dto.lg.BigDaiDTO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface IBigDaiService {
    //查询所有大额贷款
    public PageBean allBigdai(BigDaiDTO dto, Integer pageNo,Integer pageSize);
}

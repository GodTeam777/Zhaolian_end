package com.zhaolian.demo.service.front.lg;

import com.zhaolian.demo.data.entity.Moneypro;
import com.zhaolian.demo.data.entity.Proorder;
import com.zhaolian.demo.service.util.PageBean;
import com.zhaolian.demo.web.dto.lg.ProDTO;

import java.math.BigDecimal;
import java.util.Map;

public interface IMoneyProService {
    //查询理财产品
    public PageBean allpro(ProDTO dto, Integer pageNo, Integer pageSize);

    //根据产品id查看详情
    public Moneypro proinfo(BigDecimal mpid);

    //根据id查看历史购买的记录+近七日
    public Map getorder(BigDecimal mpid);

    //新增订单
    public boolean charu(Proorder order);
}

package com.zhaolian.demo.service.end.li;


import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.Moneypro;
import com.zhaolian.demo.web.util.BigdaiDTO;
import com.zhaolian.demo.web.util.MoneyproDTO;
import com.zhaolian.demo.web.util.PageBean;

import java.math.BigDecimal;

public interface MoneyproService {
    public PageBean<Moneypro> getByPage(MoneyproDTO dto, int pageNo, int pageSize);

    public int updateByPrimaryKeySelective(Moneypro moneypro);

    public  int insert(Moneypro moneypro);

    public  int deleteByPrimaryKey(BigDecimal bdid);
}

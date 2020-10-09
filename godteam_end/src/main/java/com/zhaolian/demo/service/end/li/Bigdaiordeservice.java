package com.zhaolian.demo.service.end.li;

import com.zhaolian.demo.data.entity.Bigdaiorder;
import com.zhaolian.demo.web.util.BigdaiordeDTO;
import com.zhaolian.demo.web.util.PageBean;

public interface Bigdaiordeservice {

    public PageBean<Bigdaiorder> getByPage(BigdaiordeDTO dto, int pageNo, int pageSize);
}

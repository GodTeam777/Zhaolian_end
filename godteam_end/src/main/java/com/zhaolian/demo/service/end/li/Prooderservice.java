package com.zhaolian.demo.service.end.li;

import com.zhaolian.demo.data.entity.BigdaiVlidate;
import com.zhaolian.demo.data.entity.Bigdaiorder;
import com.zhaolian.demo.data.entity.Proorder;
import com.zhaolian.demo.web.util.BigdaiordeDTO;
import com.zhaolian.demo.web.util.PageBean;
import com.zhaolian.demo.web.util.ProoderDTO;

import java.util.List;
import java.util.Map;

public interface Prooderservice {
    public PageBean<Map> getByPage(ProoderDTO dto, int pageNo, int pageSize);

    public  Integer updateByPrimaryKeySelective(Proorder record);

}

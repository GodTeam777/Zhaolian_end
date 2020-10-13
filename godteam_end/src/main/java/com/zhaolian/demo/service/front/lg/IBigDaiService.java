package com.zhaolian.demo.service.front.lg;

import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.Bigdaiorder;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.util.PageBean;
import com.zhaolian.demo.web.dto.lg.BigDaiDTO;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface IBigDaiService {
    //查询所有大额贷款
    public PageBean allBigdai(BigDaiDTO dto, Integer pageNo,Integer pageSize);

    //根据id查看大额贷款详情
    public Map bigdaiinfo(BigDecimal bid);

    //根据id插看产品历史申请的人
    public List bigdaihository(BigDecimal bid);

    //执行大额贷款
    public boolean bigdaiimp(Users user, Bigdaiorder boder);
}

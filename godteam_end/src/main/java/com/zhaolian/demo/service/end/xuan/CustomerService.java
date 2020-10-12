package com.zhaolian.demo.service.end.xuan;

import com.zhaolian.demo.service.util.PageBean;
import com.zhaolian.demo.web.dto.xuan.ServiceManageDTO;
import com.zhaolian.demo.web.util.CommonResult;

public interface CustomerService {
    CommonResult queryAllUsers(ServiceManageDTO dto, PageBean pageBean);
}

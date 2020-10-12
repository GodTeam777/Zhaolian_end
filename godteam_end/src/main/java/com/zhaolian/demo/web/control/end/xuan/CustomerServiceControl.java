package com.zhaolian.demo.web.control.end.xuan;

import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.end.xuan.CustomerService;
import com.zhaolian.demo.service.util.PageBean;
import com.zhaolian.demo.web.dto.xuan.ServiceManageDTO;
import com.zhaolian.demo.web.util.CommonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class CustomerServiceControl {
    @Resource
    CustomerService customerService;

    @RequestMapping(value = "queryAll")
    public CommonResult selectSolveTask(ServiceManageDTO dto, PageBean pageBean){
        System.out.println("进入查询");
        System.out.println(dto);
        System.out.println(pageBean.getPageSize());
        System.out.println(pageBean.toString());
        CommonResult commonResult = customerService.queryAllUsers(dto, pageBean);
        return commonResult;
    }
}

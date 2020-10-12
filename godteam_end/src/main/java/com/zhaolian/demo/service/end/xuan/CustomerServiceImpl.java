package com.zhaolian.demo.service.end.xuan;

import com.zhaolian.demo.data.dao.UsersMapper;
import com.zhaolian.demo.data.entity.Users;
import com.zhaolian.demo.service.util.PageBean;
import com.zhaolian.demo.web.dto.xuan.ServiceManageDTO;
import com.zhaolian.demo.web.util.CommonResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    UsersMapper userDAO;

    @Override
    public CommonResult queryAllUsers(ServiceManageDTO dto, PageBean pageBean) {
        int start = (pageBean.getPageNo()-1) * pageBean.getPageSize()+1;
        int end = pageBean.getPageNo()*pageBean.getPageSize();
        Map<String,Object> map = new HashMap<>();
        map.put("dto", dto);
        map.put("start", start);
        map.put("end", end);
        List<Users> solveTasks = userDAO.selectServiceByPage(map);

        System.out.println("查询到的结果"+solveTasks);
        Integer count = userDAO.selectQueryAndPageCount(map);

        pageBean.setData(solveTasks);
        pageBean.setTotalRecords(count);
        return new CommonResult(200,"查询成功",pageBean);
    }
}

package com.zhaolian.demo.web.control.end.li;

import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.Bigdaiorder;
import com.zhaolian.demo.service.end.li.Bigdaiordeservice;
import com.zhaolian.demo.service.end.li.Bigdaiservice;
import com.zhaolian.demo.web.util.BigdaiDTO;
import com.zhaolian.demo.web.util.BigdaiordeDTO;
import com.zhaolian.demo.web.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class Bigdaiordecontrol {
    @Resource
    Bigdaiordeservice daiService;
    @RequestMapping(value = "myByPage",method = RequestMethod.POST)
    public @ResponseBody
    PageBean<Bigdaiorder> myByPage
            (@RequestBody Map<String,Object> bigdaimap) {

        System.out.println("数据："+bigdaimap.toString());
        Integer pageNo = Integer.parseInt(bigdaimap.get("pageNumber").toString());
        Integer pageSize = Integer.parseInt(bigdaimap.get("pageSize").toString()) ;
        BigdaiordeDTO dto=new BigdaiordeDTO();
        System.out.println("进入控制器");
        System.out.println("进入查询");
        PageBean<Bigdaiorder> pb =
                this.daiService.getByPage(dto, pageNo, pageSize);
        System.out.println("分页结果PageBean:"+pb.getTotal());
        return pb;
    }
}

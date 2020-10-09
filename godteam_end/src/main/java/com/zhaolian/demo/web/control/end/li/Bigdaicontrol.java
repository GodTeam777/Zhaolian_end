package com.zhaolian.demo.web.control.end.li;

import com.github.pagehelper.Page;
import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.Newes;
import com.zhaolian.demo.service.end.li.Bigdaiservice;
import com.zhaolian.demo.web.util.BigdaiDTO;
import com.zhaolian.demo.web.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;
import javax.annotation.Resource;

@Controller
public class Bigdaicontrol {
    @Resource
    Bigdaiservice bigdaiService;

    @RequestMapping(value = "listByPage",method = RequestMethod.POST)
    public @ResponseBody
    PageBean<Bigdai> listByPage
            (@RequestBody Map<String,Object> bigdaimap) {

        System.out.println("数据："+bigdaimap.toString());
        Integer pageNo = Integer.parseInt(bigdaimap.get("pageNumber").toString());
        Integer pageSize = Integer.parseInt(bigdaimap.get("pageSize").toString()) ;
        BigdaiDTO dto=new BigdaiDTO();
        System.out.println("进入控制器");
        System.out.println("进入查询");
        PageBean<Bigdai> pb =
                this.bigdaiService.getByPage(dto, pageNo, pageSize);
        System.out.println("分页结果PageBean:"+pb.getTotal());
        return pb;
    }
    public @ResponseBody Integer daiupdate(@RequestBody Bigdai dai){
        
        return bigdaiService.updateByPrimaryKeySelective(dai);

    }
}

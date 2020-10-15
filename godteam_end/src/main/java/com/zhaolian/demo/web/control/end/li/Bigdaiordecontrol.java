package com.zhaolian.demo.web.control.end.li;
import com.zhaolian.demo.data.entity.Bigdaiorder;
import com.zhaolian.demo.service.end.li.Bigdaiordeservice;
import com.zhaolian.demo.web.util.BigdaiordeDTO;
import com.zhaolian.demo.web.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Map;

@Controller
public class Bigdaiordecontrol {
    @Resource
    Bigdaiordeservice daiService;
    @RequestMapping(value = "myByPage",method = RequestMethod.POST)
    public @ResponseBody
    PageBean<Map> myByPage
            (@RequestBody Map<String,Object> bigdaimap) {

        System.out.println("数据："+bigdaimap.toString());
        Integer pageNo = Integer.parseInt(bigdaimap.get("pageNumber").toString());
        Integer pageSize = Integer.parseInt(bigdaimap.get("pageSize").toString()) ;
        BigdaiordeDTO dto=null;
        String a=(String) bigdaimap.get("name");
        String b=(String) bigdaimap.get("aname");
        String c=(String) bigdaimap.get("stua");

        if (a!=""){
                dto=new BigdaiordeDTO();
                dto.setUuname(a);
        }
        if (b!=""){
            if(dto!=null) {
                dto.setBdname(b);
            }else{
                dto=new BigdaiordeDTO();
                dto.setBdname(b);
            }
        }
        if (c!=""){
            if(dto!=null) {
                dto.setStatus(c);
            }else{
                dto=new BigdaiordeDTO();
                dto.setStatus(c);
            }
        }

        System.out.println("进入控制器");
        System.out.println("进入查询");

        PageBean<Map> pb=this.daiService.getByPage(dto,pageNo, pageSize);
        System.out.println("分页结果PageBean:"+pb.getRows().toString());
        System.out.println("分页结果PageBean:"+pb.getTotal());
        return pb;
    }


    @RequestMapping(value = "bigdaiorderupdate",method = RequestMethod.POST)
    public @ResponseBody Integer bigdaiorderupdate(@RequestBody Bigdaiorder dai){
        dai.setStatus(new BigDecimal(1));
        System.out.println("进入修改方法");
        if(daiService.updateByPrimaryKeySelective(dai)>0){
            System.out.println("修改成功"+dai.getStatus());
        }else {
            System.out.println("修改失败");
        }
        return daiService.updateByPrimaryKeySelective(dai);

    }
    @RequestMapping(value = "bigdaiorderupdate1",method = RequestMethod.POST)
    public @ResponseBody Integer bigdaiorderupdate1(@RequestBody Bigdaiorder dai){
        dai.setStatus(new BigDecimal(2));
        System.out.println("进入修改方法");
        if(daiService.updateByPrimaryKeySelective(dai)>0){
            System.out.println("修改成功"+dai.getStatus());
        }else {
            System.out.println("修改失败");
        }
        return daiService.updateByPrimaryKeySelective(dai);

    }
}

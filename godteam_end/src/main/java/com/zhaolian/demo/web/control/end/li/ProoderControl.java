package com.zhaolian.demo.web.control.end.li;

import com.zhaolian.demo.data.entity.Bigdaiorder;
import com.zhaolian.demo.data.entity.Proorder;
import com.zhaolian.demo.service.end.li.Prooderservice;
import com.zhaolian.demo.web.util.BigdaiordeDTO;
import com.zhaolian.demo.web.util.PageBean;
import com.zhaolian.demo.web.util.ProoderDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Map;

@Controller
public class ProoderControl {
    @Resource
    Prooderservice por;
    @RequestMapping(value = "proodermyByPage",method = RequestMethod.POST)
    public @ResponseBody
    PageBean<Map> myByPage
            (@RequestBody Map<String,Object> bigdaimap) {

        System.out.println("数据："+bigdaimap.toString());
        Integer pageNo = Integer.parseInt(bigdaimap.get("pageNumber").toString());
        Integer pageSize = Integer.parseInt(bigdaimap.get("pageSize").toString()) ;
        ProoderDTO dto=null;
        String a=(String) bigdaimap.get("name");
        String b=(String) bigdaimap.get("aname");
        String c=(String) bigdaimap.get("stua");

        if (a!=""){
            dto=new ProoderDTO();
            dto.setUname(a);
        }
        if (b!=""){
            if(dto!=null) {
                dto.setMpname(b);
            }else{
                dto=new ProoderDTO();
                dto.setMpname(b);
            }
        }
        if (c!=""){
            if(dto!=null) {
                dto.setStatus(c);
            }else{
                dto=new ProoderDTO();
                dto.setStatus(c);
            }
        }

        System.out.println("进入控制器");
        System.out.println("进入查询");

        PageBean<Map> pb=this.por.getByPage(dto,pageNo, pageSize);
        System.out.println("分页结果PageBean:"+pb.getRows().toString());
        System.out.println("分页结果PageBean:"+pb.getTotal());
        return pb;
    }
    @RequestMapping(value = "prodderupdate",method = RequestMethod.POST)
    public @ResponseBody Integer bigdaiorderupdate(@RequestBody Proorder dai){
        dai.setStatus(new BigDecimal(1));
        System.out.println("进入修改方法");
        if(por.updateByPrimaryKeySelective(dai)>0){
            System.out.println("修改成功"+dai.getStatus());
        }else {
            System.out.println("修改失败");
        }
        return por.updateByPrimaryKeySelective(dai);

    }

    @RequestMapping(value = "prodderupdate1",method = RequestMethod.POST)
    public @ResponseBody Integer bigdaiorderupdate1(@RequestBody Proorder dai){
        dai.setStatus(new BigDecimal(2));
        System.out.println("进入修改方法");
        if(por.updateByPrimaryKeySelective(dai)>0){
            System.out.println("修改成功"+dai.getStatus());
        }else {
            System.out.println("修改失败");
        }
        return por.updateByPrimaryKeySelective(dai);

    }
}

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

import java.math.BigDecimal;
import java.util.List;
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
       String a= (String)bigdaimap.get("name");
        String b= (String)bigdaimap.get("type");

        System.out.println("数据："+bigdaimap);


        Integer pageNo = Integer.parseInt(bigdaimap.get("pageNumber").toString());
        Integer pageSize = Integer.parseInt(bigdaimap.get("pageSize").toString()) ;
        BigdaiDTO dto=new BigdaiDTO();
        if(a!=""){
            dto.setBdname(a);
        }
        if(b!=""){
            dto.setBdtype(b);
        }
        System.out.println("进入控制器");
        System.out.println("进入查询");
        PageBean<Bigdai> pb =
                this.bigdaiService.getByPage(dto, pageNo, pageSize);
        for(Bigdai bigdai:pb.getRows()){
            bigdai.setBdpath("http://localhost:10086/img/"+bigdai.getBdpath());
        }
        System.out.println("分页结果PageBean:"+pb.getTotal());


        return pb;
    }
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public @ResponseBody Integer daiupdate(@RequestBody Bigdai dai){
        System.out.println("进入修改方法");
        System.out.println(dai.toString());
        if(bigdaiService.updateByPrimaryKeySelective(dai)>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
            System.out.println(dai.getBdname());
        }

        return bigdaiService.updateByPrimaryKeySelective(dai);

    }
    @RequestMapping(value = "delect",method = RequestMethod.POST)
    public @ResponseBody Integer daidelect(@RequestBody Map data){

        int id=(int)data.get("dbid");
        System.out.println(id);
        int i=bigdaiService.deleteByPrimaryKey(new BigDecimal(id));
       if(i>0){

           System.out.println("删除成功");

       }else{
           System.out.println("删除失败");
       }


        return 1;

    }
}

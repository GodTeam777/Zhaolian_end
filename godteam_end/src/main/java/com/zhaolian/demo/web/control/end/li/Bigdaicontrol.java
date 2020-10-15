package com.zhaolian.demo.web.control.end.li;

import com.github.pagehelper.Page;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.BigdaiVlidate;
import com.zhaolian.demo.data.entity.Newes;
import com.zhaolian.demo.service.end.li.BigdaiVlidateservice;
import com.zhaolian.demo.service.end.li.Bigdaiservice;
import com.zhaolian.demo.web.util.BigdaiDTO;
import com.zhaolian.demo.web.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class Bigdaicontrol {
    @Resource
    Bigdaiservice bigdaiService;
    @Resource
    BigdaiVlidateservice bigdaiVlidateservice;
    String img1="";
    String img2="";

    //图片上传
    @RequestMapping("liupload")
    public @ResponseBody
    String upload(@RequestParam("file") MultipartFile upload, HttpSession session) {
        //获得项目相对路径
        String path=System.getProperty("user.dir");
//        File file=new File(path);
//        System.out.println("文件夹路径："+path);
//        if(file.exists()) {
//            System.out.println("文件夹存在");
//        }else{
//            System.out.println("文件夹不存在,创建文件夹");
//        }
        String originalFileName = upload.getOriginalFilename();//获取原始图片的扩展名
        String newFileName = UUID.randomUUID()+originalFileName;//生成新的图片名字（存入数据库）
        String newFilePath=path+"/upload/"+newFileName; //新文件的路径
//        System.out.println("图片名字："+originalFileName);
//        System.out.println("新名字："+newFileName);
//        System.out.println("要保存的路径："+newFilePath);
        if(this.img1==""){
            System.out.println("第一张图片");
            this.img1=newFileName;
        }else{
            System.out.println("第二张图片");
            this.img2 = newFileName;
        }
        try {

            System.out.println("保存图片");
            upload.transferTo(new File(newFilePath));//将传来的文件写入新建的文件
            System.out.println("上传图片成功进行上传文件测试");
            return newFileName;
        }catch (IllegalStateException e ) {
            //处理异常
            System.out.println("错误一");
        }catch(IOException e1){
            //处理异常
            System.out.println("错误二");
        }
        return "失败";
    }


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
        System.out.println("数据"+pb.getRows().toString());
        System.out.println("分页结果PageBean:"+pb.getTotal());


        return pb;
    }


    @RequestMapping(value = "update1",method = RequestMethod.POST)
    public @ResponseBody Integer daiupdate(@RequestBody Bigdai dai){
       if(this.img1!=""){
           dai.setBdpath(this.img1);
       }
        System.out.println("进入修改方法");

        System.out.println(dai.toString());

        this.img1="";
        this.img2="";
        return bigdaiService.updateByPrimaryKeySelective(dai);

    }

    @RequestMapping(value = "insert1",method = RequestMethod.POST)
    public @ResponseBody Integer daiinsert(@RequestBody Map data){
        Bigdai dai=new Bigdai();
        BigdaiVlidate vlidate=new BigdaiVlidate();
        vlidate.setIdcard(new BigDecimal((String) data.get("idcard")));
        vlidate.setCheliang(new BigDecimal((String)data.get("cheliang")));
        vlidate.setHome(new BigDecimal((String)data.get("home")));
        vlidate.setXueli(new BigDecimal((String)data.get("xueli")));
        System.out.println(vlidate.toString());
        if(this.img1!=""){
            dai.setBdpath(this.img1);
        }

        System.out.println("进入新增方法");
        if(bigdaiVlidateservice.insert(vlidate)>0){
         List<BigdaiVlidate> list=  bigdaiVlidateservice.selectall();
            dai.setVid(list.get(0).getVid());
            System.out.println(dai.getVid());
            dai.setBdtype((String)data.get("bdtype"));
            dai.setBddate(new BigDecimal((String)data.get("bddate")));
            dai.setBdname((String) data.get("bdname"));
            dai.setInterest(new BigDecimal((String) data.get("interest")));
            dai.setBigdaiTitle((String)data.get("bigdaiTitle"));
            dai.setBigdaiBody( (String)data.get("bigdaiBody"));
            dai.setBdpath(this.img1);
            dai.setSmallMoney(new BigDecimal((String) data.get("smallMoney")));
            dai.setBigMoney(new BigDecimal((String) data.get("bigMoney")));
            System.out.println("新增成功");
            System.out.println(dai.toString());

            bigdaiService.insert(dai);
        }else {
            System.out.println("新增失败");

        }
        this.img1="";
        this.img2="";
        return bigdaiVlidateservice.insert(vlidate);

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

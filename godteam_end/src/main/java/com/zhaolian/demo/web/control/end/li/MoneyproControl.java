package com.zhaolian.demo.web.control.end.li;

import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.Moneypro;
import com.zhaolian.demo.service.end.li.MoneyproService;
import com.zhaolian.demo.web.util.BigdaiDTO;
import com.zhaolian.demo.web.util.MoneyproDTO;
import com.zhaolian.demo.web.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

@Controller
public class MoneyproControl {
    @Resource
    MoneyproService service;
    String img1="";
    String img2="";

    @RequestMapping("moliupload")
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


    @RequestMapping(value = "moneyByPage", method = RequestMethod.POST)
    public @ResponseBody
    PageBean<Moneypro> listByPage
            (@RequestBody Map<String, Object> map) {
        String a = (String) map.get("name");
        String b = (String) map.get("aname");

        System.out.println("数据：" + map);


        Integer pageNo = Integer.parseInt(map.get("pageNumber").toString());
        Integer pageSize = Integer.parseInt(map.get("pageSize").toString());
        MoneyproDTO dto = new MoneyproDTO();
        if (a != "") {
            dto.setMpname(a);
        }
        if (b != "") {
            dto.setMptype(b);
        }
        System.out.println("进入控制器");
        System.out.println("进入查询");
        PageBean<Moneypro> pb =
                this.service.getByPage(dto, pageNo, pageSize);
        for (Moneypro mo : pb.getRows()) {

            mo.setMppath("http://localhost:10086/img/" + mo.getMppath());
        }
        System.out.println("数据"+pb.getRows().toString());
        System.out.println("分页结果PageBean:" + pb.getTotal());

        return pb;
    }
    @RequestMapping(value = "moupdate",method = RequestMethod.POST)
    public @ResponseBody Integer daiupdate(@RequestBody Moneypro moneypro){
        if(this.img1!=""){
            moneypro.setMppath(this.img1);

        }
        System.out.println("进入修改方法");

        System.out.println(moneypro.toString());

        this.img1="";
        this.img2="";
        return service.updateByPrimaryKeySelective(moneypro);

    }
    @RequestMapping(value = "moliinsert",method = RequestMethod.POST)
    public @ResponseBody Integer moliinsert(@RequestBody Moneypro data){
        if(this.img1!=""){
            data.setMppath(this.img1);

        }
        System.out.println("进入新增方法");
        System.out.println(data.toString());
        this.img1="";
        this.img2="";
        int a=service.insert(data);
        return a;
    }
    @RequestMapping(value = "molidelect",method = RequestMethod.POST)
    public @ResponseBody Integer daidelect(@RequestBody Map data){

        int id=(int)data.get("mpid");
        System.out.println(id);
        int i=service.deleteByPrimaryKey(new BigDecimal(id));
        if(i>0){

            System.out.println("删除成功");

        }else{
            System.out.println("删除失败");
        }


        return 1;

    }
}


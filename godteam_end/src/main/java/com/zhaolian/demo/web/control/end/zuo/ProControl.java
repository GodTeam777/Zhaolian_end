package com.zhaolian.demo.web.control.end.zuo;

import com.zhaolian.demo.service.end.zuo.ProService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

@Controller
public class ProControl {

    @Resource
    ProService proService;

    //按天查询，理财产品
    @RequestMapping(value = "pro_day_chart", method = RequestMethod.POST)
    public @ResponseBody List<Map<String, Object>> ProDayChart(@RequestBody Map<String, Object> map) throws ParseException {
        String change_year = String.valueOf(map.get("change_year"));
        String change_month = String.valueOf(map.get("change_month"));
        System.err.println("传递的参数："+change_year+"-"+change_month);
        List<Map<String, Object>> pro_all = proService.Pro_day_Chart(change_year+"-"+change_month);
        return pro_all;
    }
}

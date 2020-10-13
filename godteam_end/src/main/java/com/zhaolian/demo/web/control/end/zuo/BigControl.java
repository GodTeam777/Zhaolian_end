package com.zhaolian.demo.web.control.end.zuo;

import com.zhaolian.demo.service.end.zuo.BigService;
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
public class BigControl {

    @Resource
    BigService bigService;

    //按天查询，大额贷款
    @RequestMapping(value = "big_dai_chart", method = RequestMethod.POST)
    public @ResponseBody List<Map<String, Object>> Big_Dai_Chart(@RequestBody Map<String, Object> map) throws ParseException {
        String change_year = String.valueOf(map.get("change_year"));
        String change_month = String.valueOf(map.get("change_month"));
        List<Map<String, Object>> big_all = bigService.Big_DaiKuan_day_Chart(change_year+"-"+change_month);
        return big_all;
    }

    //按天查询，大额还款
    @RequestMapping(value = "big_huan_chart", method = RequestMethod.POST)
    public @ResponseBody List<Map<String, Object>> Big_Huan_Chart(@RequestBody Map<String, Object> map) throws ParseException {
        String change_year = String.valueOf(map.get("change_year"));
        String change_month = String.valueOf(map.get("change_month"));
        List<Map<String, Object>> big_all = bigService.Big_HuanKuan_day_Chart(change_year+"-"+change_month);
        return big_all;
    }

    //按月查询，大额贷款
    @RequestMapping(value = "big_dai_month_chart", method = RequestMethod.POST)
    public @ResponseBody List<Map<String, Object>> SamllMonthChart(@RequestBody Map<String, Object> map) throws ParseException {
        String change_year = String.valueOf(map.get("change_year"));
        List<Map<String, Object>> big_all = bigService.Big_DaiKuan_month_Chart(change_year+"-01");
        return big_all;
    }

    //按月查询，大额还款
    @RequestMapping(value = "big_huan_month_chart", method = RequestMethod.POST)
    public @ResponseBody List<Map<String, Object>> SmallMonthChart(@RequestBody Map<String, Object> map) throws ParseException {
        String change_year = String.valueOf(map.get("change_year"));
        List<Map<String, Object>> big_all = bigService.Big_HuanKuan_month_Chart(change_year+"-01");
        return big_all;
    }

}

package com.zhaolian.demo.web.control.end.zuo;

import com.zhaolian.demo.service.end.zuo.SamllService;
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
public class SamllControl {

    @Resource
    SamllService samllService;

    //按日查询，小额贷款
    @RequestMapping(value = "samll_chart", method = RequestMethod.POST)
    public @ResponseBody List<Map<String, Object>> SamllChart(@RequestBody Map<String, Object> map) throws ParseException {
        String change_year = String.valueOf(map.get("change_year"));
        String change_month = String.valueOf(map.get("change_month"));
        List<Map<String, Object>> samll_all = samllService.Samll_DaiKuan_Chart(change_year+"-"+change_month);
        return samll_all;
    }

    //按日查询，小额还款
    @RequestMapping(value = "small_chart", method = RequestMethod.POST)
    public @ResponseBody List<Map<String, Object>> SmallChart(@RequestBody Map<String, Object> map) throws ParseException {
        String change_year = String.valueOf(map.get("change_year"));
        String change_month = String.valueOf(map.get("change_month"));
        List<Map<String, Object>> samll_all = samllService.Small_HuanKuan_Chart(change_year+"-"+change_month);
        return samll_all;
    }

    //按月查询，小额贷款
    @RequestMapping(value = "samll_month_chart", method = RequestMethod.POST)
    public @ResponseBody List<Map<String, Object>> SamllMonthChart(@RequestBody Map<String, Object> map) throws ParseException {
        String change_year = String.valueOf(map.get("change_year"));
        System.err.println("传递的参数："+change_year+"-01");
        List<Map<String, Object>> samll_all = samllService.Samll_DaiKuan_month_Chart(change_year+"-01");
        return samll_all;
    }

    //按月查询，小额还款
    @RequestMapping(value = "small_month_chart", method = RequestMethod.POST)
    public @ResponseBody List<Map<String, Object>> SmallMonthChart(@RequestBody Map<String, Object> map) throws ParseException {
        String change_year = String.valueOf(map.get("change_year"));
        System.err.println("传递的参数："+change_year+"-01");
        List<Map<String, Object>> samll_all = samllService.Small_HuanKuan_month_Chart(change_year+"-01");
        return samll_all;
    }


}

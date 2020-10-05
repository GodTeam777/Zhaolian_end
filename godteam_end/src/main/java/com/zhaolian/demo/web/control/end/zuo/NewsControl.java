package com.zhaolian.demo.web.control.end.zuo;

import com.zhaolian.demo.data.entity.Newes;
import com.zhaolian.demo.service.end.zuo.NewsService;
import com.zhaolian.demo.web.dto.zuo.NewsDTO;
import com.zhaolian.demo.web.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Controller
public class NewsControl {

    @Resource
    NewsService news_service;

    @RequestMapping(value = "news_delete", method = RequestMethod.POST)
    public @ResponseBody String News_Delete(@RequestBody String[] array_tid){
        String message = "";
        for (int i = 0; i < array_tid.length - 1; i++){
            int count = news_service.news_delete(Integer.parseInt(array_tid[i]));
            if(count > 0) {
                message = "删除成功！";
            }else {
                message = "删除失败！";
            }
        }
        return message;
    }

    @RequestMapping(value = "news_select_ById", method = RequestMethod.POST)
    public @ResponseBody Newes News_Select_ById(@RequestBody Map<String,Object> news_map){
        return news_service.News_SelectById((Integer)news_map.get("news_id"));
    }

    @RequestMapping(value = "news_update_save", method = RequestMethod.POST)
    public @ResponseBody Integer News_Update(@RequestBody Newes newes){
        newes.setNewsDate(new Date());
        return news_service.news_update(newes);
    }

    @RequestMapping(value = "news_insert_save", method = RequestMethod.POST)
    public @ResponseBody Integer News_Insert(@RequestBody Newes news){
        news.setNewsDate(new Date());
        int count = news_service.news_insert(news);
        return count;
    }

    @RequestMapping(value = "news_page", method = RequestMethod.POST)
    public @ResponseBody PageBean<Newes> news_page(@RequestBody Map<String,Object> news_map){
        Integer pageNo = (Integer)news_map.get("pageNumber");
        Integer pageSize = (Integer)news_map.get("pageSize");
        NewsDTO dto = new NewsDTO();
        dto.setSearch_title(String.valueOf(news_map.get("search_title")));
        //dto.setSearch_body(String.valueOf(news_map.get("search_body")));
        //dto.setSearch_date(new Date(String.valueOf(news_map.get("search_date"))));
        //dto.setSearch_press(String.valueOf(news_map.get("search_press")));
        dto.setSearch_name(String.valueOf(news_map.get("search_name")));
        //dto.setSearch_type(Integer.parseInt(String.valueOf(news_map.get("search_type"))));
        PageBean<Newes> pageBean = news_service.NewsPage(dto, pageNo, pageSize);
        return pageBean;
    }
}

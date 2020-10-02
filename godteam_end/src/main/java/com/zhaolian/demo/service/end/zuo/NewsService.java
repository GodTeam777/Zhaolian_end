package com.zhaolian.demo.service.end.zuo;

import com.zhaolian.demo.data.entity.Newes;
import com.zhaolian.demo.web.dto.zuo.NewsDTO;
import com.zhaolian.demo.web.util.PageBean;

import java.math.BigDecimal;

public interface NewsService {

    //新增新闻
    int news_insert(Newes news);

    PageBean<Newes> NewsPage(NewsDTO dto, int pageNo,int pageSize);

    //按新闻编号查询一条记录
    Newes News_SelectById(Integer news_id);

    //修改新闻
    int news_update(Newes newes);

    //删除新闻
    int news_delete(Integer news_id);
}

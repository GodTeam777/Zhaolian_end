package com.zhaolian.demo.service.end.zuo.impl;

import com.zhaolian.demo.data.dao.NewesMapper;
import com.zhaolian.demo.data.entity.Newes;
import com.zhaolian.demo.service.end.zuo.NewsService;
import com.zhaolian.demo.web.dto.zuo.NewsDTO;
import com.zhaolian.demo.web.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service("NewsService")
public class NewsServiceImpl implements NewsService {

    @Resource
    NewesMapper news_dao;

    @Override
    public int news_insert(Newes news) {
        return news_dao.insert(news);
    }

    @Override
    public PageBean<Newes> NewsPage(NewsDTO dto, int pageNo, int pageSize) {
        PageBean<Newes> pageBean = new PageBean<Newes>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("dto", dto);
        int start = (pageNo -1) * pageSize + 1;
        int end = pageNo * pageSize;
        map.put("start", start);
        map.put("end", end);
        pageBean.setRows(news_dao.SelectNewsPage(map));
        pageBean.setTotal(news_dao.getNewsCount(dto));
        pageBean.setPageNo(pageNo);
        pageBean.setPageSize(pageSize);
        return pageBean;
    }

    @Override
    public Newes News_SelectById(Integer news_id) {
        return news_dao.selectByPrimaryKey(new BigDecimal(news_id));
    }

    @Override
    public int news_update(Newes newes) {
        return news_dao.updateByPrimaryKeySelective(newes);
    }

    @Override
    public int news_delete(Integer news_id) {
        return news_dao.deleteByPrimaryKey(new BigDecimal(news_id));
    }
}

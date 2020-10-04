package com.zhaolian.demo.web.dto.zuo;

import java.util.Date;

//新闻
public class NewsDTO {

    String search_title;//新闻标题
    String search_body;//新闻主题
    String search_press;//出版社
    String search_name;//发表人
    Date search_date;//发表时间
    Integer search_type;//类型

    public String getSearch_title() {
        return search_title;
    }

    public void setSearch_title(String search_title) {
        this.search_title = search_title;
    }

    public String getSearch_body() {
        return search_body;
    }

    public void setSearch_body(String search_body) {
        this.search_body = search_body;
    }

    public String getSearch_press() {
        return search_press;
    }

    public void setSearch_press(String search_press) {
        this.search_press = search_press;
    }

    public String getSearch_name() {
        return search_name;
    }

    public void setSearch_name(String search_name) {
        this.search_name = search_name;
    }

    public Date getSearch_date() {
        return search_date;
    }

    public void setSearch_date(Date search_date) {
        this.search_date = search_date;
    }

    public Integer getSearch_type() {
        return search_type;
    }

    public void setSearch_type(Integer search_type) {
        this.search_type = search_type;
    }

    public NewsDTO() {
        super();
    }

    public NewsDTO(String search_title, String search_body, String search_press, String search_name, Date search_date, Integer search_type) {
        this.search_title = search_title;
        this.search_body = search_body;
        this.search_press = search_press;
        this.search_name = search_name;
        this.search_date = search_date;
        this.search_type = search_type;
    }

    @Override
    public String toString() {
        return "NewsDTO{" +
                "search_title="+ search_title+
                ", search_body=" + search_body +
                ", search_press=" + search_press +
                ", search_name=" + search_name +
                ", search_date=" + search_date +
                ", search_type=" + search_type +
                '}';
    }
}

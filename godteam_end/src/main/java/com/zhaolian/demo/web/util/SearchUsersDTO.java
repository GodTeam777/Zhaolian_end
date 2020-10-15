package com.zhaolian.demo.web.util;

public class SearchUsersDTO {
    private String search_name;//按姓名查询

    public String getSearch_name() {
        return search_name;
    }

    public void setSearch_name(String search_name) {
        this.search_name = search_name;
    }

    @Override
    public String toString() {
        return "SearchUsersDTO{" +
                "search_name='" + search_name + '\'' +
                '}';
    }

    public SearchUsersDTO() {
        super();
    }
}

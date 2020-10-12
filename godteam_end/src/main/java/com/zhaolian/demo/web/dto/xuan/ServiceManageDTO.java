package com.zhaolian.demo.web.dto.xuan;

public class ServiceManageDTO {
    private String search_name;

    @Override
    public String toString() {
        return "ServiceManageDTO{" +
                "search_name='" + search_name + '\'' +
                '}';
    }

    public String getSearch_name() {
        return search_name;
    }

    public void setSearch_name(String search_name) {
        this.search_name = search_name;
    }

    public ServiceManageDTO(String search_name) {
        this.search_name = search_name;
    }

    public ServiceManageDTO() {
    }
}

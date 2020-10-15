package com.zhaolian.demo.web.util;

public class ProoderDTO {
    String mpname;
   String uname;
    String status;

    @Override
    public String toString() {
        return "ProoderDTO{" +
                "mpname='" + mpname + '\'' +
                ", uname='" + uname + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getMpname() {
        return mpname;
    }

    public void setMpname(String mpname) {
        this.mpname = mpname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProoderDTO(String mpname, String uname, String status) {
        this.mpname = mpname;
        this.uname = uname;
        this.status = status;
    }

    public ProoderDTO() {
    }
}

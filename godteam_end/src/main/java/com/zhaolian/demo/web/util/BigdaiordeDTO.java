package com.zhaolian.demo.web.util;

public class BigdaiordeDTO {
    String uuname;
    String Bdname;
    String status;

    public BigdaiordeDTO() {
    }

    @Override
    public String toString() {
        return "BigdaiordeDTO{" +
                "uuname='" + uuname + '\'' +
                ", Bdname='" + Bdname + '\'' +
                ", status=" + status +
                '}';
    }

    public String getUuname() {
        return uuname;
    }

    public void setUuname(String uuname) {
        this.uuname = uuname;
    }

    public String getBdname() {
        return Bdname;
    }

    public void setBdname(String bdname) {
        Bdname = bdname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigdaiordeDTO(String uuname, String bdname, String status) {
        this.uuname = uuname;
        Bdname = bdname;
        this.status = status;
    }
}

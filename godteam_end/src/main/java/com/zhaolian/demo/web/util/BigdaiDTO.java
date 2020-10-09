package com.zhaolian.demo.web.util;

public class BigdaiDTO {
String  bdname;
String Bdtype;



    public BigdaiDTO() {
    }

    public BigdaiDTO(String bdname,  String bdtype) {
        this.bdname = bdname;

        Bdtype = bdtype;

    }

    public String getBdname() {
        return bdname;
    }

    public void setBdname(String bdname) {
        this.bdname = bdname;
    }


    public String getBdtype() {
        return Bdtype;
    }

    public void setBdtype(String bdtype) {
        Bdtype = bdtype;
    }


    @Override
    public String toString() {
        return "BigdaiDTO{" +
                "bdname='" + bdname + '\'' +
                ", Bdtype='" + Bdtype + '\'' +

                '}';
    }
}

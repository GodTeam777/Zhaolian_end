package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class BigdaiVlidate implements Serializable {
    private BigDecimal vid;

    private BigDecimal idcard;

    private BigDecimal xueli;

    private BigDecimal cheliang;

    private BigDecimal home;

    private static final long serialVersionUID = 1L;

    public BigDecimal getVid() {
        return vid;
    }

    public void setVid(BigDecimal vid) {
        this.vid = vid;
    }

    public BigDecimal getIdcard() {
        return idcard;
    }

    public void setIdcard(BigDecimal idcard) {
        this.idcard = idcard;
    }

    public BigDecimal getXueli() {
        return xueli;
    }

    public void setXueli(BigDecimal xueli) {
        this.xueli = xueli;
    }

    public BigDecimal getCheliang() {
        return cheliang;
    }

    public void setCheliang(BigDecimal cheliang) {
        this.cheliang = cheliang;
    }

    public BigDecimal getHome() {
        return home;
    }

    public void setHome(BigDecimal home) {
        this.home = home;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vid=").append(vid);
        sb.append(", idcard=").append(idcard);
        sb.append(", xueli=").append(xueli);
        sb.append(", cheliang=").append(cheliang);
        sb.append(", home=").append(home);
        sb.append("]");
        return sb.toString();
    }
}
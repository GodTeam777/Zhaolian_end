package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Smallhuankuan implements Serializable {
    private BigDecimal hid;

    private BigDecimal sdoid;

    private BigDecimal liushui;

    private BigDecimal ordercard;

    private String zhifutype;

    private BigDecimal money;

    private Date huanDate;

    private static final long serialVersionUID = 1L;

    public BigDecimal getHid() {
        return hid;
    }

    public void setHid(BigDecimal hid) {
        this.hid = hid;
    }

    public BigDecimal getSdoid() {
        return sdoid;
    }

    public void setSdoid(BigDecimal sdoid) {
        this.sdoid = sdoid;
    }

    public BigDecimal getLiushui() {
        return liushui;
    }

    public void setLiushui(BigDecimal liushui) {
        this.liushui = liushui;
    }

    public BigDecimal getOrdercard() {
        return ordercard;
    }

    public void setOrdercard(BigDecimal ordercard) {
        this.ordercard = ordercard;
    }

    public String getZhifutype() {
        return zhifutype;
    }

    public void setZhifutype(String zhifutype) {
        this.zhifutype = zhifutype;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getHuanDate() {
        return huanDate;
    }

    public void setHuanDate(Date huanDate) {
        this.huanDate = huanDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hid=").append(hid);
        sb.append(", sdoid=").append(sdoid);
        sb.append(", liushui=").append(liushui);
        sb.append(", ordercard=").append(ordercard);
        sb.append(", zhifutype=").append(zhifutype);
        sb.append(", money=").append(money);
        sb.append(", huanDate=").append(huanDate);
        sb.append("]");
        return sb.toString();
    }
}
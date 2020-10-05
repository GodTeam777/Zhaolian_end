package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Proorder implements Serializable {
    private BigDecimal poid;

    private BigDecimal mpid;

    private BigDecimal usersid;

    private BigDecimal money;

    private Date licaiDate;

    private String zhifutype;

    private Date shouDate;

    private BigDecimal status;

    private static final long serialVersionUID = 1L;

    public BigDecimal getPoid() {
        return poid;
    }

    public void setPoid(BigDecimal poid) {
        this.poid = poid;
    }

    public BigDecimal getMpid() {
        return mpid;
    }

    public void setMpid(BigDecimal mpid) {
        this.mpid = mpid;
    }

    public BigDecimal getUsersid() {
        return usersid;
    }

    public void setUsersid(BigDecimal usersid) {
        this.usersid = usersid;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getLicaiDate() {
        return licaiDate;
    }

    public void setLicaiDate(Date licaiDate) {
        this.licaiDate = licaiDate;
    }

    public String getZhifutype() {
        return zhifutype;
    }

    public void setZhifutype(String zhifutype) {
        this.zhifutype = zhifutype;
    }

    public Date getShouDate() {
        return shouDate;
    }

    public void setShouDate(Date shouDate) {
        this.shouDate = shouDate;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", poid=").append(poid);
        sb.append(", mpid=").append(mpid);
        sb.append(", usersid=").append(usersid);
        sb.append(", money=").append(money);
        sb.append(", licaiDate=").append(licaiDate);
        sb.append(", zhifutype=").append(zhifutype);
        sb.append(", shouDate=").append(shouDate);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}
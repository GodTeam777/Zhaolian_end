package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Bank implements Serializable {
    private BigDecimal mybid;

    private BigDecimal usersid;

    private BigDecimal bid;

    private BigDecimal bankcard;

    private String brankphone;

    private static final long serialVersionUID = 1L;

    public BigDecimal getMybid() {
        return mybid;
    }

    public void setMybid(BigDecimal mybid) {
        this.mybid = mybid;
    }

    public BigDecimal getUsersid() {
        return usersid;
    }

    public void setUsersid(BigDecimal usersid) {
        this.usersid = usersid;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public BigDecimal getBankcard() {
        return bankcard;
    }

    public void setBankcard(BigDecimal bankcard) {
        this.bankcard = bankcard;
    }

    public String getBrankphone() {
        return brankphone;
    }

    public void setBrankphone(String brankphone) {
        this.brankphone = brankphone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mybid=").append(mybid);
        sb.append(", usersid=").append(usersid);
        sb.append(", bid=").append(bid);
        sb.append(", bankcard=").append(bankcard);
        sb.append(", brankphone=").append(brankphone);
        sb.append("]");
        return sb.toString();
    }
}
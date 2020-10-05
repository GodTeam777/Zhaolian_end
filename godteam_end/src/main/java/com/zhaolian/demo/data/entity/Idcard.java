package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Idcard implements Serializable {
    private BigDecimal cardid;

    private String name;

    private String idcard;

    private String front;

    private String fan;

    private static final long serialVersionUID = 1L;

    public BigDecimal getCardid() {
        return cardid;
    }

    public void setCardid(BigDecimal cardid) {
        this.cardid = cardid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public String getFan() {
        return fan;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cardid=").append(cardid);
        sb.append(", name=").append(name);
        sb.append(", idcard=").append(idcard);
        sb.append(", front=").append(front);
        sb.append(", fan=").append(fan);
        sb.append("]");
        return sb.toString();
    }
}
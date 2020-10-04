package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class SmadaiLilv implements Serializable {
    private BigDecimal usid;

    private BigDecimal lilv;

    private static final long serialVersionUID = 1L;

    public BigDecimal getUsid() {
        return usid;
    }

    public void setUsid(BigDecimal usid) {
        this.usid = usid;
    }

    public BigDecimal getLilv() {
        return lilv;
    }

    public void setLilv(BigDecimal lilv) {
        this.lilv = lilv;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usid=").append(usid);
        sb.append(", lilv=").append(lilv);
        sb.append("]");
        return sb.toString();
    }
}
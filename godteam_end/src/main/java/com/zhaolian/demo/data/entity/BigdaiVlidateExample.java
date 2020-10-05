package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BigdaiVlidateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BigdaiVlidateExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andVidIsNull() {
            addCriterion("VID is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("VID is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(BigDecimal value) {
            addCriterion("VID =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(BigDecimal value) {
            addCriterion("VID <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(BigDecimal value) {
            addCriterion("VID >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VID >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(BigDecimal value) {
            addCriterion("VID <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VID <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<BigDecimal> values) {
            addCriterion("VID in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<BigDecimal> values) {
            addCriterion("VID not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VID between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VID not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(BigDecimal value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(BigDecimal value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(BigDecimal value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(BigDecimal value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<BigDecimal> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<BigDecimal> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andXueliIsNull() {
            addCriterion("XUELI is null");
            return (Criteria) this;
        }

        public Criteria andXueliIsNotNull() {
            addCriterion("XUELI is not null");
            return (Criteria) this;
        }

        public Criteria andXueliEqualTo(BigDecimal value) {
            addCriterion("XUELI =", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotEqualTo(BigDecimal value) {
            addCriterion("XUELI <>", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThan(BigDecimal value) {
            addCriterion("XUELI >", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XUELI >=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThan(BigDecimal value) {
            addCriterion("XUELI <", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XUELI <=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliIn(List<BigDecimal> values) {
            addCriterion("XUELI in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotIn(List<BigDecimal> values) {
            addCriterion("XUELI not in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XUELI between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XUELI not between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andCheliangIsNull() {
            addCriterion("CHELIANG is null");
            return (Criteria) this;
        }

        public Criteria andCheliangIsNotNull() {
            addCriterion("CHELIANG is not null");
            return (Criteria) this;
        }

        public Criteria andCheliangEqualTo(BigDecimal value) {
            addCriterion("CHELIANG =", value, "cheliang");
            return (Criteria) this;
        }

        public Criteria andCheliangNotEqualTo(BigDecimal value) {
            addCriterion("CHELIANG <>", value, "cheliang");
            return (Criteria) this;
        }

        public Criteria andCheliangGreaterThan(BigDecimal value) {
            addCriterion("CHELIANG >", value, "cheliang");
            return (Criteria) this;
        }

        public Criteria andCheliangGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHELIANG >=", value, "cheliang");
            return (Criteria) this;
        }

        public Criteria andCheliangLessThan(BigDecimal value) {
            addCriterion("CHELIANG <", value, "cheliang");
            return (Criteria) this;
        }

        public Criteria andCheliangLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHELIANG <=", value, "cheliang");
            return (Criteria) this;
        }

        public Criteria andCheliangIn(List<BigDecimal> values) {
            addCriterion("CHELIANG in", values, "cheliang");
            return (Criteria) this;
        }

        public Criteria andCheliangNotIn(List<BigDecimal> values) {
            addCriterion("CHELIANG not in", values, "cheliang");
            return (Criteria) this;
        }

        public Criteria andCheliangBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHELIANG between", value1, value2, "cheliang");
            return (Criteria) this;
        }

        public Criteria andCheliangNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHELIANG not between", value1, value2, "cheliang");
            return (Criteria) this;
        }

        public Criteria andHomeIsNull() {
            addCriterion("HOME is null");
            return (Criteria) this;
        }

        public Criteria andHomeIsNotNull() {
            addCriterion("HOME is not null");
            return (Criteria) this;
        }

        public Criteria andHomeEqualTo(BigDecimal value) {
            addCriterion("HOME =", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeNotEqualTo(BigDecimal value) {
            addCriterion("HOME <>", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeGreaterThan(BigDecimal value) {
            addCriterion("HOME >", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOME >=", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeLessThan(BigDecimal value) {
            addCriterion("HOME <", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOME <=", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeIn(List<BigDecimal> values) {
            addCriterion("HOME in", values, "home");
            return (Criteria) this;
        }

        public Criteria andHomeNotIn(List<BigDecimal> values) {
            addCriterion("HOME not in", values, "home");
            return (Criteria) this;
        }

        public Criteria andHomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOME between", value1, value2, "home");
            return (Criteria) this;
        }

        public Criteria andHomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOME not between", value1, value2, "home");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
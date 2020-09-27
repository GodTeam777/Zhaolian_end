package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IdcardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IdcardExample() {
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

        public Criteria andCardidIsNull() {
            addCriterion("CARDID is null");
            return (Criteria) this;
        }

        public Criteria andCardidIsNotNull() {
            addCriterion("CARDID is not null");
            return (Criteria) this;
        }

        public Criteria andCardidEqualTo(BigDecimal value) {
            addCriterion("CARDID =", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotEqualTo(BigDecimal value) {
            addCriterion("CARDID <>", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThan(BigDecimal value) {
            addCriterion("CARDID >", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARDID >=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThan(BigDecimal value) {
            addCriterion("CARDID <", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARDID <=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidIn(List<BigDecimal> values) {
            addCriterion("CARDID in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotIn(List<BigDecimal> values) {
            addCriterion("CARDID not in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARDID between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARDID not between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("\"NAME\" is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("\"NAME\" is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("\"NAME\" =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("\"NAME\" <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("\"NAME\" >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("\"NAME\" >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("\"NAME\" <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("\"NAME\" <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("\"NAME\" like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("\"NAME\" not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("\"NAME\" in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("\"NAME\" not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("\"NAME\" between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("\"NAME\" not between", value1, value2, "name");
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

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCARD like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCARD not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andFrontIsNull() {
            addCriterion("FRONT is null");
            return (Criteria) this;
        }

        public Criteria andFrontIsNotNull() {
            addCriterion("FRONT is not null");
            return (Criteria) this;
        }

        public Criteria andFrontEqualTo(String value) {
            addCriterion("FRONT =", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontNotEqualTo(String value) {
            addCriterion("FRONT <>", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontGreaterThan(String value) {
            addCriterion("FRONT >", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontGreaterThanOrEqualTo(String value) {
            addCriterion("FRONT >=", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontLessThan(String value) {
            addCriterion("FRONT <", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontLessThanOrEqualTo(String value) {
            addCriterion("FRONT <=", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontLike(String value) {
            addCriterion("FRONT like", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontNotLike(String value) {
            addCriterion("FRONT not like", value, "front");
            return (Criteria) this;
        }

        public Criteria andFrontIn(List<String> values) {
            addCriterion("FRONT in", values, "front");
            return (Criteria) this;
        }

        public Criteria andFrontNotIn(List<String> values) {
            addCriterion("FRONT not in", values, "front");
            return (Criteria) this;
        }

        public Criteria andFrontBetween(String value1, String value2) {
            addCriterion("FRONT between", value1, value2, "front");
            return (Criteria) this;
        }

        public Criteria andFrontNotBetween(String value1, String value2) {
            addCriterion("FRONT not between", value1, value2, "front");
            return (Criteria) this;
        }

        public Criteria andFanIsNull() {
            addCriterion("FAN is null");
            return (Criteria) this;
        }

        public Criteria andFanIsNotNull() {
            addCriterion("FAN is not null");
            return (Criteria) this;
        }

        public Criteria andFanEqualTo(String value) {
            addCriterion("FAN =", value, "fan");
            return (Criteria) this;
        }

        public Criteria andFanNotEqualTo(String value) {
            addCriterion("FAN <>", value, "fan");
            return (Criteria) this;
        }

        public Criteria andFanGreaterThan(String value) {
            addCriterion("FAN >", value, "fan");
            return (Criteria) this;
        }

        public Criteria andFanGreaterThanOrEqualTo(String value) {
            addCriterion("FAN >=", value, "fan");
            return (Criteria) this;
        }

        public Criteria andFanLessThan(String value) {
            addCriterion("FAN <", value, "fan");
            return (Criteria) this;
        }

        public Criteria andFanLessThanOrEqualTo(String value) {
            addCriterion("FAN <=", value, "fan");
            return (Criteria) this;
        }

        public Criteria andFanLike(String value) {
            addCriterion("FAN like", value, "fan");
            return (Criteria) this;
        }

        public Criteria andFanNotLike(String value) {
            addCriterion("FAN not like", value, "fan");
            return (Criteria) this;
        }

        public Criteria andFanIn(List<String> values) {
            addCriterion("FAN in", values, "fan");
            return (Criteria) this;
        }

        public Criteria andFanNotIn(List<String> values) {
            addCriterion("FAN not in", values, "fan");
            return (Criteria) this;
        }

        public Criteria andFanBetween(String value1, String value2) {
            addCriterion("FAN between", value1, value2, "fan");
            return (Criteria) this;
        }

        public Criteria andFanNotBetween(String value1, String value2) {
            addCriterion("FAN not between", value1, value2, "fan");
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
package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankExample() {
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

        public Criteria andMybidIsNull() {
            addCriterion("MYBID is null");
            return (Criteria) this;
        }

        public Criteria andMybidIsNotNull() {
            addCriterion("MYBID is not null");
            return (Criteria) this;
        }

        public Criteria andMybidEqualTo(BigDecimal value) {
            addCriterion("MYBID =", value, "mybid");
            return (Criteria) this;
        }

        public Criteria andMybidNotEqualTo(BigDecimal value) {
            addCriterion("MYBID <>", value, "mybid");
            return (Criteria) this;
        }

        public Criteria andMybidGreaterThan(BigDecimal value) {
            addCriterion("MYBID >", value, "mybid");
            return (Criteria) this;
        }

        public Criteria andMybidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MYBID >=", value, "mybid");
            return (Criteria) this;
        }

        public Criteria andMybidLessThan(BigDecimal value) {
            addCriterion("MYBID <", value, "mybid");
            return (Criteria) this;
        }

        public Criteria andMybidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MYBID <=", value, "mybid");
            return (Criteria) this;
        }

        public Criteria andMybidIn(List<BigDecimal> values) {
            addCriterion("MYBID in", values, "mybid");
            return (Criteria) this;
        }

        public Criteria andMybidNotIn(List<BigDecimal> values) {
            addCriterion("MYBID not in", values, "mybid");
            return (Criteria) this;
        }

        public Criteria andMybidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MYBID between", value1, value2, "mybid");
            return (Criteria) this;
        }

        public Criteria andMybidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MYBID not between", value1, value2, "mybid");
            return (Criteria) this;
        }

        public Criteria andUsersidIsNull() {
            addCriterion("USERSID is null");
            return (Criteria) this;
        }

        public Criteria andUsersidIsNotNull() {
            addCriterion("USERSID is not null");
            return (Criteria) this;
        }

        public Criteria andUsersidEqualTo(BigDecimal value) {
            addCriterion("USERSID =", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidNotEqualTo(BigDecimal value) {
            addCriterion("USERSID <>", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidGreaterThan(BigDecimal value) {
            addCriterion("USERSID >", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USERSID >=", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidLessThan(BigDecimal value) {
            addCriterion("USERSID <", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USERSID <=", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidIn(List<BigDecimal> values) {
            addCriterion("USERSID in", values, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidNotIn(List<BigDecimal> values) {
            addCriterion("USERSID not in", values, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERSID between", value1, value2, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERSID not between", value1, value2, "usersid");
            return (Criteria) this;
        }

        public Criteria andBidIsNull() {
            addCriterion("BID is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("BID is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(BigDecimal value) {
            addCriterion("BID =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(BigDecimal value) {
            addCriterion("BID <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(BigDecimal value) {
            addCriterion("BID >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BID >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(BigDecimal value) {
            addCriterion("BID <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BID <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<BigDecimal> values) {
            addCriterion("BID in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<BigDecimal> values) {
            addCriterion("BID not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BID between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BID not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNull() {
            addCriterion("BANKCARD is null");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNotNull() {
            addCriterion("BANKCARD is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardEqualTo(BigDecimal value) {
            addCriterion("BANKCARD =", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotEqualTo(BigDecimal value) {
            addCriterion("BANKCARD <>", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThan(BigDecimal value) {
            addCriterion("BANKCARD >", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANKCARD >=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThan(BigDecimal value) {
            addCriterion("BANKCARD <", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANKCARD <=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardIn(List<BigDecimal> values) {
            addCriterion("BANKCARD in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotIn(List<BigDecimal> values) {
            addCriterion("BANKCARD not in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANKCARD between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANKCARD not between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBrankphoneIsNull() {
            addCriterion("BRANKPHONE is null");
            return (Criteria) this;
        }

        public Criteria andBrankphoneIsNotNull() {
            addCriterion("BRANKPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andBrankphoneEqualTo(String value) {
            addCriterion("BRANKPHONE =", value, "brankphone");
            return (Criteria) this;
        }

        public Criteria andBrankphoneNotEqualTo(String value) {
            addCriterion("BRANKPHONE <>", value, "brankphone");
            return (Criteria) this;
        }

        public Criteria andBrankphoneGreaterThan(String value) {
            addCriterion("BRANKPHONE >", value, "brankphone");
            return (Criteria) this;
        }

        public Criteria andBrankphoneGreaterThanOrEqualTo(String value) {
            addCriterion("BRANKPHONE >=", value, "brankphone");
            return (Criteria) this;
        }

        public Criteria andBrankphoneLessThan(String value) {
            addCriterion("BRANKPHONE <", value, "brankphone");
            return (Criteria) this;
        }

        public Criteria andBrankphoneLessThanOrEqualTo(String value) {
            addCriterion("BRANKPHONE <=", value, "brankphone");
            return (Criteria) this;
        }

        public Criteria andBrankphoneLike(String value) {
            addCriterion("BRANKPHONE like", value, "brankphone");
            return (Criteria) this;
        }

        public Criteria andBrankphoneNotLike(String value) {
            addCriterion("BRANKPHONE not like", value, "brankphone");
            return (Criteria) this;
        }

        public Criteria andBrankphoneIn(List<String> values) {
            addCriterion("BRANKPHONE in", values, "brankphone");
            return (Criteria) this;
        }

        public Criteria andBrankphoneNotIn(List<String> values) {
            addCriterion("BRANKPHONE not in", values, "brankphone");
            return (Criteria) this;
        }

        public Criteria andBrankphoneBetween(String value1, String value2) {
            addCriterion("BRANKPHONE between", value1, value2, "brankphone");
            return (Criteria) this;
        }

        public Criteria andBrankphoneNotBetween(String value1, String value2) {
            addCriterion("BRANKPHONE not between", value1, value2, "brankphone");
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
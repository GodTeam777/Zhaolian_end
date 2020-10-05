package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProorderExample() {
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

        public Criteria andPoidIsNull() {
            addCriterion("POID is null");
            return (Criteria) this;
        }

        public Criteria andPoidIsNotNull() {
            addCriterion("POID is not null");
            return (Criteria) this;
        }

        public Criteria andPoidEqualTo(BigDecimal value) {
            addCriterion("POID =", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidNotEqualTo(BigDecimal value) {
            addCriterion("POID <>", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidGreaterThan(BigDecimal value) {
            addCriterion("POID >", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POID >=", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidLessThan(BigDecimal value) {
            addCriterion("POID <", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POID <=", value, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidIn(List<BigDecimal> values) {
            addCriterion("POID in", values, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidNotIn(List<BigDecimal> values) {
            addCriterion("POID not in", values, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POID between", value1, value2, "poid");
            return (Criteria) this;
        }

        public Criteria andPoidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POID not between", value1, value2, "poid");
            return (Criteria) this;
        }

        public Criteria andMpidIsNull() {
            addCriterion("MPID is null");
            return (Criteria) this;
        }

        public Criteria andMpidIsNotNull() {
            addCriterion("MPID is not null");
            return (Criteria) this;
        }

        public Criteria andMpidEqualTo(BigDecimal value) {
            addCriterion("MPID =", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotEqualTo(BigDecimal value) {
            addCriterion("MPID <>", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidGreaterThan(BigDecimal value) {
            addCriterion("MPID >", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MPID >=", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidLessThan(BigDecimal value) {
            addCriterion("MPID <", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MPID <=", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidIn(List<BigDecimal> values) {
            addCriterion("MPID in", values, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotIn(List<BigDecimal> values) {
            addCriterion("MPID not in", values, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MPID between", value1, value2, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MPID not between", value1, value2, "mpid");
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

        public Criteria andMoneyIsNull() {
            addCriterion("MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("MONEY =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("MONEY <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("MONEY >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("MONEY <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONEY <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("MONEY in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("MONEY not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONEY not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andLicaiDateIsNull() {
            addCriterion("LICAI_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLicaiDateIsNotNull() {
            addCriterion("LICAI_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLicaiDateEqualTo(Date value) {
            addCriterion("LICAI_DATE =", value, "licaiDate");
            return (Criteria) this;
        }

        public Criteria andLicaiDateNotEqualTo(Date value) {
            addCriterion("LICAI_DATE <>", value, "licaiDate");
            return (Criteria) this;
        }

        public Criteria andLicaiDateGreaterThan(Date value) {
            addCriterion("LICAI_DATE >", value, "licaiDate");
            return (Criteria) this;
        }

        public Criteria andLicaiDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LICAI_DATE >=", value, "licaiDate");
            return (Criteria) this;
        }

        public Criteria andLicaiDateLessThan(Date value) {
            addCriterion("LICAI_DATE <", value, "licaiDate");
            return (Criteria) this;
        }

        public Criteria andLicaiDateLessThanOrEqualTo(Date value) {
            addCriterion("LICAI_DATE <=", value, "licaiDate");
            return (Criteria) this;
        }

        public Criteria andLicaiDateIn(List<Date> values) {
            addCriterion("LICAI_DATE in", values, "licaiDate");
            return (Criteria) this;
        }

        public Criteria andLicaiDateNotIn(List<Date> values) {
            addCriterion("LICAI_DATE not in", values, "licaiDate");
            return (Criteria) this;
        }

        public Criteria andLicaiDateBetween(Date value1, Date value2) {
            addCriterion("LICAI_DATE between", value1, value2, "licaiDate");
            return (Criteria) this;
        }

        public Criteria andLicaiDateNotBetween(Date value1, Date value2) {
            addCriterion("LICAI_DATE not between", value1, value2, "licaiDate");
            return (Criteria) this;
        }

        public Criteria andZhifutypeIsNull() {
            addCriterion("ZHIFUTYPE is null");
            return (Criteria) this;
        }

        public Criteria andZhifutypeIsNotNull() {
            addCriterion("ZHIFUTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andZhifutypeEqualTo(String value) {
            addCriterion("ZHIFUTYPE =", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeNotEqualTo(String value) {
            addCriterion("ZHIFUTYPE <>", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeGreaterThan(String value) {
            addCriterion("ZHIFUTYPE >", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeGreaterThanOrEqualTo(String value) {
            addCriterion("ZHIFUTYPE >=", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeLessThan(String value) {
            addCriterion("ZHIFUTYPE <", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeLessThanOrEqualTo(String value) {
            addCriterion("ZHIFUTYPE <=", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeLike(String value) {
            addCriterion("ZHIFUTYPE like", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeNotLike(String value) {
            addCriterion("ZHIFUTYPE not like", value, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeIn(List<String> values) {
            addCriterion("ZHIFUTYPE in", values, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeNotIn(List<String> values) {
            addCriterion("ZHIFUTYPE not in", values, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeBetween(String value1, String value2) {
            addCriterion("ZHIFUTYPE between", value1, value2, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andZhifutypeNotBetween(String value1, String value2) {
            addCriterion("ZHIFUTYPE not between", value1, value2, "zhifutype");
            return (Criteria) this;
        }

        public Criteria andShouDateIsNull() {
            addCriterion("SHOU_DATE is null");
            return (Criteria) this;
        }

        public Criteria andShouDateIsNotNull() {
            addCriterion("SHOU_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andShouDateEqualTo(Date value) {
            addCriterion("SHOU_DATE =", value, "shouDate");
            return (Criteria) this;
        }

        public Criteria andShouDateNotEqualTo(Date value) {
            addCriterion("SHOU_DATE <>", value, "shouDate");
            return (Criteria) this;
        }

        public Criteria andShouDateGreaterThan(Date value) {
            addCriterion("SHOU_DATE >", value, "shouDate");
            return (Criteria) this;
        }

        public Criteria andShouDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SHOU_DATE >=", value, "shouDate");
            return (Criteria) this;
        }

        public Criteria andShouDateLessThan(Date value) {
            addCriterion("SHOU_DATE <", value, "shouDate");
            return (Criteria) this;
        }

        public Criteria andShouDateLessThanOrEqualTo(Date value) {
            addCriterion("SHOU_DATE <=", value, "shouDate");
            return (Criteria) this;
        }

        public Criteria andShouDateIn(List<Date> values) {
            addCriterion("SHOU_DATE in", values, "shouDate");
            return (Criteria) this;
        }

        public Criteria andShouDateNotIn(List<Date> values) {
            addCriterion("SHOU_DATE not in", values, "shouDate");
            return (Criteria) this;
        }

        public Criteria andShouDateBetween(Date value1, Date value2) {
            addCriterion("SHOU_DATE between", value1, value2, "shouDate");
            return (Criteria) this;
        }

        public Criteria andShouDateNotBetween(Date value1, Date value2) {
            addCriterion("SHOU_DATE not between", value1, value2, "shouDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("\"STATUS\" is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("\"STATUS\" is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(BigDecimal value) {
            addCriterion("\"STATUS\" =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(BigDecimal value) {
            addCriterion("\"STATUS\" <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(BigDecimal value) {
            addCriterion("\"STATUS\" >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"STATUS\" >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(BigDecimal value) {
            addCriterion("\"STATUS\" <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"STATUS\" <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<BigDecimal> values) {
            addCriterion("\"STATUS\" in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<BigDecimal> values) {
            addCriterion("\"STATUS\" not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"STATUS\" between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"STATUS\" not between", value1, value2, "status");
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
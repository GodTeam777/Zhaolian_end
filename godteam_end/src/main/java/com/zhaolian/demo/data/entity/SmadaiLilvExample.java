package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SmadaiLilvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmadaiLilvExample() {
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

        public Criteria andUsidIsNull() {
            addCriterion("USID is null");
            return (Criteria) this;
        }

        public Criteria andUsidIsNotNull() {
            addCriterion("USID is not null");
            return (Criteria) this;
        }

        public Criteria andUsidEqualTo(BigDecimal value) {
            addCriterion("USID =", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidNotEqualTo(BigDecimal value) {
            addCriterion("USID <>", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidGreaterThan(BigDecimal value) {
            addCriterion("USID >", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USID >=", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidLessThan(BigDecimal value) {
            addCriterion("USID <", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USID <=", value, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidIn(List<BigDecimal> values) {
            addCriterion("USID in", values, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidNotIn(List<BigDecimal> values) {
            addCriterion("USID not in", values, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USID between", value1, value2, "usid");
            return (Criteria) this;
        }

        public Criteria andUsidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USID not between", value1, value2, "usid");
            return (Criteria) this;
        }

        public Criteria andLilvIsNull() {
            addCriterion("LILV is null");
            return (Criteria) this;
        }

        public Criteria andLilvIsNotNull() {
            addCriterion("LILV is not null");
            return (Criteria) this;
        }

        public Criteria andLilvEqualTo(BigDecimal value) {
            addCriterion("LILV =", value, "lilv");
            return (Criteria) this;
        }

        public Criteria andLilvNotEqualTo(BigDecimal value) {
            addCriterion("LILV <>", value, "lilv");
            return (Criteria) this;
        }

        public Criteria andLilvGreaterThan(BigDecimal value) {
            addCriterion("LILV >", value, "lilv");
            return (Criteria) this;
        }

        public Criteria andLilvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LILV >=", value, "lilv");
            return (Criteria) this;
        }

        public Criteria andLilvLessThan(BigDecimal value) {
            addCriterion("LILV <", value, "lilv");
            return (Criteria) this;
        }

        public Criteria andLilvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LILV <=", value, "lilv");
            return (Criteria) this;
        }

        public Criteria andLilvIn(List<BigDecimal> values) {
            addCriterion("LILV in", values, "lilv");
            return (Criteria) this;
        }

        public Criteria andLilvNotIn(List<BigDecimal> values) {
            addCriterion("LILV not in", values, "lilv");
            return (Criteria) this;
        }

        public Criteria andLilvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LILV between", value1, value2, "lilv");
            return (Criteria) this;
        }

        public Criteria andLilvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LILV not between", value1, value2, "lilv");
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
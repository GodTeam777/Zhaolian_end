package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MoneyproExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoneyproExample() {
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

        public Criteria andMpnameIsNull() {
            addCriterion("MPNAME is null");
            return (Criteria) this;
        }

        public Criteria andMpnameIsNotNull() {
            addCriterion("MPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMpnameEqualTo(String value) {
            addCriterion("MPNAME =", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameNotEqualTo(String value) {
            addCriterion("MPNAME <>", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameGreaterThan(String value) {
            addCriterion("MPNAME >", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameGreaterThanOrEqualTo(String value) {
            addCriterion("MPNAME >=", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameLessThan(String value) {
            addCriterion("MPNAME <", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameLessThanOrEqualTo(String value) {
            addCriterion("MPNAME <=", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameLike(String value) {
            addCriterion("MPNAME like", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameNotLike(String value) {
            addCriterion("MPNAME not like", value, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameIn(List<String> values) {
            addCriterion("MPNAME in", values, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameNotIn(List<String> values) {
            addCriterion("MPNAME not in", values, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameBetween(String value1, String value2) {
            addCriterion("MPNAME between", value1, value2, "mpname");
            return (Criteria) this;
        }

        public Criteria andMpnameNotBetween(String value1, String value2) {
            addCriterion("MPNAME not between", value1, value2, "mpname");
            return (Criteria) this;
        }

        public Criteria andMptypeIsNull() {
            addCriterion("MPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andMptypeIsNotNull() {
            addCriterion("MPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMptypeEqualTo(String value) {
            addCriterion("MPTYPE =", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeNotEqualTo(String value) {
            addCriterion("MPTYPE <>", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeGreaterThan(String value) {
            addCriterion("MPTYPE >", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeGreaterThanOrEqualTo(String value) {
            addCriterion("MPTYPE >=", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeLessThan(String value) {
            addCriterion("MPTYPE <", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeLessThanOrEqualTo(String value) {
            addCriterion("MPTYPE <=", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeLike(String value) {
            addCriterion("MPTYPE like", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeNotLike(String value) {
            addCriterion("MPTYPE not like", value, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeIn(List<String> values) {
            addCriterion("MPTYPE in", values, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeNotIn(List<String> values) {
            addCriterion("MPTYPE not in", values, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeBetween(String value1, String value2) {
            addCriterion("MPTYPE between", value1, value2, "mptype");
            return (Criteria) this;
        }

        public Criteria andMptypeNotBetween(String value1, String value2) {
            addCriterion("MPTYPE not between", value1, value2, "mptype");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("INCOME is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(BigDecimal value) {
            addCriterion("INCOME =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(BigDecimal value) {
            addCriterion("INCOME <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(BigDecimal value) {
            addCriterion("INCOME >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INCOME >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(BigDecimal value) {
            addCriterion("INCOME <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INCOME <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<BigDecimal> values) {
            addCriterion("INCOME in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<BigDecimal> values) {
            addCriterion("INCOME not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INCOME between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INCOME not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andMppathIsNull() {
            addCriterion("MPPATH is null");
            return (Criteria) this;
        }

        public Criteria andMppathIsNotNull() {
            addCriterion("MPPATH is not null");
            return (Criteria) this;
        }

        public Criteria andMppathEqualTo(String value) {
            addCriterion("MPPATH =", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathNotEqualTo(String value) {
            addCriterion("MPPATH <>", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathGreaterThan(String value) {
            addCriterion("MPPATH >", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathGreaterThanOrEqualTo(String value) {
            addCriterion("MPPATH >=", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathLessThan(String value) {
            addCriterion("MPPATH <", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathLessThanOrEqualTo(String value) {
            addCriterion("MPPATH <=", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathLike(String value) {
            addCriterion("MPPATH like", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathNotLike(String value) {
            addCriterion("MPPATH not like", value, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathIn(List<String> values) {
            addCriterion("MPPATH in", values, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathNotIn(List<String> values) {
            addCriterion("MPPATH not in", values, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathBetween(String value1, String value2) {
            addCriterion("MPPATH between", value1, value2, "mppath");
            return (Criteria) this;
        }

        public Criteria andMppathNotBetween(String value1, String value2) {
            addCriterion("MPPATH not between", value1, value2, "mppath");
            return (Criteria) this;
        }

        public Criteria andMpTitleIsNull() {
            addCriterion("MP_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andMpTitleIsNotNull() {
            addCriterion("MP_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andMpTitleEqualTo(String value) {
            addCriterion("MP_TITLE =", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleNotEqualTo(String value) {
            addCriterion("MP_TITLE <>", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleGreaterThan(String value) {
            addCriterion("MP_TITLE >", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleGreaterThanOrEqualTo(String value) {
            addCriterion("MP_TITLE >=", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleLessThan(String value) {
            addCriterion("MP_TITLE <", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleLessThanOrEqualTo(String value) {
            addCriterion("MP_TITLE <=", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleLike(String value) {
            addCriterion("MP_TITLE like", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleNotLike(String value) {
            addCriterion("MP_TITLE not like", value, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleIn(List<String> values) {
            addCriterion("MP_TITLE in", values, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleNotIn(List<String> values) {
            addCriterion("MP_TITLE not in", values, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleBetween(String value1, String value2) {
            addCriterion("MP_TITLE between", value1, value2, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpTitleNotBetween(String value1, String value2) {
            addCriterion("MP_TITLE not between", value1, value2, "mpTitle");
            return (Criteria) this;
        }

        public Criteria andMpBodyIsNull() {
            addCriterion("MP_BODY is null");
            return (Criteria) this;
        }

        public Criteria andMpBodyIsNotNull() {
            addCriterion("MP_BODY is not null");
            return (Criteria) this;
        }

        public Criteria andMpBodyEqualTo(String value) {
            addCriterion("MP_BODY =", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyNotEqualTo(String value) {
            addCriterion("MP_BODY <>", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyGreaterThan(String value) {
            addCriterion("MP_BODY >", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyGreaterThanOrEqualTo(String value) {
            addCriterion("MP_BODY >=", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyLessThan(String value) {
            addCriterion("MP_BODY <", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyLessThanOrEqualTo(String value) {
            addCriterion("MP_BODY <=", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyLike(String value) {
            addCriterion("MP_BODY like", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyNotLike(String value) {
            addCriterion("MP_BODY not like", value, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyIn(List<String> values) {
            addCriterion("MP_BODY in", values, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyNotIn(List<String> values) {
            addCriterion("MP_BODY not in", values, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyBetween(String value1, String value2) {
            addCriterion("MP_BODY between", value1, value2, "mpBody");
            return (Criteria) this;
        }

        public Criteria andMpBodyNotBetween(String value1, String value2) {
            addCriterion("MP_BODY not between", value1, value2, "mpBody");
            return (Criteria) this;
        }

        public Criteria andZhouqiIsNull() {
            addCriterion("ZHOUQI is null");
            return (Criteria) this;
        }

        public Criteria andZhouqiIsNotNull() {
            addCriterion("ZHOUQI is not null");
            return (Criteria) this;
        }

        public Criteria andZhouqiEqualTo(BigDecimal value) {
            addCriterion("ZHOUQI =", value, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiNotEqualTo(BigDecimal value) {
            addCriterion("ZHOUQI <>", value, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiGreaterThan(BigDecimal value) {
            addCriterion("ZHOUQI >", value, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHOUQI >=", value, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiLessThan(BigDecimal value) {
            addCriterion("ZHOUQI <", value, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHOUQI <=", value, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiIn(List<BigDecimal> values) {
            addCriterion("ZHOUQI in", values, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiNotIn(List<BigDecimal> values) {
            addCriterion("ZHOUQI not in", values, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHOUQI between", value1, value2, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andZhouqiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHOUQI not between", value1, value2, "zhouqi");
            return (Criteria) this;
        }

        public Criteria andMinMoneyIsNull() {
            addCriterion("MIN_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMinMoneyIsNotNull() {
            addCriterion("MIN_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMinMoneyEqualTo(BigDecimal value) {
            addCriterion("MIN_MONEY =", value, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyNotEqualTo(BigDecimal value) {
            addCriterion("MIN_MONEY <>", value, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyGreaterThan(BigDecimal value) {
            addCriterion("MIN_MONEY >", value, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_MONEY >=", value, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyLessThan(BigDecimal value) {
            addCriterion("MIN_MONEY <", value, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_MONEY <=", value, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyIn(List<BigDecimal> values) {
            addCriterion("MIN_MONEY in", values, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyNotIn(List<BigDecimal> values) {
            addCriterion("MIN_MONEY not in", values, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_MONEY between", value1, value2, "minMoney");
            return (Criteria) this;
        }

        public Criteria andMinMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_MONEY not between", value1, value2, "minMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyIsNull() {
            addCriterion("BIG_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andBigMoneyIsNotNull() {
            addCriterion("BIG_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andBigMoneyEqualTo(BigDecimal value) {
            addCriterion("BIG_MONEY =", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyNotEqualTo(BigDecimal value) {
            addCriterion("BIG_MONEY <>", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyGreaterThan(BigDecimal value) {
            addCriterion("BIG_MONEY >", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BIG_MONEY >=", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyLessThan(BigDecimal value) {
            addCriterion("BIG_MONEY <", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BIG_MONEY <=", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyIn(List<BigDecimal> values) {
            addCriterion("BIG_MONEY in", values, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyNotIn(List<BigDecimal> values) {
            addCriterion("BIG_MONEY not in", values, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIG_MONEY between", value1, value2, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIG_MONEY not between", value1, value2, "bigMoney");
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
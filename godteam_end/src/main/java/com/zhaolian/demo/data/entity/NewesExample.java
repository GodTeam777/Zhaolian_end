package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewesExample() {
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

        public Criteria andNidIsNull() {
            addCriterion("NID is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("NID is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(BigDecimal value) {
            addCriterion("NID =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(BigDecimal value) {
            addCriterion("NID <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(BigDecimal value) {
            addCriterion("NID >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NID >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(BigDecimal value) {
            addCriterion("NID <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NID <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<BigDecimal> values) {
            addCriterion("NID in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<BigDecimal> values) {
            addCriterion("NID not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NID between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NID not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("NEWS_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("NEWS_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("NEWS_TITLE =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("NEWS_TITLE <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("NEWS_TITLE >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("NEWS_TITLE >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("NEWS_TITLE <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("NEWS_TITLE <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("NEWS_TITLE like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("NEWS_TITLE not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("NEWS_TITLE in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("NEWS_TITLE not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("NEWS_TITLE between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("NEWS_TITLE not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsBodyIsNull() {
            addCriterion("NEWS_BODY is null");
            return (Criteria) this;
        }

        public Criteria andNewsBodyIsNotNull() {
            addCriterion("NEWS_BODY is not null");
            return (Criteria) this;
        }

        public Criteria andNewsBodyEqualTo(String value) {
            addCriterion("NEWS_BODY =", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotEqualTo(String value) {
            addCriterion("NEWS_BODY <>", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyGreaterThan(String value) {
            addCriterion("NEWS_BODY >", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyGreaterThanOrEqualTo(String value) {
            addCriterion("NEWS_BODY >=", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyLessThan(String value) {
            addCriterion("NEWS_BODY <", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyLessThanOrEqualTo(String value) {
            addCriterion("NEWS_BODY <=", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyLike(String value) {
            addCriterion("NEWS_BODY like", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotLike(String value) {
            addCriterion("NEWS_BODY not like", value, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyIn(List<String> values) {
            addCriterion("NEWS_BODY in", values, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotIn(List<String> values) {
            addCriterion("NEWS_BODY not in", values, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyBetween(String value1, String value2) {
            addCriterion("NEWS_BODY between", value1, value2, "newsBody");
            return (Criteria) this;
        }

        public Criteria andNewsBodyNotBetween(String value1, String value2) {
            addCriterion("NEWS_BODY not between", value1, value2, "newsBody");
            return (Criteria) this;
        }

        public Criteria andChubansheIsNull() {
            addCriterion("CHUBANSHE is null");
            return (Criteria) this;
        }

        public Criteria andChubansheIsNotNull() {
            addCriterion("CHUBANSHE is not null");
            return (Criteria) this;
        }

        public Criteria andChubansheEqualTo(String value) {
            addCriterion("CHUBANSHE =", value, "chubanshe");
            return (Criteria) this;
        }

        public Criteria andChubansheNotEqualTo(String value) {
            addCriterion("CHUBANSHE <>", value, "chubanshe");
            return (Criteria) this;
        }

        public Criteria andChubansheGreaterThan(String value) {
            addCriterion("CHUBANSHE >", value, "chubanshe");
            return (Criteria) this;
        }

        public Criteria andChubansheGreaterThanOrEqualTo(String value) {
            addCriterion("CHUBANSHE >=", value, "chubanshe");
            return (Criteria) this;
        }

        public Criteria andChubansheLessThan(String value) {
            addCriterion("CHUBANSHE <", value, "chubanshe");
            return (Criteria) this;
        }

        public Criteria andChubansheLessThanOrEqualTo(String value) {
            addCriterion("CHUBANSHE <=", value, "chubanshe");
            return (Criteria) this;
        }

        public Criteria andChubansheLike(String value) {
            addCriterion("CHUBANSHE like", value, "chubanshe");
            return (Criteria) this;
        }

        public Criteria andChubansheNotLike(String value) {
            addCriterion("CHUBANSHE not like", value, "chubanshe");
            return (Criteria) this;
        }

        public Criteria andChubansheIn(List<String> values) {
            addCriterion("CHUBANSHE in", values, "chubanshe");
            return (Criteria) this;
        }

        public Criteria andChubansheNotIn(List<String> values) {
            addCriterion("CHUBANSHE not in", values, "chubanshe");
            return (Criteria) this;
        }

        public Criteria andChubansheBetween(String value1, String value2) {
            addCriterion("CHUBANSHE between", value1, value2, "chubanshe");
            return (Criteria) this;
        }

        public Criteria andChubansheNotBetween(String value1, String value2) {
            addCriterion("CHUBANSHE not between", value1, value2, "chubanshe");
            return (Criteria) this;
        }

        public Criteria andFabiaonameIsNull() {
            addCriterion("FABIAONAME is null");
            return (Criteria) this;
        }

        public Criteria andFabiaonameIsNotNull() {
            addCriterion("FABIAONAME is not null");
            return (Criteria) this;
        }

        public Criteria andFabiaonameEqualTo(String value) {
            addCriterion("FABIAONAME =", value, "fabiaoname");
            return (Criteria) this;
        }

        public Criteria andFabiaonameNotEqualTo(String value) {
            addCriterion("FABIAONAME <>", value, "fabiaoname");
            return (Criteria) this;
        }

        public Criteria andFabiaonameGreaterThan(String value) {
            addCriterion("FABIAONAME >", value, "fabiaoname");
            return (Criteria) this;
        }

        public Criteria andFabiaonameGreaterThanOrEqualTo(String value) {
            addCriterion("FABIAONAME >=", value, "fabiaoname");
            return (Criteria) this;
        }

        public Criteria andFabiaonameLessThan(String value) {
            addCriterion("FABIAONAME <", value, "fabiaoname");
            return (Criteria) this;
        }

        public Criteria andFabiaonameLessThanOrEqualTo(String value) {
            addCriterion("FABIAONAME <=", value, "fabiaoname");
            return (Criteria) this;
        }

        public Criteria andFabiaonameLike(String value) {
            addCriterion("FABIAONAME like", value, "fabiaoname");
            return (Criteria) this;
        }

        public Criteria andFabiaonameNotLike(String value) {
            addCriterion("FABIAONAME not like", value, "fabiaoname");
            return (Criteria) this;
        }

        public Criteria andFabiaonameIn(List<String> values) {
            addCriterion("FABIAONAME in", values, "fabiaoname");
            return (Criteria) this;
        }

        public Criteria andFabiaonameNotIn(List<String> values) {
            addCriterion("FABIAONAME not in", values, "fabiaoname");
            return (Criteria) this;
        }

        public Criteria andFabiaonameBetween(String value1, String value2) {
            addCriterion("FABIAONAME between", value1, value2, "fabiaoname");
            return (Criteria) this;
        }

        public Criteria andFabiaonameNotBetween(String value1, String value2) {
            addCriterion("FABIAONAME not between", value1, value2, "fabiaoname");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNull() {
            addCriterion("NEWS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNotNull() {
            addCriterion("NEWS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNewsDateEqualTo(Date value) {
            addCriterion("NEWS_DATE =", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotEqualTo(Date value) {
            addCriterion("NEWS_DATE <>", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThan(Date value) {
            addCriterion("NEWS_DATE >", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("NEWS_DATE >=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThan(Date value) {
            addCriterion("NEWS_DATE <", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThanOrEqualTo(Date value) {
            addCriterion("NEWS_DATE <=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateIn(List<Date> values) {
            addCriterion("NEWS_DATE in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotIn(List<Date> values) {
            addCriterion("NEWS_DATE not in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateBetween(Date value1, Date value2) {
            addCriterion("NEWS_DATE between", value1, value2, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotBetween(Date value1, Date value2) {
            addCriterion("NEWS_DATE not between", value1, value2, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNtypeIsNull() {
            addCriterion("NTYPE is null");
            return (Criteria) this;
        }

        public Criteria andNtypeIsNotNull() {
            addCriterion("NTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNtypeEqualTo(BigDecimal value) {
            addCriterion("NTYPE =", value, "ntype");
            return (Criteria) this;
        }

        public Criteria andNtypeNotEqualTo(BigDecimal value) {
            addCriterion("NTYPE <>", value, "ntype");
            return (Criteria) this;
        }

        public Criteria andNtypeGreaterThan(BigDecimal value) {
            addCriterion("NTYPE >", value, "ntype");
            return (Criteria) this;
        }

        public Criteria andNtypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NTYPE >=", value, "ntype");
            return (Criteria) this;
        }

        public Criteria andNtypeLessThan(BigDecimal value) {
            addCriterion("NTYPE <", value, "ntype");
            return (Criteria) this;
        }

        public Criteria andNtypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NTYPE <=", value, "ntype");
            return (Criteria) this;
        }

        public Criteria andNtypeIn(List<BigDecimal> values) {
            addCriterion("NTYPE in", values, "ntype");
            return (Criteria) this;
        }

        public Criteria andNtypeNotIn(List<BigDecimal> values) {
            addCriterion("NTYPE not in", values, "ntype");
            return (Criteria) this;
        }

        public Criteria andNtypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NTYPE between", value1, value2, "ntype");
            return (Criteria) this;
        }

        public Criteria andNtypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NTYPE not between", value1, value2, "ntype");
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
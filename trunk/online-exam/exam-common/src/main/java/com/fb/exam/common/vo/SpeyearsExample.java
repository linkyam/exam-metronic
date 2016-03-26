package com.fb.exam.common.vo;

import java.util.ArrayList;
import java.util.List;

public class SpeyearsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer begin;

    protected Integer length;

    public SpeyearsExample() {
        oredCriteria = new ArrayList<Criteria>();
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

    public void setBegin(Integer begin) {
        this.begin=begin;
    }

    public Integer getBegin() {
        return begin;
    }

    public void setLength(Integer length) {
        this.length=length;
    }

    public Integer getLength() {
        return length;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andSpeyearsIdIsNull() {
            addCriterion("speyears_id is null");
            return (Criteria) this;
        }

        public Criteria andSpeyearsIdIsNotNull() {
            addCriterion("speyears_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpeyearsIdEqualTo(Integer value) {
            addCriterion("speyears_id =", value, "speyearsId");
            return (Criteria) this;
        }

        public Criteria andSpeyearsIdNotEqualTo(Integer value) {
            addCriterion("speyears_id <>", value, "speyearsId");
            return (Criteria) this;
        }

        public Criteria andSpeyearsIdGreaterThan(Integer value) {
            addCriterion("speyears_id >", value, "speyearsId");
            return (Criteria) this;
        }

        public Criteria andSpeyearsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("speyears_id >=", value, "speyearsId");
            return (Criteria) this;
        }

        public Criteria andSpeyearsIdLessThan(Integer value) {
            addCriterion("speyears_id <", value, "speyearsId");
            return (Criteria) this;
        }

        public Criteria andSpeyearsIdLessThanOrEqualTo(Integer value) {
            addCriterion("speyears_id <=", value, "speyearsId");
            return (Criteria) this;
        }

        public Criteria andSpeyearsIdIn(List<Integer> values) {
            addCriterion("speyears_id in", values, "speyearsId");
            return (Criteria) this;
        }

        public Criteria andSpeyearsIdNotIn(List<Integer> values) {
            addCriterion("speyears_id not in", values, "speyearsId");
            return (Criteria) this;
        }

        public Criteria andSpeyearsIdBetween(Integer value1, Integer value2) {
            addCriterion("speyears_id between", value1, value2, "speyearsId");
            return (Criteria) this;
        }

        public Criteria andSpeyearsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("speyears_id not between", value1, value2, "speyearsId");
            return (Criteria) this;
        }

        public Criteria andSpeyearsNameIsNull() {
            addCriterion("speyears_name is null");
            return (Criteria) this;
        }

        public Criteria andSpeyearsNameIsNotNull() {
            addCriterion("speyears_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpeyearsNameEqualTo(String value) {
            addCriterion("speyears_name =", value, "speyearsName");
            return (Criteria) this;
        }

        public Criteria andSpeyearsNameNotEqualTo(String value) {
            addCriterion("speyears_name <>", value, "speyearsName");
            return (Criteria) this;
        }

        public Criteria andSpeyearsNameGreaterThan(String value) {
            addCriterion("speyears_name >", value, "speyearsName");
            return (Criteria) this;
        }

        public Criteria andSpeyearsNameGreaterThanOrEqualTo(String value) {
            addCriterion("speyears_name >=", value, "speyearsName");
            return (Criteria) this;
        }

        public Criteria andSpeyearsNameLessThan(String value) {
            addCriterion("speyears_name <", value, "speyearsName");
            return (Criteria) this;
        }

        public Criteria andSpeyearsNameLessThanOrEqualTo(String value) {
            addCriterion("speyears_name <=", value, "speyearsName");
            return (Criteria) this;
        }

        public Criteria andSpeyearsNameLike(String value) {
            addCriterion("speyears_name like", value, "speyearsName");
            return (Criteria) this;
        }

        public Criteria andSpeyearsNameNotLike(String value) {
            addCriterion("speyears_name not like", value, "speyearsName");
            return (Criteria) this;
        }

        public Criteria andSpeyearsNameIn(List<String> values) {
            addCriterion("speyears_name in", values, "speyearsName");
            return (Criteria) this;
        }

        public Criteria andSpeyearsNameNotIn(List<String> values) {
            addCriterion("speyears_name not in", values, "speyearsName");
            return (Criteria) this;
        }

        public Criteria andSpeyearsNameBetween(String value1, String value2) {
            addCriterion("speyears_name between", value1, value2, "speyearsName");
            return (Criteria) this;
        }

        public Criteria andSpeyearsNameNotBetween(String value1, String value2) {
            addCriterion("speyears_name not between", value1, value2, "speyearsName");
            return (Criteria) this;
        }

        public Criteria andSpeyearsYearsIsNull() {
            addCriterion("speyears_years is null");
            return (Criteria) this;
        }

        public Criteria andSpeyearsYearsIsNotNull() {
            addCriterion("speyears_years is not null");
            return (Criteria) this;
        }

        public Criteria andSpeyearsYearsEqualTo(Integer value) {
            addCriterion("speyears_years =", value, "speyearsYears");
            return (Criteria) this;
        }

        public Criteria andSpeyearsYearsNotEqualTo(Integer value) {
            addCriterion("speyears_years <>", value, "speyearsYears");
            return (Criteria) this;
        }

        public Criteria andSpeyearsYearsGreaterThan(Integer value) {
            addCriterion("speyears_years >", value, "speyearsYears");
            return (Criteria) this;
        }

        public Criteria andSpeyearsYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("speyears_years >=", value, "speyearsYears");
            return (Criteria) this;
        }

        public Criteria andSpeyearsYearsLessThan(Integer value) {
            addCriterion("speyears_years <", value, "speyearsYears");
            return (Criteria) this;
        }

        public Criteria andSpeyearsYearsLessThanOrEqualTo(Integer value) {
            addCriterion("speyears_years <=", value, "speyearsYears");
            return (Criteria) this;
        }

        public Criteria andSpeyearsYearsIn(List<Integer> values) {
            addCriterion("speyears_years in", values, "speyearsYears");
            return (Criteria) this;
        }

        public Criteria andSpeyearsYearsNotIn(List<Integer> values) {
            addCriterion("speyears_years not in", values, "speyearsYears");
            return (Criteria) this;
        }

        public Criteria andSpeyearsYearsBetween(Integer value1, Integer value2) {
            addCriterion("speyears_years between", value1, value2, "speyearsYears");
            return (Criteria) this;
        }

        public Criteria andSpeyearsYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("speyears_years not between", value1, value2, "speyearsYears");
            return (Criteria) this;
        }

        public Criteria andSpeyearsNameLikeInsensitive(String value) {
            addCriterion("upper(speyears_name) like", value.toUpperCase(), "speyearsName");
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
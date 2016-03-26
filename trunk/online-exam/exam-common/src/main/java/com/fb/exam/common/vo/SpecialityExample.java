package com.fb.exam.common.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SpecialityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer begin;

    protected Integer length;

    public SpecialityExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSpecialityIdIsNull() {
            addCriterion("speciality_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdIsNotNull() {
            addCriterion("speciality_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdEqualTo(Integer value) {
            addCriterion("speciality_id =", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdNotEqualTo(Integer value) {
            addCriterion("speciality_id <>", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdGreaterThan(Integer value) {
            addCriterion("speciality_id >", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("speciality_id >=", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdLessThan(Integer value) {
            addCriterion("speciality_id <", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdLessThanOrEqualTo(Integer value) {
            addCriterion("speciality_id <=", value, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdIn(List<Integer> values) {
            addCriterion("speciality_id in", values, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdNotIn(List<Integer> values) {
            addCriterion("speciality_id not in", values, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdBetween(Integer value1, Integer value2) {
            addCriterion("speciality_id between", value1, value2, "specialityId");
            return (Criteria) this;
        }

        public Criteria andSpecialityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("speciality_id not between", value1, value2, "specialityId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNull() {
            addCriterion("college_id is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNotNull() {
            addCriterion("college_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdEqualTo(Integer value) {
            addCriterion("college_id =", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotEqualTo(Integer value) {
            addCriterion("college_id <>", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThan(Integer value) {
            addCriterion("college_id >", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("college_id >=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThan(Integer value) {
            addCriterion("college_id <", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThanOrEqualTo(Integer value) {
            addCriterion("college_id <=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIn(List<Integer> values) {
            addCriterion("college_id in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotIn(List<Integer> values) {
            addCriterion("college_id not in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdBetween(Integer value1, Integer value2) {
            addCriterion("college_id between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("college_id not between", value1, value2, "collegeId");
            return (Criteria) this;
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

        public Criteria andSpecialityNameIsNull() {
            addCriterion("speciality_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameIsNotNull() {
            addCriterion("speciality_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameEqualTo(String value) {
            addCriterion("speciality_name =", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameNotEqualTo(String value) {
            addCriterion("speciality_name <>", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameGreaterThan(String value) {
            addCriterion("speciality_name >", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameGreaterThanOrEqualTo(String value) {
            addCriterion("speciality_name >=", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameLessThan(String value) {
            addCriterion("speciality_name <", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameLessThanOrEqualTo(String value) {
            addCriterion("speciality_name <=", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameLike(String value) {
            addCriterion("speciality_name like", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameNotLike(String value) {
            addCriterion("speciality_name not like", value, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameIn(List<String> values) {
            addCriterion("speciality_name in", values, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameNotIn(List<String> values) {
            addCriterion("speciality_name not in", values, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameBetween(String value1, String value2) {
            addCriterion("speciality_name between", value1, value2, "specialityName");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameNotBetween(String value1, String value2) {
            addCriterion("speciality_name not between", value1, value2, "specialityName");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andSpecialityNameLikeInsensitive(String value) {
            addCriterion("upper(speciality_name) like", value.toUpperCase(), "specialityName");
            return (Criteria) this;
        }

        public Criteria andCommentLikeInsensitive(String value) {
            addCriterion("upper(comment) like", value.toUpperCase(), "comment");
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
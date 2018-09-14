package com.imooc.product.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductInfoExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pId is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pId is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pId =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pId <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pId >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pId >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pId <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pId <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pId in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pId not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pId between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pId not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pName is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pName is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pName =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pName <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pName >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pName >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pName <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pName <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pName like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pName not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pName in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pName not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pName between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pName not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPstateIsNull() {
            addCriterion("pState is null");
            return (Criteria) this;
        }

        public Criteria andPstateIsNotNull() {
            addCriterion("pState is not null");
            return (Criteria) this;
        }

        public Criteria andPstateEqualTo(Integer value) {
            addCriterion("pState =", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateNotEqualTo(Integer value) {
            addCriterion("pState <>", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateGreaterThan(Integer value) {
            addCriterion("pState >", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pState >=", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateLessThan(Integer value) {
            addCriterion("pState <", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateLessThanOrEqualTo(Integer value) {
            addCriterion("pState <=", value, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateIn(List<Integer> values) {
            addCriterion("pState in", values, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateNotIn(List<Integer> values) {
            addCriterion("pState not in", values, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateBetween(Integer value1, Integer value2) {
            addCriterion("pState between", value1, value2, "pstate");
            return (Criteria) this;
        }

        public Criteria andPstateNotBetween(Integer value1, Integer value2) {
            addCriterion("pState not between", value1, value2, "pstate");
            return (Criteria) this;
        }

        public Criteria andPpriceIsNull() {
            addCriterion("pPrice is null");
            return (Criteria) this;
        }

        public Criteria andPpriceIsNotNull() {
            addCriterion("pPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPpriceEqualTo(Double value) {
            addCriterion("pPrice =", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceNotEqualTo(Double value) {
            addCriterion("pPrice <>", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceGreaterThan(Double value) {
            addCriterion("pPrice >", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pPrice >=", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceLessThan(Double value) {
            addCriterion("pPrice <", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceLessThanOrEqualTo(Double value) {
            addCriterion("pPrice <=", value, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceIn(List<Double> values) {
            addCriterion("pPrice in", values, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceNotIn(List<Double> values) {
            addCriterion("pPrice not in", values, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceBetween(Double value1, Double value2) {
            addCriterion("pPrice between", value1, value2, "pprice");
            return (Criteria) this;
        }

        public Criteria andPpriceNotBetween(Double value1, Double value2) {
            addCriterion("pPrice not between", value1, value2, "pprice");
            return (Criteria) this;
        }

        public Criteria andPcountIsNull() {
            addCriterion("pCount is null");
            return (Criteria) this;
        }

        public Criteria andPcountIsNotNull() {
            addCriterion("pCount is not null");
            return (Criteria) this;
        }

        public Criteria andPcountEqualTo(Integer value) {
            addCriterion("pCount =", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountNotEqualTo(Integer value) {
            addCriterion("pCount <>", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountGreaterThan(Integer value) {
            addCriterion("pCount >", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pCount >=", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountLessThan(Integer value) {
            addCriterion("pCount <", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountLessThanOrEqualTo(Integer value) {
            addCriterion("pCount <=", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountIn(List<Integer> values) {
            addCriterion("pCount in", values, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountNotIn(List<Integer> values) {
            addCriterion("pCount not in", values, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountBetween(Integer value1, Integer value2) {
            addCriterion("pCount between", value1, value2, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountNotBetween(Integer value1, Integer value2) {
            addCriterion("pCount not between", value1, value2, "pcount");
            return (Criteria) this;
        }

        public Criteria andPtotalIsNull() {
            addCriterion("pTotal is null");
            return (Criteria) this;
        }

        public Criteria andPtotalIsNotNull() {
            addCriterion("pTotal is not null");
            return (Criteria) this;
        }

        public Criteria andPtotalEqualTo(Double value) {
            addCriterion("pTotal =", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalNotEqualTo(Double value) {
            addCriterion("pTotal <>", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalGreaterThan(Double value) {
            addCriterion("pTotal >", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalGreaterThanOrEqualTo(Double value) {
            addCriterion("pTotal >=", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalLessThan(Double value) {
            addCriterion("pTotal <", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalLessThanOrEqualTo(Double value) {
            addCriterion("pTotal <=", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalIn(List<Double> values) {
            addCriterion("pTotal in", values, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalNotIn(List<Double> values) {
            addCriterion("pTotal not in", values, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalBetween(Double value1, Double value2) {
            addCriterion("pTotal between", value1, value2, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalNotBetween(Double value1, Double value2) {
            addCriterion("pTotal not between", value1, value2, "ptotal");
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
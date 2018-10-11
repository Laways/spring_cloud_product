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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPStateIsNull() {
            addCriterion("p_state is null");
            return (Criteria) this;
        }

        public Criteria andPStateIsNotNull() {
            addCriterion("p_state is not null");
            return (Criteria) this;
        }

        public Criteria andPStateEqualTo(Integer value) {
            addCriterion("p_state =", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotEqualTo(Integer value) {
            addCriterion("p_state <>", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateGreaterThan(Integer value) {
            addCriterion("p_state >", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_state >=", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateLessThan(Integer value) {
            addCriterion("p_state <", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateLessThanOrEqualTo(Integer value) {
            addCriterion("p_state <=", value, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateIn(List<Integer> values) {
            addCriterion("p_state in", values, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotIn(List<Integer> values) {
            addCriterion("p_state not in", values, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateBetween(Integer value1, Integer value2) {
            addCriterion("p_state between", value1, value2, "pState");
            return (Criteria) this;
        }

        public Criteria andPStateNotBetween(Integer value1, Integer value2) {
            addCriterion("p_state not between", value1, value2, "pState");
            return (Criteria) this;
        }

        public Criteria andPPriceIsNull() {
            addCriterion("p_price is null");
            return (Criteria) this;
        }

        public Criteria andPPriceIsNotNull() {
            addCriterion("p_price is not null");
            return (Criteria) this;
        }

        public Criteria andPPriceEqualTo(Double value) {
            addCriterion("p_price =", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceNotEqualTo(Double value) {
            addCriterion("p_price <>", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceGreaterThan(Double value) {
            addCriterion("p_price >", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("p_price >=", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceLessThan(Double value) {
            addCriterion("p_price <", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceLessThanOrEqualTo(Double value) {
            addCriterion("p_price <=", value, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceIn(List<Double> values) {
            addCriterion("p_price in", values, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceNotIn(List<Double> values) {
            addCriterion("p_price not in", values, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceBetween(Double value1, Double value2) {
            addCriterion("p_price between", value1, value2, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPPriceNotBetween(Double value1, Double value2) {
            addCriterion("p_price not between", value1, value2, "pPrice");
            return (Criteria) this;
        }

        public Criteria andPCountIsNull() {
            addCriterion("p_count is null");
            return (Criteria) this;
        }

        public Criteria andPCountIsNotNull() {
            addCriterion("p_count is not null");
            return (Criteria) this;
        }

        public Criteria andPCountEqualTo(Integer value) {
            addCriterion("p_count =", value, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountNotEqualTo(Integer value) {
            addCriterion("p_count <>", value, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountGreaterThan(Integer value) {
            addCriterion("p_count >", value, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_count >=", value, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountLessThan(Integer value) {
            addCriterion("p_count <", value, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountLessThanOrEqualTo(Integer value) {
            addCriterion("p_count <=", value, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountIn(List<Integer> values) {
            addCriterion("p_count in", values, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountNotIn(List<Integer> values) {
            addCriterion("p_count not in", values, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountBetween(Integer value1, Integer value2) {
            addCriterion("p_count between", value1, value2, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountNotBetween(Integer value1, Integer value2) {
            addCriterion("p_count not between", value1, value2, "pCount");
            return (Criteria) this;
        }

        public Criteria andPTotalIsNull() {
            addCriterion("p_total is null");
            return (Criteria) this;
        }

        public Criteria andPTotalIsNotNull() {
            addCriterion("p_total is not null");
            return (Criteria) this;
        }

        public Criteria andPTotalEqualTo(Double value) {
            addCriterion("p_total =", value, "pTotal");
            return (Criteria) this;
        }

        public Criteria andPTotalNotEqualTo(Double value) {
            addCriterion("p_total <>", value, "pTotal");
            return (Criteria) this;
        }

        public Criteria andPTotalGreaterThan(Double value) {
            addCriterion("p_total >", value, "pTotal");
            return (Criteria) this;
        }

        public Criteria andPTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("p_total >=", value, "pTotal");
            return (Criteria) this;
        }

        public Criteria andPTotalLessThan(Double value) {
            addCriterion("p_total <", value, "pTotal");
            return (Criteria) this;
        }

        public Criteria andPTotalLessThanOrEqualTo(Double value) {
            addCriterion("p_total <=", value, "pTotal");
            return (Criteria) this;
        }

        public Criteria andPTotalIn(List<Double> values) {
            addCriterion("p_total in", values, "pTotal");
            return (Criteria) this;
        }

        public Criteria andPTotalNotIn(List<Double> values) {
            addCriterion("p_total not in", values, "pTotal");
            return (Criteria) this;
        }

        public Criteria andPTotalBetween(Double value1, Double value2) {
            addCriterion("p_total between", value1, value2, "pTotal");
            return (Criteria) this;
        }

        public Criteria andPTotalNotBetween(Double value1, Double value2) {
            addCriterion("p_total not between", value1, value2, "pTotal");
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
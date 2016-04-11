package edu.fiu.hmts.domain.hmts_repos;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class FunctionRoleExample.
 */
public class FunctionRoleExample {
    
    /** The order by clause. */
    protected String orderByClause;

    /** The distinct. */
    protected boolean distinct;

    /** The ored criteria. */
    protected List<Criteria> oredCriteria;

    /**
	 * Instantiates a new function role example.
	 */
    public FunctionRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
	 * Sets the order by clause.
	 *
	 * @param orderByClause
	 *            the new order by clause
	 */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
	 * Gets the order by clause.
	 *
	 * @return the order by clause
	 */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
	 * Sets the distinct.
	 *
	 * @param distinct
	 *            the new distinct
	 */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
	 * Checks if is distinct.
	 *
	 * @return true, if is distinct
	 */
    public boolean isDistinct() {
        return distinct;
    }

    /**
	 * Gets the ored criteria.
	 *
	 * @return the ored criteria
	 */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
	 * Or.
	 *
	 * @param criteria
	 *            the criteria
	 */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
	 * Or.
	 *
	 * @return the criteria
	 */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
	 * Creates the criteria.
	 *
	 * @return the criteria
	 */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
	 * Creates the criteria internal.
	 *
	 * @return the criteria
	 */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
	 * Clear.
	 */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
	 * The Class GeneratedCriteria.
	 */
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

        public Criteria andFunctionIdIsNull() {
            addCriterion("function_id is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNotNull() {
            addCriterion("function_id is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdEqualTo(Integer value) {
            addCriterion("function_id =", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotEqualTo(Integer value) {
            addCriterion("function_id <>", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThan(Integer value) {
            addCriterion("function_id >", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("function_id >=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThan(Integer value) {
            addCriterion("function_id <", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThanOrEqualTo(Integer value) {
            addCriterion("function_id <=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIn(List<Integer> values) {
            addCriterion("function_id in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotIn(List<Integer> values) {
            addCriterion("function_id not in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdBetween(Integer value1, Integer value2) {
            addCriterion("function_id between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("function_id not between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }
    }

    /**
	 * The Class Criteria.
	 */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
	 * The Class Criterion.
	 */
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
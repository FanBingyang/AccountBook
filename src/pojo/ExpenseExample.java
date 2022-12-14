package pojo;

import java.util.ArrayList;
import java.util.List;

public class ExpenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpenseExample() {
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

        public Criteria andExpenseIdIsNull() {
            addCriterion("expense_id is null");
            return (Criteria) this;
        }

        public Criteria andExpenseIdIsNotNull() {
            addCriterion("expense_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseIdEqualTo(Integer value) {
            addCriterion("expense_id =", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdNotEqualTo(Integer value) {
            addCriterion("expense_id <>", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdGreaterThan(Integer value) {
            addCriterion("expense_id >", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("expense_id >=", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdLessThan(Integer value) {
            addCriterion("expense_id <", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdLessThanOrEqualTo(Integer value) {
            addCriterion("expense_id <=", value, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdIn(List<Integer> values) {
            addCriterion("expense_id in", values, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdNotIn(List<Integer> values) {
            addCriterion("expense_id not in", values, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdBetween(Integer value1, Integer value2) {
            addCriterion("expense_id between", value1, value2, "expenseId");
            return (Criteria) this;
        }

        public Criteria andExpenseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("expense_id not between", value1, value2, "expenseId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andExpenseTitleIsNull() {
            addCriterion("expense_title is null");
            return (Criteria) this;
        }

        public Criteria andExpenseTitleIsNotNull() {
            addCriterion("expense_title is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseTitleEqualTo(String value) {
            addCriterion("expense_title =", value, "expenseTitle");
            return (Criteria) this;
        }

        public Criteria andExpenseTitleNotEqualTo(String value) {
            addCriterion("expense_title <>", value, "expenseTitle");
            return (Criteria) this;
        }

        public Criteria andExpenseTitleGreaterThan(String value) {
            addCriterion("expense_title >", value, "expenseTitle");
            return (Criteria) this;
        }

        public Criteria andExpenseTitleGreaterThanOrEqualTo(String value) {
            addCriterion("expense_title >=", value, "expenseTitle");
            return (Criteria) this;
        }

        public Criteria andExpenseTitleLessThan(String value) {
            addCriterion("expense_title <", value, "expenseTitle");
            return (Criteria) this;
        }

        public Criteria andExpenseTitleLessThanOrEqualTo(String value) {
            addCriterion("expense_title <=", value, "expenseTitle");
            return (Criteria) this;
        }

        public Criteria andExpenseTitleLike(String value) {
            addCriterion("expense_title like", value, "expenseTitle");
            return (Criteria) this;
        }

        public Criteria andExpenseTitleNotLike(String value) {
            addCriterion("expense_title not like", value, "expenseTitle");
            return (Criteria) this;
        }

        public Criteria andExpenseTitleIn(List<String> values) {
            addCriterion("expense_title in", values, "expenseTitle");
            return (Criteria) this;
        }

        public Criteria andExpenseTitleNotIn(List<String> values) {
            addCriterion("expense_title not in", values, "expenseTitle");
            return (Criteria) this;
        }

        public Criteria andExpenseTitleBetween(String value1, String value2) {
            addCriterion("expense_title between", value1, value2, "expenseTitle");
            return (Criteria) this;
        }

        public Criteria andExpenseTitleNotBetween(String value1, String value2) {
            addCriterion("expense_title not between", value1, value2, "expenseTitle");
            return (Criteria) this;
        }

        public Criteria andExpenseCategoryIsNull() {
            addCriterion("expense_category is null");
            return (Criteria) this;
        }

        public Criteria andExpenseCategoryIsNotNull() {
            addCriterion("expense_category is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseCategoryEqualTo(String value) {
            addCriterion("expense_category =", value, "expenseCategory");
            return (Criteria) this;
        }

        public Criteria andExpenseCategoryNotEqualTo(String value) {
            addCriterion("expense_category <>", value, "expenseCategory");
            return (Criteria) this;
        }

        public Criteria andExpenseCategoryGreaterThan(String value) {
            addCriterion("expense_category >", value, "expenseCategory");
            return (Criteria) this;
        }

        public Criteria andExpenseCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("expense_category >=", value, "expenseCategory");
            return (Criteria) this;
        }

        public Criteria andExpenseCategoryLessThan(String value) {
            addCriterion("expense_category <", value, "expenseCategory");
            return (Criteria) this;
        }

        public Criteria andExpenseCategoryLessThanOrEqualTo(String value) {
            addCriterion("expense_category <=", value, "expenseCategory");
            return (Criteria) this;
        }

        public Criteria andExpenseCategoryLike(String value) {
            addCriterion("expense_category like", value, "expenseCategory");
            return (Criteria) this;
        }

        public Criteria andExpenseCategoryNotLike(String value) {
            addCriterion("expense_category not like", value, "expenseCategory");
            return (Criteria) this;
        }

        public Criteria andExpenseCategoryIn(List<String> values) {
            addCriterion("expense_category in", values, "expenseCategory");
            return (Criteria) this;
        }

        public Criteria andExpenseCategoryNotIn(List<String> values) {
            addCriterion("expense_category not in", values, "expenseCategory");
            return (Criteria) this;
        }

        public Criteria andExpenseCategoryBetween(String value1, String value2) {
            addCriterion("expense_category between", value1, value2, "expenseCategory");
            return (Criteria) this;
        }

        public Criteria andExpenseCategoryNotBetween(String value1, String value2) {
            addCriterion("expense_category not between", value1, value2, "expenseCategory");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyIsNull() {
            addCriterion("expense_money is null");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyIsNotNull() {
            addCriterion("expense_money is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyEqualTo(Float value) {
            addCriterion("expense_money =", value, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyNotEqualTo(Float value) {
            addCriterion("expense_money <>", value, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyGreaterThan(Float value) {
            addCriterion("expense_money >", value, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("expense_money >=", value, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyLessThan(Float value) {
            addCriterion("expense_money <", value, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyLessThanOrEqualTo(Float value) {
            addCriterion("expense_money <=", value, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyIn(List<Float> values) {
            addCriterion("expense_money in", values, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyNotIn(List<Float> values) {
            addCriterion("expense_money not in", values, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyBetween(Float value1, Float value2) {
            addCriterion("expense_money between", value1, value2, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseMoneyNotBetween(Float value1, Float value2) {
            addCriterion("expense_money not between", value1, value2, "expenseMoney");
            return (Criteria) this;
        }

        public Criteria andExpenseExplainIsNull() {
            addCriterion("expense_explain is null");
            return (Criteria) this;
        }

        public Criteria andExpenseExplainIsNotNull() {
            addCriterion("expense_explain is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseExplainEqualTo(String value) {
            addCriterion("expense_explain =", value, "expenseExplain");
            return (Criteria) this;
        }

        public Criteria andExpenseExplainNotEqualTo(String value) {
            addCriterion("expense_explain <>", value, "expenseExplain");
            return (Criteria) this;
        }

        public Criteria andExpenseExplainGreaterThan(String value) {
            addCriterion("expense_explain >", value, "expenseExplain");
            return (Criteria) this;
        }

        public Criteria andExpenseExplainGreaterThanOrEqualTo(String value) {
            addCriterion("expense_explain >=", value, "expenseExplain");
            return (Criteria) this;
        }

        public Criteria andExpenseExplainLessThan(String value) {
            addCriterion("expense_explain <", value, "expenseExplain");
            return (Criteria) this;
        }

        public Criteria andExpenseExplainLessThanOrEqualTo(String value) {
            addCriterion("expense_explain <=", value, "expenseExplain");
            return (Criteria) this;
        }

        public Criteria andExpenseExplainLike(String value) {
            addCriterion("expense_explain like", value, "expenseExplain");
            return (Criteria) this;
        }

        public Criteria andExpenseExplainNotLike(String value) {
            addCriterion("expense_explain not like", value, "expenseExplain");
            return (Criteria) this;
        }

        public Criteria andExpenseExplainIn(List<String> values) {
            addCriterion("expense_explain in", values, "expenseExplain");
            return (Criteria) this;
        }

        public Criteria andExpenseExplainNotIn(List<String> values) {
            addCriterion("expense_explain not in", values, "expenseExplain");
            return (Criteria) this;
        }

        public Criteria andExpenseExplainBetween(String value1, String value2) {
            addCriterion("expense_explain between", value1, value2, "expenseExplain");
            return (Criteria) this;
        }

        public Criteria andExpenseExplainNotBetween(String value1, String value2) {
            addCriterion("expense_explain not between", value1, value2, "expenseExplain");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeIsNull() {
            addCriterion("expense_time is null");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeIsNotNull() {
            addCriterion("expense_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeEqualTo(String value) {
            addCriterion("expense_time =", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeNotEqualTo(String value) {
            addCriterion("expense_time <>", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeGreaterThan(String value) {
            addCriterion("expense_time >", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("expense_time >=", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeLessThan(String value) {
            addCriterion("expense_time <", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeLessThanOrEqualTo(String value) {
            addCriterion("expense_time <=", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeLike(String value) {
            addCriterion("expense_time like", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeNotLike(String value) {
            addCriterion("expense_time not like", value, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeIn(List<String> values) {
            addCriterion("expense_time in", values, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeNotIn(List<String> values) {
            addCriterion("expense_time not in", values, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeBetween(String value1, String value2) {
            addCriterion("expense_time between", value1, value2, "expenseTime");
            return (Criteria) this;
        }

        public Criteria andExpenseTimeNotBetween(String value1, String value2) {
            addCriterion("expense_time not between", value1, value2, "expenseTime");
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
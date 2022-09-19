package pojo;

import java.util.ArrayList;
import java.util.List;

public class MonthlyBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonthlyBillExample() {
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

        public Criteria andMonthlyIdIsNull() {
            addCriterion("monthly_id is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyIdIsNotNull() {
            addCriterion("monthly_id is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyIdEqualTo(Integer value) {
            addCriterion("monthly_id =", value, "monthlyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyIdNotEqualTo(Integer value) {
            addCriterion("monthly_id <>", value, "monthlyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyIdGreaterThan(Integer value) {
            addCriterion("monthly_id >", value, "monthlyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_id >=", value, "monthlyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyIdLessThan(Integer value) {
            addCriterion("monthly_id <", value, "monthlyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyIdLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_id <=", value, "monthlyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyIdIn(List<Integer> values) {
            addCriterion("monthly_id in", values, "monthlyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyIdNotIn(List<Integer> values) {
            addCriterion("monthly_id not in", values, "monthlyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyIdBetween(Integer value1, Integer value2) {
            addCriterion("monthly_id between", value1, value2, "monthlyId");
            return (Criteria) this;
        }

        public Criteria andMonthlyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_id not between", value1, value2, "monthlyId");
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

        public Criteria andMonthlySnacksIsNull() {
            addCriterion("monthly_snacks is null");
            return (Criteria) this;
        }

        public Criteria andMonthlySnacksIsNotNull() {
            addCriterion("monthly_snacks is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlySnacksEqualTo(Float value) {
            addCriterion("monthly_snacks =", value, "monthlySnacks");
            return (Criteria) this;
        }

        public Criteria andMonthlySnacksNotEqualTo(Float value) {
            addCriterion("monthly_snacks <>", value, "monthlySnacks");
            return (Criteria) this;
        }

        public Criteria andMonthlySnacksGreaterThan(Float value) {
            addCriterion("monthly_snacks >", value, "monthlySnacks");
            return (Criteria) this;
        }

        public Criteria andMonthlySnacksGreaterThanOrEqualTo(Float value) {
            addCriterion("monthly_snacks >=", value, "monthlySnacks");
            return (Criteria) this;
        }

        public Criteria andMonthlySnacksLessThan(Float value) {
            addCriterion("monthly_snacks <", value, "monthlySnacks");
            return (Criteria) this;
        }

        public Criteria andMonthlySnacksLessThanOrEqualTo(Float value) {
            addCriterion("monthly_snacks <=", value, "monthlySnacks");
            return (Criteria) this;
        }

        public Criteria andMonthlySnacksIn(List<Float> values) {
            addCriterion("monthly_snacks in", values, "monthlySnacks");
            return (Criteria) this;
        }

        public Criteria andMonthlySnacksNotIn(List<Float> values) {
            addCriterion("monthly_snacks not in", values, "monthlySnacks");
            return (Criteria) this;
        }

        public Criteria andMonthlySnacksBetween(Float value1, Float value2) {
            addCriterion("monthly_snacks between", value1, value2, "monthlySnacks");
            return (Criteria) this;
        }

        public Criteria andMonthlySnacksNotBetween(Float value1, Float value2) {
            addCriterion("monthly_snacks not between", value1, value2, "monthlySnacks");
            return (Criteria) this;
        }

        public Criteria andMonthlyFareIsNull() {
            addCriterion("monthly_fare is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyFareIsNotNull() {
            addCriterion("monthly_fare is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyFareEqualTo(Float value) {
            addCriterion("monthly_fare =", value, "monthlyFare");
            return (Criteria) this;
        }

        public Criteria andMonthlyFareNotEqualTo(Float value) {
            addCriterion("monthly_fare <>", value, "monthlyFare");
            return (Criteria) this;
        }

        public Criteria andMonthlyFareGreaterThan(Float value) {
            addCriterion("monthly_fare >", value, "monthlyFare");
            return (Criteria) this;
        }

        public Criteria andMonthlyFareGreaterThanOrEqualTo(Float value) {
            addCriterion("monthly_fare >=", value, "monthlyFare");
            return (Criteria) this;
        }

        public Criteria andMonthlyFareLessThan(Float value) {
            addCriterion("monthly_fare <", value, "monthlyFare");
            return (Criteria) this;
        }

        public Criteria andMonthlyFareLessThanOrEqualTo(Float value) {
            addCriterion("monthly_fare <=", value, "monthlyFare");
            return (Criteria) this;
        }

        public Criteria andMonthlyFareIn(List<Float> values) {
            addCriterion("monthly_fare in", values, "monthlyFare");
            return (Criteria) this;
        }

        public Criteria andMonthlyFareNotIn(List<Float> values) {
            addCriterion("monthly_fare not in", values, "monthlyFare");
            return (Criteria) this;
        }

        public Criteria andMonthlyFareBetween(Float value1, Float value2) {
            addCriterion("monthly_fare between", value1, value2, "monthlyFare");
            return (Criteria) this;
        }

        public Criteria andMonthlyFareNotBetween(Float value1, Float value2) {
            addCriterion("monthly_fare not between", value1, value2, "monthlyFare");
            return (Criteria) this;
        }

        public Criteria andMonthlyStayIsNull() {
            addCriterion("monthly_stay is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyStayIsNotNull() {
            addCriterion("monthly_stay is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyStayEqualTo(Float value) {
            addCriterion("monthly_stay =", value, "monthlyStay");
            return (Criteria) this;
        }

        public Criteria andMonthlyStayNotEqualTo(Float value) {
            addCriterion("monthly_stay <>", value, "monthlyStay");
            return (Criteria) this;
        }

        public Criteria andMonthlyStayGreaterThan(Float value) {
            addCriterion("monthly_stay >", value, "monthlyStay");
            return (Criteria) this;
        }

        public Criteria andMonthlyStayGreaterThanOrEqualTo(Float value) {
            addCriterion("monthly_stay >=", value, "monthlyStay");
            return (Criteria) this;
        }

        public Criteria andMonthlyStayLessThan(Float value) {
            addCriterion("monthly_stay <", value, "monthlyStay");
            return (Criteria) this;
        }

        public Criteria andMonthlyStayLessThanOrEqualTo(Float value) {
            addCriterion("monthly_stay <=", value, "monthlyStay");
            return (Criteria) this;
        }

        public Criteria andMonthlyStayIn(List<Float> values) {
            addCriterion("monthly_stay in", values, "monthlyStay");
            return (Criteria) this;
        }

        public Criteria andMonthlyStayNotIn(List<Float> values) {
            addCriterion("monthly_stay not in", values, "monthlyStay");
            return (Criteria) this;
        }

        public Criteria andMonthlyStayBetween(Float value1, Float value2) {
            addCriterion("monthly_stay between", value1, value2, "monthlyStay");
            return (Criteria) this;
        }

        public Criteria andMonthlyStayNotBetween(Float value1, Float value2) {
            addCriterion("monthly_stay not between", value1, value2, "monthlyStay");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepastIsNull() {
            addCriterion("monthly_repast is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepastIsNotNull() {
            addCriterion("monthly_repast is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepastEqualTo(Float value) {
            addCriterion("monthly_repast =", value, "monthlyRepast");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepastNotEqualTo(Float value) {
            addCriterion("monthly_repast <>", value, "monthlyRepast");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepastGreaterThan(Float value) {
            addCriterion("monthly_repast >", value, "monthlyRepast");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepastGreaterThanOrEqualTo(Float value) {
            addCriterion("monthly_repast >=", value, "monthlyRepast");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepastLessThan(Float value) {
            addCriterion("monthly_repast <", value, "monthlyRepast");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepastLessThanOrEqualTo(Float value) {
            addCriterion("monthly_repast <=", value, "monthlyRepast");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepastIn(List<Float> values) {
            addCriterion("monthly_repast in", values, "monthlyRepast");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepastNotIn(List<Float> values) {
            addCriterion("monthly_repast not in", values, "monthlyRepast");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepastBetween(Float value1, Float value2) {
            addCriterion("monthly_repast between", value1, value2, "monthlyRepast");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepastNotBetween(Float value1, Float value2) {
            addCriterion("monthly_repast not between", value1, value2, "monthlyRepast");
            return (Criteria) this;
        }

        public Criteria andMonthlyRecreationIsNull() {
            addCriterion("monthly_recreation is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRecreationIsNotNull() {
            addCriterion("monthly_recreation is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRecreationEqualTo(Float value) {
            addCriterion("monthly_recreation =", value, "monthlyRecreation");
            return (Criteria) this;
        }

        public Criteria andMonthlyRecreationNotEqualTo(Float value) {
            addCriterion("monthly_recreation <>", value, "monthlyRecreation");
            return (Criteria) this;
        }

        public Criteria andMonthlyRecreationGreaterThan(Float value) {
            addCriterion("monthly_recreation >", value, "monthlyRecreation");
            return (Criteria) this;
        }

        public Criteria andMonthlyRecreationGreaterThanOrEqualTo(Float value) {
            addCriterion("monthly_recreation >=", value, "monthlyRecreation");
            return (Criteria) this;
        }

        public Criteria andMonthlyRecreationLessThan(Float value) {
            addCriterion("monthly_recreation <", value, "monthlyRecreation");
            return (Criteria) this;
        }

        public Criteria andMonthlyRecreationLessThanOrEqualTo(Float value) {
            addCriterion("monthly_recreation <=", value, "monthlyRecreation");
            return (Criteria) this;
        }

        public Criteria andMonthlyRecreationIn(List<Float> values) {
            addCriterion("monthly_recreation in", values, "monthlyRecreation");
            return (Criteria) this;
        }

        public Criteria andMonthlyRecreationNotIn(List<Float> values) {
            addCriterion("monthly_recreation not in", values, "monthlyRecreation");
            return (Criteria) this;
        }

        public Criteria andMonthlyRecreationBetween(Float value1, Float value2) {
            addCriterion("monthly_recreation between", value1, value2, "monthlyRecreation");
            return (Criteria) this;
        }

        public Criteria andMonthlyRecreationNotBetween(Float value1, Float value2) {
            addCriterion("monthly_recreation not between", value1, value2, "monthlyRecreation");
            return (Criteria) this;
        }

        public Criteria andMonthlyClothingIsNull() {
            addCriterion("monthly_clothing is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyClothingIsNotNull() {
            addCriterion("monthly_clothing is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyClothingEqualTo(Float value) {
            addCriterion("monthly_clothing =", value, "monthlyClothing");
            return (Criteria) this;
        }

        public Criteria andMonthlyClothingNotEqualTo(Float value) {
            addCriterion("monthly_clothing <>", value, "monthlyClothing");
            return (Criteria) this;
        }

        public Criteria andMonthlyClothingGreaterThan(Float value) {
            addCriterion("monthly_clothing >", value, "monthlyClothing");
            return (Criteria) this;
        }

        public Criteria andMonthlyClothingGreaterThanOrEqualTo(Float value) {
            addCriterion("monthly_clothing >=", value, "monthlyClothing");
            return (Criteria) this;
        }

        public Criteria andMonthlyClothingLessThan(Float value) {
            addCriterion("monthly_clothing <", value, "monthlyClothing");
            return (Criteria) this;
        }

        public Criteria andMonthlyClothingLessThanOrEqualTo(Float value) {
            addCriterion("monthly_clothing <=", value, "monthlyClothing");
            return (Criteria) this;
        }

        public Criteria andMonthlyClothingIn(List<Float> values) {
            addCriterion("monthly_clothing in", values, "monthlyClothing");
            return (Criteria) this;
        }

        public Criteria andMonthlyClothingNotIn(List<Float> values) {
            addCriterion("monthly_clothing not in", values, "monthlyClothing");
            return (Criteria) this;
        }

        public Criteria andMonthlyClothingBetween(Float value1, Float value2) {
            addCriterion("monthly_clothing between", value1, value2, "monthlyClothing");
            return (Criteria) this;
        }

        public Criteria andMonthlyClothingNotBetween(Float value1, Float value2) {
            addCriterion("monthly_clothing not between", value1, value2, "monthlyClothing");
            return (Criteria) this;
        }

        public Criteria andMonthlyDailyIsNull() {
            addCriterion("monthly_daily is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyDailyIsNotNull() {
            addCriterion("monthly_daily is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyDailyEqualTo(Float value) {
            addCriterion("monthly_daily =", value, "monthlyDaily");
            return (Criteria) this;
        }

        public Criteria andMonthlyDailyNotEqualTo(Float value) {
            addCriterion("monthly_daily <>", value, "monthlyDaily");
            return (Criteria) this;
        }

        public Criteria andMonthlyDailyGreaterThan(Float value) {
            addCriterion("monthly_daily >", value, "monthlyDaily");
            return (Criteria) this;
        }

        public Criteria andMonthlyDailyGreaterThanOrEqualTo(Float value) {
            addCriterion("monthly_daily >=", value, "monthlyDaily");
            return (Criteria) this;
        }

        public Criteria andMonthlyDailyLessThan(Float value) {
            addCriterion("monthly_daily <", value, "monthlyDaily");
            return (Criteria) this;
        }

        public Criteria andMonthlyDailyLessThanOrEqualTo(Float value) {
            addCriterion("monthly_daily <=", value, "monthlyDaily");
            return (Criteria) this;
        }

        public Criteria andMonthlyDailyIn(List<Float> values) {
            addCriterion("monthly_daily in", values, "monthlyDaily");
            return (Criteria) this;
        }

        public Criteria andMonthlyDailyNotIn(List<Float> values) {
            addCriterion("monthly_daily not in", values, "monthlyDaily");
            return (Criteria) this;
        }

        public Criteria andMonthlyDailyBetween(Float value1, Float value2) {
            addCriterion("monthly_daily between", value1, value2, "monthlyDaily");
            return (Criteria) this;
        }

        public Criteria andMonthlyDailyNotBetween(Float value1, Float value2) {
            addCriterion("monthly_daily not between", value1, value2, "monthlyDaily");
            return (Criteria) this;
        }

        public Criteria andMonthlyOtherIsNull() {
            addCriterion("monthly_other is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyOtherIsNotNull() {
            addCriterion("monthly_other is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyOtherEqualTo(Float value) {
            addCriterion("monthly_other =", value, "monthlyOther");
            return (Criteria) this;
        }

        public Criteria andMonthlyOtherNotEqualTo(Float value) {
            addCriterion("monthly_other <>", value, "monthlyOther");
            return (Criteria) this;
        }

        public Criteria andMonthlyOtherGreaterThan(Float value) {
            addCriterion("monthly_other >", value, "monthlyOther");
            return (Criteria) this;
        }

        public Criteria andMonthlyOtherGreaterThanOrEqualTo(Float value) {
            addCriterion("monthly_other >=", value, "monthlyOther");
            return (Criteria) this;
        }

        public Criteria andMonthlyOtherLessThan(Float value) {
            addCriterion("monthly_other <", value, "monthlyOther");
            return (Criteria) this;
        }

        public Criteria andMonthlyOtherLessThanOrEqualTo(Float value) {
            addCriterion("monthly_other <=", value, "monthlyOther");
            return (Criteria) this;
        }

        public Criteria andMonthlyOtherIn(List<Float> values) {
            addCriterion("monthly_other in", values, "monthlyOther");
            return (Criteria) this;
        }

        public Criteria andMonthlyOtherNotIn(List<Float> values) {
            addCriterion("monthly_other not in", values, "monthlyOther");
            return (Criteria) this;
        }

        public Criteria andMonthlyOtherBetween(Float value1, Float value2) {
            addCriterion("monthly_other between", value1, value2, "monthlyOther");
            return (Criteria) this;
        }

        public Criteria andMonthlyOtherNotBetween(Float value1, Float value2) {
            addCriterion("monthly_other not between", value1, value2, "monthlyOther");
            return (Criteria) this;
        }

        public Criteria andMonthlyTotalIsNull() {
            addCriterion("monthly_total is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTotalIsNotNull() {
            addCriterion("monthly_total is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTotalEqualTo(Float value) {
            addCriterion("monthly_total =", value, "monthlyTotal");
            return (Criteria) this;
        }

        public Criteria andMonthlyTotalNotEqualTo(Float value) {
            addCriterion("monthly_total <>", value, "monthlyTotal");
            return (Criteria) this;
        }

        public Criteria andMonthlyTotalGreaterThan(Float value) {
            addCriterion("monthly_total >", value, "monthlyTotal");
            return (Criteria) this;
        }

        public Criteria andMonthlyTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("monthly_total >=", value, "monthlyTotal");
            return (Criteria) this;
        }

        public Criteria andMonthlyTotalLessThan(Float value) {
            addCriterion("monthly_total <", value, "monthlyTotal");
            return (Criteria) this;
        }

        public Criteria andMonthlyTotalLessThanOrEqualTo(Float value) {
            addCriterion("monthly_total <=", value, "monthlyTotal");
            return (Criteria) this;
        }

        public Criteria andMonthlyTotalIn(List<Float> values) {
            addCriterion("monthly_total in", values, "monthlyTotal");
            return (Criteria) this;
        }

        public Criteria andMonthlyTotalNotIn(List<Float> values) {
            addCriterion("monthly_total not in", values, "monthlyTotal");
            return (Criteria) this;
        }

        public Criteria andMonthlyTotalBetween(Float value1, Float value2) {
            addCriterion("monthly_total between", value1, value2, "monthlyTotal");
            return (Criteria) this;
        }

        public Criteria andMonthlyTotalNotBetween(Float value1, Float value2) {
            addCriterion("monthly_total not between", value1, value2, "monthlyTotal");
            return (Criteria) this;
        }

        public Criteria andMonthlyTimeIsNull() {
            addCriterion("monthly_time is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTimeIsNotNull() {
            addCriterion("monthly_time is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyTimeEqualTo(String value) {
            addCriterion("monthly_time =", value, "monthlyTime");
            return (Criteria) this;
        }

        public Criteria andMonthlyTimeNotEqualTo(String value) {
            addCriterion("monthly_time <>", value, "monthlyTime");
            return (Criteria) this;
        }

        public Criteria andMonthlyTimeGreaterThan(String value) {
            addCriterion("monthly_time >", value, "monthlyTime");
            return (Criteria) this;
        }

        public Criteria andMonthlyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("monthly_time >=", value, "monthlyTime");
            return (Criteria) this;
        }

        public Criteria andMonthlyTimeLessThan(String value) {
            addCriterion("monthly_time <", value, "monthlyTime");
            return (Criteria) this;
        }

        public Criteria andMonthlyTimeLessThanOrEqualTo(String value) {
            addCriterion("monthly_time <=", value, "monthlyTime");
            return (Criteria) this;
        }

        public Criteria andMonthlyTimeLike(String value) {
            addCriterion("monthly_time like", value, "monthlyTime");
            return (Criteria) this;
        }

        public Criteria andMonthlyTimeNotLike(String value) {
            addCriterion("monthly_time not like", value, "monthlyTime");
            return (Criteria) this;
        }

        public Criteria andMonthlyTimeIn(List<String> values) {
            addCriterion("monthly_time in", values, "monthlyTime");
            return (Criteria) this;
        }

        public Criteria andMonthlyTimeNotIn(List<String> values) {
            addCriterion("monthly_time not in", values, "monthlyTime");
            return (Criteria) this;
        }

        public Criteria andMonthlyTimeBetween(String value1, String value2) {
            addCriterion("monthly_time between", value1, value2, "monthlyTime");
            return (Criteria) this;
        }

        public Criteria andMonthlyTimeNotBetween(String value1, String value2) {
            addCriterion("monthly_time not between", value1, value2, "monthlyTime");
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
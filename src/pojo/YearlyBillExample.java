package pojo;

import java.util.ArrayList;
import java.util.List;

public class YearlyBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YearlyBillExample() {
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

        public Criteria andYearlyIdIsNull() {
            addCriterion("yearly_id is null");
            return (Criteria) this;
        }

        public Criteria andYearlyIdIsNotNull() {
            addCriterion("yearly_id is not null");
            return (Criteria) this;
        }

        public Criteria andYearlyIdEqualTo(Integer value) {
            addCriterion("yearly_id =", value, "yearlyId");
            return (Criteria) this;
        }

        public Criteria andYearlyIdNotEqualTo(Integer value) {
            addCriterion("yearly_id <>", value, "yearlyId");
            return (Criteria) this;
        }

        public Criteria andYearlyIdGreaterThan(Integer value) {
            addCriterion("yearly_id >", value, "yearlyId");
            return (Criteria) this;
        }

        public Criteria andYearlyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yearly_id >=", value, "yearlyId");
            return (Criteria) this;
        }

        public Criteria andYearlyIdLessThan(Integer value) {
            addCriterion("yearly_id <", value, "yearlyId");
            return (Criteria) this;
        }

        public Criteria andYearlyIdLessThanOrEqualTo(Integer value) {
            addCriterion("yearly_id <=", value, "yearlyId");
            return (Criteria) this;
        }

        public Criteria andYearlyIdIn(List<Integer> values) {
            addCriterion("yearly_id in", values, "yearlyId");
            return (Criteria) this;
        }

        public Criteria andYearlyIdNotIn(List<Integer> values) {
            addCriterion("yearly_id not in", values, "yearlyId");
            return (Criteria) this;
        }

        public Criteria andYearlyIdBetween(Integer value1, Integer value2) {
            addCriterion("yearly_id between", value1, value2, "yearlyId");
            return (Criteria) this;
        }

        public Criteria andYearlyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yearly_id not between", value1, value2, "yearlyId");
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

        public Criteria andYearlySnacksIsNull() {
            addCriterion("yearly_snacks is null");
            return (Criteria) this;
        }

        public Criteria andYearlySnacksIsNotNull() {
            addCriterion("yearly_snacks is not null");
            return (Criteria) this;
        }

        public Criteria andYearlySnacksEqualTo(Float value) {
            addCriterion("yearly_snacks =", value, "yearlySnacks");
            return (Criteria) this;
        }

        public Criteria andYearlySnacksNotEqualTo(Float value) {
            addCriterion("yearly_snacks <>", value, "yearlySnacks");
            return (Criteria) this;
        }

        public Criteria andYearlySnacksGreaterThan(Float value) {
            addCriterion("yearly_snacks >", value, "yearlySnacks");
            return (Criteria) this;
        }

        public Criteria andYearlySnacksGreaterThanOrEqualTo(Float value) {
            addCriterion("yearly_snacks >=", value, "yearlySnacks");
            return (Criteria) this;
        }

        public Criteria andYearlySnacksLessThan(Float value) {
            addCriterion("yearly_snacks <", value, "yearlySnacks");
            return (Criteria) this;
        }

        public Criteria andYearlySnacksLessThanOrEqualTo(Float value) {
            addCriterion("yearly_snacks <=", value, "yearlySnacks");
            return (Criteria) this;
        }

        public Criteria andYearlySnacksIn(List<Float> values) {
            addCriterion("yearly_snacks in", values, "yearlySnacks");
            return (Criteria) this;
        }

        public Criteria andYearlySnacksNotIn(List<Float> values) {
            addCriterion("yearly_snacks not in", values, "yearlySnacks");
            return (Criteria) this;
        }

        public Criteria andYearlySnacksBetween(Float value1, Float value2) {
            addCriterion("yearly_snacks between", value1, value2, "yearlySnacks");
            return (Criteria) this;
        }

        public Criteria andYearlySnacksNotBetween(Float value1, Float value2) {
            addCriterion("yearly_snacks not between", value1, value2, "yearlySnacks");
            return (Criteria) this;
        }

        public Criteria andYearlyFareIsNull() {
            addCriterion("yearly_fare is null");
            return (Criteria) this;
        }

        public Criteria andYearlyFareIsNotNull() {
            addCriterion("yearly_fare is not null");
            return (Criteria) this;
        }

        public Criteria andYearlyFareEqualTo(Float value) {
            addCriterion("yearly_fare =", value, "yearlyFare");
            return (Criteria) this;
        }

        public Criteria andYearlyFareNotEqualTo(Float value) {
            addCriterion("yearly_fare <>", value, "yearlyFare");
            return (Criteria) this;
        }

        public Criteria andYearlyFareGreaterThan(Float value) {
            addCriterion("yearly_fare >", value, "yearlyFare");
            return (Criteria) this;
        }

        public Criteria andYearlyFareGreaterThanOrEqualTo(Float value) {
            addCriterion("yearly_fare >=", value, "yearlyFare");
            return (Criteria) this;
        }

        public Criteria andYearlyFareLessThan(Float value) {
            addCriterion("yearly_fare <", value, "yearlyFare");
            return (Criteria) this;
        }

        public Criteria andYearlyFareLessThanOrEqualTo(Float value) {
            addCriterion("yearly_fare <=", value, "yearlyFare");
            return (Criteria) this;
        }

        public Criteria andYearlyFareIn(List<Float> values) {
            addCriterion("yearly_fare in", values, "yearlyFare");
            return (Criteria) this;
        }

        public Criteria andYearlyFareNotIn(List<Float> values) {
            addCriterion("yearly_fare not in", values, "yearlyFare");
            return (Criteria) this;
        }

        public Criteria andYearlyFareBetween(Float value1, Float value2) {
            addCriterion("yearly_fare between", value1, value2, "yearlyFare");
            return (Criteria) this;
        }

        public Criteria andYearlyFareNotBetween(Float value1, Float value2) {
            addCriterion("yearly_fare not between", value1, value2, "yearlyFare");
            return (Criteria) this;
        }

        public Criteria andYearlyStayIsNull() {
            addCriterion("yearly_stay is null");
            return (Criteria) this;
        }

        public Criteria andYearlyStayIsNotNull() {
            addCriterion("yearly_stay is not null");
            return (Criteria) this;
        }

        public Criteria andYearlyStayEqualTo(Float value) {
            addCriterion("yearly_stay =", value, "yearlyStay");
            return (Criteria) this;
        }

        public Criteria andYearlyStayNotEqualTo(Float value) {
            addCriterion("yearly_stay <>", value, "yearlyStay");
            return (Criteria) this;
        }

        public Criteria andYearlyStayGreaterThan(Float value) {
            addCriterion("yearly_stay >", value, "yearlyStay");
            return (Criteria) this;
        }

        public Criteria andYearlyStayGreaterThanOrEqualTo(Float value) {
            addCriterion("yearly_stay >=", value, "yearlyStay");
            return (Criteria) this;
        }

        public Criteria andYearlyStayLessThan(Float value) {
            addCriterion("yearly_stay <", value, "yearlyStay");
            return (Criteria) this;
        }

        public Criteria andYearlyStayLessThanOrEqualTo(Float value) {
            addCriterion("yearly_stay <=", value, "yearlyStay");
            return (Criteria) this;
        }

        public Criteria andYearlyStayIn(List<Float> values) {
            addCriterion("yearly_stay in", values, "yearlyStay");
            return (Criteria) this;
        }

        public Criteria andYearlyStayNotIn(List<Float> values) {
            addCriterion("yearly_stay not in", values, "yearlyStay");
            return (Criteria) this;
        }

        public Criteria andYearlyStayBetween(Float value1, Float value2) {
            addCriterion("yearly_stay between", value1, value2, "yearlyStay");
            return (Criteria) this;
        }

        public Criteria andYearlyStayNotBetween(Float value1, Float value2) {
            addCriterion("yearly_stay not between", value1, value2, "yearlyStay");
            return (Criteria) this;
        }

        public Criteria andYearlyRepastIsNull() {
            addCriterion("yearly_repast is null");
            return (Criteria) this;
        }

        public Criteria andYearlyRepastIsNotNull() {
            addCriterion("yearly_repast is not null");
            return (Criteria) this;
        }

        public Criteria andYearlyRepastEqualTo(Float value) {
            addCriterion("yearly_repast =", value, "yearlyRepast");
            return (Criteria) this;
        }

        public Criteria andYearlyRepastNotEqualTo(Float value) {
            addCriterion("yearly_repast <>", value, "yearlyRepast");
            return (Criteria) this;
        }

        public Criteria andYearlyRepastGreaterThan(Float value) {
            addCriterion("yearly_repast >", value, "yearlyRepast");
            return (Criteria) this;
        }

        public Criteria andYearlyRepastGreaterThanOrEqualTo(Float value) {
            addCriterion("yearly_repast >=", value, "yearlyRepast");
            return (Criteria) this;
        }

        public Criteria andYearlyRepastLessThan(Float value) {
            addCriterion("yearly_repast <", value, "yearlyRepast");
            return (Criteria) this;
        }

        public Criteria andYearlyRepastLessThanOrEqualTo(Float value) {
            addCriterion("yearly_repast <=", value, "yearlyRepast");
            return (Criteria) this;
        }

        public Criteria andYearlyRepastIn(List<Float> values) {
            addCriterion("yearly_repast in", values, "yearlyRepast");
            return (Criteria) this;
        }

        public Criteria andYearlyRepastNotIn(List<Float> values) {
            addCriterion("yearly_repast not in", values, "yearlyRepast");
            return (Criteria) this;
        }

        public Criteria andYearlyRepastBetween(Float value1, Float value2) {
            addCriterion("yearly_repast between", value1, value2, "yearlyRepast");
            return (Criteria) this;
        }

        public Criteria andYearlyRepastNotBetween(Float value1, Float value2) {
            addCriterion("yearly_repast not between", value1, value2, "yearlyRepast");
            return (Criteria) this;
        }

        public Criteria andYearlyRecreationIsNull() {
            addCriterion("yearly_recreation is null");
            return (Criteria) this;
        }

        public Criteria andYearlyRecreationIsNotNull() {
            addCriterion("yearly_recreation is not null");
            return (Criteria) this;
        }

        public Criteria andYearlyRecreationEqualTo(Float value) {
            addCriterion("yearly_recreation =", value, "yearlyRecreation");
            return (Criteria) this;
        }

        public Criteria andYearlyRecreationNotEqualTo(Float value) {
            addCriterion("yearly_recreation <>", value, "yearlyRecreation");
            return (Criteria) this;
        }

        public Criteria andYearlyRecreationGreaterThan(Float value) {
            addCriterion("yearly_recreation >", value, "yearlyRecreation");
            return (Criteria) this;
        }

        public Criteria andYearlyRecreationGreaterThanOrEqualTo(Float value) {
            addCriterion("yearly_recreation >=", value, "yearlyRecreation");
            return (Criteria) this;
        }

        public Criteria andYearlyRecreationLessThan(Float value) {
            addCriterion("yearly_recreation <", value, "yearlyRecreation");
            return (Criteria) this;
        }

        public Criteria andYearlyRecreationLessThanOrEqualTo(Float value) {
            addCriterion("yearly_recreation <=", value, "yearlyRecreation");
            return (Criteria) this;
        }

        public Criteria andYearlyRecreationIn(List<Float> values) {
            addCriterion("yearly_recreation in", values, "yearlyRecreation");
            return (Criteria) this;
        }

        public Criteria andYearlyRecreationNotIn(List<Float> values) {
            addCriterion("yearly_recreation not in", values, "yearlyRecreation");
            return (Criteria) this;
        }

        public Criteria andYearlyRecreationBetween(Float value1, Float value2) {
            addCriterion("yearly_recreation between", value1, value2, "yearlyRecreation");
            return (Criteria) this;
        }

        public Criteria andYearlyRecreationNotBetween(Float value1, Float value2) {
            addCriterion("yearly_recreation not between", value1, value2, "yearlyRecreation");
            return (Criteria) this;
        }

        public Criteria andYearlyClothingIsNull() {
            addCriterion("yearly_clothing is null");
            return (Criteria) this;
        }

        public Criteria andYearlyClothingIsNotNull() {
            addCriterion("yearly_clothing is not null");
            return (Criteria) this;
        }

        public Criteria andYearlyClothingEqualTo(Float value) {
            addCriterion("yearly_clothing =", value, "yearlyClothing");
            return (Criteria) this;
        }

        public Criteria andYearlyClothingNotEqualTo(Float value) {
            addCriterion("yearly_clothing <>", value, "yearlyClothing");
            return (Criteria) this;
        }

        public Criteria andYearlyClothingGreaterThan(Float value) {
            addCriterion("yearly_clothing >", value, "yearlyClothing");
            return (Criteria) this;
        }

        public Criteria andYearlyClothingGreaterThanOrEqualTo(Float value) {
            addCriterion("yearly_clothing >=", value, "yearlyClothing");
            return (Criteria) this;
        }

        public Criteria andYearlyClothingLessThan(Float value) {
            addCriterion("yearly_clothing <", value, "yearlyClothing");
            return (Criteria) this;
        }

        public Criteria andYearlyClothingLessThanOrEqualTo(Float value) {
            addCriterion("yearly_clothing <=", value, "yearlyClothing");
            return (Criteria) this;
        }

        public Criteria andYearlyClothingIn(List<Float> values) {
            addCriterion("yearly_clothing in", values, "yearlyClothing");
            return (Criteria) this;
        }

        public Criteria andYearlyClothingNotIn(List<Float> values) {
            addCriterion("yearly_clothing not in", values, "yearlyClothing");
            return (Criteria) this;
        }

        public Criteria andYearlyClothingBetween(Float value1, Float value2) {
            addCriterion("yearly_clothing between", value1, value2, "yearlyClothing");
            return (Criteria) this;
        }

        public Criteria andYearlyClothingNotBetween(Float value1, Float value2) {
            addCriterion("yearly_clothing not between", value1, value2, "yearlyClothing");
            return (Criteria) this;
        }

        public Criteria andYearlyDailyIsNull() {
            addCriterion("yearly_daily is null");
            return (Criteria) this;
        }

        public Criteria andYearlyDailyIsNotNull() {
            addCriterion("yearly_daily is not null");
            return (Criteria) this;
        }

        public Criteria andYearlyDailyEqualTo(Float value) {
            addCriterion("yearly_daily =", value, "yearlyDaily");
            return (Criteria) this;
        }

        public Criteria andYearlyDailyNotEqualTo(Float value) {
            addCriterion("yearly_daily <>", value, "yearlyDaily");
            return (Criteria) this;
        }

        public Criteria andYearlyDailyGreaterThan(Float value) {
            addCriterion("yearly_daily >", value, "yearlyDaily");
            return (Criteria) this;
        }

        public Criteria andYearlyDailyGreaterThanOrEqualTo(Float value) {
            addCriterion("yearly_daily >=", value, "yearlyDaily");
            return (Criteria) this;
        }

        public Criteria andYearlyDailyLessThan(Float value) {
            addCriterion("yearly_daily <", value, "yearlyDaily");
            return (Criteria) this;
        }

        public Criteria andYearlyDailyLessThanOrEqualTo(Float value) {
            addCriterion("yearly_daily <=", value, "yearlyDaily");
            return (Criteria) this;
        }

        public Criteria andYearlyDailyIn(List<Float> values) {
            addCriterion("yearly_daily in", values, "yearlyDaily");
            return (Criteria) this;
        }

        public Criteria andYearlyDailyNotIn(List<Float> values) {
            addCriterion("yearly_daily not in", values, "yearlyDaily");
            return (Criteria) this;
        }

        public Criteria andYearlyDailyBetween(Float value1, Float value2) {
            addCriterion("yearly_daily between", value1, value2, "yearlyDaily");
            return (Criteria) this;
        }

        public Criteria andYearlyDailyNotBetween(Float value1, Float value2) {
            addCriterion("yearly_daily not between", value1, value2, "yearlyDaily");
            return (Criteria) this;
        }

        public Criteria andYearlyOtherIsNull() {
            addCriterion("yearly_other is null");
            return (Criteria) this;
        }

        public Criteria andYearlyOtherIsNotNull() {
            addCriterion("yearly_other is not null");
            return (Criteria) this;
        }

        public Criteria andYearlyOtherEqualTo(Float value) {
            addCriterion("yearly_other =", value, "yearlyOther");
            return (Criteria) this;
        }

        public Criteria andYearlyOtherNotEqualTo(Float value) {
            addCriterion("yearly_other <>", value, "yearlyOther");
            return (Criteria) this;
        }

        public Criteria andYearlyOtherGreaterThan(Float value) {
            addCriterion("yearly_other >", value, "yearlyOther");
            return (Criteria) this;
        }

        public Criteria andYearlyOtherGreaterThanOrEqualTo(Float value) {
            addCriterion("yearly_other >=", value, "yearlyOther");
            return (Criteria) this;
        }

        public Criteria andYearlyOtherLessThan(Float value) {
            addCriterion("yearly_other <", value, "yearlyOther");
            return (Criteria) this;
        }

        public Criteria andYearlyOtherLessThanOrEqualTo(Float value) {
            addCriterion("yearly_other <=", value, "yearlyOther");
            return (Criteria) this;
        }

        public Criteria andYearlyOtherIn(List<Float> values) {
            addCriterion("yearly_other in", values, "yearlyOther");
            return (Criteria) this;
        }

        public Criteria andYearlyOtherNotIn(List<Float> values) {
            addCriterion("yearly_other not in", values, "yearlyOther");
            return (Criteria) this;
        }

        public Criteria andYearlyOtherBetween(Float value1, Float value2) {
            addCriterion("yearly_other between", value1, value2, "yearlyOther");
            return (Criteria) this;
        }

        public Criteria andYearlyOtherNotBetween(Float value1, Float value2) {
            addCriterion("yearly_other not between", value1, value2, "yearlyOther");
            return (Criteria) this;
        }

        public Criteria andYearlyTotalIsNull() {
            addCriterion("yearly_total is null");
            return (Criteria) this;
        }

        public Criteria andYearlyTotalIsNotNull() {
            addCriterion("yearly_total is not null");
            return (Criteria) this;
        }

        public Criteria andYearlyTotalEqualTo(Float value) {
            addCriterion("yearly_total =", value, "yearlyTotal");
            return (Criteria) this;
        }

        public Criteria andYearlyTotalNotEqualTo(Float value) {
            addCriterion("yearly_total <>", value, "yearlyTotal");
            return (Criteria) this;
        }

        public Criteria andYearlyTotalGreaterThan(Float value) {
            addCriterion("yearly_total >", value, "yearlyTotal");
            return (Criteria) this;
        }

        public Criteria andYearlyTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("yearly_total >=", value, "yearlyTotal");
            return (Criteria) this;
        }

        public Criteria andYearlyTotalLessThan(Float value) {
            addCriterion("yearly_total <", value, "yearlyTotal");
            return (Criteria) this;
        }

        public Criteria andYearlyTotalLessThanOrEqualTo(Float value) {
            addCriterion("yearly_total <=", value, "yearlyTotal");
            return (Criteria) this;
        }

        public Criteria andYearlyTotalIn(List<Float> values) {
            addCriterion("yearly_total in", values, "yearlyTotal");
            return (Criteria) this;
        }

        public Criteria andYearlyTotalNotIn(List<Float> values) {
            addCriterion("yearly_total not in", values, "yearlyTotal");
            return (Criteria) this;
        }

        public Criteria andYearlyTotalBetween(Float value1, Float value2) {
            addCriterion("yearly_total between", value1, value2, "yearlyTotal");
            return (Criteria) this;
        }

        public Criteria andYearlyTotalNotBetween(Float value1, Float value2) {
            addCriterion("yearly_total not between", value1, value2, "yearlyTotal");
            return (Criteria) this;
        }

        public Criteria andYearlyTimeIsNull() {
            addCriterion("yearly_time is null");
            return (Criteria) this;
        }

        public Criteria andYearlyTimeIsNotNull() {
            addCriterion("yearly_time is not null");
            return (Criteria) this;
        }

        public Criteria andYearlyTimeEqualTo(String value) {
            addCriterion("yearly_time =", value, "yearlyTime");
            return (Criteria) this;
        }

        public Criteria andYearlyTimeNotEqualTo(String value) {
            addCriterion("yearly_time <>", value, "yearlyTime");
            return (Criteria) this;
        }

        public Criteria andYearlyTimeGreaterThan(String value) {
            addCriterion("yearly_time >", value, "yearlyTime");
            return (Criteria) this;
        }

        public Criteria andYearlyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("yearly_time >=", value, "yearlyTime");
            return (Criteria) this;
        }

        public Criteria andYearlyTimeLessThan(String value) {
            addCriterion("yearly_time <", value, "yearlyTime");
            return (Criteria) this;
        }

        public Criteria andYearlyTimeLessThanOrEqualTo(String value) {
            addCriterion("yearly_time <=", value, "yearlyTime");
            return (Criteria) this;
        }

        public Criteria andYearlyTimeLike(String value) {
            addCriterion("yearly_time like", value, "yearlyTime");
            return (Criteria) this;
        }

        public Criteria andYearlyTimeNotLike(String value) {
            addCriterion("yearly_time not like", value, "yearlyTime");
            return (Criteria) this;
        }

        public Criteria andYearlyTimeIn(List<String> values) {
            addCriterion("yearly_time in", values, "yearlyTime");
            return (Criteria) this;
        }

        public Criteria andYearlyTimeNotIn(List<String> values) {
            addCriterion("yearly_time not in", values, "yearlyTime");
            return (Criteria) this;
        }

        public Criteria andYearlyTimeBetween(String value1, String value2) {
            addCriterion("yearly_time between", value1, value2, "yearlyTime");
            return (Criteria) this;
        }

        public Criteria andYearlyTimeNotBetween(String value1, String value2) {
            addCriterion("yearly_time not between", value1, value2, "yearlyTime");
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
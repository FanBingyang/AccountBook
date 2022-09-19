package pojo;

import java.util.ArrayList;
import java.util.List;

public class SceneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SceneExample() {
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

        public Criteria andSceneIdIsNull() {
            addCriterion("scene_id is null");
            return (Criteria) this;
        }

        public Criteria andSceneIdIsNotNull() {
            addCriterion("scene_id is not null");
            return (Criteria) this;
        }

        public Criteria andSceneIdEqualTo(Integer value) {
            addCriterion("scene_id =", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotEqualTo(Integer value) {
            addCriterion("scene_id <>", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThan(Integer value) {
            addCriterion("scene_id >", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scene_id >=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThan(Integer value) {
            addCriterion("scene_id <", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThanOrEqualTo(Integer value) {
            addCriterion("scene_id <=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdIn(List<Integer> values) {
            addCriterion("scene_id in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotIn(List<Integer> values) {
            addCriterion("scene_id not in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdBetween(Integer value1, Integer value2) {
            addCriterion("scene_id between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scene_id not between", value1, value2, "sceneId");
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

        public Criteria andSceneTitleIsNull() {
            addCriterion("scene_title is null");
            return (Criteria) this;
        }

        public Criteria andSceneTitleIsNotNull() {
            addCriterion("scene_title is not null");
            return (Criteria) this;
        }

        public Criteria andSceneTitleEqualTo(String value) {
            addCriterion("scene_title =", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleNotEqualTo(String value) {
            addCriterion("scene_title <>", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleGreaterThan(String value) {
            addCriterion("scene_title >", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleGreaterThanOrEqualTo(String value) {
            addCriterion("scene_title >=", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleLessThan(String value) {
            addCriterion("scene_title <", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleLessThanOrEqualTo(String value) {
            addCriterion("scene_title <=", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleLike(String value) {
            addCriterion("scene_title like", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleNotLike(String value) {
            addCriterion("scene_title not like", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleIn(List<String> values) {
            addCriterion("scene_title in", values, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleNotIn(List<String> values) {
            addCriterion("scene_title not in", values, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleBetween(String value1, String value2) {
            addCriterion("scene_title between", value1, value2, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleNotBetween(String value1, String value2) {
            addCriterion("scene_title not between", value1, value2, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneSnacksIsNull() {
            addCriterion("scene_snacks is null");
            return (Criteria) this;
        }

        public Criteria andSceneSnacksIsNotNull() {
            addCriterion("scene_snacks is not null");
            return (Criteria) this;
        }

        public Criteria andSceneSnacksEqualTo(Float value) {
            addCriterion("scene_snacks =", value, "sceneSnacks");
            return (Criteria) this;
        }

        public Criteria andSceneSnacksNotEqualTo(Float value) {
            addCriterion("scene_snacks <>", value, "sceneSnacks");
            return (Criteria) this;
        }

        public Criteria andSceneSnacksGreaterThan(Float value) {
            addCriterion("scene_snacks >", value, "sceneSnacks");
            return (Criteria) this;
        }

        public Criteria andSceneSnacksGreaterThanOrEqualTo(Float value) {
            addCriterion("scene_snacks >=", value, "sceneSnacks");
            return (Criteria) this;
        }

        public Criteria andSceneSnacksLessThan(Float value) {
            addCriterion("scene_snacks <", value, "sceneSnacks");
            return (Criteria) this;
        }

        public Criteria andSceneSnacksLessThanOrEqualTo(Float value) {
            addCriterion("scene_snacks <=", value, "sceneSnacks");
            return (Criteria) this;
        }

        public Criteria andSceneSnacksIn(List<Float> values) {
            addCriterion("scene_snacks in", values, "sceneSnacks");
            return (Criteria) this;
        }

        public Criteria andSceneSnacksNotIn(List<Float> values) {
            addCriterion("scene_snacks not in", values, "sceneSnacks");
            return (Criteria) this;
        }

        public Criteria andSceneSnacksBetween(Float value1, Float value2) {
            addCriterion("scene_snacks between", value1, value2, "sceneSnacks");
            return (Criteria) this;
        }

        public Criteria andSceneSnacksNotBetween(Float value1, Float value2) {
            addCriterion("scene_snacks not between", value1, value2, "sceneSnacks");
            return (Criteria) this;
        }

        public Criteria andSceneFareIsNull() {
            addCriterion("scene_fare is null");
            return (Criteria) this;
        }

        public Criteria andSceneFareIsNotNull() {
            addCriterion("scene_fare is not null");
            return (Criteria) this;
        }

        public Criteria andSceneFareEqualTo(Float value) {
            addCriterion("scene_fare =", value, "sceneFare");
            return (Criteria) this;
        }

        public Criteria andSceneFareNotEqualTo(Float value) {
            addCriterion("scene_fare <>", value, "sceneFare");
            return (Criteria) this;
        }

        public Criteria andSceneFareGreaterThan(Float value) {
            addCriterion("scene_fare >", value, "sceneFare");
            return (Criteria) this;
        }

        public Criteria andSceneFareGreaterThanOrEqualTo(Float value) {
            addCriterion("scene_fare >=", value, "sceneFare");
            return (Criteria) this;
        }

        public Criteria andSceneFareLessThan(Float value) {
            addCriterion("scene_fare <", value, "sceneFare");
            return (Criteria) this;
        }

        public Criteria andSceneFareLessThanOrEqualTo(Float value) {
            addCriterion("scene_fare <=", value, "sceneFare");
            return (Criteria) this;
        }

        public Criteria andSceneFareIn(List<Float> values) {
            addCriterion("scene_fare in", values, "sceneFare");
            return (Criteria) this;
        }

        public Criteria andSceneFareNotIn(List<Float> values) {
            addCriterion("scene_fare not in", values, "sceneFare");
            return (Criteria) this;
        }

        public Criteria andSceneFareBetween(Float value1, Float value2) {
            addCriterion("scene_fare between", value1, value2, "sceneFare");
            return (Criteria) this;
        }

        public Criteria andSceneFareNotBetween(Float value1, Float value2) {
            addCriterion("scene_fare not between", value1, value2, "sceneFare");
            return (Criteria) this;
        }

        public Criteria andSceneStayIsNull() {
            addCriterion("scene_stay is null");
            return (Criteria) this;
        }

        public Criteria andSceneStayIsNotNull() {
            addCriterion("scene_stay is not null");
            return (Criteria) this;
        }

        public Criteria andSceneStayEqualTo(Float value) {
            addCriterion("scene_stay =", value, "sceneStay");
            return (Criteria) this;
        }

        public Criteria andSceneStayNotEqualTo(Float value) {
            addCriterion("scene_stay <>", value, "sceneStay");
            return (Criteria) this;
        }

        public Criteria andSceneStayGreaterThan(Float value) {
            addCriterion("scene_stay >", value, "sceneStay");
            return (Criteria) this;
        }

        public Criteria andSceneStayGreaterThanOrEqualTo(Float value) {
            addCriterion("scene_stay >=", value, "sceneStay");
            return (Criteria) this;
        }

        public Criteria andSceneStayLessThan(Float value) {
            addCriterion("scene_stay <", value, "sceneStay");
            return (Criteria) this;
        }

        public Criteria andSceneStayLessThanOrEqualTo(Float value) {
            addCriterion("scene_stay <=", value, "sceneStay");
            return (Criteria) this;
        }

        public Criteria andSceneStayIn(List<Float> values) {
            addCriterion("scene_stay in", values, "sceneStay");
            return (Criteria) this;
        }

        public Criteria andSceneStayNotIn(List<Float> values) {
            addCriterion("scene_stay not in", values, "sceneStay");
            return (Criteria) this;
        }

        public Criteria andSceneStayBetween(Float value1, Float value2) {
            addCriterion("scene_stay between", value1, value2, "sceneStay");
            return (Criteria) this;
        }

        public Criteria andSceneStayNotBetween(Float value1, Float value2) {
            addCriterion("scene_stay not between", value1, value2, "sceneStay");
            return (Criteria) this;
        }

        public Criteria andSceneRepastIsNull() {
            addCriterion("scene_repast is null");
            return (Criteria) this;
        }

        public Criteria andSceneRepastIsNotNull() {
            addCriterion("scene_repast is not null");
            return (Criteria) this;
        }

        public Criteria andSceneRepastEqualTo(Float value) {
            addCriterion("scene_repast =", value, "sceneRepast");
            return (Criteria) this;
        }

        public Criteria andSceneRepastNotEqualTo(Float value) {
            addCriterion("scene_repast <>", value, "sceneRepast");
            return (Criteria) this;
        }

        public Criteria andSceneRepastGreaterThan(Float value) {
            addCriterion("scene_repast >", value, "sceneRepast");
            return (Criteria) this;
        }

        public Criteria andSceneRepastGreaterThanOrEqualTo(Float value) {
            addCriterion("scene_repast >=", value, "sceneRepast");
            return (Criteria) this;
        }

        public Criteria andSceneRepastLessThan(Float value) {
            addCriterion("scene_repast <", value, "sceneRepast");
            return (Criteria) this;
        }

        public Criteria andSceneRepastLessThanOrEqualTo(Float value) {
            addCriterion("scene_repast <=", value, "sceneRepast");
            return (Criteria) this;
        }

        public Criteria andSceneRepastIn(List<Float> values) {
            addCriterion("scene_repast in", values, "sceneRepast");
            return (Criteria) this;
        }

        public Criteria andSceneRepastNotIn(List<Float> values) {
            addCriterion("scene_repast not in", values, "sceneRepast");
            return (Criteria) this;
        }

        public Criteria andSceneRepastBetween(Float value1, Float value2) {
            addCriterion("scene_repast between", value1, value2, "sceneRepast");
            return (Criteria) this;
        }

        public Criteria andSceneRepastNotBetween(Float value1, Float value2) {
            addCriterion("scene_repast not between", value1, value2, "sceneRepast");
            return (Criteria) this;
        }

        public Criteria andSceneRecreationIsNull() {
            addCriterion("scene_recreation is null");
            return (Criteria) this;
        }

        public Criteria andSceneRecreationIsNotNull() {
            addCriterion("scene_recreation is not null");
            return (Criteria) this;
        }

        public Criteria andSceneRecreationEqualTo(Float value) {
            addCriterion("scene_recreation =", value, "sceneRecreation");
            return (Criteria) this;
        }

        public Criteria andSceneRecreationNotEqualTo(Float value) {
            addCriterion("scene_recreation <>", value, "sceneRecreation");
            return (Criteria) this;
        }

        public Criteria andSceneRecreationGreaterThan(Float value) {
            addCriterion("scene_recreation >", value, "sceneRecreation");
            return (Criteria) this;
        }

        public Criteria andSceneRecreationGreaterThanOrEqualTo(Float value) {
            addCriterion("scene_recreation >=", value, "sceneRecreation");
            return (Criteria) this;
        }

        public Criteria andSceneRecreationLessThan(Float value) {
            addCriterion("scene_recreation <", value, "sceneRecreation");
            return (Criteria) this;
        }

        public Criteria andSceneRecreationLessThanOrEqualTo(Float value) {
            addCriterion("scene_recreation <=", value, "sceneRecreation");
            return (Criteria) this;
        }

        public Criteria andSceneRecreationIn(List<Float> values) {
            addCriterion("scene_recreation in", values, "sceneRecreation");
            return (Criteria) this;
        }

        public Criteria andSceneRecreationNotIn(List<Float> values) {
            addCriterion("scene_recreation not in", values, "sceneRecreation");
            return (Criteria) this;
        }

        public Criteria andSceneRecreationBetween(Float value1, Float value2) {
            addCriterion("scene_recreation between", value1, value2, "sceneRecreation");
            return (Criteria) this;
        }

        public Criteria andSceneRecreationNotBetween(Float value1, Float value2) {
            addCriterion("scene_recreation not between", value1, value2, "sceneRecreation");
            return (Criteria) this;
        }

        public Criteria andSceneClothingIsNull() {
            addCriterion("scene_clothing is null");
            return (Criteria) this;
        }

        public Criteria andSceneClothingIsNotNull() {
            addCriterion("scene_clothing is not null");
            return (Criteria) this;
        }

        public Criteria andSceneClothingEqualTo(Float value) {
            addCriterion("scene_clothing =", value, "sceneClothing");
            return (Criteria) this;
        }

        public Criteria andSceneClothingNotEqualTo(Float value) {
            addCriterion("scene_clothing <>", value, "sceneClothing");
            return (Criteria) this;
        }

        public Criteria andSceneClothingGreaterThan(Float value) {
            addCriterion("scene_clothing >", value, "sceneClothing");
            return (Criteria) this;
        }

        public Criteria andSceneClothingGreaterThanOrEqualTo(Float value) {
            addCriterion("scene_clothing >=", value, "sceneClothing");
            return (Criteria) this;
        }

        public Criteria andSceneClothingLessThan(Float value) {
            addCriterion("scene_clothing <", value, "sceneClothing");
            return (Criteria) this;
        }

        public Criteria andSceneClothingLessThanOrEqualTo(Float value) {
            addCriterion("scene_clothing <=", value, "sceneClothing");
            return (Criteria) this;
        }

        public Criteria andSceneClothingIn(List<Float> values) {
            addCriterion("scene_clothing in", values, "sceneClothing");
            return (Criteria) this;
        }

        public Criteria andSceneClothingNotIn(List<Float> values) {
            addCriterion("scene_clothing not in", values, "sceneClothing");
            return (Criteria) this;
        }

        public Criteria andSceneClothingBetween(Float value1, Float value2) {
            addCriterion("scene_clothing between", value1, value2, "sceneClothing");
            return (Criteria) this;
        }

        public Criteria andSceneClothingNotBetween(Float value1, Float value2) {
            addCriterion("scene_clothing not between", value1, value2, "sceneClothing");
            return (Criteria) this;
        }

        public Criteria andSceneDailyIsNull() {
            addCriterion("scene_daily is null");
            return (Criteria) this;
        }

        public Criteria andSceneDailyIsNotNull() {
            addCriterion("scene_daily is not null");
            return (Criteria) this;
        }

        public Criteria andSceneDailyEqualTo(Float value) {
            addCriterion("scene_daily =", value, "sceneDaily");
            return (Criteria) this;
        }

        public Criteria andSceneDailyNotEqualTo(Float value) {
            addCriterion("scene_daily <>", value, "sceneDaily");
            return (Criteria) this;
        }

        public Criteria andSceneDailyGreaterThan(Float value) {
            addCriterion("scene_daily >", value, "sceneDaily");
            return (Criteria) this;
        }

        public Criteria andSceneDailyGreaterThanOrEqualTo(Float value) {
            addCriterion("scene_daily >=", value, "sceneDaily");
            return (Criteria) this;
        }

        public Criteria andSceneDailyLessThan(Float value) {
            addCriterion("scene_daily <", value, "sceneDaily");
            return (Criteria) this;
        }

        public Criteria andSceneDailyLessThanOrEqualTo(Float value) {
            addCriterion("scene_daily <=", value, "sceneDaily");
            return (Criteria) this;
        }

        public Criteria andSceneDailyIn(List<Float> values) {
            addCriterion("scene_daily in", values, "sceneDaily");
            return (Criteria) this;
        }

        public Criteria andSceneDailyNotIn(List<Float> values) {
            addCriterion("scene_daily not in", values, "sceneDaily");
            return (Criteria) this;
        }

        public Criteria andSceneDailyBetween(Float value1, Float value2) {
            addCriterion("scene_daily between", value1, value2, "sceneDaily");
            return (Criteria) this;
        }

        public Criteria andSceneDailyNotBetween(Float value1, Float value2) {
            addCriterion("scene_daily not between", value1, value2, "sceneDaily");
            return (Criteria) this;
        }

        public Criteria andSceneOtherIsNull() {
            addCriterion("scene_other is null");
            return (Criteria) this;
        }

        public Criteria andSceneOtherIsNotNull() {
            addCriterion("scene_other is not null");
            return (Criteria) this;
        }

        public Criteria andSceneOtherEqualTo(Float value) {
            addCriterion("scene_other =", value, "sceneOther");
            return (Criteria) this;
        }

        public Criteria andSceneOtherNotEqualTo(Float value) {
            addCriterion("scene_other <>", value, "sceneOther");
            return (Criteria) this;
        }

        public Criteria andSceneOtherGreaterThan(Float value) {
            addCriterion("scene_other >", value, "sceneOther");
            return (Criteria) this;
        }

        public Criteria andSceneOtherGreaterThanOrEqualTo(Float value) {
            addCriterion("scene_other >=", value, "sceneOther");
            return (Criteria) this;
        }

        public Criteria andSceneOtherLessThan(Float value) {
            addCriterion("scene_other <", value, "sceneOther");
            return (Criteria) this;
        }

        public Criteria andSceneOtherLessThanOrEqualTo(Float value) {
            addCriterion("scene_other <=", value, "sceneOther");
            return (Criteria) this;
        }

        public Criteria andSceneOtherIn(List<Float> values) {
            addCriterion("scene_other in", values, "sceneOther");
            return (Criteria) this;
        }

        public Criteria andSceneOtherNotIn(List<Float> values) {
            addCriterion("scene_other not in", values, "sceneOther");
            return (Criteria) this;
        }

        public Criteria andSceneOtherBetween(Float value1, Float value2) {
            addCriterion("scene_other between", value1, value2, "sceneOther");
            return (Criteria) this;
        }

        public Criteria andSceneOtherNotBetween(Float value1, Float value2) {
            addCriterion("scene_other not between", value1, value2, "sceneOther");
            return (Criteria) this;
        }

        public Criteria andSceneTotalIsNull() {
            addCriterion("scene_total is null");
            return (Criteria) this;
        }

        public Criteria andSceneTotalIsNotNull() {
            addCriterion("scene_total is not null");
            return (Criteria) this;
        }

        public Criteria andSceneTotalEqualTo(Float value) {
            addCriterion("scene_total =", value, "sceneTotal");
            return (Criteria) this;
        }

        public Criteria andSceneTotalNotEqualTo(Float value) {
            addCriterion("scene_total <>", value, "sceneTotal");
            return (Criteria) this;
        }

        public Criteria andSceneTotalGreaterThan(Float value) {
            addCriterion("scene_total >", value, "sceneTotal");
            return (Criteria) this;
        }

        public Criteria andSceneTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("scene_total >=", value, "sceneTotal");
            return (Criteria) this;
        }

        public Criteria andSceneTotalLessThan(Float value) {
            addCriterion("scene_total <", value, "sceneTotal");
            return (Criteria) this;
        }

        public Criteria andSceneTotalLessThanOrEqualTo(Float value) {
            addCriterion("scene_total <=", value, "sceneTotal");
            return (Criteria) this;
        }

        public Criteria andSceneTotalIn(List<Float> values) {
            addCriterion("scene_total in", values, "sceneTotal");
            return (Criteria) this;
        }

        public Criteria andSceneTotalNotIn(List<Float> values) {
            addCriterion("scene_total not in", values, "sceneTotal");
            return (Criteria) this;
        }

        public Criteria andSceneTotalBetween(Float value1, Float value2) {
            addCriterion("scene_total between", value1, value2, "sceneTotal");
            return (Criteria) this;
        }

        public Criteria andSceneTotalNotBetween(Float value1, Float value2) {
            addCriterion("scene_total not between", value1, value2, "sceneTotal");
            return (Criteria) this;
        }

        public Criteria andSceneExplainIsNull() {
            addCriterion("scene_explain is null");
            return (Criteria) this;
        }

        public Criteria andSceneExplainIsNotNull() {
            addCriterion("scene_explain is not null");
            return (Criteria) this;
        }

        public Criteria andSceneExplainEqualTo(String value) {
            addCriterion("scene_explain =", value, "sceneExplain");
            return (Criteria) this;
        }

        public Criteria andSceneExplainNotEqualTo(String value) {
            addCriterion("scene_explain <>", value, "sceneExplain");
            return (Criteria) this;
        }

        public Criteria andSceneExplainGreaterThan(String value) {
            addCriterion("scene_explain >", value, "sceneExplain");
            return (Criteria) this;
        }

        public Criteria andSceneExplainGreaterThanOrEqualTo(String value) {
            addCriterion("scene_explain >=", value, "sceneExplain");
            return (Criteria) this;
        }

        public Criteria andSceneExplainLessThan(String value) {
            addCriterion("scene_explain <", value, "sceneExplain");
            return (Criteria) this;
        }

        public Criteria andSceneExplainLessThanOrEqualTo(String value) {
            addCriterion("scene_explain <=", value, "sceneExplain");
            return (Criteria) this;
        }

        public Criteria andSceneExplainLike(String value) {
            addCriterion("scene_explain like", value, "sceneExplain");
            return (Criteria) this;
        }

        public Criteria andSceneExplainNotLike(String value) {
            addCriterion("scene_explain not like", value, "sceneExplain");
            return (Criteria) this;
        }

        public Criteria andSceneExplainIn(List<String> values) {
            addCriterion("scene_explain in", values, "sceneExplain");
            return (Criteria) this;
        }

        public Criteria andSceneExplainNotIn(List<String> values) {
            addCriterion("scene_explain not in", values, "sceneExplain");
            return (Criteria) this;
        }

        public Criteria andSceneExplainBetween(String value1, String value2) {
            addCriterion("scene_explain between", value1, value2, "sceneExplain");
            return (Criteria) this;
        }

        public Criteria andSceneExplainNotBetween(String value1, String value2) {
            addCriterion("scene_explain not between", value1, value2, "sceneExplain");
            return (Criteria) this;
        }

        public Criteria andSceneTimeIsNull() {
            addCriterion("scene_time is null");
            return (Criteria) this;
        }

        public Criteria andSceneTimeIsNotNull() {
            addCriterion("scene_time is not null");
            return (Criteria) this;
        }

        public Criteria andSceneTimeEqualTo(String value) {
            addCriterion("scene_time =", value, "sceneTime");
            return (Criteria) this;
        }

        public Criteria andSceneTimeNotEqualTo(String value) {
            addCriterion("scene_time <>", value, "sceneTime");
            return (Criteria) this;
        }

        public Criteria andSceneTimeGreaterThan(String value) {
            addCriterion("scene_time >", value, "sceneTime");
            return (Criteria) this;
        }

        public Criteria andSceneTimeGreaterThanOrEqualTo(String value) {
            addCriterion("scene_time >=", value, "sceneTime");
            return (Criteria) this;
        }

        public Criteria andSceneTimeLessThan(String value) {
            addCriterion("scene_time <", value, "sceneTime");
            return (Criteria) this;
        }

        public Criteria andSceneTimeLessThanOrEqualTo(String value) {
            addCriterion("scene_time <=", value, "sceneTime");
            return (Criteria) this;
        }

        public Criteria andSceneTimeLike(String value) {
            addCriterion("scene_time like", value, "sceneTime");
            return (Criteria) this;
        }

        public Criteria andSceneTimeNotLike(String value) {
            addCriterion("scene_time not like", value, "sceneTime");
            return (Criteria) this;
        }

        public Criteria andSceneTimeIn(List<String> values) {
            addCriterion("scene_time in", values, "sceneTime");
            return (Criteria) this;
        }

        public Criteria andSceneTimeNotIn(List<String> values) {
            addCriterion("scene_time not in", values, "sceneTime");
            return (Criteria) this;
        }

        public Criteria andSceneTimeBetween(String value1, String value2) {
            addCriterion("scene_time between", value1, value2, "sceneTime");
            return (Criteria) this;
        }

        public Criteria andSceneTimeNotBetween(String value1, String value2) {
            addCriterion("scene_time not between", value1, value2, "sceneTime");
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
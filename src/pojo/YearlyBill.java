package pojo;

public class YearlyBill {
    private Integer yearlyId;

    private String openId;

    private Float yearlySnacks;

    private Float yearlyFare;

    private Float yearlyStay;

    private Float yearlyRepast;

    private Float yearlyRecreation;

    private Float yearlyClothing;

    private Float yearlyDaily;

    private Float yearlyOther;

    private Float yearlyTotal;

    private String yearlyTime;

    public YearlyBill() {
    }

    public Integer getYearlyId() {
        return yearlyId;
    }

    public void setYearlyId(Integer yearlyId) {
        this.yearlyId = yearlyId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Float getYearlySnacks() {
        return yearlySnacks;
    }

    public void setYearlySnacks(Float yearlySnacks) {
        this.yearlySnacks = yearlySnacks;
    }

    public Float getYearlyFare() {
        return yearlyFare;
    }

    public void setYearlyFare(Float yearlyFare) {
        this.yearlyFare = yearlyFare;
    }

    public Float getYearlyStay() {
        return yearlyStay;
    }

    public void setYearlyStay(Float yearlyStay) {
        this.yearlyStay = yearlyStay;
    }

    public Float getYearlyRepast() {
        return yearlyRepast;
    }

    public void setYearlyRepast(Float yearlyRepast) {
        this.yearlyRepast = yearlyRepast;
    }

    public Float getYearlyRecreation() {
        return yearlyRecreation;
    }

    public void setYearlyRecreation(Float yearlyRecreation) {
        this.yearlyRecreation = yearlyRecreation;
    }

    public Float getYearlyClothing() {
        return yearlyClothing;
    }

    public void setYearlyClothing(Float yearlyClothing) {
        this.yearlyClothing = yearlyClothing;
    }

    public Float getYearlyDaily() {
        return yearlyDaily;
    }

    public void setYearlyDaily(Float yearlyDaily) {
        this.yearlyDaily = yearlyDaily;
    }

    public Float getYearlyOther() {
        return yearlyOther;
    }

    public void setYearlyOther(Float yearlyOther) {
        this.yearlyOther = yearlyOther;
    }

    public Float getYearlyTotal() {
        return yearlyTotal;
    }

    public void setYearlyTotal(Float yearlyTotal) {
        this.yearlyTotal = yearlyTotal;
    }

    public String getYearlyTime() {
        return yearlyTime;
    }

    public void setYearlyTime(String yearlyTime) {
        this.yearlyTime = yearlyTime == null ? null : yearlyTime.trim();
    }

    @Override
    public String toString() {
        return "YearlyBill{" +
                "yearlyId=" + yearlyId +
                ", openId='" + openId + '\'' +
                ", yearlySnacks=" + yearlySnacks +
                ", yearlyFare=" + yearlyFare +
                ", yearlyStay=" + yearlyStay +
                ", yearlyRepast=" + yearlyRepast +
                ", yearlyRecreation=" + yearlyRecreation +
                ", yearlyClothing=" + yearlyClothing +
                ", yearlyDaily=" + yearlyDaily +
                ", yearlyOther=" + yearlyOther +
                ", yearlyTotal=" + yearlyTotal +
                ", yearlyTime='" + yearlyTime + '\'' +
                '}';
    }
}
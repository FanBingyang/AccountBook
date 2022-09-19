package pojo;

public class MonthlyBill {
    private Integer monthlyId;

    private String openId;

    private Float monthlySnacks;

    private Float monthlyFare;

    private Float monthlyStay;

    private Float monthlyRepast;

    private Float monthlyRecreation;

    private Float monthlyClothing;

    private Float monthlyDaily;

    private Float monthlyOther;

    private Float monthlyTotal;

    private String monthlyTime;

    public MonthlyBill() {
    }

    public Integer getMonthlyId() {
        return monthlyId;
    }

    public void setMonthlyId(Integer monthlyId) {
        this.monthlyId = monthlyId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Float getMonthlySnacks() {
        return monthlySnacks;
    }

    public void setMonthlySnacks(Float monthlySnacks) {
        this.monthlySnacks = monthlySnacks;
    }

    public Float getMonthlyFare() {
        return monthlyFare;
    }

    public void setMonthlyFare(Float monthlyFare) {
        this.monthlyFare = monthlyFare;
    }

    public Float getMonthlyStay() {
        return monthlyStay;
    }

    public void setMonthlyStay(Float monthlyStay) {
        this.monthlyStay = monthlyStay;
    }

    public Float getMonthlyRepast() {
        return monthlyRepast;
    }

    public void setMonthlyRepast(Float monthlyRepast) {
        this.monthlyRepast = monthlyRepast;
    }

    public Float getMonthlyRecreation() {
        return monthlyRecreation;
    }

    public void setMonthlyRecreation(Float monthlyRecreation) {
        this.monthlyRecreation = monthlyRecreation;
    }

    public Float getMonthlyClothing() {
        return monthlyClothing;
    }

    public void setMonthlyClothing(Float monthlyClothing) {
        this.monthlyClothing = monthlyClothing;
    }

    public Float getMonthlyDaily() {
        return monthlyDaily;
    }

    public void setMonthlyDaily(Float monthlyDaily) {
        this.monthlyDaily = monthlyDaily;
    }

    public Float getMonthlyOther() {
        return monthlyOther;
    }

    public void setMonthlyOther(Float monthlyOther) {
        this.monthlyOther = monthlyOther;
    }

    public Float getMonthlyTotal() {
        return monthlyTotal;
    }

    public void setMonthlyTotal(Float monthlyTotal) {
        this.monthlyTotal = monthlyTotal;
    }

    public String getMonthlyTime() {
        return monthlyTime;
    }

    public void setMonthlyTime(String monthlyTime) {
        this.monthlyTime = monthlyTime == null ? null : monthlyTime.trim();
    }

    @Override
    public String toString() {
        return "MonthlyBill{" +
                "monthlyId=" + monthlyId +
                ", openId='" + openId + '\'' +
                ", monthlySnacks=" + monthlySnacks +
                ", monthlyFare=" + monthlyFare +
                ", monthlyStay=" + monthlyStay +
                ", monthlyRepast=" + monthlyRepast +
                ", monthlyRecreation=" + monthlyRecreation +
                ", monthlyClothing=" + monthlyClothing +
                ", monthlyDaily=" + monthlyDaily +
                ", monthlyOther=" + monthlyOther +
                ", monthlyTotal=" + monthlyTotal +
                ", monthlyTime='" + monthlyTime + '\'' +
                '}';
    }
}
package pojo;

public class Expense {
    private Integer expenseId;

    private String openId;

    private String expenseTitle;

    private String expenseCategory;

    private Float expenseMoney;

    private String expenseExplain;

    private String expenseTime;

    public Expense() {
    }

    public Expense(Integer expenseId, String openId, String expenseTitle, String expenseCategory, Float expenseMoney, String expenseExplain, String expenseTime) {
        this.expenseId = expenseId;
        this.openId = openId;
        this.expenseTitle = expenseTitle;
        this.expenseCategory = expenseCategory;
        this.expenseMoney = expenseMoney;
        this.expenseExplain = expenseExplain;
        this.expenseTime = expenseTime;
    }

    public Integer getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Integer expenseId) {
        this.expenseId = expenseId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getExpenseTitle() {
        return expenseTitle;
    }

    public void setExpenseTitle(String expenseTitle) {
        this.expenseTitle = expenseTitle == null ? null : expenseTitle.trim();
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory == null ? null : expenseCategory.trim();
    }

    public Float getExpenseMoney() {
        return expenseMoney;
    }

    public void setExpenseMoney(Float expenseMoney) {
        this.expenseMoney = expenseMoney;
    }

    public String getExpenseExplain() {
        return expenseExplain;
    }

    public void setExpenseExplain(String expenseExplain) {
        this.expenseExplain = expenseExplain == null ? null : expenseExplain.trim();
    }

    public String getExpenseTime() {
        return expenseTime;
    }

    public void setExpenseTime(String expenseTime) {
        this.expenseTime = expenseTime == null ? null : expenseTime.trim();
    }

    @Override
    public String toString() {
        return "Expense{" +
                "expenseId=" + expenseId +
                ", openId='" + openId + '\'' +
                ", expenseTitle='" + expenseTitle + '\'' +
                ", expenseCategory='" + expenseCategory + '\'' +
                ", expenseMoney=" + expenseMoney +
                ", expenseExplain='" + expenseExplain + '\'' +
                ", expenseTime='" + expenseTime + '\'' +
                '}';
    }
}
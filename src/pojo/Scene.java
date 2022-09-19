package pojo;

public class Scene {
    private Integer sceneId;

    private String openId;

    private String sceneTitle;

    private Float sceneSnacks;

    private Float sceneFare;

    private Float sceneStay;

    private Float sceneRepast;

    private Float sceneRecreation;

    private Float sceneClothing;

    private Float sceneDaily;

    private Float sceneOther;

    private Float sceneTotal;

    private String sceneExplain;

    private String sceneTime;

    public Scene() {
    }

    public Scene(Integer sceneId, String openId, String sceneTitle, Float sceneSnacks, Float sceneFare, Float sceneStay, Float sceneRepast, Float sceneRecreation, Float sceneClothing, Float sceneDaily, Float sceneOther, Float sceneTotal, String sceneExplain, String sceneTime) {
        this.sceneId = sceneId;
        this.openId = openId;
        this.sceneTitle = sceneTitle;
        this.sceneSnacks = sceneSnacks;
        this.sceneFare = sceneFare;
        this.sceneStay = sceneStay;
        this.sceneRepast = sceneRepast;
        this.sceneRecreation = sceneRecreation;
        this.sceneClothing = sceneClothing;
        this.sceneDaily = sceneDaily;
        this.sceneOther = sceneOther;
        this.sceneTotal = sceneTotal;
        this.sceneExplain = sceneExplain;
        this.sceneTime = sceneTime;
    }

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getSceneTitle() {
        return sceneTitle;
    }

    public void setSceneTitle(String sceneTitle) {
        this.sceneTitle = sceneTitle == null ? null : sceneTitle.trim();
    }

    public Float getSceneSnacks() {
        return sceneSnacks;
    }

    public void setSceneSnacks(Float sceneSnacks) {
        this.sceneSnacks = sceneSnacks;
    }

    public Float getSceneFare() {
        return sceneFare;
    }

    public void setSceneFare(Float sceneFare) {
        this.sceneFare = sceneFare;
    }

    public Float getSceneStay() {
        return sceneStay;
    }

    public void setSceneStay(Float sceneStay) {
        this.sceneStay = sceneStay;
    }

    public Float getSceneRepast() {
        return sceneRepast;
    }

    public void setSceneRepast(Float sceneRepast) {
        this.sceneRepast = sceneRepast;
    }

    public Float getSceneRecreation() {
        return sceneRecreation;
    }

    public void setSceneRecreation(Float sceneRecreation) {
        this.sceneRecreation = sceneRecreation;
    }

    public Float getSceneClothing() {
        return sceneClothing;
    }

    public void setSceneClothing(Float sceneClothing) {
        this.sceneClothing = sceneClothing;
    }

    public Float getSceneDaily() {
        return sceneDaily;
    }

    public void setSceneDaily(Float sceneDaily) {
        this.sceneDaily = sceneDaily;
    }

    public Float getSceneOther() {
        return sceneOther;
    }

    public void setSceneOther(Float sceneOther) {
        this.sceneOther = sceneOther;
    }

    public Float getSceneTotal() {
        return sceneTotal;
    }

    public void setSceneTotal(Float sceneTotal) {
        this.sceneTotal = sceneTotal;
    }

    public String getSceneExplain() {
        return sceneExplain;
    }

    public void setSceneExplain(String sceneExplain) {
        this.sceneExplain = sceneExplain == null ? null : sceneExplain.trim();
    }

    public String getSceneTime() {
        return sceneTime;
    }

    public void setSceneTime(String sceneTime) {
        this.sceneTime = sceneTime == null ? null : sceneTime.trim();
    }

    @Override
    public String toString() {
        return "Scene{" +
                "sceneId=" + sceneId +
                ", openId='" + openId + '\'' +
                ", sceneTitle='" + sceneTitle + '\'' +
                ", sceneSnacks=" + sceneSnacks +
                ", sceneFare=" + sceneFare +
                ", sceneStay=" + sceneStay +
                ", sceneRepast=" + sceneRepast +
                ", sceneRecreation=" + sceneRecreation +
                ", sceneClothing=" + sceneClothing +
                ", sceneDaily=" + sceneDaily +
                ", sceneOther=" + sceneOther +
                ", sceneTotal=" + sceneTotal +
                ", sceneExplain='" + sceneExplain + '\'' +
                ", sceneTime='" + sceneTime + '\'' +
                '}';
    }
}
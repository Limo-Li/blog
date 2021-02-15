package com.jackson.user.orm.model.dailypaper;

public class DailyPaperRecord {

    private int id;

    private int userId;

    private String content;

    private String plan;

    private int idDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getIdDate() {
        return idDate;
    }

    public void setIdDate(int idDate) {
        this.idDate = idDate;
    }
}

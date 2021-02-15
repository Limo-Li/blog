package com.jackson.user.orm.model.identity;

public class UserDailyRecord {
    private Integer relationId;

    private Integer userId;

    private Integer dailyId;

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDailyId() {
        return dailyId;
    }

    public void setDailyId(Integer dailyId) {
        this.dailyId = dailyId;
    }
}
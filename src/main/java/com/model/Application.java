package com.model;

public class Application {
    private Integer applicationId;
    private String fullName;
    private String course;
    private Boolean isOnline;
    private String email;

    public Application(){}

    public Application(Integer applicationId, String fullName, String course, Boolean isOnline, String email) {
        this.applicationId = applicationId;
        this.fullName = fullName;
        this.course = course;
        this.isOnline = isOnline;
        this.email = email;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean online) {
        isOnline = online;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.reaction.ices4hu.core.requests;

public class AssignCourseRequest {

    private String courseCode;
    private String semester;

    private Long userId;

    public AssignCourseRequest(String courseCode, String semester, Long userId) {
        this.courseCode = courseCode;
        this.semester = semester;
        this.userId = userId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}

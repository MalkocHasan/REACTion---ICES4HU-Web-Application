package com.reaction.ices4hu.core.requests;

public class DeleteCourseRequest {
    private String courseCode;
    private String semester;

    public DeleteCourseRequest(String courseCode, String semester) {
        this.courseCode = courseCode;
        this.semester = semester;


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

}

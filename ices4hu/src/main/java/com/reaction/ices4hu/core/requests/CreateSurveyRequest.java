package com.reaction.ices4hu.core.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.reaction.ices4hu.core.dtos.QuestionDTO;

import java.util.List;

public class CreateSurveyRequest {

    public Long getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Long instructorId) {
        this.instructorId = instructorId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getSurveyType() {
        return surveyType;
    }

    public void setSurveyType(String surveyType) {
        this.surveyType = surveyType;
    }

    public List<QuestionDTO> getQuestionDTOS() {
        return questionDTOS;
    }

    public void setQuestionDTOS(List<QuestionDTO> questionDTOS) {
        this.questionDTOS = questionDTOS;
    }


    private Long instructorId;


    private Long courseId;


    private String surveyType;


    private List<QuestionDTO> questionDTOS;


    public CreateSurveyRequest(Long instructorId, Long courseId, String surveyType, List<QuestionDTO> questionDTOS) {
        this.instructorId = instructorId;
        this.courseId = courseId;
        this.surveyType = surveyType;
        this.questionDTOS = questionDTOS;
    }


}

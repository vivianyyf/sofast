package com.sofast.application.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class StudentHasQuestionnaireSurveyPK implements Serializable {
    private String studentInfoId;
    private String questionnaireSurveyId;

    @Column(name = "student_info_id")
    @Id
    public String getStudentInfoId() {
        return studentInfoId;
    }

    public void setStudentInfoId(String studentInfoId) {
        this.studentInfoId = studentInfoId;
    }

    @Column(name = "questionnaire_survey_id")
    @Id
    public String getQuestionnaireSurveyId() {
        return questionnaireSurveyId;
    }

    public void setQuestionnaireSurveyId(String questionnaireSurveyId) {
        this.questionnaireSurveyId = questionnaireSurveyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentHasQuestionnaireSurveyPK that = (StudentHasQuestionnaireSurveyPK) o;

        if (studentInfoId != null ? !studentInfoId.equals(that.studentInfoId) : that.studentInfoId != null)
            return false;
        if (questionnaireSurveyId != null ? !questionnaireSurveyId.equals(that.questionnaireSurveyId) : that.questionnaireSurveyId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentInfoId != null ? studentInfoId.hashCode() : 0;
        result = 31 * result + (questionnaireSurveyId != null ? questionnaireSurveyId.hashCode() : 0);
        return result;
    }
}

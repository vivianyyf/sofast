package com.sofast.application.model;

import javax.persistence.*;

@Entity
@Table(name = "student_has_questionnaire_survey", schema = "so_fast", catalog = "")
@IdClass(StudentHasQuestionnaireSurveyPK.class)
public class StudentHasQuestionnaireSurvey {
    private String studentInfoId;
    private String questionnaireSurveyId;
    private String answer;

    @Id
    @Column(name = "student_info_id")
    public String getStudentInfoId() {
        return studentInfoId;
    }

    public void setStudentInfoId(String studentInfoId) {
        this.studentInfoId = studentInfoId;
    }

    @Id
    @Column(name = "questionnaire_survey_id")
    public String getQuestionnaireSurveyId() {
        return questionnaireSurveyId;
    }

    public void setQuestionnaireSurveyId(String questionnaireSurveyId) {
        this.questionnaireSurveyId = questionnaireSurveyId;
    }

    @Basic
    @Column(name = "answer")
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentHasQuestionnaireSurvey that = (StudentHasQuestionnaireSurvey) o;

        if (studentInfoId != null ? !studentInfoId.equals(that.studentInfoId) : that.studentInfoId != null)
            return false;
        if (questionnaireSurveyId != null ? !questionnaireSurveyId.equals(that.questionnaireSurveyId) : that.questionnaireSurveyId != null)
            return false;
        if (answer != null ? !answer.equals(that.answer) : that.answer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentInfoId != null ? studentInfoId.hashCode() : 0;
        result = 31 * result + (questionnaireSurveyId != null ? questionnaireSurveyId.hashCode() : 0);
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        return result;
    }
}

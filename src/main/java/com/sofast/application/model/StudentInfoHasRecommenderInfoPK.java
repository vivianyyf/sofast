package com.sofast.application.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class StudentInfoHasRecommenderInfoPK implements Serializable {
    private String studentInfoId;
    private String recommenderInfoId;

    @Column(name = "student_info_id")
    @Id
    public String getStudentInfoId() {
        return studentInfoId;
    }

    public void setStudentInfoId(String studentInfoId) {
        this.studentInfoId = studentInfoId;
    }

    @Column(name = "recommender_info_id")
    @Id
    public String getRecommenderInfoId() {
        return recommenderInfoId;
    }

    public void setRecommenderInfoId(String recommenderInfoId) {
        this.recommenderInfoId = recommenderInfoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentInfoHasRecommenderInfoPK that = (StudentInfoHasRecommenderInfoPK) o;

        if (studentInfoId != null ? !studentInfoId.equals(that.studentInfoId) : that.studentInfoId != null)
            return false;
        if (recommenderInfoId != null ? !recommenderInfoId.equals(that.recommenderInfoId) : that.recommenderInfoId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentInfoId != null ? studentInfoId.hashCode() : 0;
        result = 31 * result + (recommenderInfoId != null ? recommenderInfoId.hashCode() : 0);
        return result;
    }
}

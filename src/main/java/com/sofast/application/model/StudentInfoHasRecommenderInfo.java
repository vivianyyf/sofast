package com.sofast.application.model;

import javax.persistence.*;

@Entity
@Table(name = "student_info_has_recommender_info", schema = "so_fast", catalog = "")
@IdClass(StudentInfoHasRecommenderInfoPK.class)
public class StudentInfoHasRecommenderInfo {
    private String studentInfoId;
    private String recommenderInfoId;

    @Id
    @Column(name = "student_info_id")
    public String getStudentInfoId() {
        return studentInfoId;
    }

    public void setStudentInfoId(String studentInfoId) {
        this.studentInfoId = studentInfoId;
    }

    @Id
    @Column(name = "recommender_info_id")
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

        StudentInfoHasRecommenderInfo that = (StudentInfoHasRecommenderInfo) o;

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

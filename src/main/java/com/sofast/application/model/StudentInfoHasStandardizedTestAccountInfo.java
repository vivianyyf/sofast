package com.sofast.application.model;

import javax.persistence.*;

@Entity
@Table(name = "student_info_has_standardized_test_account_info", schema = "so_fast", catalog = "")
@IdClass(StudentInfoHasStandardizedTestAccountInfoPK.class)
public class StudentInfoHasStandardizedTestAccountInfo {
    private String studentInfoId;
    private String standardizedTestAccountInfoId;

    @Id
    @Column(name = "student_info_id")
    public String getStudentInfoId() {
        return studentInfoId;
    }

    public void setStudentInfoId(String studentInfoId) {
        this.studentInfoId = studentInfoId;
    }

    @Id
    @Column(name = "standardized_test_account_info_id")
    public String getStandardizedTestAccountInfoId() {
        return standardizedTestAccountInfoId;
    }

    public void setStandardizedTestAccountInfoId(String standardizedTestAccountInfoId) {
        this.standardizedTestAccountInfoId = standardizedTestAccountInfoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentInfoHasStandardizedTestAccountInfo that = (StudentInfoHasStandardizedTestAccountInfo) o;

        if (studentInfoId != null ? !studentInfoId.equals(that.studentInfoId) : that.studentInfoId != null)
            return false;
        if (standardizedTestAccountInfoId != null ? !standardizedTestAccountInfoId.equals(that.standardizedTestAccountInfoId) : that.standardizedTestAccountInfoId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentInfoId != null ? studentInfoId.hashCode() : 0;
        result = 31 * result + (standardizedTestAccountInfoId != null ? standardizedTestAccountInfoId.hashCode() : 0);
        return result;
    }
}

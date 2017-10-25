package com.sofast.application.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class StudentInfoHasStandardizedTestAccountInfoPK implements Serializable {
    private String studentInfoId;
    private String standardizedTestAccountInfoId;

    @Column(name = "student_info_id")
    @Id
    public String getStudentInfoId() {
        return studentInfoId;
    }

    public void setStudentInfoId(String studentInfoId) {
        this.studentInfoId = studentInfoId;
    }

    @Column(name = "standardized_test_account_info_id")
    @Id
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

        StudentInfoHasStandardizedTestAccountInfoPK that = (StudentInfoHasStandardizedTestAccountInfoPK) o;

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

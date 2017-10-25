package com.sofast.application.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "student_info", schema = "so_fast", catalog = "")
public class StudentInfo {
    private String id;
    private String studentBasicId;
    private Timestamp createdAt;
    private Timestamp dateOfBirth;
    private Timestamp countryOfBirth;
    private String passportNumber;
    private String applicantEmailAddress;
    private String nationality;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "student_basic_id")
    public String getStudentBasicId() {
        return studentBasicId;
    }

    public void setStudentBasicId(String studentBasicId) {
        this.studentBasicId = studentBasicId;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "date_of_birth")
    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "country_of_Birth")
    public Timestamp getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(Timestamp countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    @Basic
    @Column(name = "passport_number")
    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Basic
    @Column(name = "applicant_email_address")
    public String getApplicantEmailAddress() {
        return applicantEmailAddress;
    }

    public void setApplicantEmailAddress(String applicantEmailAddress) {
        this.applicantEmailAddress = applicantEmailAddress;
    }

    @Basic
    @Column(name = "nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentInfo that = (StudentInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (studentBasicId != null ? !studentBasicId.equals(that.studentBasicId) : that.studentBasicId != null)
            return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(that.dateOfBirth) : that.dateOfBirth != null) return false;
        if (countryOfBirth != null ? !countryOfBirth.equals(that.countryOfBirth) : that.countryOfBirth != null)
            return false;
        if (passportNumber != null ? !passportNumber.equals(that.passportNumber) : that.passportNumber != null)
            return false;
        if (applicantEmailAddress != null ? !applicantEmailAddress.equals(that.applicantEmailAddress) : that.applicantEmailAddress != null)
            return false;
        if (nationality != null ? !nationality.equals(that.nationality) : that.nationality != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (studentBasicId != null ? studentBasicId.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (countryOfBirth != null ? countryOfBirth.hashCode() : 0);
        result = 31 * result + (passportNumber != null ? passportNumber.hashCode() : 0);
        result = 31 * result + (applicantEmailAddress != null ? applicantEmailAddress.hashCode() : 0);
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        return result;
    }
}

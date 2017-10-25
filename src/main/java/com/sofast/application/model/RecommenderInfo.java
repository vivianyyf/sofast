package com.sofast.application.model;

import javax.persistence.*;

@Entity
@Table(name = "recommender_info", schema = "so_fast", catalog = "")
public class RecommenderInfo {
    private String id;
    private String type;
    private String nameOfRecommender;
    private String jobTitle;
    private String relationship;
    private String phoneId;
    private String cellPhoneId;
    private String email;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "name_of_recommender")
    public String getNameOfRecommender() {
        return nameOfRecommender;
    }

    public void setNameOfRecommender(String nameOfRecommender) {
        this.nameOfRecommender = nameOfRecommender;
    }

    @Basic
    @Column(name = "job_title")
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Basic
    @Column(name = "relationship")
    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Basic
    @Column(name = "phone_id")
    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    @Basic
    @Column(name = "cell_phone_id")
    public String getCellPhoneId() {
        return cellPhoneId;
    }

    public void setCellPhoneId(String cellPhoneId) {
        this.cellPhoneId = cellPhoneId;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecommenderInfo that = (RecommenderInfo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (nameOfRecommender != null ? !nameOfRecommender.equals(that.nameOfRecommender) : that.nameOfRecommender != null)
            return false;
        if (jobTitle != null ? !jobTitle.equals(that.jobTitle) : that.jobTitle != null) return false;
        if (relationship != null ? !relationship.equals(that.relationship) : that.relationship != null) return false;
        if (phoneId != null ? !phoneId.equals(that.phoneId) : that.phoneId != null) return false;
        if (cellPhoneId != null ? !cellPhoneId.equals(that.cellPhoneId) : that.cellPhoneId != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (nameOfRecommender != null ? nameOfRecommender.hashCode() : 0);
        result = 31 * result + (jobTitle != null ? jobTitle.hashCode() : 0);
        result = 31 * result + (relationship != null ? relationship.hashCode() : 0);
        result = 31 * result + (phoneId != null ? phoneId.hashCode() : 0);
        result = 31 * result + (cellPhoneId != null ? cellPhoneId.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}

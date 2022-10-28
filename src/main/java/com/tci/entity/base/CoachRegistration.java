package com.tci.entity.base;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Syed Muhammad Hassan
 * 27th September, 2022
 */
@Entity
@Table(name="coachregistration")
public class CoachRegistration {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="contactNumber")
    private String contactNumber;
    @Column(name="designation")
    private String designation;
    @Column(name="gender")
    private String gender;
    @Column(name="rolesAndResponsibilities")
    private String rolesAndResponsibilities;
    @Column(name="termOfEngagement")
    private String termOfEngagement;
    @Column(name="primaryFunction")
    private String primaryFunction;
    @Column(name="coachType")
    private String coachType;
    @Column(name="keyStrengths")
    private String keyStrengths;
    @Column(name="serviceType")
    private String serviceType;
    @Column(name="basicPayScale")
    private int basicPayScale;

    @Column(name="UPDATE_BY")
    private String UPDATE_BY;
    @Column(name="UPDATE_DATE")
    private Date updateDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRolesAndResponsibilities() {
        return rolesAndResponsibilities;
    }

    public void setRolesAndResponsibilities(String rolesAndResponsibilities) {
        this.rolesAndResponsibilities = rolesAndResponsibilities;
    }

    public String getTermOfEngagement() {
        return termOfEngagement;
    }

    public void setTermOfEngagement(String termOfEngagement) {
        this.termOfEngagement = termOfEngagement;
    }

    public String getPrimaryFunction() {
        return primaryFunction;
    }

    public void setPrimaryFunction(String primaryFunction) {
        this.primaryFunction = primaryFunction;
    }

    public String getCoachType() {
        return coachType;
    }

    public void setCoachType(String coachType) {
        this.coachType = coachType;
    }

    public String getKeyStrengths() {
        return keyStrengths;
    }

    public void setKeyStrengths(String keyStrengths) {
        this.keyStrengths = keyStrengths;
    }

    public String getUPDATE_BY() {
        return UPDATE_BY;
    }

    public void setUPDATE_BY(String UPDATE_BY) {
        this.UPDATE_BY = UPDATE_BY;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getBasicPayScale() {
        return basicPayScale;
    }

    public void setBasicPayScale(int basicPayScale) {
        this.basicPayScale = basicPayScale;
    }
}

package com.tci.entity.base;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Syed Muhammad Hassan
 * 22nd September, 2022
 */
@Entity
@Table(name="CoachingLog")
public class CoachingLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "coachId")
    private Integer coachId;
    @Column(name = "coachingDate")
    private String coachingDate;
    @Column(name = "durationOfCoachingSession")
    private String durationOfCoachingSession;
    @Column(name = "typeOfSession")
    private String typeOfSession;
    @Column(name = "modeOfCoaching")
    private String modeOfCoaching;
    @Column(name = "healthFacilityId")
    private Integer healthFacilityId;
    @Column(name = "typeOfCoachingRequest")
    private String typeOfCoachingRequest;
    @Column(name = "focusOfCoaching")
    private String focusOfCoaching;
    @Column(name = "coachingTool")
    private String coachingTool;
    @Column(name = "hiaCoachedOn")
    private String hiaCoachedOn;
    @Column(name = "materialUsedDuringSession")
    private String materialUsedDuringSession;
    @Column(name = "coachingSessionObjectivesAndActivities")
    private String coachingSessionObjectivesAndActivities;
    @Column(name="followUpRequired")
    private String followUpRequired;
    @Column(name = "kindOfRequiredFollowUp")
    private String kindOfRequiredFollowUp;
    @Column(name = "areasOfImprovement")
    private String areasOfImprovement;
    @Column(name = "recommendations")
    private String recommendations;
    @Column(name="city")
    private String city;

    @Column(name = "UPDATE_BY")
    private String UPDATE_BY;
    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoachingDate() {
        return coachingDate;
    }

    public void setCoachingDate(String coachingDate) {
        this.coachingDate = coachingDate;
    }

    public String getDurationOfCoachingSession() {
        return durationOfCoachingSession;
    }

    public void setDurationOfCoachingSession(String durationOfCoachingSession) {
        this.durationOfCoachingSession = durationOfCoachingSession;
    }

    public String getTypeOfSession() {
        return typeOfSession;
    }

    public void setTypeOfSession(String typeOfSession) {
        this.typeOfSession = typeOfSession;
    }

    public String getModeOfCoaching() {
        return modeOfCoaching;
    }

    public void setModeOfCoaching(String modeOfCoaching) {
        this.modeOfCoaching = modeOfCoaching;
    }

    public Integer getHealthFacilityId() {
        return healthFacilityId;
    }

    public void setHealthFacilityId(Integer healthFacilityId) {
        this.healthFacilityId = healthFacilityId;
    }

    public String getTypeOfCoachingRequest() {
        return typeOfCoachingRequest;
    }

    public void setTypeOfCoachingRequest(String typeOfCoachingRequest) {
        this.typeOfCoachingRequest = typeOfCoachingRequest;
    }

    public String getFocusOfCoaching() {
        return focusOfCoaching;
    }

    public void setFocusOfCoaching(String focusOfCoaching) {
        this.focusOfCoaching = focusOfCoaching;
    }

    public String getCoachingTool() {
        return coachingTool;
    }

    public void setCoachingTool(String coachingTool) {
        this.coachingTool = coachingTool;
    }

    public String getHiaCoachedOn() {
        return hiaCoachedOn;
    }

    public void setHiaCoachedOn(String hiaCoachedOn) {
        this.hiaCoachedOn = hiaCoachedOn;
    }

    public String getMaterialUsedDuringSession() {
        return materialUsedDuringSession;
    }

    public void setMaterialUsedDuringSession(String materialUsedDuringSession) {
        this.materialUsedDuringSession = materialUsedDuringSession;
    }

    public String getCoachingSessionObjectivesAndActivities() {
        return coachingSessionObjectivesAndActivities;
    }

    public void setCoachingSessionObjectivesAndActivities(String coachingSessionObjectivesAndActivities) {
        this.coachingSessionObjectivesAndActivities = coachingSessionObjectivesAndActivities;
    }


    public String getKindOfRequiredFollowUp() {
        return kindOfRequiredFollowUp;
    }

    public void setKindOfRequiredFollowUp(String kindOfRequiredFollowUp) {
        this.kindOfRequiredFollowUp = kindOfRequiredFollowUp;
    }

    public String getAreasOfImprovement() {
        return areasOfImprovement;
    }

    public void setAreasOfImprovement(String areasOfImprovement) {
        this.areasOfImprovement = areasOfImprovement;
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
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

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getFollowUpRequired() {
        return followUpRequired;
    }

    public void setFollowUpRequired(String followUpRequired) {
        this.followUpRequired = followUpRequired;
    }

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
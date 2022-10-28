package com.tci.entity.base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Syed Muhammad Hassan
 * 21st October, 2022
 */
@Entity
@Table(name="HIIOutReach")
public class HIIOutReach {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="city")
    private String city;
    @Column(name="dateCompleted")
    private String dateCompleted;
    @Column(name="score")
    private int score;
    @Column(name="coachId")
    private int coachId;
    @Column(name="healthFacilityId")
    private int healthFacilityId;
    @Column(name="outReachFilename")
    private String outReachFilename;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(String dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCoachId() {
        return coachId;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }

    public int getHealthFacilityId() {
        return healthFacilityId;
    }

    public void setHealthFacilityId(int healthFacilityId) {
        this.healthFacilityId = healthFacilityId;
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
}


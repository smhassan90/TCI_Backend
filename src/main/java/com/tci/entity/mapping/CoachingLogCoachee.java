package com.tci.entity.mapping;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Syed Muhammad Hassan
 * 6th October, 2022
 */
@Entity
@Table(name="CoachingLogCoachee")
public class CoachingLogCoachee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "coacheeId")
    private int coacheeId;
    @Column(name = "coachingLogId")
    private int coachingLogId;
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

    public int getCoacheeId() {
        return coacheeId;
    }

    public void setCoacheeId(int coacheeId) {
        this.coacheeId = coacheeId;
    }

    public int getCoachingLogId() {
        return coachingLogId;
    }

    public void setCoachingLogId(int coachingLogId) {
        this.coachingLogId = coachingLogId;
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

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
@Table(name="HIIRaiseAssessment")
public class HIIRaiseAssessment {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="city")
    private String city;
    @Column(name="dateCompleted")
    private String dateCompleted;
    @Column(name="month")
    private int month;
    @Column(name="year")
    private int year;
    @Column(name="quarter")
    private int quarter;
    @Column(name="score")
    private int score;
    @Column(name="raiseScore")
    private int raiseScore;
    @Column(name="raiseFilename")
    private String raiseFilename;

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

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getRaiseScore() {
        return raiseScore;
    }

    public void setRaiseScore(int raiseScore) {
        this.raiseScore = raiseScore;
    }

    public String getRaiseFilename() {
        return raiseFilename;
    }

    public void setRaiseFilename(String raiseFilename) {
        this.raiseFilename = raiseFilename;
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


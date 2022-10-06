package com.tci.entity.base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Syed Muhammad Hassan
 * 20th September, 2022
 */
@Entity
@Table(name="CLMIS")
public class CLMIS {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="city")
    private String city;
    @Column(name="reportingMonth")
    private int reportingMonth;
    @Column(name="reportingYear")
    private int reportingYear;
    @Column(name="injectables")
    private int injectables;
    @Column(name="ec")
    private int ec;
    @Column(name="condoms")
    private int condoms;
    @Column(name="pills")
    private int pills;
    @Column(name="iud")
    private int iud;
    @Column(name="implants")
    private int implants;
    @Column(name="malesterilization")
    private int malesterilization;
    @Column(name="femalesterilization")
    private int femalesterilization;
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

    public int getReportingMonth() {
        return reportingMonth;
    }

    public void setReportingMonth(int reportingMonth) {
        this.reportingMonth = reportingMonth;
    }

    public int getReportingYear() {
        return reportingYear;
    }

    public void setReportingYear(int reportingYear) {
        this.reportingYear = reportingYear;
    }

    public int getInjectables() {
        return injectables;
    }

    public void setInjectables(int injectables) {
        this.injectables = injectables;
    }

    public int getEc() {
        return ec;
    }

    public void setEc(int ec) {
        this.ec = ec;
    }

    public int getCondoms() {
        return condoms;
    }

    public void setCondoms(int condoms) {
        this.condoms = condoms;
    }

    public int getPills() {
        return pills;
    }

    public void setPills(int pills) {
        this.pills = pills;
    }

    public int getIud() {
        return iud;
    }

    public void setIud(int iud) {
        this.iud = iud;
    }

    public int getImplants() {
        return implants;
    }

    public void setImplants(int implants) {
        this.implants = implants;
    }

    public int getMalesterilization() {
        return malesterilization;
    }

    public void setMalesterilization(int malesterilization) {
        this.malesterilization = malesterilization;
    }

    public int getFemalesterilization() {
        return femalesterilization;
    }

    public void setFemalesterilization(int femalesterilization) {
        this.femalesterilization = femalesterilization;
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

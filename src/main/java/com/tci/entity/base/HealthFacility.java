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
@Table(name="healthfacility")
public class HealthFacility {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="nameOfFacility")
    private String nameOfFacility;
    @Column(name="typeOfHealthFacility")
    private String typeOfHealthFacility;

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

    public String getNameOfFacility() {
        return nameOfFacility;
    }

    public void setNameOfFacility(String nameOfFacility) {
        this.nameOfFacility = nameOfFacility;
    }

    public String getTypeOfHealthFacility() {
        return typeOfHealthFacility;
    }

    public void setTypeOfHealthFacility(String typeOfHealthFacility) {
        this.typeOfHealthFacility = typeOfHealthFacility;
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

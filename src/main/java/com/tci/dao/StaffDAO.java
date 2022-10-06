package com.tci.dao;

import com.tci.controllers.greensales.Codes;
import com.tci.entity.login.LoginStatus;
import com.tci.utils.HibernateUtil;
import org.apache.log4j.Logger;
import org.json.JSONObject;

import java.util.List;


public class StaffDAO implements IStaffDatabaseDAO {
    @Override
    public void insertRecord(String username, int status, String token) {

    }

    @Override
    public boolean isExist(String username) {
        return false;
    }

    @Override
    public void updateInformation(String username, int status, String token) {

    }

    @Override
    public boolean isLoggedIn(String username) {
        return false;
    }

    @Override
    public boolean logout(String username) {
        return false;
    }

    @Override
    public String getToken(String username) {
        return null;
    }

    @Override
    public String isCorrect(String username, String password) {
        return null;
    }

    @Override
    public JSONObject performSync(String username) {
        return null;
    }

    @Override
    public String getName(String username) {
        return null;
    }


}

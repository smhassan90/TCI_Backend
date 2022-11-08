package com.tci.controllers.greensales;


import com.google.gson.Gson;
import com.tci.dal.LoginResponse;
import com.tci.entity.login.LoginLog;
import com.tci.entity.login.LoginStatus;
import com.tci.entity.login.User;
import com.tci.utils.HibernateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Syed Muhammad Hassan
 * 8th November, 2021
 */

@Controller
public class LoginServerAttempt {

    @CrossOrigin(origins = "*" )
    @RequestMapping(value = "/loginServerAttempt", method = RequestMethod.GET,params={"username","password"})
    @ResponseBody
    public String loginServerAttempt(String username, String password){
        String secret = "secret";

        User user = new User();
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setStatusCode(Codes.SOMETHING_WENT_WRONG);
        try {

            List<User> users = (List<User>) HibernateUtil.getDBObjects("from User where userName ='" + username + "' and password ='" + password + "'");
            if(users!=null && users.size()>0){

                LoginStatus loginStatus = new LoginStatus();
                user = users.get(0);
                loginStatus.setStatus(1);
                loginStatus.setUsername(user.getUserName());
                loginStatus.setType(user.getUserType());
                String token = UUID.randomUUID().toString();
                loginStatus.setToken(token);
                boolean isSuccessful = HibernateUtil.saveOrUpdate(loginStatus);
                if(isSuccessful){
                    loginResponse.setToken(token);
                    loginResponse.setStatusCode(Codes.ALL_OK);
                    loginResponse.setUser(user);
                }
            }else{
                loginResponse.setStatusCode(Codes.INVALID_CREDENTIALS);
            }
        }catch(Exception e){
            loginResponse.setStatusCode(Codes.SOMETHING_WENT_WRONG);
        }
        return new Gson().toJson(loginResponse);
    }

    @CrossOrigin(origins = "*" )
    @RequestMapping(value = "/loginLog", method = RequestMethod.GET,params={"token"})
    @ResponseBody
    public boolean loginLog(String token){
        String username = "";
        ArrayList<LoginStatus> loginStatuses = (ArrayList<LoginStatus>) HibernateUtil.getDBObjects("from LoginStatus where token = '"+token+"'");
        if(loginStatuses!=null){
            if(loginStatuses.size()>0){
                username = loginStatuses.get(0).getUsername();
            }
        }
        LoginLog loginLog = new LoginLog();
        if(!"".equals(token)){
            loginLog.setTOKEN(token);
            loginLog.setEMP_ID(username);
            return HibernateUtil.save(loginLog);
        }else{
            return false;
        }
    }

}

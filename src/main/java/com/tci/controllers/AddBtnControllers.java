package com.tci.controllers;

import com.tci.controllers.greensales.Codes;
import com.tci.dal.GeneralResponse;
import com.tci.entity.base.Outcome;
import com.tci.utils.HibernateUtil;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class AddBtnControllers {
    @CrossOrigin(origins = "*" )
    @RequestMapping(value = "/btnAddAdminPanel", method = RequestMethod.GET, params = {"tablename","data"})
    @ResponseBody
    public String btnAddAdminPanel(String tablename, String data){
        boolean isSuccessful = false;

        Object obj = null;
        if(tablename!=null && !tablename.equals("") &&
                data!=null && !data.equals("")){
            try {
                Class cls = Class.forName("com.tci.entity.base."+tablename);
                obj = new Gson().fromJson(data, cls);

                isSuccessful = HibernateUtil.saveOrUpdate(obj);
            }catch (Exception e){
                int i = 0;
            }
        }
        GeneralResponse generalResponse = new GeneralResponse();
        if(isSuccessful){
            generalResponse.setStatus(Codes.ALL_OK);
        }else{
            generalResponse.setStatus(Codes.SOMETHING_WENT_WRONG);
        }
        return new Gson().toJson(generalResponse);
    }

}

package com.tci.controllers.data;


import com.google.gson.Gson;
import com.tci.controllers.greensales.Codes;
import com.tci.dal.Response;
import com.tci.entity.mapping.FormCoacheeMapping;
import com.tci.utils.HibernateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * @author Syed Muhammad Hassan
 * 6th October, 2022
 */

@Controller
public class CoachingLogSave {
    @CrossOrigin(origins = "*" )
    @RequestMapping(value = "/addFormCoachee", method = RequestMethod.GET, params = {"token","data","ids", "tableName"})
    @ResponseBody
    public String addCoachingLog(String token, String data, String ids, String tableName) {
        boolean isSuccessful = false;
        Response response = new Response();
        Integer formId = null;
        ArrayList<FormCoacheeMapping> formCoacheeMappings = new ArrayList<>();
        FormCoacheeMapping formCoacheeMapping = new FormCoacheeMapping();
        String[] idsArray = ids.split("&");
        if(HibernateUtil.isLoginValid(token)){
            Object obj = null;
            try {
                Class cls = Class.forName("com.tci.entity.base." + tableName);
                obj = new Gson().fromJson(data, cls);
            }catch (Exception e){

            }
            if(obj!=null){
                formId = HibernateUtil.saveAndGetId(obj);
                if(formId!=null){
                    if(idsArray!=null){
                        for(String id : idsArray){
                            formCoacheeMapping = new FormCoacheeMapping();
                            formCoacheeMapping.setCoacheeId(Integer.valueOf(id.trim()));
                            formCoacheeMapping.setFormId(formId);
                            formCoacheeMapping.setFormName(tableName);
                            formCoacheeMapping.setUPDATE_BY("");
                            formCoacheeMappings.add(formCoacheeMapping);
                        }
                        isSuccessful = HibernateUtil.saveOrUpdateListMySQL(formCoacheeMappings);
                        if(isSuccessful){
                            response.setStatus(Codes.ALL_OK);
                            response.setMessage("Data Inserted");
                        }else{
                            response.setStatus(Codes.SOMETHING_WENT_WRONG);
                        }

                    }else{
                        response.setStatus(Codes.SOMETHING_WENT_WRONG);
                    }


                }else{
                    response.setStatus(Codes.SOMETHING_WENT_WRONG);
                }
            }else{
                response.setStatus(Codes.SOMETHING_WENT_WRONG);
            }
        }else{
            response.setStatus(Codes.INVALID_TOKEN);
        }
        return new Gson().toJson(response);
    }
}

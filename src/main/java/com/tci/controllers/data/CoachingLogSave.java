package com.tci.controllers.data;


import com.google.gson.Gson;
import com.tci.controllers.greensales.Codes;
import com.tci.dal.Response;
import com.tci.entity.base.CoachingLog;
import com.tci.entity.mapping.CoachingLogCoachee;
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
    @RequestMapping(value = "/addCoachingLog", method = RequestMethod.GET, params = {"token","data","ids"})
    @ResponseBody
    public String addCoachingLog(String token, String data, String ids) {
        boolean isSuccessful = false;
        Response response = new Response();
        Integer coachingLogId = null;
        ArrayList<CoachingLogCoachee> coachingLogCoachees = new ArrayList<>();
        CoachingLogCoachee coachingLogCoachee = new CoachingLogCoachee();
        String[] idsArray = ids.split("&");
        if(HibernateUtil.isLoginValid(token)){
            CoachingLog coachingLog = new Gson().fromJson(data, CoachingLog.class);
            if(coachingLog!=null){
                coachingLogId = HibernateUtil.saveAndGetId(coachingLog);
                if(coachingLogId!=null){
                    if(idsArray!=null){
                        for(String id : idsArray){
                            coachingLogCoachee = new CoachingLogCoachee();
                            coachingLogCoachee.setCoacheeId(Integer.valueOf(id.trim()));
                            coachingLogCoachee.setCoachingLogId(coachingLogId);
                            coachingLogCoachee.setUPDATE_BY(coachingLog.getUPDATE_BY());
                            coachingLogCoachees.add(coachingLogCoachee);
                        }
                        isSuccessful = HibernateUtil.saveOrUpdateListMySQL(coachingLogCoachees);
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

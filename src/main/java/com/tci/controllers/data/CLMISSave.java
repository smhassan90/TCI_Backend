package com.tci.controllers.data;

import com.google.gson.Gson;
import com.tci.controllers.greensales.Codes;
import com.tci.dal.Response;
import com.tci.entity.base.CLMIS;
import com.tci.entity.login.User;
import com.tci.utils.HibernateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Syed Muhammad Hassan
 * 21st September, 2022
 */

@Controller
public class CLMISSave {
    @CrossOrigin(origins = "*" )
    @RequestMapping(value = "/addCLMIS", method = RequestMethod.GET, params = {"token","data"})
    @ResponseBody
    public String addCLMIS(String token, String data) {
        boolean isSuccessful = false;
        Response response = new Response();
        if(HibernateUtil.isLoginValid(token)){
            User user = HibernateUtil.getUser(token);
            CLMIS clmis = new Gson().fromJson(data, CLMIS.class);
            clmis.setCity(user.getCity());
            clmis.setUPDATE_BY(user.getUserName());

            String alreadyDataExistQuery = "SELECT count(*) FROM CLMIS WHERE city='"+clmis.getCity()+"' and reportingMonth ="+clmis.getReportingMonth()+" and reportingYear ="+clmis.getReportingYear();

            int count = HibernateUtil.getRecordCount(alreadyDataExistQuery);
            if(count>0){
                response.setStatus(Codes.ALREADY_EXISTS);
            }else{
                isSuccessful = HibernateUtil.saveOrUpdate(clmis);
                if (isSuccessful){
                    response.setStatus(Codes.ALL_OK);
                }else {
                    response.setStatus(Codes.SOMETHING_WENT_WRONG);
                }
            }
        }else{
            response.setStatus(Codes.INVALID_TOKEN);
        }

        return new Gson().toJson(response);
    }
}

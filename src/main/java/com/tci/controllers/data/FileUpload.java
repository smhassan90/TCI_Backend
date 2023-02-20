package com.tci.controllers.data;


import com.google.gson.Gson;
import com.tci.controllers.greensales.Codes;
import com.tci.dal.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author Syed Muhammad Hassan
 * 6th October, 2022
 */

@Controller
public class FileUpload {

    @CrossOrigin(origins = "*" )
    @GetMapping("/index")
    public String hello() {
        return "uploader";
    }
    @CrossOrigin(origins = "*" )
    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile formData ,@RequestParam("filename") String filename) {
        Response response = new Response();
        try {
            formData.transferTo( new File("C:\\xampp\\htdocs\\tci\\uploads\\" + filename));
   //         formData.transferTo( new File("C:\\Temp\\" + filename));
            response.setStatus(Codes.ALL_OK);
            response.setMessage("Successfully Uploaded");

        } catch (Exception e) {
            response.setStatus(Codes.SOMETHING_WENT_WRONG);
        }
        return new Gson().toJson(response);
    }
}
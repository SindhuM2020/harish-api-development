package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.dao.RegistrationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
// @Api("API to Retrieve attendies")
public class RetrieveAttendies{
    private static final Logger LOGGER = LoggerFactory.getLogger(RetrieveAttendies.class);

    @Autowired RegistrationService registrationService;
    // url - http://localhost:8080/retireve-attendies?talkName=Kubernetes
    @GetMapping(value = "/retrieve-attendies")
    public String retrieveAttendies(@RequestParam String talkName){
        String returnValue = "";
        LOGGER.info("Retrieve talk details of talk{}", talkName);
        try{
            returnValue = registrationService.retrieveAttendies(talkName);
            LOGGER.info("Successfully retrieve talk details of talk{}", talkName);
        }catch(NullPointerException e){
            LOGGER.error("Error while retrieveing talk details of talk{}", talkName, e);
        }
       return returnValue;
    }

}
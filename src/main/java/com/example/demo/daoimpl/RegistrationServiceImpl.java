package com.example.demo.daoimpl;

import com.example.demo.dao.RegistrationService;

import org.springframework.stereotype.Component;

@Component
public class RegistrationServiceImpl implements RegistrationService {
  
   @Override
    public String retrieveAttendies(String talkName){ return "host name is Harish";
    }
}
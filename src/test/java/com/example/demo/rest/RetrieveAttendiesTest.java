package com.example.demo.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.rest.RetrieveAttendies;
import com.example.demo.dao.RegistrationService;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class RetrieveAttendiesTest {
    @InjectMocks private RetrieveAttendies retrieveAttendies;
    @Mock private RegistrationService registrationService;

    String talkName = "Kubernetes";
    String returnValue = "host name is Harish";

    // @Test
    // public void retrieveAttendiesPositiveTest(){
    //    when(registrationService.retrieveAttendies(talkName)).thenReturn(returnValue);
    //    verify(registrationService, times(1)).retrieveAttendies(talkName);
    //    retrieveAttendies.retrieveAttendies(talkName);
    // }
}
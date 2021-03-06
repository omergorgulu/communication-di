package com.aep.training.communicationdi.controller;

import com.aep.training.communicationdi.service.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FieldCommunicationController {

    @Autowired
    public CommunicationService communicationService;

    public void handleMessage(){
        System.out.println(communicationService.sendMessage());
    }
}

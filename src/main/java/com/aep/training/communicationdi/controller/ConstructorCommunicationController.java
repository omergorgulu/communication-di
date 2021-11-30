package com.aep.training.communicationdi.controller;

import com.aep.training.communicationdi.service.CommunicationService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorCommunicationController {

    private CommunicationService communicationService;

    public ConstructorCommunicationController(CommunicationService communicationService) {
        this.communicationService = communicationService;
    }

    public void handleMessage(){
        System.out.println(communicationService.sendMessage());
    }
}

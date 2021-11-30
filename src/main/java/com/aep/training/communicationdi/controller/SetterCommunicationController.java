package com.aep.training.communicationdi.controller;

import com.aep.training.communicationdi.service.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterCommunicationController {

    private CommunicationService communicationService;

    @Qualifier("smsCommunicationServiceImpl")
    @Autowired
    public void setCommunicationService(CommunicationService communicationService) {
        this.communicationService = communicationService;
    }

    public void handleMessage(){
        System.out.println(communicationService.sendMessage());
    }
}

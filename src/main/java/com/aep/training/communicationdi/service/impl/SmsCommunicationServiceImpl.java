package com.aep.training.communicationdi.service.impl;

import com.aep.training.communicationdi.service.CommunicationService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
public class SmsCommunicationServiceImpl implements CommunicationService {
    @Override
    public String sendMessage() {
        return "SMS Gönderildi!";
    }
}

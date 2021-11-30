package com.aep.training.communicationdi.service.impl;

import com.aep.training.communicationdi.service.CommunicationService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("pn")
public class PnCommunicationServiceImpl implements CommunicationService {
    @Override
    public String sendMessage() {
        return "Push Notification Gönderildi!";
    }
}

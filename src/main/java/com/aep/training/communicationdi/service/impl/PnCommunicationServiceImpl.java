package com.aep.training.communicationdi.service.impl;

import com.aep.training.communicationdi.service.CommunicationService;
import org.springframework.stereotype.Service;

@Service
public class PnCommunicationServiceImpl implements CommunicationService {
    @Override
    public String sendMessage() {
        return "Push Notification Gönderildi!";
    }
}

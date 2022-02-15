package com.mobinet.fraud.service;

import com.mobinet.fraud.controller.FraudCheckActivityRequest;
import com.mobinet.fraud.model.FraudCheckActivity;
import com.mobinet.fraud.repository.FraudCheckActivityRepository;
import org.springframework.stereotype.Service;

@Service
public class FraudCheckActivityService {

    private FraudCheckActivityRepository fraudCheckActivityRepository;

    public void registerFraudCheckActivity(FraudCheckActivityRequest request){
        FraudCheckActivity fraud = FraudCheckActivity.builder()
                .clientId(request.clientId())
                .fraudDetected(request.fraudDetected())
                .createdAt(request.createdAt())
                .build();
        fraudCheckActivityRepository.save(fraud);
    }

    public Boolean checkClientForFraud(Long clientID){
        return false;
    }

}
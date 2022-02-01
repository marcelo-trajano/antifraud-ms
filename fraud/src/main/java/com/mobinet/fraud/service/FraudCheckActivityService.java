package com.mobinet.fraud.service;

import com.mobinet.fraud.controller.FraudCheckActivityRequest;
import com.mobinet.fraud.model.FraudCheckActivity;
import com.mobinet.fraud.repository.FraudCheckActivityRepository;
import org.springframework.stereotype.Service;

@Service
public record FraudCheckActivityService(FraudCheckActivityRepository fraudCheckActivityRepository) {
    public void registerFraudCheckActivity(FraudCheckActivityRequest request){
        FraudCheckActivity fraud = FraudCheckActivity.builder()
                .clientId(request.clientId())
                .fraudDetected(request.fraudDetected())
                .createdAt(request.createdAt())
                .build();
        fraudCheckActivityRepository.save(fraud);
    };
}
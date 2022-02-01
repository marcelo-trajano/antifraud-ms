package com.mobinet.fraud.controller;

import com.mobinet.fraud.service.FraudCheckActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("api/v1/frauds")
public record FraudCheckActivityController(FraudCheckActivityService fraudCheckActivityService) {

    @PostMapping("")
    public void registerFraudCheckActivity(@RequestBody FraudCheckActivityRequest request){
        log.info("New fraud registration {} ", request );
        fraudCheckActivityService.registerFraudCheckActivity(request);
    }

}

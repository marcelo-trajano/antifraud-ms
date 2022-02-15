package com.mobinet.fraud.controller;

import com.mobinet.fraud.service.FraudCheckActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("api/v1/frauds")
public class FraudCheckActivityController{


    private FraudCheckActivityService fraudCheckActivityService;

    @PostMapping("")
    public void registerFraudCheckActivity(@RequestBody FraudCheckActivityRequest request){
        log.info("New fraud registration {} ", request );
        fraudCheckActivityService.registerFraudCheckActivity(request);
    }

    @GetMapping(path = "{clientID}")
    public FraudCheckResponse fraudCheck(@PathVariable("clientID") Long clientID ){

        Boolean clientFraud =  fraudCheckActivityService.checkClientForFraud(clientID);

        return new FraudCheckResponse(clientFraud);

    }


}

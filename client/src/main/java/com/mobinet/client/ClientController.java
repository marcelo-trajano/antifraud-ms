package com.mobinet.client;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/clients")
public class ClientController {

    public void resisterClient(@RequestBody ClientRegistrationRequest clientRegistrationRequest){
        log.info("New client registration {}", clientRegistrationRequest);

    }



}

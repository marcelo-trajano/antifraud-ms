package com.mobinet.client.service;


import com.mobinet.client.controller.ClientRegistrationRequest;
import com.mobinet.client.model.Client;
import com.mobinet.client.repository.ClientRepository;
import com.mobinet.fraud.controller.FraudCheckResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;
    private final RestTemplate restTemplate;

    public void registerClient(ClientRegistrationRequest request){
        Client client = Client.builder()
                .branchNumber(request.branchNumber())
                .accountNumber(request.accountNumber())
                .clientName(request.clientName())
                .amount(request.amount()).build();

        clientRepository.saveAndFlush(client);

        FraudCheckResponse fraudCheckResponse = restTemplate
                .getForObject("http://localhost:8081/api/v1/frauds/{clientID}",
                        FraudCheckResponse.class, client.getId());

        if(fraudCheckResponse.clientFraud()){
            throw new IllegalStateException("Client not allowed!");
        }

    }
}


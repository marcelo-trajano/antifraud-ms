package com.mobinet.client;

import org.springframework.stereotype.Service;

@Service
public record ClientService(ClientRepository clientRepository) {
    public void registerClient(ClientRegistrationRequest request){
        Client client = Client.builder()
                .branchNumber(request.branchNumber())
                .accountNumber(request.accountNumber())
                .clientName(request.clientName())
                .amount(request.amount()).build();
        clientRepository.save(client);
    }
}

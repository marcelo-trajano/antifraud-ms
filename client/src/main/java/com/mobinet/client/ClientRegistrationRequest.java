package com.mobinet.client;


public record ClientRegistrationRequest(String branchNumber,
                                        String accountNumber,
                                        String clientName) {
}
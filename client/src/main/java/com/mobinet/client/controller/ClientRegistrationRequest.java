package com.mobinet.client.controller;

public record ClientRegistrationRequest(    String branchNumber,
                                            String accountNumber,
                                            String clientName,
                                            Double amount) {
}
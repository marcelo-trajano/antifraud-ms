package com.mobinet.client;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Client {

    private Long Id;
    private String branchNumber;
    private String accountNumber;
    private String clientName;
    private Double amount;


}

package com.mobinet.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {

    @Id
    @SequenceGenerator(name = "client_id_sequence", sequenceName = "client_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_id_sequence")
    private Long Id;
    private String branchNumber;
    private String accountNumber;
    private String clientName;
    private Double amount;


}

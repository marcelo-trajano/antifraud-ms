package com.mobinet.fraud.controller;

import java.time.LocalDateTime;

public record FraudCheckActivityRequest(Long clientId,
                                        Boolean fraudDetected,
                                        LocalDateTime createdAt) {
}

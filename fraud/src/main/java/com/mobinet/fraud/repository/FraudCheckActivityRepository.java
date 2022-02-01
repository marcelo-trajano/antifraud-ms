package com.mobinet.fraud.repository;

import com.mobinet.fraud.model.FraudCheckActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckActivityRepository extends JpaRepository<FraudCheckActivity, Long> {
}

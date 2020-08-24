package com.ce.ciyos.gate.repository;

import com.ce.ciyos.gate.entiy.GateTruck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GateTruckRepository
    extends JpaRepository<GateTruck, String>, JpaSpecificationExecutor<GateTruck> {}

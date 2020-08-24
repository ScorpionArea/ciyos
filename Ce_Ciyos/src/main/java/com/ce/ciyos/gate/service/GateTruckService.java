package com.ce.ciyos.gate.service;

import com.ce.ciyos.gate.entiy.GateTruck;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface GateTruckService {
  GateTruck save(GateTruck gateTruck);

  void deleteById(String gateTruckId);

  Page<GateTruck> findAll(Pageable pageable);

  Page<GateTruck> findAll(Specification specification, Pageable pageable);

  List<GateTruck> findAll(Sort sort);

  List<GateTruck> findAll(Specification specification, Sort sort);
}

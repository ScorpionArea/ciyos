package com.ce.ciyos.gate.service.impl;

import com.ce.ciyos.gate.entiy.GateTruck;
import com.ce.ciyos.gate.repository.GateTruckRepository;
import com.ce.ciyos.gate.service.GateTruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GateTruckServiceImpl implements GateTruckService {
  @Autowired GateTruckRepository gateTruckRepository;

  @Override
  public GateTruck save(GateTruck gateTruck) {
    return gateTruckRepository.save(gateTruck);
  }

  @Override
  public void deleteById(String gateTruckId) {
    gateTruckRepository.deleteById(gateTruckId);
  }

  @Override
  public Page<GateTruck> findAll(Pageable pageable) {
    return gateTruckRepository.findAll(pageable);
  }

  @Override
  public Page<GateTruck> findAll(Specification specification, Pageable pageable) {
    return gateTruckRepository.findAll(specification, pageable);
  }

  @Override
  public List<GateTruck> findAll(Sort sort) {
    return gateTruckRepository.findAll(sort);
  }

  @Override
  public List<GateTruck> findAll(Specification specification, Sort sort) {
    return gateTruckRepository.findAll(specification, sort);
  }
}

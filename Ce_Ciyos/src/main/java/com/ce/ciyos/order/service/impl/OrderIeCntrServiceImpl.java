package com.ce.ciyos.order.service.impl;

import com.ce.ciyos.order.entiy.OrderIeCntr;
import com.ce.ciyos.order.entiy.OrderIeCntrPK;
import com.ce.ciyos.order.repository.OrderIeCntrRepository;
import com.ce.ciyos.order.service.OrderIeCntrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderIeCntrServiceImpl implements OrderIeCntrService {
  @Autowired OrderIeCntrRepository orderIeCntrRepository;

  @Override
  public OrderIeCntr save(OrderIeCntr orderIeCntr) {
    return orderIeCntrRepository.save(orderIeCntr);
  }

  @Override
  public void deleteById(OrderIeCntrPK orderIeCntrPK) {
    orderIeCntrRepository.deleteById(orderIeCntrPK);
  }

  @Override
  public Page<OrderIeCntr> findAll(Pageable pageable) {
    return orderIeCntrRepository.findAll(pageable);
  }

  @Override
  public Page<OrderIeCntr> findAll(Specification specification, Pageable pageable) {
    return orderIeCntrRepository.findAll(specification, pageable);
  }

  @Override
  public List<OrderIeCntr> findAll(Sort sort) {
    return orderIeCntrRepository.findAll(sort);
  }

  @Override
  public List<OrderIeCntr> findAll(Specification specification, Sort sort) {
    return orderIeCntrRepository.findAll(specification, sort);
  }
}

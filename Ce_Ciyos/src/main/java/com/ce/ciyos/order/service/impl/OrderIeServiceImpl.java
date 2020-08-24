package com.ce.ciyos.order.service.impl;

import com.ce.ciyos.order.entiy.OrderIe;
import com.ce.ciyos.order.repository.OrderIeRepository;
import com.ce.ciyos.order.service.OrderIeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderIeServiceImpl implements OrderIeService {
  @Autowired OrderIeRepository orderIeRepository;

  @Override
  public OrderIe save(OrderIe orderIe) {
    return orderIeRepository.save(orderIe);
  }

  @Override
  public void deleteById(String orderNo) {
    orderIeRepository.deleteById(orderNo);
  }

  @Override
  public Page<OrderIe> findAll(Pageable pageable) {
    return orderIeRepository.findAll(pageable);
  }

  @Override
  public Page<OrderIe> findAll(Specification specification, Pageable pageable) {
    return orderIeRepository.findAll(specification, pageable);
  }

  @Override
  public List<OrderIe> findAll(Sort sort) {
    return orderIeRepository.findAll(sort);
  }

  @Override
  public List<OrderIe> findAll(Specification specification, Sort sort) {
    return orderIeRepository.findAll(specification, sort);
  }
}

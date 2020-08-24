package com.ce.ciyos.order.service;

import com.ce.ciyos.order.entiy.OrderIeCntr;
import com.ce.ciyos.order.entiy.OrderIeCntrPK;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface OrderIeCntrService {
  OrderIeCntr save(OrderIeCntr orderIeCntr);

  void deleteById(OrderIeCntrPK orderIeCntrPK);

  Page<OrderIeCntr> findAll(Pageable pageable);

  Page<OrderIeCntr> findAll(Specification specification, Pageable pageable);

  List<OrderIeCntr> findAll(Sort sort);

  List<OrderIeCntr> findAll(Specification specification, Sort sort);
}

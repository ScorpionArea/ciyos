package com.ce.ciyos.order.service;

import com.ce.ciyos.order.entiy.OrderIe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface OrderIeService {

  OrderIe save(OrderIe orderIe);

  void deleteById(String orderNo);

  Page<OrderIe> findAll(Pageable pageable);

  Page<OrderIe> findAll(Specification specification, Pageable pageable);

  List<OrderIe> findAll(Sort sort);

  List<OrderIe> findAll(Specification specification, Sort sort);
}

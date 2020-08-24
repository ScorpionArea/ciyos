package com.ce.ciyos.order.repository;

import com.ce.ciyos.order.entiy.OrderIe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderIeRepository
    extends JpaRepository<OrderIe, String>, JpaSpecificationExecutor<OrderIe> {}

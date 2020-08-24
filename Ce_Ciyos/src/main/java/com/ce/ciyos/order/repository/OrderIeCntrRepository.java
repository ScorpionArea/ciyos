package com.ce.ciyos.order.repository;

import com.ce.ciyos.order.entiy.OrderIeCntr;
import com.ce.ciyos.order.entiy.OrderIeCntrPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderIeCntrRepository
    extends JpaRepository<OrderIeCntr, OrderIeCntrPK>, JpaSpecificationExecutor<OrderIeCntr> {}

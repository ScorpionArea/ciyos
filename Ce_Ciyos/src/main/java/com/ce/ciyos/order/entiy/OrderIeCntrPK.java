package com.ce.ciyos.order.entiy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class OrderIeCntrPK implements Serializable {
  private String orderNo;
  private long seqNo;

  @Column(name = "ORDER_NO")
  @Id
  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  @Column(name = "SEQ_NO")
  @Id
  public long getSeqNo() {
    return seqNo;
  }

  public void setSeqNo(long seqNo) {
    this.seqNo = seqNo;
  }
}

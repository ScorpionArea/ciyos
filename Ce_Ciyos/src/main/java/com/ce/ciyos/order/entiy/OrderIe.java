package com.ce.ciyos.order.entiy;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "ORDER_IE", schema = "CE_CIYOS", catalog = "")
public class OrderIe implements Serializable {
  private static final long serialVersionUID = 4482506791069639611L;
  private String orderNo;
  private String orderType;
  private Date orderDate;
  private String workType;
  private String taFlag;
  private String billNo;
  private String source;
  private String status;
  private String creator;
  private Timestamp createdTim;
  private String changer;
  private Timestamp changedTim;

  @Id
  @Column(name = "ORDER_NO")
  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  @Basic
  @Column(name = "ORDER_TYPE")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  @Basic
  @Column(name = "ORDER_DATE")
  public Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  @Basic
  @Column(name = "WORK_TYPE")
  public String getWorkType() {
    return workType;
  }

  public void setWorkType(String workType) {
    this.workType = workType;
  }

  @Basic
  @Column(name = "TA_FLAG")
  public String getTaFlag() {
    return taFlag;
  }

  public void setTaFlag(String taFlag) {
    this.taFlag = taFlag;
  }

  @Basic
  @Column(name = "BILL_NO")
  public String getBillNo() {
    return billNo;
  }

  public void setBillNo(String billNo) {
    this.billNo = billNo;
  }

  @Basic
  @Column(name = "SOURCE")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  @Basic
  @Column(name = "STATUS")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Basic
  @Column(name = "CREATOR")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  @Basic
  @Column(name = "CREATED_TIM")
  public Timestamp getCreatedTim() {
    return createdTim;
  }

  public void setCreatedTim(Timestamp createdTim) {
    this.createdTim = createdTim;
  }

  @Basic
  @Column(name = "CHANGER")
  public String getChanger() {
    return changer;
  }

  public void setChanger(String changer) {
    this.changer = changer;
  }

  @Basic
  @Column(name = "CHANGED_TIM")
  public Timestamp getChangedTim() {
    return changedTim;
  }

  public void setChangedTim(Timestamp changedTim) {
    this.changedTim = changedTim;
  }
}

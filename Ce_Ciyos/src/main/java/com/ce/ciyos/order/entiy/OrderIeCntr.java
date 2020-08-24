package com.ce.ciyos.order.entiy;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ORDER_IE_CNTR", schema = "CE_CIYOS", catalog = "")
@IdClass(OrderIeCntrPK.class)
public class OrderIeCntr implements Serializable {
  private static final long serialVersionUID = 4210906832342328637L;
  private String orderNo;
  private long seqNo;
  private String billNo;
  private String taFlag;
  private String cntrCoprId;
  private String cntrId;
  private String cntr;
  private String efFlag;
  private String cntrSize;
  private String cntrType;
  private String cntrIso;
  private String tradeType;
  private String cntrClass;
  private String cntrPlace;
  private Long reeferTempr;
  private String overFlag;
  private String damageId;
  private String sealNo;
  private String truckId;
  private String status;
  private Long cntrWeight;
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

  @Id
  @Column(name = "SEQ_NO")
  public long getSeqNo() {
    return seqNo;
  }

  public void setSeqNo(long seqNo) {
    this.seqNo = seqNo;
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
  @Column(name = "TA_FLAG")
  public String getTaFlag() {
    return taFlag;
  }

  public void setTaFlag(String taFlag) {
    this.taFlag = taFlag;
  }

  @Basic
  @Column(name = "CNTR_COPR_ID")
  public String getCntrCoprId() {
    return cntrCoprId;
  }

  public void setCntrCoprId(String cntrCoprId) {
    this.cntrCoprId = cntrCoprId;
  }

  @Basic
  @Column(name = "CNTR_ID")
  public String getCntrId() {
    return cntrId;
  }

  public void setCntrId(String cntrId) {
    this.cntrId = cntrId;
  }

  @Basic
  @Column(name = "CNTR")
  public String getCntr() {
    return cntr;
  }

  public void setCntr(String cntr) {
    this.cntr = cntr;
  }

  @Basic
  @Column(name = "EF_FLAG")
  public String getEfFlag() {
    return efFlag;
  }

  public void setEfFlag(String efFlag) {
    this.efFlag = efFlag;
  }

  @Basic
  @Column(name = "CNTR_SIZE")
  public String getCntrSize() {
    return cntrSize;
  }

  public void setCntrSize(String cntrSize) {
    this.cntrSize = cntrSize;
  }

  @Basic
  @Column(name = "CNTR_TYPE")
  public String getCntrType() {
    return cntrType;
  }

  public void setCntrType(String cntrType) {
    this.cntrType = cntrType;
  }

  @Basic
  @Column(name = "CNTR_ISO")
  public String getCntrIso() {
    return cntrIso;
  }

  public void setCntrIso(String cntrIso) {
    this.cntrIso = cntrIso;
  }

  @Basic
  @Column(name = "TRADE_TYPE")
  public String getTradeType() {
    return tradeType;
  }

  public void setTradeType(String tradeType) {
    this.tradeType = tradeType;
  }

  @Basic
  @Column(name = "CNTR_CLASS")
  public String getCntrClass() {
    return cntrClass;
  }

  public void setCntrClass(String cntrClass) {
    this.cntrClass = cntrClass;
  }

  @Basic
  @Column(name = "CNTR_PLACE")
  public String getCntrPlace() {
    return cntrPlace;
  }

  public void setCntrPlace(String cntrPlace) {
    this.cntrPlace = cntrPlace;
  }

  @Basic
  @Column(name = "REEFER_TEMPR")
  public Long getReeferTempr() {
    return reeferTempr;
  }

  public void setReeferTempr(Long reeferTempr) {
    this.reeferTempr = reeferTempr;
  }

  @Basic
  @Column(name = "OVER_FLAG")
  public String getOverFlag() {
    return overFlag;
  }

  public void setOverFlag(String overFlag) {
    this.overFlag = overFlag;
  }

  @Basic
  @Column(name = "DAMAGE_ID")
  public String getDamageId() {
    return damageId;
  }

  public void setDamageId(String damageId) {
    this.damageId = damageId;
  }

  @Basic
  @Column(name = "SEAL_NO")
  public String getSealNo() {
    return sealNo;
  }

  public void setSealNo(String sealNo) {
    this.sealNo = sealNo;
  }

  @Basic
  @Column(name = "TRUCK_ID")
  public String getTruckId() {
    return truckId;
  }

  public void setTruckId(String truckId) {
    this.truckId = truckId;
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
  @Column(name = "CNTR_WEIGHT")
  public Long getCntrWeight() {
    return cntrWeight;
  }

  public void setCntrWeight(Long cntrWeight) {
    this.cntrWeight = cntrWeight;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderIeCntr that = (OrderIeCntr) o;
    return seqNo == that.seqNo
        && Objects.equals(orderNo, that.orderNo)
        && Objects.equals(billNo, that.billNo)
        && Objects.equals(taFlag, that.taFlag)
        && Objects.equals(cntrCoprId, that.cntrCoprId)
        && Objects.equals(cntrId, that.cntrId)
        && Objects.equals(cntr, that.cntr)
        && Objects.equals(efFlag, that.efFlag)
        && Objects.equals(cntrSize, that.cntrSize)
        && Objects.equals(cntrType, that.cntrType)
        && Objects.equals(cntrIso, that.cntrIso)
        && Objects.equals(tradeType, that.tradeType)
        && Objects.equals(cntrClass, that.cntrClass)
        && Objects.equals(cntrPlace, that.cntrPlace)
        && Objects.equals(reeferTempr, that.reeferTempr)
        && Objects.equals(overFlag, that.overFlag)
        && Objects.equals(damageId, that.damageId)
        && Objects.equals(sealNo, that.sealNo)
        && Objects.equals(truckId, that.truckId)
        && Objects.equals(status, that.status)
        && Objects.equals(cntrWeight, that.cntrWeight)
        && Objects.equals(creator, that.creator)
        && Objects.equals(createdTim, that.createdTim)
        && Objects.equals(changer, that.changer)
        && Objects.equals(changedTim, that.changedTim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        orderNo,
        seqNo,
        billNo,
        taFlag,
        cntrCoprId,
        cntrId,
        cntr,
        efFlag,
        cntrSize,
        cntrType,
        cntrIso,
        tradeType,
        cntrClass,
        cntrPlace,
        reeferTempr,
        overFlag,
        damageId,
        sealNo,
        truckId,
        status,
        cntrWeight,
        creator,
        createdTim,
        changer,
        changedTim);
  }
}

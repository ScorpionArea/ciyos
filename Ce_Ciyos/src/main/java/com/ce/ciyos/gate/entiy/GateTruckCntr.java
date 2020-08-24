package com.ce.ciyos.gate.entiy;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "GATE_TRUCK_CNTR", schema = "CE_CIYOS", catalog = "")
public class GateTruckCntr implements Serializable {
  private static final long serialVersionUID = 1778275763557844395L;
  private String gateTruckCntrId;
  private String gateTruckId;
  private String orderCntrDetailId;
  private String orderCntrId;
  private String orderCntrNo;
  private Byte seqNo;
  private String taFlag;
  private String billNo;
  private String cntrCoprId;
  private String cntrId;
  private String cntr;
  private String efFlag;
  private String cntrSize;
  private String cntrType;
  private String cntrIso;
  private String tradeType;
  private String cntrClass;
  private Float reeferTemper;
  private String sealNo;
  private String damageId;
  private String overFlag;
  private Float cntrGrossWgt;
  private Float cntrNetWgt;
  private Float cargoWgt;
  private Float cargoNumber;
  private Float cargoVolume;
  private Float vgm;
  private String shipVoyage;
  private String posOnTruck;
  private String creator;
  private Timestamp createdTime;
  private String changer;
  private Timestamp changedTime;

  @Id
  @Column(name = "GATE_TRUCK_CNTR_ID")
  public String getGateTruckCntrId() {
    return gateTruckCntrId;
  }

  public void setGateTruckCntrId(String gateTruckCntrId) {
    this.gateTruckCntrId = gateTruckCntrId;
  }

  @Basic
  @Column(name = "GATE_TRUCK_ID")
  public String getGateTruckId() {
    return gateTruckId;
  }

  public void setGateTruckId(String gateTruckId) {
    this.gateTruckId = gateTruckId;
  }

  @Basic
  @Column(name = "ORDER_CNTR_DETAIL_ID")
  public String getOrderCntrDetailId() {
    return orderCntrDetailId;
  }

  public void setOrderCntrDetailId(String orderCntrDetailId) {
    this.orderCntrDetailId = orderCntrDetailId;
  }

  @Basic
  @Column(name = "ORDER_CNTR_ID")
  public String getOrderCntrId() {
    return orderCntrId;
  }

  public void setOrderCntrId(String orderCntrId) {
    this.orderCntrId = orderCntrId;
  }

  @Basic
  @Column(name = "ORDER_CNTR_NO")
  public String getOrderCntrNo() {
    return orderCntrNo;
  }

  public void setOrderCntrNo(String orderCntrNo) {
    this.orderCntrNo = orderCntrNo;
  }

  @Basic
  @Column(name = "SEQ_NO")
  public Byte getSeqNo() {
    return seqNo;
  }

  public void setSeqNo(Byte seqNo) {
    this.seqNo = seqNo;
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
  @Column(name = "REEFER_TEMPER")
  public Float getReeferTemper() {
    return reeferTemper;
  }

  public void setReeferTemper(Float reeferTemper) {
    this.reeferTemper = reeferTemper;
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
  @Column(name = "DAMAGE_ID")
  public String getDamageId() {
    return damageId;
  }

  public void setDamageId(String damageId) {
    this.damageId = damageId;
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
  @Column(name = "CNTR_GROSS_WGT")
  public Float getCntrGrossWgt() {
    return cntrGrossWgt;
  }

  public void setCntrGrossWgt(Float cntrGrossWgt) {
    this.cntrGrossWgt = cntrGrossWgt;
  }

  @Basic
  @Column(name = "CNTR_NET_WGT")
  public Float getCntrNetWgt() {
    return cntrNetWgt;
  }

  public void setCntrNetWgt(Float cntrNetWgt) {
    this.cntrNetWgt = cntrNetWgt;
  }

  @Basic
  @Column(name = "CARGO_WGT")
  public Float getCargoWgt() {
    return cargoWgt;
  }

  public void setCargoWgt(Float cargoWgt) {
    this.cargoWgt = cargoWgt;
  }

  @Basic
  @Column(name = "CARGO_NUMBER")
  public Float getCargoNumber() {
    return cargoNumber;
  }

  public void setCargoNumber(Float cargoNumber) {
    this.cargoNumber = cargoNumber;
  }

  @Basic
  @Column(name = "CARGO_VOLUME")
  public Float getCargoVolume() {
    return cargoVolume;
  }

  public void setCargoVolume(Float cargoVolume) {
    this.cargoVolume = cargoVolume;
  }

  @Basic
  @Column(name = "VGM")
  public Float getVgm() {
    return vgm;
  }

  public void setVgm(Float vgm) {
    this.vgm = vgm;
  }

  @Basic
  @Column(name = "SHIP_VOYAGE")
  public String getShipVoyage() {
    return shipVoyage;
  }

  public void setShipVoyage(String shipVoyage) {
    this.shipVoyage = shipVoyage;
  }

  @Basic
  @Column(name = "POS_ON_TRUCK")
  public String getPosOnTruck() {
    return posOnTruck;
  }

  public void setPosOnTruck(String posOnTruck) {
    this.posOnTruck = posOnTruck;
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
  @Column(name = "CREATED_TIME")
  public Timestamp getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Timestamp createdTime) {
    this.createdTime = createdTime;
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
  @Column(name = "CHANGED_TIME")
  public Timestamp getChangedTime() {
    return changedTime;
  }

  public void setChangedTime(Timestamp changedTime) {
    this.changedTime = changedTime;
  }
}

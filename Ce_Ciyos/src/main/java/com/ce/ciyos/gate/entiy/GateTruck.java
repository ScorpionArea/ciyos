package com.ce.ciyos.gate.entiy;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "GATE_TRUCK", schema = "CE_CIYOS", catalog = "")
public class GateTruck implements Serializable {
  private static final long serialVersionUID = 8151392501965247518L;
  private String gateTruckId;
  private String truckId;
  private String palletId;
  private Float truckGrossWgt;
  private String inGateId;
  private Date inGateTime;
  private String outGateId;
  private Date outGateTime;
  private String status;
  private String creator;
  private Timestamp createdTime;
  private String changer;
  private Timestamp changdeTime;

  @Id
  @Column(name = "GATE_TRUCK_ID")
  public String getGateTruckId() {
    return gateTruckId;
  }

  public void setGateTruckId(String gateTruckId) {
    this.gateTruckId = gateTruckId;
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
  @Column(name = "PALLET_ID")
  public String getPalletId() {
    return palletId;
  }

  public void setPalletId(String palletId) {
    this.palletId = palletId;
  }

  @Basic
  @Column(name = "TRUCK_GROSS_WGT")
  public Float getTruckGrossWgt() {
    return truckGrossWgt;
  }

  public void setTruckGrossWgt(Float truckGrossWgt) {
    this.truckGrossWgt = truckGrossWgt;
  }

  @Basic
  @Column(name = "IN_GATE_ID")
  public String getInGateId() {
    return inGateId;
  }

  public void setInGateId(String inGateId) {
    this.inGateId = inGateId;
  }

  @Basic
  @Column(name = "IN_GATE_TIME")
  public Date getInGateTime() {
    return inGateTime;
  }

  public void setInGateTime(Date inGateTime) {
    this.inGateTime = inGateTime;
  }

  @Basic
  @Column(name = "OUT_GATE_ID")
  public String getOutGateId() {
    return outGateId;
  }

  public void setOutGateId(String outGateId) {
    this.outGateId = outGateId;
  }

  @Basic
  @Column(name = "OUT_GATE_TIME")
  public Date getOutGateTime() {
    return outGateTime;
  }

  public void setOutGateTime(Date outGateTime) {
    this.outGateTime = outGateTime;
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
  @Column(name = "CHANGDE_TIME")
  public Timestamp getChangdeTime() {
    return changdeTime;
  }

  public void setChangdeTime(Timestamp changdeTime) {
    this.changdeTime = changdeTime;
  }
}

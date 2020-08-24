package com.ce.ciyos.cy.entiy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "CY_TRUCK", schema = "CE_CIYOS", catalog = "")
public class CyTruck {
  private String truckId;
  private String truckNo;
  private Boolean truckInvalid;
  private String creator;
  private Timestamp createdTime;
  private String changer;
  private Timestamp changedTime;

  @Id
  @Column(name = "TRUCK_ID")
  public String getTruckId() {
    return truckId;
  }

  public void setTruckId(String truckId) {
    this.truckId = truckId;
  }

  @Basic
  @Column(name = "TRUCK_NO")
  public String getTruckNo() {
    return truckNo;
  }

  public void setTruckNo(String truckNo) {
    this.truckNo = truckNo;
  }

  @Basic
  @Column(name = "TRUCK_INVALID")
  public Boolean getTruckInvalid() {
    return truckInvalid;
  }

  public void setTruckInvalid(Boolean truckInvalid) {
    this.truckInvalid = truckInvalid;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CyTruck cyTruck = (CyTruck) o;
    return Objects.equals(truckId, cyTruck.truckId)
        && Objects.equals(truckNo, cyTruck.truckNo)
        && Objects.equals(truckInvalid, cyTruck.truckInvalid)
        && Objects.equals(creator, cyTruck.creator)
        && Objects.equals(createdTime, cyTruck.createdTime)
        && Objects.equals(changer, cyTruck.changer)
        && Objects.equals(changedTime, cyTruck.changedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(truckId, truckNo, truckInvalid, creator, createdTime, changer, changedTime);
  }
}

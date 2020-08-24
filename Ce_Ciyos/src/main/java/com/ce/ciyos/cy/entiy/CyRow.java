package com.ce.ciyos.cy.entiy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "CY_ROW", schema = "CE_CIYOS", catalog = "")
@IdClass(CyRowPK.class)
public class CyRow {
  private String areaNo;
  private String bayNo;
  private String rowNo;
  private Boolean rowInvalid;
  private String creator;
  private Timestamp createdTime;
  private String changer;
  private Timestamp changedTim;
  private Long rowDistance;

  @Id
  @Column(name = "AREA_NO")
  public String getAreaNo() {
    return areaNo;
  }

  public void setAreaNo(String areaNo) {
    this.areaNo = areaNo;
  }

  @Id
  @Column(name = "BAY_NO")
  public String getBayNo() {
    return bayNo;
  }

  public void setBayNo(String bayNo) {
    this.bayNo = bayNo;
  }

  @Id
  @Column(name = "ROW_NO")
  public String getRowNo() {
    return rowNo;
  }

  public void setRowNo(String rowNo) {
    this.rowNo = rowNo;
  }

  @Basic
  @Column(name = "ROW_INVALID")
  public Boolean getRowInvalid() {
    return rowInvalid;
  }

  public void setRowInvalid(Boolean rowInvalid) {
    this.rowInvalid = rowInvalid;
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
  @Column(name = "CHANGED_TIM")
  public Timestamp getChangedTim() {
    return changedTim;
  }

  public void setChangedTim(Timestamp changedTim) {
    this.changedTim = changedTim;
  }

  @Basic
  @Column(name = "ROW_DISTANCE")
  public Long getRowDistance() {
    return rowDistance;
  }

  public void setRowDistance(Long rowDistance) {
    this.rowDistance = rowDistance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CyRow cyRow = (CyRow) o;
    return Objects.equals(areaNo, cyRow.areaNo)
        && Objects.equals(bayNo, cyRow.bayNo)
        && Objects.equals(rowNo, cyRow.rowNo)
        && Objects.equals(rowInvalid, cyRow.rowInvalid)
        && Objects.equals(creator, cyRow.creator)
        && Objects.equals(createdTime, cyRow.createdTime)
        && Objects.equals(changer, cyRow.changer)
        && Objects.equals(changedTim, cyRow.changedTim)
        && Objects.equals(rowDistance, cyRow.rowDistance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        areaNo, bayNo, rowNo, rowInvalid, creator, createdTime, changer, changedTim, rowDistance);
  }
}

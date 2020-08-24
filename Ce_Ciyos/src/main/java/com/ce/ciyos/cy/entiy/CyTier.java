package com.ce.ciyos.cy.entiy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "CY_TIER", schema = "CE_CIYOS", catalog = "")
@IdClass(CyTierPK.class)
public class CyTier {
  private String areaNo;
  private String bayNo;
  private String rowNo;
  private String tierNum;
  private Boolean tierInvalid;
  private String creator;
  private Timestamp createdTime;
  private String changer;
  private Timestamp changedTime;

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

  @Id
  @Column(name = "TIER_NUM")
  public String getTierNum() {
    return tierNum;
  }

  public void setTierNum(String tierNum) {
    this.tierNum = tierNum;
  }

  @Basic
  @Column(name = "TIER_INVALID")
  public Boolean getTierInvalid() {
    return tierInvalid;
  }

  public void setTierInvalid(Boolean tierInvalid) {
    this.tierInvalid = tierInvalid;
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
    CyTier cyTier = (CyTier) o;
    return Objects.equals(areaNo, cyTier.areaNo)
        && Objects.equals(bayNo, cyTier.bayNo)
        && Objects.equals(rowNo, cyTier.rowNo)
        && Objects.equals(tierNum, cyTier.tierNum)
        && Objects.equals(tierInvalid, cyTier.tierInvalid)
        && Objects.equals(creator, cyTier.creator)
        && Objects.equals(createdTime, cyTier.createdTime)
        && Objects.equals(changer, cyTier.changer)
        && Objects.equals(changedTime, cyTier.changedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        areaNo, bayNo, rowNo, tierNum, tierInvalid, creator, createdTime, changer, changedTime);
  }
}

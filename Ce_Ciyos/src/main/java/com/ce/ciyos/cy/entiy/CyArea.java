package com.ce.ciyos.cy.entiy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "CY_AREA", schema = "CE_CIYOS", catalog = "")
public class CyArea {
  private String areaNo;
  private Boolean areaInvalid;
  private String remark;
  private String creator;
  private Timestamp createdTim;
  private String changer;
  private Timestamp changedTim;
  private Long areaX;
  private Long areaY;
  private Long bayDis;
  private Long rowDis;
  private Long bayWidth;
  private Long rowWidth;

  @Id
  @Column(name = "AREA_NO")
  public String getAreaNo() {
    return areaNo;
  }

  public void setAreaNo(String areaNo) {
    this.areaNo = areaNo;
  }

  @Basic
  @Column(name = "AREA_INVALID")
  public Boolean getAreaInvalid() {
    return areaInvalid;
  }

  public void setAreaInvalid(Boolean areaInvalid) {
    this.areaInvalid = areaInvalid;
  }

  @Basic
  @Column(name = "REMARK")
  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
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

  @Basic
  @Column(name = "AREA_X")
  public Long getAreaX() {
    return areaX;
  }

  public void setAreaX(Long areaX) {
    this.areaX = areaX;
  }

  @Basic
  @Column(name = "AREA_Y")
  public Long getAreaY() {
    return areaY;
  }

  public void setAreaY(Long areaY) {
    this.areaY = areaY;
  }

  @Basic
  @Column(name = "BAY_DIS")
  public Long getBayDis() {
    return bayDis;
  }

  public void setBayDis(Long bayDis) {
    this.bayDis = bayDis;
  }

  @Basic
  @Column(name = "ROW_DIS")
  public Long getRowDis() {
    return rowDis;
  }

  public void setRowDis(Long rowDis) {
    this.rowDis = rowDis;
  }

  @Basic
  @Column(name = "BAY_WIDTH")
  public Long getBayWidth() {
    return bayWidth;
  }

  public void setBayWidth(Long bayWidth) {
    this.bayWidth = bayWidth;
  }

  @Basic
  @Column(name = "ROW_WIDTH")
  public Long getRowWidth() {
    return rowWidth;
  }

  public void setRowWidth(Long rowWidth) {
    this.rowWidth = rowWidth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CyArea cyArea = (CyArea) o;
    return Objects.equals(areaNo, cyArea.areaNo)
        && Objects.equals(areaInvalid, cyArea.areaInvalid)
        && Objects.equals(remark, cyArea.remark)
        && Objects.equals(creator, cyArea.creator)
        && Objects.equals(createdTim, cyArea.createdTim)
        && Objects.equals(changer, cyArea.changer)
        && Objects.equals(changedTim, cyArea.changedTim)
        && Objects.equals(areaX, cyArea.areaX)
        && Objects.equals(areaY, cyArea.areaY)
        && Objects.equals(bayDis, cyArea.bayDis)
        && Objects.equals(rowDis, cyArea.rowDis)
        && Objects.equals(bayWidth, cyArea.bayWidth)
        && Objects.equals(rowWidth, cyArea.rowWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        areaNo,
        areaInvalid,
        remark,
        creator,
        createdTim,
        changer,
        changedTim,
        areaX,
        areaY,
        bayDis,
        rowDis,
        bayWidth,
        rowWidth);
  }
}

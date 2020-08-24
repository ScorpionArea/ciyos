package com.ce.ciyos.cy.entiy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CyTierPK implements Serializable {
  private String areaNo;
  private String bayNo;
  private String rowNo;
  private String tierNum;

  @Column(name = "AREA_NO")
  @Id
  public String getAreaNo() {
    return areaNo;
  }

  public void setAreaNo(String areaNo) {
    this.areaNo = areaNo;
  }

  @Column(name = "BAY_NO")
  @Id
  public String getBayNo() {
    return bayNo;
  }

  public void setBayNo(String bayNo) {
    this.bayNo = bayNo;
  }

  @Column(name = "ROW_NO")
  @Id
  public String getRowNo() {
    return rowNo;
  }

  public void setRowNo(String rowNo) {
    this.rowNo = rowNo;
  }

  @Column(name = "TIER_NUM")
  @Id
  public String getTierNum() {
    return tierNum;
  }

  public void setTierNum(String tierNum) {
    this.tierNum = tierNum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CyTierPK cyTierPK = (CyTierPK) o;
    return Objects.equals(areaNo, cyTierPK.areaNo)
        && Objects.equals(bayNo, cyTierPK.bayNo)
        && Objects.equals(rowNo, cyTierPK.rowNo)
        && Objects.equals(tierNum, cyTierPK.tierNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaNo, bayNo, rowNo, tierNum);
  }
}

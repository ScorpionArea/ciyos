package com.ce.ciyos.cy.entiy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CyBayPK implements Serializable {
  private String areaNo;
  private String bayNo;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CyBayPK cyBayPK = (CyBayPK) o;
    return Objects.equals(areaNo, cyBayPK.areaNo) && Objects.equals(bayNo, cyBayPK.bayNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaNo, bayNo);
  }
}

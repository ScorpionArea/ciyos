package com.ce.ciyos.cy.entiy;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CyRowPK implements Serializable {
  private String areaNo;
  private String bayNo;
  private String rowNo;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CyRowPK cyRowPK = (CyRowPK) o;
    return Objects.equals(areaNo, cyRowPK.areaNo)
        && Objects.equals(bayNo, cyRowPK.bayNo)
        && Objects.equals(rowNo, cyRowPK.rowNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaNo, bayNo, rowNo);
  }
}

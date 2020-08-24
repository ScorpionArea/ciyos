package com.ce.ciyos.cy.entiy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "CY_BAY", schema = "CE_CIYOS", catalog = "")
@IdClass(CyBayPK.class)
public class CyBay {
  private String areaNo;
  private String bayNo;
  private Boolean bayInvalid;
  private String accept40;
  private String accept45;
  private String accept48;
  private Long bayDistince;
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

  @Basic
  @Column(name = "BAY_INVALID")
  public Boolean getBayInvalid() {
    return bayInvalid;
  }

  public void setBayInvalid(Boolean bayInvalid) {
    this.bayInvalid = bayInvalid;
  }

  @Basic
  @Column(name = "ACCEPT_40")
  public String getAccept40() {
    return accept40;
  }

  public void setAccept40(String accept40) {
    this.accept40 = accept40;
  }

  @Basic
  @Column(name = "ACCEPT_45")
  public String getAccept45() {
    return accept45;
  }

  public void setAccept45(String accept45) {
    this.accept45 = accept45;
  }

  @Basic
  @Column(name = "ACCEPT_48")
  public String getAccept48() {
    return accept48;
  }

  public void setAccept48(String accept48) {
    this.accept48 = accept48;
  }

  @Basic
  @Column(name = "BAY_DISTINCE")
  public Long getBayDistince() {
    return bayDistince;
  }

  public void setBayDistince(Long bayDistince) {
    this.bayDistince = bayDistince;
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
    CyBay cyBay = (CyBay) o;
    return Objects.equals(areaNo, cyBay.areaNo)
        && Objects.equals(bayNo, cyBay.bayNo)
        && Objects.equals(bayInvalid, cyBay.bayInvalid)
        && Objects.equals(accept40, cyBay.accept40)
        && Objects.equals(accept45, cyBay.accept45)
        && Objects.equals(accept48, cyBay.accept48)
        && Objects.equals(bayDistince, cyBay.bayDistince)
        && Objects.equals(creator, cyBay.creator)
        && Objects.equals(createdTime, cyBay.createdTime)
        && Objects.equals(changer, cyBay.changer)
        && Objects.equals(changedTime, cyBay.changedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        areaNo,
        bayNo,
        bayInvalid,
        accept40,
        accept45,
        accept48,
        bayDistince,
        creator,
        createdTime,
        changer,
        changedTime);
  }
}

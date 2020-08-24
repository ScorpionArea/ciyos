package com.ce.pojo;

import java.io.Serializable;
import java.util.List;

public class DateGrid<T> implements Serializable {
  private static final long serialVersionUID = -3400729936348877493L;
  private List<T> inserted;
  private List<T> updated;
  private List<T> deleted;

  public List<T> getInserted() {
    return inserted;
  }

  public void setInserted(List<T> inserted) {
    this.inserted = inserted;
  }

  public List<T> getUpdated() {
    return updated;
  }

  public void setUpdated(List<T> updated) {
    this.updated = updated;
  }

  public List<T> getDeleted() {
    return deleted;
  }

  public void setDeleted(List<T> deleted) {
    this.deleted = deleted;
  }
}

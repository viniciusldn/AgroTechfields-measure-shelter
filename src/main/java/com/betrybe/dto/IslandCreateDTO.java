package com.betrybe.dto;

public class IslandCreateDTO {
  private String name;
  private String agriculture;
  private boolean status;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAgriculture() {
    return agriculture;
  }

  public void setAgriculture(String agriculture) {
    this.agriculture = agriculture;
  }

  public Boolean getStatus() {
    return status;
  }

  public void setArea(Boolean status) {
    this.status = status;
  }
}

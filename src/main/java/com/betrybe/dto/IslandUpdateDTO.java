package com.betrybe.dto;

import java.util.List;

public class IslandUpdateDTO {

  private String temperature;
  private String relativeHumidity;
  private String soilMoisture;
  private boolean isFertilized;
  private boolean isHarvested;
  private boolean isPalnted;
  private String location;
  private String area;
  private List<String> imageList;
  private boolean status;

  public String getTemperature() {
    return temperature;
  }

  public void setTemperature(String temperature) {
    this.temperature = temperature;
  }

  public String getRelativeHumidity() {
    return relativeHumidity;
  }

  public void setRelativeHumidity(String relativeHumidity) {
    this.relativeHumidity = relativeHumidity;
  }

  public String getSoilMoisture() {
    return soilMoisture;
  }

  public void setSoilMoisture(String soilMoisture) {
    this.soilMoisture = soilMoisture;
  }

  public boolean isFertilized() {
    return isFertilized;
  }

  public void setFertilized(boolean fertilized) {
    this.isFertilized = fertilized;
  }

  public boolean isHarvested() {
    return isHarvested;
  }

  public void setHarvested(boolean harvested) {
    this.isHarvested = harvested;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public List<String> getImageList() {
    return imageList;
  }

  public void setImagePath(String imgPath) {
    this.imageList.add(imgPath);
  }

  public boolean isPalnted() {
    return isPalnted;
  }

  public void setPalnted(boolean isPalnted) {
    this.isPalnted = isPalnted;
  }
}

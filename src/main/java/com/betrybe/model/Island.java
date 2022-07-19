package com.betrybe.model;

import java.text.SimpleDateFormat;
import java.util.List;

import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "islands")
public class Island extends PanacheMongoEntity {

  private ObjectId id;
  private String createdAt = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
      .toString();
  private String temperature;
  private String relativeHumidity;
  private String soilMoisture;
  private boolean isFertilized;
  private String fertilizingDate;
  private boolean isPlanted;
  private String plantingDate;
  private boolean isHarvested;
  private String harvestDate;
  private String location;
  private String area;
  private List<String> imageList;
  private boolean status = true;

  public String getCreatedAt() {
    return createdAt;
  }

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

  public void setFertilized(boolean isFertilized) {
    this.isFertilized = isFertilized;
    if (isFertilized) {
      this.fertilizingDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
          .toString();
    }
  }

  public String getFertilizingDate() {
    return fertilizingDate;
  }

  public String getPlantingDate() {
    return plantingDate;
  }

  public void setPlantingDate(String plantingDate) {
    this.plantingDate = plantingDate;
  }

  public boolean isHarvested() {
    return isHarvested;
  }

  public void setHarvested(boolean isHarvested) {
    this.isHarvested = isHarvested;
    if (isHarvested) {
      this.harvestDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").toString();
    }
  }

  public String getHarvestDate() {
    return harvestDate;
  }

  public boolean isPlanted() {
    return isPlanted;
  }

  public void setPlanted(boolean isPlanted) {
    this.isPlanted = isPlanted;
    if (isPlanted) {
      this.plantingDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
          .toString();
    }
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

  public boolean status() {
    return status;
  }

  public void changeStatus() {
    this.status = !this.status;
  }

  public List<String> getImageList() {
    return imageList;
  }

  public void setImageList(String imgPath) {
    this.imageList.add(imgPath);
  }

  public ObjectId getId() {
    return id;
  }

}

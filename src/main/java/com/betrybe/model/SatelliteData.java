package com.betrybe.model;

import java.text.SimpleDateFormat;

import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "images")
public class SatelliteData extends PanacheMongoEntity {

  private ObjectId id;
  private String location;
  private String imagePath = String.format("../images/%d", id);
  private String imageDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
      .toString();

  public ObjectId getId() {
    return id;
  }

  public String getImagePath() {
    return imagePath;
  }

  public String getImageDate() {
    return imageDate;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

}

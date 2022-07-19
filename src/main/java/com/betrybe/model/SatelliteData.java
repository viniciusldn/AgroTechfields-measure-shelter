package com.betrybe.model;

import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "images")
public class SatelliteData extends PanacheMongoEntity {

  private ObjectId id;
  private String imagePath;

  public ObjectId getId() {
    return id;
  }

  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }

}

package com.betrybe.model;

import org.bson.types.ObjectId;

public class Image {

  private ObjectId id;
  private String imagePath;
  private String imageDate;
  private String location;

  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }

  public String getImageDate() {
    return imageDate;
  }

  public void setImageDate(String imageDate) {
    this.imageDate = imageDate;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public ObjectId getId() {
    return id;
  }

}

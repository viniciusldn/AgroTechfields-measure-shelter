package com.betrybe.model;

import java.util.List;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "images")
public class SatelliteData extends PanacheMongoEntity {

  private List<Image> imageList;

  public List<Image> getImageList() {
    return imageList;
  }

  public void setImageList(Image image) {
    this.imageList.add(image);
  }

}

package com.betrybe.dto;

import java.util.List;

import com.betrybe.model.Image;

public class SatelliteDataCreateDTO {

  private List<Image> imageList;

  public List<Image> getImageList() {
    return imageList;
  }

  public void setImageList(Image image) {
    this.imageList.add(image);
  }
}

package com.betrybe.service;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.transaction.Transactional;

import com.betrybe.dto.SatelliteDataCreateDTO;
import com.betrybe.model.Image;
import com.betrybe.model.SatelliteData;
import com.betrybe.repository.SatelliteRepository;

import org.bson.types.ObjectId;

@ApplicationScoped
public class SatelliteService {

  @Inject
  private SatelliteRepository repo;

  @Inject

  public List<Image> list() {
    List<Image> imageList = Collections.<Image>emptyList();
    for (SatelliteData list : repo.listAll()) {
      imageList.addAll(list.getImageList());
    }

    return imageList;
  }

  public void findById(ObjectId id) throws IOException {
    List<Image> imageList = Collections.<Image>emptyList();
    for (SatelliteData list : repo.listAll()) {
      imageList.addAll(list.getImageList());
    }
    for (Image image : imageList) {
      if (image.getId().equals(id)) {
        URL url = new URL(image.getImagePath());
        BufferedImage bufferedImage = ImageIO.read(url);
        File file = new File("../images");

        ImageIO.write(bufferedImage, "jpg", file);
      }
    }
  }

  @Transactional
  public void create(SatelliteDataCreateDTO data) {
    SatelliteData satelliteData = new SatelliteData();
    for (Image image : data.getImageList()) {
      satelliteData.setImageList(image);
    }
    repo.persist(satelliteData);
  }

}

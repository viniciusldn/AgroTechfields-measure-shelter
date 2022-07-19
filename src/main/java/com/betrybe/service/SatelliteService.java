package com.betrybe.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import com.betrybe.dto.SatelliteDataCreateDTO;
import com.betrybe.model.Island;
import com.betrybe.model.SatelliteData;
import com.betrybe.repository.IslandRepository;
import com.betrybe.repository.SatelliteRepository;

import org.bson.types.ObjectId;

@ApplicationScoped
public class SatelliteService {

  @Inject
  private SatelliteRepository repo;
  @Inject
  private IslandRepository islandRepo;

  public List<SatelliteData> list() {
    return repo.listAll();
  }

  public SatelliteData findById(ObjectId id) {
    return repo.find("id", id).firstResult();
  }

  @Transactional
  public void create(SatelliteDataCreateDTO data) {
    SatelliteData satelliteData = new SatelliteData();
    satelliteData.setLocation(data.getLocation());
    repo.persist(satelliteData);
    Island island = islandRepo.find("location", data.getLocation())
        .firstResult();
    island.setImageList(satelliteData.getImagePath());
  }

}

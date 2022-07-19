package com.betrybe.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import com.betrybe.model.SatelliteData;
import com.betrybe.repository.SatelliteRepository;

import org.bson.types.ObjectId;

@ApplicationScoped
public class SatelliteService {

  @Inject
  private SatelliteRepository repo;

  public List<SatelliteData> list() {
    return repo.listAll();
  }

  public SatelliteData findById(ObjectId id) {
    return repo.find("id", id).firstResult();
  }

  @Transactional
  public void create(String path) {
  }

}

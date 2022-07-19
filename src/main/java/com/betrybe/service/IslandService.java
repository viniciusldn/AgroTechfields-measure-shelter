package com.betrybe.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;

import com.betrybe.dto.IslandCreateDTO;
import com.betrybe.dto.IslandUpdateDTO;
import com.betrybe.model.Island;
import com.betrybe.repository.IslandRepository;

import org.bson.types.ObjectId;

/**
 * The Class IslandService.
 */
@ApplicationScoped
public class IslandService {

  @Inject
  private IslandRepository repo;

  public List<Island> list() {
    return repo.listAll();
  }

  public Island findById(ObjectId id) {
    return repo.find("id", id).firstResult();
  }

  @Transactional
  public void create(@Valid IslandCreateDTO dto) {
    Island island = new Island();
    island.setTemperature(dto.getTemperature());
    island.setRelativeHumidity(dto.getRelativeHumidity());
    island.setSoilMoisture(dto.getSoilMoisture());
    island.setFertilized(dto.isFertilized());
    island.setHarvested(dto.isHarvested());
    island.setPlanted(dto.isPlanted());
    island.setArea(dto.getArea());
    island.setLocation(dto.getLocation());
    repo.persist(island);
  }

  @Transactional
  public void update(ObjectId id, @Valid IslandUpdateDTO dto) {
    Island island = findById(id);
    if (!island.status())
      island.changeStatus();
    island.setTemperature(dto.getTemperature());
    island.setRelativeHumidity(dto.getRelativeHumidity());
    island.setSoilMoisture(dto.getSoilMoisture());
    island.setFertilized(dto.isFertilized());
    island.setHarvested(dto.isHarvested());
    island.setPlanted(dto.isPalnted());
    island.setArea(dto.getArea());
    island.setLocation(dto.getLocation());
    for (String image : dto.getImageList())
      island.setImageList(image);
    repo.persist(island);
  }

  @Transactional
  public void updateStatus(ObjectId id) {
    Island island = findById(id);
    if (island.status()) {
      island.changeStatus();
      repo.persist(island);
    }
  }

  @Transactional
  public void deleteById(ObjectId id) {
    repo.deleteById(id);
  }
}

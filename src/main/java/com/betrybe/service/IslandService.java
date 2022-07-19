package com.betrybe.service;

import com.betrybe.dto.IslandCreateDTO;
import com.betrybe.dto.IslandUpdateDTO;
import com.betrybe.model.Island;
import com.betrybe.repository.IslandRepository;

import org.bson.types.ObjectId;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

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
  public void create(IslandCreateDTO dto) {
    Island island = new Island();
    island.setNome(dto.getName());
    island.setAgriculture(dto.getAgriculture());
    island.setStatus(dto.getStatus());
    repo.persist(island);
  }

  @Transactional
  public void update(IslandUpdateDTO dto, ObjectId id) {
    Island island = findById(id);
    island.setStatus(dto.getStatus());
    repo.persist(island);
  }

  @Transactional
  public void deletar(ObjectId id) {
    repo.deleteById(id);
  }
}

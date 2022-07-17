package com.betrybe.service;

import com.betrybe.dto.IslandCreateDTO;
import com.betrybe.dto.IslandUpdateDTO;
import com.betrybe.model.IslandModel;
import com.betrybe.repository.IslandRepository;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class IslandService {

  @Inject
  private IslandRepository islandRepository;

  public List<IslandModel> listar() {
    return islandRepository.listAll();
  }

  public IslandModel buscarPorId(Long id) {
    return islandRepository.findById(id);
  }

  @Transactional
  public void salvar(IslandCreateDTO islandDto) {
    var island = new IslandModel();
    island.setNome(islandDto.getName());
    island.setAgriculture(islandDto.getAgriculture());
    island.setStatus(islandDto.getStatus());
    islandRepository.persist(island);
  }

  @Transactional
  public void atualizar(IslandUpdateDTO islandDto, Long id) {
    var island = islandRepository.findById(id);
    island.setStatus(islandDto.getStatus());
    islandRepository.persist(island);
  }

  @Transactional
  public void deletar(Long id) {
    islandRepository.deleteById(id);
  }
}

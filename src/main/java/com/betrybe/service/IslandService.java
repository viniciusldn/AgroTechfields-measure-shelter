package com.betrybe.service;

import com.betrybe.dto.IslandUpdateDTO;
import com.betrybe.dto.IslandCreateDTO;
import com.betrybe.model.IslandModel;
import com.betrybe.repository.IslandRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

public class IslandService {

  @Inject
  private IslandRepository islandRepository;

  public List<IslandModel> listar(){
      return islandRepository.listAll();
  }

  public IslandModel buscarPorId(Long id){
      return islandRepository.findById(id);
  }

  @Transactional
  public void salvar(IslandCreateDTO islandDto){
      var island = new IslandModel();
      island.setNome(islandDto.getNome());
      island.setAno(islandDto.getAno());
      island.setPreco(islandDto.getPreco());
      islandRepository.persist(carro);
  }

  @Transactional
  public void atualizar(IslandUpdateDTO islandDto, Long id){
     var island = islandRepository.findById(id);
     island.setPreco(islandDto.getPreco());
     islandRepository.persist(island);
  }

  @Transactional
  public void deletar(Long id){
      islandRepository.deleteById(id);
  }
}

package com.betrybe.controller;

import com.betrybe.dto.IslandCreateDTO;
import com.betrybe.dto.IslandUpdateDTO;
import com.betrybe.model.IslandModel;
import com.betrybe.service.IslandService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/island")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class IslandController {

  @Inject
  private IslandService islandService;

  @GET
  public List<IslandModel> listar() {
    return islandService.listar();
  }

  @GET
  @Path("/{id}")
  public IslandModel buscarPorId(@PathParam("id") Long id) {
    return islandService.buscarPorId(id);
  }

  @POST
  public void salvar(IslandCreateDTO islandDTO) {
    islandService.salvar(islandDTO);
  }

  @PATCH
  @Path("/{id}")
  public void atualizar(@PathParam("id") Long id, IslandUpdateDTO islandDTO) {
    islandService.atualizar(islandDTO, id);
  }

  @DELETE
  @Path("/{id}")
  public void deletar(@PathParam("id") Long id) {
    islandService.deletar(id);
  }

}

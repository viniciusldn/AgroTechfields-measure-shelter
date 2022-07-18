package com.betrybe.controller;

import java.util.List;

import javax.enterprise.context.RequestScoped;
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
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.betrybe.dto.IslandCreateDTO;
import com.betrybe.model.Island;
import com.betrybe.service.IslandService;

import org.bson.types.ObjectId;

@Path("/island")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class IslandController {

  @Inject
  private IslandService service;

  // Isles end-points.
  @GET
  @Path("/island")
  public Response listAll() {
    try {
      service.list();
      return Response.status(Status.OK).build();
    } catch (Exception e) {
      throw new Error(e.getMessage());
    }
  }

  @GET
  @Path("/island/{id}")
  public Response findById(@PathParam(value = "id") ObjectId id) {
    try {
      service.findById(id);
      return Response.status(Status.OK).build();
    } catch (Exception e) {
      throw new Error(e.getMessage());
    }
  }

  @POST
  @Path("/island")
  public Response createIsland(@Val IslandCreateDTO island) {
    try {
      service.create(island);
      return Response.status(Status.CREATED).build();
    } catch (Exception e) {
      throw new Error(e.getMessage());
    }
  }

  @PATCH
  @Path("/island/{id}")
  public Response updateIsland(@PathParam(value = "id") String id) {
    try {
      service.update(island);
      return Response.status(Status.ACCEPTED).build();
    } catch (Exception e) {
      throw new Error(e.getMessage());
    }
  }

  @DELETE
  @Path("/island/{id}")
  public String deleteIsland(@PathParam(value = "id") String id) {
    return String.format("Deleting Island %s", id);
  }

}

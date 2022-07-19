package com.betrybe.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.betrybe.dto.IslandCreateDTO;
import com.betrybe.dto.SatelliteDataCreateDTO;
import com.betrybe.service.IslandService;
import com.betrybe.service.SatelliteService;

import org.bson.types.ObjectId;

@Path("/satellite")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SatelliteDataController {
  @Inject
  private SatelliteService service;

  // Satellite End-points.
  @GET
  public Response listAll() {
    try {
      service.list();
      return Response.status(Status.OK).build();
    } catch (Exception e) {
      throw new Error(e.getMessage());
    }
  }

  @GET
  @Path("/{id}")
  public Response findById(@PathParam(value = "id") ObjectId id) {
    try {
      service.findById(id);
      return Response.status(Status.OK).build();
    } catch (Exception e) {
      throw new Error(e.getMessage());
    }
  }

  @POST
  public Response createIsland(SatelliteDataCreateDTO data) {
    try {
      service.create(data);
      return Response.status(Status.CREATED).build();
    } catch (Exception e) {
      throw new Error(e.getMessage());
    }
  }
}

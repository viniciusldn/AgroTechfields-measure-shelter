package com.betrybe;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/measure-shelter")
public class MeasureShelter {

  // Isles end-points.
  @GET
  @Path("/island")
  @Produces(MediaType.TEXT_PLAIN)
  public String listIslands() {
    return "List all islands";
  }

  @GET
  @Path("/island/{id}")
  @Consumes(MediaType.TEXT_PLAIN)
  @Produces(MediaType.TEXT_PLAIN)
  public String listIsland(@PathParam(value = "id") String id) {
    return String.format("Downloading Image %s", id);
  }

  @POST
  @Path("/island")
  @Produces(MediaType.TEXT_PLAIN)
  public String createIsland() {
    return "Create Island";
  }

  @PUT
  @Path("/island/{id}")
  @Produces(MediaType.TEXT_PLAIN)
  public String updateIsland(@PathParam(value = "id") String id) {
    return String.format("Updating Island %s", id);
  }

  @DELETE
  @Path("/island/{id}")
  @Produces(MediaType.TEXT_PLAIN)
  public String deleteIsland(@PathParam(value = "id") String id) {
    return String.format("Deleting Island %s", id);
  }

  // Satellite End-points.
  @GET
  @Path("/satellite")
  @Produces(MediaType.TEXT_PLAIN)
  public String listImages() {
    return "List all images";
  }

  @POST
  @Path("/satellite")
  @Produces(MediaType.TEXT_PLAIN)
  public String InsertImage() {
    return "Insert Image";
  }

  @GET
  @Path("/satellite/{id}")
  @Consumes(MediaType.TEXT_PLAIN)
  @Produces(MediaType.TEXT_PLAIN)
  public String downloadImage(@PathParam(value = "id") String id) {
    return String.format("Downloading Image %s", id);
  }
}

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

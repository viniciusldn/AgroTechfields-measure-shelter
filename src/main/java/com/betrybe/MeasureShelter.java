package com.betrybe;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/measure-shelter")
public class MeasureShelter {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String ListImages() {
    return "List all images";
  }

  @POST
  @Produces(MediaType.TEXT_PLAIN)
  public String InsertImage() {
    return "Insert Image";
  }

  @GET
  @Path("/{id}")
  @Consumes(MediaType.TEXT_PLAIN)
  public String DownloadImage(@PathParam(value = "id") String id) {
    return String.format("Downloading Image %s", id);
  }
}

package com.betrybe.model;

import org.bson.types.ObjectId;import javax.
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity
public class Island extends PanacheMongoEntity {

  private ObjectId id;
  private String name;
  private String agriculture;
  private boolean status;

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setNome(String nome) {
    this.name = nome;
  }

  public String getAgriculture() {
    return agriculture;
  }

  public void setAgriculture(String agriculture) {
    this.agriculture = agriculture;
  }

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

}

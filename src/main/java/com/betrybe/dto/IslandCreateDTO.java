package com.betrybe.dto;

public class IslandCreateDTO {
  private String nome;
  private String agriculture;
  private boolean status;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
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

  public void setArea(Boolean status) {
    this.status = status;
  }
}

package com.betrybe.dto;

public class IslandCreateDTO {
  private String nome;
  private String agriculture;
  private Double area;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getagriculture() {
    return agriculture;
  }

  public void setagriculture(String agriculture) {
    this.agriculture = agriculture;
  }

  public Double getarea() {
    return area;
  }

  public void setarea(Double area) {
    this.area = area;
  }
}

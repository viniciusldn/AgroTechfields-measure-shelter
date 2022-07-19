package com.betrybe;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.betrybe.model.IslandModel;

import static io.restassured.RestAssured.given;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class IslandTest {
  @Test
  @DisplayName("1 - Cadastra uma ilha com sucesso.")
  public void testCadastroSucesso() {
    IslandModel islandModel = new IslandModel();
    islandModel.setNome("Teste nome");
    IslandModel retornoDadosCadastro = given()
      .contentType("application/json")
      .body(islandModel)
      .when()
      .post("/island")
      .as(IslandModel.class);
    assertTrue(retornoDadosCadastro.getId().equals(retornoDadosCadastro.getId()));
  }

  @Test
  @DisplayName("2 - Tenta cadastrar uma ilha sem nome e recebe dados inválidos.")
  public void testCadastroSemNome() {
    IslandModel islandModel = new IslandModel();
    given()
      .contentType("application/json")
      .body(islandModel)
      .when()
      .post("/island")
      .then()
      .statusCode(400);
  }

  @Test
  @DisplayName("3 - Tenta cadastrar um cliente com nome vazio e recebe internal server error.")
  public void testCadastroNomeVazio() {
    IslandModel islandModel = new IslandModel();
    islandModel.setNome("");
    given()
      .contentType("application/json")
      .body(islandModel)
      .when()
      .post("/island")
      .then()
      .statusCode(500);
  }

  @Test
  @DisplayName("4 - Tenta obter um cadastro com id inválido e recebe bad request.")
  public void testObterSemId() {
    IslandModel islandModel = new IslandModel();
    given()
      .contentType("application/json")
      .body(islandModel)
      .when()
        .get("/island/idInvalido")
        .then()
        .statusCode(400);
  }

  @Test
  @DisplayName("5 - Tenta obter um cadastro com id que não está cadastrado e recebe bad request.")
  public void testObterIdInexistente() {
    IslandModel islandModel = new IslandModel();
    given()
      .contentType("application/json")
      .body(islandModel)
      .when()
      .get("/island/1000")
      .then()
      .statusCode(400);
    }
}

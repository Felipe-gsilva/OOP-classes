package com.carlos;

public class Comercial extends Ambiente implements ControladorDeIluminacao {
  private String descricao;

  public Comercial() {
    super(6);
    this.descricao = "Ambiente Comercial";
  }

  public String obterDescricao() {
    return descricao;
  }

  public void ajustarIluminacao() {

  }
}

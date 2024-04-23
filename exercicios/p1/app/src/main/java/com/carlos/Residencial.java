package com.carlos;

public class Residencial extends Ambiente implements ControladorDeIluminacao {
  private String descricao;

  public Residencial() {
    super(3);
    this.descricao = "Ambiente Residencial";
  }

  public String obterDescricao() {
    return descricao;
  }

  public void ajustarIluminacao() {

  }
}

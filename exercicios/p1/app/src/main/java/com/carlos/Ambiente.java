package com.carlos;

public abstract class Ambiente {
  private int iluminacao;

  public Ambiente(int iluminacao) {
    this.iluminacao = iluminacao;
  }

  public abstract String obterDescricao();

  public void verificarSensores() {
    if (iluminacao > 0) {
      System.out.println("Está ligado");
      return;
    }
    System.out.println("Está desligado");   
  }

  public void setIluminacao(int iluminacao) {
    this.iluminacao = iluminacao;
  }

  public int getIluminacao() {
    return iluminacao;
  }
}

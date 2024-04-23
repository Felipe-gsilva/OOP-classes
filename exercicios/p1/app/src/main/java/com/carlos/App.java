package com.carlos;

public class App {
  public static void main( String[] args ) {
    SistemaDeIluminacao sistema = new SistemaDeIluminacao(new Residencial());
    System.out.println(sistema.getIluminacaoAmbiente());
    sistema.setIluminacaoAmbiente(6);
    System.out.println(sistema.getIluminacaoAmbiente());
    sistema.mostrarDescricao(); 
  }
}

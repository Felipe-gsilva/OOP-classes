package com.mycompany.app;

public class Exemplo{
    private static int contador;
    public Exemplo(){
      contador++;
    }
    public static int getContador(){
      return contador;
    }
}

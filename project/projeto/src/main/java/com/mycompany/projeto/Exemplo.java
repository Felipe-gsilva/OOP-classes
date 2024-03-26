package com.mycompany.projeto;

public class Exemplo {
    private static int contador = 0;
    public Exemplo(){
        contador++;
    }
    public static int getContador(){
        return contador;    
    }
}

package com.mycompany.app;

import java.util.Scanner;

public class App {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    Conta conta[] = new Conta[5];

    for(int i = 0; i < 1; i++){
      conta[i] = new Conta();    
      conta[i].setNome(sc.nextLine());
      conta[i].setCpf(sc.nextLong());
      conta[i].setSaldo(sc.nextDouble());
      sc.nextLine();
      conta[i].setAgencia(sc.nextLine());
    }
    System.out.println(conta[0].getNome());
  }
}

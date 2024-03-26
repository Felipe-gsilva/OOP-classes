package com.java;

import com.java.util.*;

public class Predio{
  private List<Andar> andar = new ArrayList<>();
  private int nSalas; 

  public Predio(int nAndar) {
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < nAndar; i++) {
      System.out.println("Digite o numero de salas");
      nSalas = sc.nextInt();
      andar.add(new Andar(nSalas));
    }
  }
}

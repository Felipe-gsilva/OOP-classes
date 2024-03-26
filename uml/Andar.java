package com.java;

import com.java.util.*;

public class Andar {
  private List<Sala> sala = new ArrayList<>();

  public Andar(int nSalas) {
    for(int i = 0; i < nSalas; i++) {
      sala.add(new Sala(i));
    }
  }
}

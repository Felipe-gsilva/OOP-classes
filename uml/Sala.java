package com.java;

import com.java.util.*;

public class Sala {
  private List<Mesa> mesa = new ArrayList<>(); 
  private Andar andar;

  public Sala(int nMesas, Andar andar) {
    this.andar = andar;
    for(int i = 0; i < nMesas; i++) {
      mesa.add(new Mesa(i));
    }
  }

  public static Mesa getMesa(int id) {
    return mesa(id);
  }
}

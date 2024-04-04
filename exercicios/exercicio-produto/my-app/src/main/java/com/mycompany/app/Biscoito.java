package com.mycompany.app;

public class Biscoito extends Produto {
  private int cancer;
  
  public Biscoito() {
    
  }

  public Biscoito(String nome, int cancer, double peso) {
    this.nome = nome;
    this.cancer = cancer;
    this.preco = preco;
  }

  public void setCancer(int cancer) {
    this.cancer = cancer;
  }
  public int getCancer() {
    return cancer;
  }

  public int compareTo(Produto obj) {
    Biscoito biscoito2= (Biscoito) obj;
    if(this.preco * this.cancer> biscoito2.preco * biscoito2.cancer)
      return -1;
    if(this.preco * this.cancer < biscoito2.preco * biscoito2.cancer)
      return 1;
    return 0;
  }
}




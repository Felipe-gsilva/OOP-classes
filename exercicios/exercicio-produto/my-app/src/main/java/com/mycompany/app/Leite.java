package com.mycompany.app;

public class Leite extends Produto {
  private int val;
  
  public Leite() {
    
  }

  public Leite(String nome, int val, double peso) {
    this.nome = nome;
    this.val = val;
    this.preco = preco;
  }

  public void setVal(int val) {
    this.val = val;
  }

  public int getVal() {
    return val;
  }

  public int compareTo(Produto obj) {
    Leite leite2= (Leite) obj;
    if(this.preco * this.val> leite2.preco * leite2.val)
      return 1;
    if(this.preco * this.val < leite2.preco * leite2.val)
      return -1;
    return 0;
  }
}

package com.mycompany.app;

public class Shampoo extends Produto {
  private int irritabilidade;
  
  public Shampoo() {
    
  }

  public Shampoo(String nome, int irritabilidade, double peso) {
    this.nome = nome;
    this.irritabilidade = irritabilidade;
    this.preco = preco;
  }

  public void setIrritabilidade(int irritabilidade) {
    this.irritabilidade = irritabilidade;
  }
  public int getIrritabilidade() {
    return irritabilidade;
  }

  public int compareTo(Produto obj) {
    Shampoo shampoo2 = (Shampoo) obj;
    if(this.preco * this.irritabilidade > shampoo2.preco * shampoo2.irritabilidade)
      return -1;
    if(this.preco * this.irritabilidade < shampoo2.preco * shampoo2.irritabilidade)
      return 1;
    return 0;
  }
}

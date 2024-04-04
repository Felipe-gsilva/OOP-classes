package com.mycompany.app;

public class Arroz extends Produto{
  private double peso;

  public Arroz() {
    
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }
  public double getPeso() {
    return peso;
  }

  public Arroz(String nome, double preco, double peso) {
    this.nome = nome;
    this.peso = peso;
    this.preco = preco;
  }

  public int compareTo(Produto obj) {
    Arroz arroz2 = (Arroz) obj; 
    if(this.preco/this.peso > arroz2.preco/arroz2.peso)
      return -1;
    if(this.preco/this.peso == arroz2.preco/arroz2.peso)
      return 0;
    return 1;
  }
}

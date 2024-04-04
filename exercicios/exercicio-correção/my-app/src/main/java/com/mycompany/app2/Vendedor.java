package com.mycompany.app2;
// Arquivo Vendedor . java
public class Vendedor extends Funcionario {
  private double comissao ;

  public Vendedor ( String nome , double salario , double comissao ) {
    super(nome , salario) ;
    this.comissao = comissao;

  }

  public double calcularBonus () {
    return this.getSalario() + comissao;
  }
}

package com.mycompany.app2;
// Arquivo Gerente . java
public class Gerente extends Funcionario {
  private double bonus ;
  private String area ;

  public Gerente ( String nome , double salario , double bonus , String area ) {
    super (nome , salario) ;
    this.bonus = bonus;
    this.area = area;
  }
  
  public Gerente() {
    super();
  }

  public double calcularBonus () {
    return this.getSalario() + bonus ;
  }

  public String getArea () {
    return area;
  }
}

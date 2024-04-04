package com.mycompany.app2;

public class Principal {
  public static void main ( String [] args ) {
    Funcionario [] funcionarios = new Funcionario [4];
    funcionarios [0] = new Gerente (" Maria ", 5000 , 1000, "autopeças") ;
    funcionarios [1] = new Vendedor ("Jo ̃ao", 3000 , 500) ;
    funcionarios [2] = new Vendedor (" Lucas ", 2500 , 400) ;
    funcionarios [3] = new Vendedor(" Lucas ", 2500 , 400) ;

    for ( Funcionario funcionario : funcionarios) {
      System.out.println (" Nome: " + funcionario . getNome () ) ;
      if (funcionario instanceof Gerente)
        System .out . println (" Area: " + ((Gerente)funcionario).getArea()) ;
    System.out.println (" Bonus: " + funcionario.calcularBonus () ) ;
    }
  }
}

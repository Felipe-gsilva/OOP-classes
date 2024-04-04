package com.mycompany.app;

import java.util.Scanner;

public class App {
  public static void main( String[] args ) {
    Scanner sc = new Scanner(System.in);
    try {
      double resultado = Calculator.calcular(sc.nextDouble(), sc.nextDouble(), sc.next().charAt(0));
      System.out.println(resultado);
    } catch (InvalidOperationException iEx) {
      System.err.println(iEx.getMessage());
    } catch (ArithmeticException aEx) {
      System.err.println(aEx.getMessage());
    } finally {
      sc.close();
    }
  }
}

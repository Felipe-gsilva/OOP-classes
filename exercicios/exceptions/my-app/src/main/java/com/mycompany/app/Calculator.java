package com.mycompany.app;

public class Calculator {
  public static double  calcular (double a, double b, char operacao) throws InvalidOperationException, ArithmeticException {
    double resultado;
    switch(operacao) {
      case '+':
        resultado = a + b;
      break;
      case '-':
        resultado = a - b;
      break;
      case '/':
        if (b == 0)
          throw new ArithmeticException("dividido por 0");
        resultado = a/b;
      break;
      case '*':
        resultado = a*b;
      break;
      default:
        throw new InvalidOperationException("coiso invalido");
    }
    return resultado;
  }
}

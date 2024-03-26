package com.mycompany.app;


import java.util.Scanner;

public class test {
  public static void generic( String[] args )
{
    int linha, coluna;
    Scanner sc = new Scanner(System.in);  
    System.out.println("Digite:");
    linha = sc.nextInt();
    System.out.println("Digite:");
    coluna = sc.nextInt();

    int[][] matriz = new int[linha][coluna]; 

    for(int i = 0; i < linha; i++) {
      for(int j = 0; j < coluna; j++) {
        matriz[i][j] = sc.nextInt();
      }
    }

    for(int i = 0; i < linha; i++) {
      for(int j = 0; j < coluna; j++) {
        System.out.print(matriz[j][i] + " ");
      }
      System.out.println(" ");
    }
    sc.close();
  }
}

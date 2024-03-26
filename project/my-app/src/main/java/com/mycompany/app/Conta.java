package com.mycompany.app;

public class Conta {
  private String nome;
  private long cpf;
  private double saldo;
  private int numeroConta;
  private String agencia;
  private static int contadorConta;

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }

  public void setCpf(long cpf){
    this.cpf = cpf;
  }

  public long getCpf(){
    return cpf;
  }

  public void setSaldo(double saldo){
    this.saldo = saldo;
  }

  public double getSaldo(){
    return saldo;
  }

  public void setNumeroConta(int numeroConta){
    this.numeroConta = numeroConta;
  }

  public long getNumeroConta(){
    return numeroConta;
  }

  public void setAgencia(String agencia){
    this.agencia = agencia;
  }

  public String getAgencia(){
    return agencia;
  }

  public Conta() {
    numeroConta = ++contadorConta;
  }

  public void deposito(double x) {
    saldo += x;
  }

  public double saque(double x) {
    saldo -= x;
    return x;
  }



}

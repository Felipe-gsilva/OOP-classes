package com.carlos;

public class SistemaDeIluminacao {
  private Ambiente ambiente;

  public SistemaDeIluminacao(Ambiente ambiente){
    if(ambiente instanceof Residencial ) {
      this.ambiente = (Residencial) ambiente;
      return;
    }
    this.ambiente = (Comercial) ambiente;
  }

  public void setIluminacaoAmbiente(int iluminacao) {
    ambiente.setIluminacao(iluminacao);
  } 

  public int getIluminacaoAmbiente() {
    return ambiente.getIluminacao();
  } 
  public void mostrarDescricao() {
    System.out.println(ambiente.obterDescricao());
  }
}

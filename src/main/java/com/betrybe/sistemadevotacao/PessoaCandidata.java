package com.betrybe.sistemadevotacao;

public class PessoaCandidata extends Pessoa {

  private int numero;
  private int votos;

  public PessoaCandidata(String nome, int numero) {
    this.numero = numero;
    this.nome = nome;
    this.votos = 0;
  }

  public void receberVoto() {
    this.votos += 1;
  }

  public int getNumero() {
    return numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }
}

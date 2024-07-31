package com.betrybe.sistemadevotacao;

/**
 * The type Pessoa candidata.
 */
public class PessoaCandidata extends Pessoa {

  private int numero;
  private int votos;

  /**
   * Instantiates a new Pessoa candidata.
   *
   * @param nome   the nome
   * @param numero the numero
   */
  public PessoaCandidata(String nome, int numero) {
    this.numero = numero;
    this.nome = nome;
    this.votos = 0;
  }

  /**
   * Receber voto.
   */
  public void receberVoto() {
    this.votos += 1;
  }

  /**
   * Gets numero.
   *
   * @return the numero
   */
  public int getNumero() {
    return numero;
  }

  /**
   * Gets votos.
   *
   * @return the votos
   */
  public int getVotos() {
    return votos;
  }

  /**
   * Sets numero.
   *
   * @param numero the numero
   */
  public void setNumero(int numero) {
    this.numero = numero;
  }
}

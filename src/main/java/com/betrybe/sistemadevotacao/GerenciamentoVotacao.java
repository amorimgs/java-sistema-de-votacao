package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfsComputados = new ArrayList<String>();


  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    PessoaCandidata candidataCadastrada = pessoasCandidatas.stream()
        .filter(p -> numero == p.getNumero()).findAny().orElse(null);
    if (candidataCadastrada != null) {
      System.out.println("Número da pessoa candidata já utilizado!");
    } else {
      PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(pessoaCandidata);
    }
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    PessoaEleitora eleitoraCadastrada = pessoasEleitoras.stream()
        .filter(p -> cpf.contains(p.getCpf())).findAny().orElse(null);
    if (eleitoraCadastrada != null) {
      System.out.println("Pessoa eleitora já cadastrada!");
    } else {
      PessoaEleitora pessoaEleitora = new PessoaEleitora(nome, cpf);
      pessoasEleitoras.add(pessoaEleitora);
    }
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfsComputados.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
    }
    PessoaCandidata pessoaCandidata = pessoasCandidatas.stream()
        .filter(p -> numeroPessoaCandidata == p.getNumero()).findAny()
        .orElse(null);
    if (pessoaCandidata != null) {
      pessoaCandidata.receberVoto();
      cpfsComputados.add(cpfPessoaEleitora);
    }
  }

  @Override
  public void mostrarResultado() {
    int totalVotos = cpfsComputados.size();
    if (totalVotos == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    }
    for (PessoaCandidata p : pessoasCandidatas) {
      System.out.println(
          "Nome: " + p.getNome() + " - " + p.getVotos() + " votos ( " + Math.round(
              ((float) p.getVotos() / totalVotos) * 100) + "% )");
    }
    System.out.println("Total de votos: " + totalVotos);
  }
}

package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * The type Principal.
 */
public class Principal {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();

    char option = 0;
    while (option != '2') {
      System.out.println("""
          Cadastrar pessoa candidata?
          1 - Sim
          2 - Não
          Entre com o número correspondente à opção desejada:""");
      option = scanner.nextLine().charAt(0);
      if (option == '1') {

        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(scanner.nextLine());
        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      }
    }
    option = 0;
    while (option != '2') {
      System.out.println("""
          Cadastrar pessoa eleitora?
          1 - Sim
          2 - Não
          Entre com o número correspondente à opção desejada:""");
      option = scanner.nextLine().charAt(0);
      if (option == '1') {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = scanner.nextLine();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.nextLine();
        gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
      }
    }
    option = 0;
    while (option != '3') {
      System.out.println("""
          Entre com o número correspondente à opção desejada:
          1 - Votar
          2 - Resultado Parcial
          3 - Finalizar Votação""");
      option = scanner.nextLine().charAt(0);
      if (option == '1') {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String nome = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(scanner.nextLine());
        gerenciamentoVotacao.votar(nome, numero);
      }
      if (option == '2') {
        gerenciamentoVotacao.mostrarResultado();
      }
      if (option == '3') {
        gerenciamentoVotacao.mostrarResultado();
      }

    }


  }

}

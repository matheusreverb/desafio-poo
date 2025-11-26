package com.desafiopoo;

public class Aluno {
  public String nome;
  public int idade;

  public void exibirInformacoes() {
    System.out.println(String.format(
      """
        Nome: %s
        Idade: %d    
      """, 
      this.nome,
      this.idade
    ));
  }
}

package com.desafiopoo;

public class Aluno {
  private String nome;
  private int notas = 0;
  private int provas = 0; 

  public void exibirInformacoes() {
    System.out.println(String.format(
      """
        Nome: %s
        nota: %d    
      """, 
      this.nome,
      this.notas
    ));
  }

  public String getNome() {
    return nome;
  }

  public int getNota() {
    return notas;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void avaliarAluno(int nota) {
    provas++;
    this.notas = this.notas + nota;
  }

  public int calcularMedia() {
    return notas / provas;
  }

}

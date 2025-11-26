package com.desafiopoo;

public class Produto {
  private String nome;
  private Double preco;

  public String getNome() {
    return nome;
  }

  public Double getPreco() {
    return preco;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void aplicarDesconto(double desconto) {
    preco = preco - (preco * desconto / 100);
  }

}

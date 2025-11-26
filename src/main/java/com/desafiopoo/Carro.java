package com.desafiopoo;

public class Carro {
  public String modelo;
  public int ano;
  public String cor;

  public void exibirFichaTecnica() {
    System.out.println(String.format(
      """
        Modelo: %s
        Ano: %d
        Cor: %s
      """, 
      modelo,
      ano,
      cor
    ));
  }

  public int calcularIdadeCarro(int anoAtual) {
    return anoAtual - this.ano;
  }
}

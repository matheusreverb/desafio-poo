package com.desafiopoo;

public class Musica {
  public String titulo;
  public String artista;
  public int anoDeLancamento;
  public double avaliacao = 0;
  public int numAvaliacoes = 0;

  public void exibirFichaTecnica() {
    System.out.println(String.format(
      """
        Titulo: %s
        Artista: %s
        Ano de Lançamento: %d
        Avaliação: %.2f
        Número de Avaliações: %d
      """, 
      titulo,
      artista,
      anoDeLancamento,
      (avaliacao / numAvaliacoes),
      numAvaliacoes
    ));
  }

  public void avaliarMusica(double nota) {
    this.numAvaliacoes += 1;
    this.avaliacao += nota;
  }

  public double pegarMediaCalculada() {
    return this.avaliacao / this.numAvaliacoes;
  }
}

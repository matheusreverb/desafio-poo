package com.desafiopoo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.getHelloWorld();


        Calculadora calculadora = new Calculadora();
        int doubleNumber = calculadora.getDouble(10);
        System.out.println(doubleNumber);

        
        Musica musica = new Musica();
        musica.titulo = "Céu Azul";
        musica.artista = "Alexandre Magno Abrão";
        musica.anoDeLancamento = 2012;
        musica.avaliarMusica(10);
        musica.avaliarMusica(10);
        musica.avaliarMusica(8);
        musica.avaliarMusica(9);
        musica.exibirFichaTecnica();
        System.out.println(musica.pegarMediaCalculada());

        
        Carro carro = new Carro();
        carro.modelo = "Volkswagen Passat CC V6";
        carro.ano = 2014;
        carro.cor = "Prata";
        carro.exibirFichaTecnica();
        

        final int year = LocalDate.now().getYear();
        System.out.println(carro.calcularIdadeCarro(year));


        Aluno aluno = new Aluno();
        aluno.setNome("Iran Braga");
        aluno.avaliarAluno(10);
        aluno.avaliarAluno(8);
        aluno.avaliarAluno(9);
        System.out.println("A média do aluno é:" + aluno.calcularMedia()); 

    }
}
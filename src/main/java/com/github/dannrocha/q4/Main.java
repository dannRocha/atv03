package com.github.dannrocha.q4;

import com.github.dannrocha.q4.factory.ElementoFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Elemento pastaMusicaQueen = ElementoFactory.criarElemento("queen",
            ElementoFactory.criarElemento("Somebody To Love", 2000L),
            ElementoFactory.criarElemento("Bohemian Rhapsody.", 5000L),
            ElementoFactory.criarElemento("We Are The Champions", 3000L)
        );

        Elemento pastaMusicasClassicas = ElementoFactory.criarElemento("erudita",
            ElementoFactory.criarElemento("5ª Sinfonia em Dó Menor Op", 12000L),
            ElementoFactory.criarElemento("Infernal Galop, de Orfeu no Submundo", 15000L),
            ElementoFactory.criarElemento("O Barbeiro de Sevilha", 40000L)
        );

        Elemento musicas = ElementoFactory.criarElemento("minhas musicas",
            pastaMusicaQueen, pastaMusicasClassicas,
            ElementoFactory.criarElemento("Eu Não Sou Cachorro Não", 20000L),
            ElementoFactory.criarElemento("Garçon", 7000L)
        );


        System.out.println("%s - %sKb".formatted(musicas.getNome(), musicas.tamanho() / 1028));

    }
}

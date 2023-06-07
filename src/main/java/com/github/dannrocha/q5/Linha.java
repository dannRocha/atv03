package com.github.dannrocha.q5;

import java.util.ArrayList;
import java.util.List;

public class Linha extends Item {
    private final List<Celula> celulas = new ArrayList<>();

    @Override
    public void imprimir() {
        celulas.forEach(Item::imprimir);
//        System.out.println("|");
        int tamanho = celulas.size() * 17  + 15;
        char[] linha = new char[tamanho];
//
        for(int i = 0; i < tamanho; i++) linha[i] = '-';
        System.out.println("\n %s".formatted(String.valueOf(linha)));




    }

    public void adicionar(Celula celula) {
        celulas.add(celula);
    }
}

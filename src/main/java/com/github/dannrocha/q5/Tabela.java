package com.github.dannrocha.q5;

import java.util.ArrayList;
import java.util.List;

public class Tabela extends Item{
    private final List<Item> linhas  = new ArrayList<>();

    public void adicionar(Item linha) {
        linhas.add(linha);
    }

    @Override
    void imprimir() {
        linhas.forEach(Item::imprimir);
    }
}

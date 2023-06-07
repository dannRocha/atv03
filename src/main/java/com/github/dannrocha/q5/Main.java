package com.github.dannrocha.q5;

import com.github.dannrocha.q5.factory.TabelaViewFactory;

public class Main {
    public static void main(String[] args) {
        Item tabela = TabelaViewFactory.criarTabelaIndexada(2, 4);
        tabela.imprimir();
    }
}

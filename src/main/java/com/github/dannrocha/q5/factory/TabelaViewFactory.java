package com.github.dannrocha.q5.factory;

import com.github.dannrocha.q5.Celula;
import com.github.dannrocha.q5.Item;
import com.github.dannrocha.q5.Linha;
import com.github.dannrocha.q5.Tabela;

public class TabelaViewFactory {
    public static Item criarTabelaIndexada(long coluna, long linha) {
        var tabela = new Tabela();
        int index = 1;

        for(int i = 0; i < linha; i++) {
            var linhaItem = new Linha();
            for(int j = 0; j < coluna; j++) {
                var celula = new Celula("%s".formatted(index));
                linhaItem.adicionar(celula);
                index++;
            }
            tabela.adicionar(linhaItem);
        }
        return tabela;
    }
}

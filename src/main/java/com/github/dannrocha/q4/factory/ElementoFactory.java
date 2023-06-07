package com.github.dannrocha.q4.factory;

import com.github.dannrocha.q4.Arquivo;
import com.github.dannrocha.q4.Diretorio;
import com.github.dannrocha.q4.Elemento;

import java.util.Arrays;
import java.util.List;

public class ElementoFactory {

    public static Elemento criarElemento(final String nome, final Elemento ...elementos) {
        var dir = new Diretorio(nome);
        dir.adicionar(Arrays.stream(elementos).toList());
        return dir;
    }
    public static Elemento criarElemento(final String nome, final long tamanho) {
        return new Arquivo(nome, tamanho);
    }
}

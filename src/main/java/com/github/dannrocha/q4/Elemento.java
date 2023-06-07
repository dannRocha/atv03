package com.github.dannrocha.q4;

public abstract class Elemento {

    private final String nome;

    public Elemento(final String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public long tamanho() {
        return 0L;
    }
}

package com.github.dannrocha.q4;

public class Arquivo extends Elemento {

    private final long bytes;
    public Arquivo(final String nome, final long bytes) {
        super(nome);
        this.bytes = bytes;
    }

    @Override
    public long tamanho() {
        return bytes;
    }
}

package com.github.dannrocha.q4;

import java.util.ArrayList;
import java.util.List;

public class Diretorio extends Elemento {
    private final List<Elemento> elementos;
    public Diretorio(final String nome) {
        super(nome);
        elementos = new ArrayList<>();
    }

    public void adicionar(Elemento elemento) {
        elementos.add(elemento);
    }

    public void adicionar(List<Elemento> elementos) {
        elementos.forEach(this::adicionar);
    }

    @Override
    public long tamanho() {
        return elementos
            .stream()
            .map(Elemento::tamanho)
            .reduce((accumuator, value) -> accumuator + value)
            .orElseGet(() -> 0L);
    }
}

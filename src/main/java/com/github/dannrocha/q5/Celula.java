package com.github.dannrocha.q5;

public class Celula extends Item {
    private String conteudo;

    public Celula(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        conteudo = (conteudo + " ".repeat(15)).substring(0, 15);

        System.out.print(" | %s".formatted(conteudo));
    }
}

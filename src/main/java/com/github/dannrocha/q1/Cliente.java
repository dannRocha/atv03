package com.github.dannrocha.q1;

public class Cliente {
    private final SomadorEsperado somador;

    public Cliente(SomadorEsperado somador) {
        this.somador = somador;
    }

    public void executar() {
        var vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var soma = somador.somaVetor(vetor);

        assert soma == 55;
        System.out.println("resutado %s".formatted(soma));
    }

}

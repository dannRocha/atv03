package com.github.dannrocha.q1;

public class Main {
    public static void main(String[] args) {

        SomadorEsperado somadorEsperado = new SomadorAdapter();

        Cliente cliente = new Cliente(somadorEsperado);

        cliente.executar();

    }
}

package com.github.dannrocha.q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SomadorAdapter implements SomadorEsperado {

    private final SomadorExistente somador = new SomadorExistente();

    @Override
    public int somaVetor(int[] vetor) {
        return somador.somaLista(Arrays.stream(vetor).boxed().toList());
    }
}

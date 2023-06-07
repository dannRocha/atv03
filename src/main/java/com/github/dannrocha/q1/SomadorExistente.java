package com.github.dannrocha.q1;

import java.util.List;

public class SomadorExistente {
    public int somaLista(List<Integer> lista) {
        int resultado = 0;
        for(var i : lista ) resultado += i;
        return resultado;
    }
}

package com.github.dannrocha.q6.implementacoes;

import com.github.dannrocha.q6.contratos.ModuloPersitencia;

public class XMLModuloPersistencia extends ModuloPersitencia {
    @Override
    public void salvar() {
        System.out.println("salvando em XML");
    }
}

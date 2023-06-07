package com.github.dannrocha.q6.contratos;

public abstract class ClasseNegocio {

    private final ModuloPersitencia persitencia;

    protected ClasseNegocio(ModuloPersitencia persitencia) {
        this.persitencia = persitencia;
    }

    public void persiste() {
        System.out.println("salvando");
        persitencia.salvar();
    }
}

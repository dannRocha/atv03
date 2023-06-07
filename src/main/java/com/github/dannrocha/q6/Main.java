package com.github.dannrocha.q6;

import com.github.dannrocha.q6.contratos.Carro;
import com.github.dannrocha.q6.contratos.ClasseNegocio;
import com.github.dannrocha.q6.contratos.ModuloPersitencia;
import com.github.dannrocha.q6.contratos.Pessoa;
import com.github.dannrocha.q6.implementacoes.JSONModuloPersistencia;
import com.github.dannrocha.q6.implementacoes.XMLModuloPersistencia;

public class Main {
    public static void main(String[] args) {
        ModuloPersitencia xml = new XMLModuloPersistencia();
        ModuloPersitencia json = new JSONModuloPersistencia();

        ClasseNegocio pessoa = new Pessoa(xml);
        ClasseNegocio carro = new Carro(json);

        pessoa.persiste();
        carro.persiste();
    }
}

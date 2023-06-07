package com.github.dannrocha.q3;

import com.github.dannrocha.q3.comandos.AbrirAutoClave;
import com.github.dannrocha.q3.comandos.AdicionarEtiquetaDeEsterilizacao;
import com.github.dannrocha.q3.comandos.DesligarEsterilizadora;
import com.github.dannrocha.q3.comandos.FecharAutoClave;
import com.github.dannrocha.q3.comandos.IsolarMaterialEmPacote;
import com.github.dannrocha.q3.comandos.LigarEsterilizadora;
import com.github.dannrocha.q3.comandos.PreprarMaterialParaEsterilizacao;

import java.util.ArrayList;
import java.util.List;

public class ExperimentoUm extends ExperimentoAbstratoTemplate {

    @Override
    protected List<RoboAction> configuracaoAcoes() {
        var material = new Material("'amostra N'");
        return new ArrayList<>(List.of(
                new PreprarMaterialParaEsterilizacao(material),
                new AbrirAutoClave(),
                new IsolarMaterialEmPacote(material),
                new FecharAutoClave(),
                new LigarEsterilizadora(),
                new DesligarEsterilizadora(),
                new AbrirAutoClave(),
                new AdicionarEtiquetaDeEsterilizacao()
        ));
    }
}

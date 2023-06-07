package com.github.dannrocha.q3;

import java.util.List;

public abstract class ExperimentoAbstratoTemplate {
    private List<RoboAction> acoes;

    protected abstract List<RoboAction> configuracaoAcoes();

    protected ExperimentoAbstratoTemplate() {
        acoes = configuracaoAcoes();
    }

    public void adicionarPasso(RoboAction roboAction) {
        acoes.add(roboAction);
    }

    public void execute() {
        acoes.forEach(RoboAction::execute);
    }
}

package com.github.dannrocha.q3.comandos;

import com.github.dannrocha.q3.Material;
import com.github.dannrocha.q3.RoboAction;

public class PreprarMaterialParaEsterilizacao implements RoboAction {

    private final Material material;

    public PreprarMaterialParaEsterilizacao(Material material) {
        this.material = material;
    }

    @Override
    public void execute() {
        System.out.println("preparando material %s".formatted(material));
    }
}

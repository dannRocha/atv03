package com.github.dannrocha.q3.comandos;

import com.github.dannrocha.q3.Material;
import com.github.dannrocha.q3.RoboAction;

public class IsolarMaterialEmPacote implements RoboAction {
    private final Material material;

    public IsolarMaterialEmPacote(Material material) {
        this.material = material;
    }

    @Override
    public void execute() {
        System.out.println("adicionado material %s". formatted(material));
    }
}

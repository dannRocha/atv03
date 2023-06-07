package com.github.dannrocha.q3;

public class Material {
    private final String nome;

    public Material(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Material{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

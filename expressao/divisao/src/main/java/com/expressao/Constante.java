package com.expressao;

class Constante extends Expressao {
    private float valor;

    public Constante(float valor) {
        this.valor = valor;
    }

    public float valor() {
        return valor;
    }
}
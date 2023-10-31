package com.expressao;

public class Soma extends DecoratorExpressao {

    public Soma(Expressao e1, Expressao e2) {
        super(e1, e2);
    }

    public float valor() {
        return this.e1.valor() + this.e2.valor();
    }
}

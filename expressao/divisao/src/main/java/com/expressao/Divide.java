package com.expressao;

public class Divide extends DecoratorExpressao {

    public Divide(Expressao e1, Expressao e2) {
        super(e1, e2);
    }

    public float valor() {
        return e1.valor() / e2.valor();
    }
}

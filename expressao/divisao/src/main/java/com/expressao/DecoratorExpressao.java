package com.expressao;

abstract public class DecoratorExpressao extends Expressao {
    protected Expressao e1;
    protected Expressao e2;

    protected DecoratorExpressao(Expressao e1, Expressao e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    abstract public float valor();
}

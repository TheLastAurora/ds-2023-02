package com.expressao;

public class Multiplica extends DecoratorExpressao {

    public Multiplica(Expressao e1, Expressao e2) {
        super(e1, e2);
    }

    public float valor() {
        return this.e1.valor() * this.e2.valor();
    }
}

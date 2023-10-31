package com.expressao;

public class Main {
    public static void main(String[] args) {
        float x = 5;
        float y = 2;
        float z = 3;
        Soma sum1 = new Soma(new Constante(x),new Multiplica(new Constante(y), new Constante(z)));
        Divide div1 = new Divide(new Constante(x),new Multiplica(new Constante(y), new Constante(z)));
        Multiplica mult1 = new Multiplica(new Constante(x),new Multiplica(new Constante(y), new Constante(z)));
        Subtrai sub1 = new Subtrai(new Constante(x),new Multiplica(new Constante(y), new Constante(z)));
        System.out.println(sum1.valor());
        System.out.println(div1.valor());
        System.out.println(mult1.valor());
        System.out.println(sub1.valor());
    }
}

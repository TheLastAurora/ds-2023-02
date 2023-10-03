package com.newton;

public class Main {
    public static void main(String[] args) {
        double raiz = AproximacaoNewtoniana.raizQuadrada(16.0, 0.0001, 100);
        System.out.println(raiz);
    }
}

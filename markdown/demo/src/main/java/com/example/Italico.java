package com.example;

public class Italico implements Markdown {

    private Texto texto;

    public Italico(Texto texto) {
        this.texto = texto;
    }

    @Override
    public void exibe() {
        System.out.print("_");
        this.texto.exibe();
        System.out.println("_");
    }

}

package com.example;

public class Negrito implements Markdown {
    
    private Texto texto;

    public Negrito(Texto texto) {
        this.texto = texto;
    }

    @Override
    public void exibe() {
        System.out.print("**");
        this.texto.exibe();
        System.out.println("**");
    }

}

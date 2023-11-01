package com.example;

public class Item implements Markdown {

    private Texto texto;

    public Item(Texto texto) {
        this.texto = texto;
    }

    @Override
    public void exibe() {
        System.out.print("- ");
        this.texto.exibe();
        System.out.println("- ");
    }

}

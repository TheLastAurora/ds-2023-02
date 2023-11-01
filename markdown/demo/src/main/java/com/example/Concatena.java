package com.example;

public class Concatena implements Markdown {
    
    private Texto texto1;
    private Texto texto2;

    public Concatena(Texto texto1, Texto texto2) {
        this.texto1 = texto1;
        this.texto2 = texto2;
    }

    @Override
    public void exibe() {
        // TODO
        System.out.print("");
    }

    

}

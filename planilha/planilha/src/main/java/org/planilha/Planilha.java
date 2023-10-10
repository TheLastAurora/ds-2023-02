package org.planilha;

import java.util.ArrayList;
import java.util.List;

public class Planilha {
    private List<Celula> celulas;

    public Planilha() {
        this.celulas = new ArrayList<>();
    }

    public void adicionarCelula(Celula celula) {
        celulas.add(celula);
    }

    public void removerCelula(Celula celula) {
        celulas.remove(celula);
    }
}

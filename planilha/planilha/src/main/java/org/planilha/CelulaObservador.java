package org.planilha;

public class CelulaObservador implements Observador {
    private Celula celula;
    private boolean estaAtualizado;

    public CelulaObservador(Celula celula) {
        this.celula = celula;
        celula.adicionarObservador(this);
    }

    @Override
    public void atualizar() {
        this.estaAtualizado = true;
    }

    public boolean getEstaAtualizado() {
        return this.estaAtualizado;
    }
}

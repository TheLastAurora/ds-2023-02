package org.planilha;

import java.util.ArrayList;
import java.util.List;

class ObjetoObservavel implements Observavel {
    private List<Observador> observadores;

    public ObjetoObservavel() {
        this.observadores = new ArrayList<>();
    }

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar();
        }
    }
}

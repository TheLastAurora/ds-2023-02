package org.planilha;

import java.util.List;

class ObjetoObservavel implements Observavel {
    private List<Observador> observadores;

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar();
        }
    }
}

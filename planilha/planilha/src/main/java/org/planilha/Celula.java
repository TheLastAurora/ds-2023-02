package org.planilha;

import java.util.ArrayList;
import java.util.List;

public class Celula implements Observavel {
    private String valor;
    private List<Observador> observadores;

    public Celula() {
        this.valor = "";
        this.observadores = new ArrayList<>();
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
        notificarObservadores();
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


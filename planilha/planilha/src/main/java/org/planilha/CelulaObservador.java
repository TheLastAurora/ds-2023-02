package org.planilha;

public class CelulaObservador implements Observador {
    private Celula celula;
    private String valorAtualizado;
    public CelulaObservador(Celula celula) {
        this.celula = celula;
        celula.adicionarObservador(this);
    }

    public void setValorAtualizado(String valor) {
        this.valorAtualizado = valor;
    }

    public String getValorAtualizado() {
        return valorAtualizado;
    }
    @Override
    public void atualizar() {
        setValorAtualizado(celula.getValor());
        String mensagem = String.format("Célula atualizada: %s", celula.getValor());
    }

}

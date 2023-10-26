import java.util.ArrayList;

public class Pintura implements ItemObservavel {

    ArrayList<Interessado> participantes = new ArrayList<>();
    private String nome;
    private String data;
    private String autor;
    private float preço;

    public Pintura() {
        this.participantes = new ArrayList<>();
    }

    public Pintura(String nome, String data, String autor, float preço) {
        this.data = data;
        this.autor = autor;
        this.preço = preço;
    }

    @Override
    public void addObserver(Interessado interessado) {
        this.participantes.add(interessado);
    }

    @Override
    public void removeObserver(Interessado interessado) {
        this.participantes.remove(interessado);
    }

    @Override
    public void notifyObservers() {
        if (participantes != null && !participantes.isEmpty()) {
            for (Interessado interessado : participantes) {
                interessado.updatePreco(this);
            }
        } else {
            System.out.println("Nenhum observador para notificar!!!");
        }
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
        notifyObservers();
    }
}

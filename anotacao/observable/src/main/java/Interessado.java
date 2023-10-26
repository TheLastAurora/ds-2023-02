@Observador(classesMonitoradas = {Pintura.class, Escultura.class})
public class Interessado {
    Object itemObservado;

    public Interessado() {
    }

    public void updatePreco(Object itemObservado) {
        this.itemObservado = itemObservado;
        float preço = itemObservado.getClass().getSimpleName().equals("Pintura") ? ((Pintura) itemObservado).getPreço() : ((Escultura) itemObservado).getPreço();
        if (preço != 0.0f) {
            System.out.println("Classe: " + itemObservado.getClass() + " teve o preço atualizado!!! " + preço);
        }
    }
}
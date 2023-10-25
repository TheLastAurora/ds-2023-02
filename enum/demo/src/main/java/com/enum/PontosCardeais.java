public enum PontosCardeais {
    NORTE(0),
    SUL(180),
    LESTE(90),
    OESTE(270);

    private final int grau;

    private PontosCardeais(int grau) {
        this.grau = grau;
    }

    public int getGrau() {
        return grau;
    }
}

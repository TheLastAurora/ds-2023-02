public enum TamanhoPizza {
    PEQUENA("30cm"),
    MEDIA("40cm"),
    GRANDE("50cm");

    private final String tamanho;

    private TamanhoPizza(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getDiametro() {
        return Integer.parseInt(tamanho.replaceAll("[^0-9]", ""));
    }
}

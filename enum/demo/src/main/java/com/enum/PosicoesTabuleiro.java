public enum PosicoesTabuleiro {
    A8("Preta"), B8("Branca"), C8("Preta"), D8("Branca"), E8("Preta"), F8("Branca"), G8("Preta"), H8("Branca"),
    A7("Branca"), B7("Preta"), C7("Branca"), D7("Preta"), E7("Branca"), F7("Preta"), G7("Branca"), H7("Preta"),
    A6("Preta"), B6("Branca"), C6("Preta"), D6("Branca"), E6("Preta"), F6("Branca"), G6("Preta"), H6("Branca"),
    A5("Branca"), B5("Preta"), C5("Branca"), D5("Preta"), E5("Branca"), F5("Preta"), G5("Branca"), H5("Preta"),
    A4("Preta"), B4("Branca"), C4("Preta"), D4("Branca"), E4("Preta"), F4("Branca"), G4("Preta"), H4("Branca"),
    A3("Branca"), B3("Preta"), C3("Branca"), D3("Preta"), E3("Branca"), F3("Preta"), G3("Branca"), H3("Preta"),
    A2("Preta"), B2("Branca"), C2("Preta"), D2("Branca"), E2("Preta"), F2("Branca"), G2("Preta"), H2("Branca"),
    A1("Branca"), B1("Preta"), C1("Branca"), D1("Preta"), E1("Branca"), F1("Preta"), G1("Branca"), H1("Preta");

    private final String cor;
    private final int linha;
    private final int coluna;

    private PosicoesTabuleiro(String cor) {
        this.cor = cor;
        this.linha = 8 - (ordinal() / 8); 
        this.coluna = ordinal() % 8 + 1;  
    }

    public String getCor() {
        return cor;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }
}

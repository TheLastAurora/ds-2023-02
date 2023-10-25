public enum DiasSemana {
    SEGUNDA("Segunda-feira"),
    TERÇA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("Sexta-feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo");

    private final String nome;

    private DiasSemana(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

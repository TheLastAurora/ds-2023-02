public enum PermissoesDiretorio {
    LEITURA(true, false, false, false),
    ESCRITA(true, true, false, false),
    CRIAÇÃO(true, true, true, false),
    EXCLUSÃO(true, true, true, true);

    private final boolean leitura;
    private final boolean escrita;
    private final boolean criacao;
    private final boolean exclusao;

    private PermissoesDiretorio(boolean leitura, boolean escrita, boolean criacao, boolean exclusao) {
        this.leitura = leitura;
        this.escrita = escrita;
        this.criacao = criacao;
        this.exclusao = exclusao;
    }

    public boolean permiteLeitura() {
        return leitura;
    }

    public boolean permiteEscrita() {
        return escrita;
    }

    public boolean permiteCriacao() {
        return criacao;
    }

    public boolean permiteExclusao() {
        return exclusao;
    }
}

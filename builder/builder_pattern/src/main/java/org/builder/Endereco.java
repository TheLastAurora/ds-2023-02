package org.builder;

public class Endereco {
    private String rua;
    private String setor;
    private String cep;
    private int numero;
    private String cidade;
    private String estado;
    private String bloco;
    private String quadra;

    private Endereco(Builder builder) {
        rua = builder.rua;
        setor = builder.setor;
        cep = builder.cep;
        numero = builder.numero;
        cidade = builder.cidade;
        estado = builder.estado;
        bloco = builder.bloco;
        quadra = builder.quadra;
    }


    public static final class Builder {
        private String rua;
        private String setor;
        private String cep;
        private int numero;
        private String cidade;
        private String estado;
        private String bloco;
        private String quadra;

        public Builder() {
        }

        public Builder rua(String val) {
            rua = val;
            return this;
        }

        public Builder setor(String val) {
            setor = val;
            return this;
        }

        public Builder cep(String val) {
            cep = val;
            return this;
        }

        public Builder numero(int val) {
            numero = val;
            return this;
        }

        public Builder cidade(String val) {
            cidade = val;
            return this;
        }

        public Builder estado(String val) {
            estado = val;
            return this;
        }

        public Builder bloco(String val) {
            bloco = val;
            return this;
        }

        public Builder quadra(String val) {
            quadra = val;
            return this;
        }

        public Endereco build() {
            return new Endereco(this);
        }
    }
}


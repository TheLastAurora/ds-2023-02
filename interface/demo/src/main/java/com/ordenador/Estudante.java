package main.java.com.ordenador;

import java.util.Arrays;

public class Estudante {
    private String nome;
    private String sobrenome;
    private int idade;
    private double[] notas;
    private float frequencia;

    public Estudante(String nome, String sobrenome, int idade, double[] notas, float frequencia) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.notas = notas;
        this.frequencia = frequencia;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNotas() {
        return notas;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Estudante [nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + ", notas="
                + Arrays.toString(notas) + ", frequencia=" + frequencia + "]";
    }
}
package main.java.com.ordenador;
import java.util.Comparator;

public class EstudantePorNotasComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante e1, Estudante e2) {
        double somaNotasE1 = calcularSomaNotas(e1);
        double somaNotasE2 = calcularSomaNotas(e2);
        return Double.compare(somaNotasE1, somaNotasE2);
    }

    private double calcularSomaNotas(Estudante estudante) {
        double[] notas = estudante.getNotas();
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma;
    }
}
package main.java.com.ordenador;
import java.util.Comparator;

public class EstudantePorFrequenciaComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante e1, Estudante e2) {
        return Float.compare(e1.getFrequencia(), e2.getFrequencia());
    }
}
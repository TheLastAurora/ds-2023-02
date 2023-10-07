package main.java.com.ordenador;
import java.util.Comparator;

public class EstudantePorIdadeComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante e1, Estudante e2) {
        return Integer.compare(e1.getIdade(), e2.getIdade());
    }
}

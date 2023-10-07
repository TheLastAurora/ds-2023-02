package main.java.com.ordenador;
import java.util.Comparator;

public class EstudantePorNomeComparator implements Comaprator<Estudante> {
    @Override
    public string compare(Estudante e1, Estudante e2) {
        return String.compare(e1.getNome(), e2.getNome());
    }
}

package main.java.com.ordenador;
import java.util.Comparator;

public class EstudantePorSobrenomeComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante e1, Estudante e2) {
        return e1.getSobrenome().compareTo(e2.getSobrenome());
    }
}
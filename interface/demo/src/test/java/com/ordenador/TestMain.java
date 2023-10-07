package com.ordenador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.ordenador.Estudante;
import main.java.com.ordenador.EstudantePorFrequenciaComparator;
import main.java.com.ordenador.EstudantePorIdadeComparator;
import main.java.com.ordenador.EstudantePorNomeComparator;
import main.java.com.ordenador.EstudantePorNotasComparator;
import main.java.com.ordenador.EstudantePorSobrenomeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMain {

    private List<Estudante> estudantes;

    @BeforeEach
    void estudantesSetup() {
        estudantes = new ArrayList<>();
        seedList(estudantes);
    }

    @Test
    void testOrdenarPorIdade() {
        Collections.sort(estudantes, new EstudantePorIdadeComparator());
        assertEquals("Pedro", estudantes.get(0).getNome());
        assertEquals("João", estudantes.get(1).getNome());
        assertEquals("Ana", estudantes.get(2).getNome());
        assertEquals("Maria", estudantes.get(3).getNome());
        assertEquals("Mariana", estudantes.get(4).getNome());
    }

    @Test
    void testOrdenarPorNome() {
        Collections.sort(estudantes, new EstudantePorNomeComparator());
        assertEquals("Ana", estudantes.get(0).getNome());
        assertEquals("João", estudantes.get(1).getNome());
        assertEquals("Mariana", estudantes.get(2).getNome());
        assertEquals("Maria", estudantes.get(3).getNome());
        assertEquals("Pedro", estudantes.get(4).getNome());
    }

    @Test
    void testOrdenarPorSobrenome() {
        Collections.sort(estudantes, new EstudantePorSobrenomeComparator());
        assertEquals("Maria", estudantes.get(0).getNome());
        assertEquals("Pedro", estudantes.get(1).getNome());
        assertEquals("João", estudantes.get(2).getNome());
        assertEquals("Ana", estudantes.get(3).getNome());
        assertEquals("Mariana", estudantes.get(4).getNome());
    }

    @Test
    void testOrdenarPorNotas() {
        Collections.sort(estudantes, new EstudantePorNotasComparator());
        assertEquals("Pedro", estudantes.get(0).getNome());
        assertEquals("João", estudantes.get(1).getNome());
        assertEquals("Maria", estudantes.get(2).getNome());
        assertEquals("Mariana", estudantes.get(3).getNome());
        assertEquals("Ana", estudantes.get(4).getNome());
    }

    @Test
    void testOrdenarPorFrequencia() {
        Collections.sort(estudantes, new EstudantePorFrequenciaComparator());
        assertEquals("Pedro", estudantes.get(0).getNome());
        assertEquals("Mariana", estudantes.get(1).getNome());
        assertEquals("João", estudantes.get(2).getNome());
        assertEquals("Ana", estudantes.get(3).getNome());
        assertEquals("Maria", estudantes.get(4).getNome());
    }

    public static void seedList(List<Estudante> list) {
        list.add(new Estudante("João", "Silva", 20, new double[] { 8.5, 7.2, 9.0 }, 0.90f));
        list.add(new Estudante("Maria", "Santos", 22, new double[] { 7.0, 7.5, 8.0 }, 0.85f));
        list.add(new Estudante("Pedro", "Ferreira", 19, new double[] { 9.5, 8.0, 7.5 }, 0.92f));
        list.add(new Estudante("Ana", "Oliveira", 21, new double[] { 8.0, 8.5, 7.2 }, 0.88f));
        list.add(new Estudante("Mariana", "Lima", 23, new double[] { 7.8, 8.2, 8.5 }, 0.91f));
    }
}

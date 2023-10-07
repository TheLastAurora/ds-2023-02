package com.ordenador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}

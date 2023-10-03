package com.newton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteNewton {

    @Test
    public void testeRaizQuadrada() {
        assertEquals(3.0, AproximacaoNewtoniana.raizQuadrada(9.0, 0.0001, 100), 0.0001);
        assertEquals(5.0, AproximacaoNewtoniana.raizQuadrada(25.0, 0.0001, 100), 0.0001);
        assertEquals(12.0, AproximacaoNewtoniana.raizQuadrada(144.0, 0.0001, 100), 0.0001);
    }
}

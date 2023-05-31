package org.example.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    @Test
    void deveCalcularExpressaoComFormula() {
        Usuario usuario = new Usuario();
        usuario.setValorAluguel(700.0);
        usuario.setIndice(0.05);

        assertEquals(735.0, usuario.calcularReajuste());
    }
}
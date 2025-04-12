package ordenacao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import interfaces.Busca_IF;

public class Busca_Test {

    private final int[] numerosOrdenados = {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
    };

    private final Busca_IF busca = new Busca();

    // Testando com valor encontrado...

    @Test
    public void testBuscaLinearIterativa() throws Exception {
        assertTrue(busca.buscaLinearIterativa(numerosOrdenados, 10));
    }

    @Test
    public void testBuscaLinearRecursiva() throws Exception {
        assertTrue(busca.buscaLinearRecursiva(numerosOrdenados, 10, 0));
    }

    @Test
    public void testBuscaBinariaIterativa() throws Exception {
        assertTrue(busca.buscaBinariaIterativa(numerosOrdenados, 10));
    }

    @Test
    public void testBuscaBinariaRecursiva() throws Exception {
        assertTrue(busca.buscaBinariaRecursiva(numerosOrdenados, 10, 0, numerosOrdenados.length - 1));
    }

    @Test
    public void testBuscaLinearDuasPontas() throws Exception {
        assertTrue(busca.buscaLinearDuasPontas(numerosOrdenados, 10));
    }

    // Testando com valor inexistente...

    @Test
    public void testBuscaLinearIterativa_valorInexistente() throws Exception {
        assertFalse(busca.buscaLinearIterativa(numerosOrdenados, -1));
    }

    @Test
    public void testBuscaLinearRecursiva_valorInexistente() throws Exception {
        assertFalse(busca.buscaLinearRecursiva(numerosOrdenados, -1, 0));
    }

    @Test
    public void testBuscaBinariaIterativa_valorInexistente() throws Exception {
        assertFalse(busca.buscaBinariaIterativa(numerosOrdenados, -1));
    }

    @Test
    public void testBuscaBinariaRecursiva_valorInexistente() throws Exception {
        assertFalse(busca.buscaBinariaRecursiva(numerosOrdenados, -1, 0, numerosOrdenados.length - 1));
    }

    @Test
    public void testBuscaLinearDuasPontas_valorInexistente() throws Exception {
        assertFalse(busca.buscaLinearDuasPontas(numerosOrdenados, -1));
    }
}

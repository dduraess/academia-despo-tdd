package br.gov.serpro;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class TestaPlacar {

    private Placar placar;
    private ArmazenamentoMock ar;

    @Before
    public void inicia(){
        ar = new ArmazenamentoMock();
        placar = new Placar(ar);
    }

    @Test
    public void testaPontosCompetidorTipoEstrela() {
        ar.armazenarPontosCompetidor("Guerra", "estrela", 10);
        assertEquals("{estrela=10}", placar.exibirPontosCompetidorPorTipo("Guerra", "estrela"));

    }
}

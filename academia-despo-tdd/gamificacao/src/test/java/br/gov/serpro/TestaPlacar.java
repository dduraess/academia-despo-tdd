package br.gov.serpro;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class TestaPlacar {

    private Placar placar;

    @Before
    public void inicia(){
        placar = new Placar(new ArmazenamentoMock("Guerra", TipoPonto.ESTRELA, 10));
    }

    @Test
    public void testaPlacarPontosTipoEstrela() {
        assertEquals("O usuário Guerra recebeu 10 pontos do tipo estrela", placar.exibirPlacar());
    }
}

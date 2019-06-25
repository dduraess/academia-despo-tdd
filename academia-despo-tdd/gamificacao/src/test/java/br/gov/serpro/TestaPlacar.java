package br.gov.serpro;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Unit test for simple App.
 */
public class TestaPlacar {

    private Placar placar;
    private ArmazenamentoMock armazena;

    @Before
    public void inicia(){
        armazena = new ArmazenamentoMock();
        placar = new Placar(armazena);
    }

    @Test
    public void testaPontosUsuarioApenasUmTipo() {
        placar.registrarPontosUsuarioPorTipo("Guerra", TipoPonto.ESTRELA, 10);
        assertEquals("{ESTRELA=10}", placar.retornarPontuacaoGeralUsuario("Guerra"));

    }

    @Test
    public void testaGravacaoArquivoDepoisFinalizarPrimeiraAtribuicaoPontos() {
        assertEquals("{ESTRELA=10}", placar.retornarPontuacaoGeralUsuario("Guerra"));
    }

//    @Test
//    public void testaGravacao() {
//
//    }
}

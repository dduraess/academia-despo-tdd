package br.gov.serpro;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        placar.registrarPontosUsuarioPorTipo("Guerra", "estrela", 10);
        assertEquals("{estrela=10}", placar.retornarPontuacaoGeralUsuario("Guerra"));

    }

    @Test
    @Ignore
    public void testaGravacao(){

    }
}

package br.gov.serpro;

import java.util.Map;

/**
 * Created by 27352403809 on 12/06/19.
 */
public class Placar {

    private Armazenamento armazena;

    public Placar(Armazenamento armazena){
        this.armazena = armazena;
    }

    public void registrarPontosUsuarioPorTipo(String nome, TipoPonto tipoPonto, Integer i) {
        armazena.armazenarPontosCompetidor(nome, tipoPonto, i);
    }

    public String retornarPontuacaoGeralUsuario(String nome) {
        Map<TipoPonto, Integer> pontosCompetidor = armazena.recuperarPontosCompetidor(nome);
        return pontosCompetidor.toString();
    }
}

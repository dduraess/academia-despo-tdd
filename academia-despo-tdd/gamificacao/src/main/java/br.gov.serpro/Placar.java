package br.gov.serpro;

import java.util.Map;

/**
 * Created by 27352403809 on 12/06/19.
 */
public class Placar {

    private Armazenamento ar;

    public Placar(Armazenamento ar){
        this.ar = ar;
    }

    public String exibirPontosCompetidorPorTipo(String nome, String tipoPonto) {
        Map<String, Integer> pontosCompetidorPorTipo = ar.recuperarPontosCompetidor(nome, tipoPonto);
        return pontosCompetidorPorTipo.toString();
    }
}

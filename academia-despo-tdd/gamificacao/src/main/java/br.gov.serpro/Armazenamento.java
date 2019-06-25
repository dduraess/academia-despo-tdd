package br.gov.serpro;

import java.util.Map;

/**
 * Created by 27352403809 on 12/06/19.
 */
public interface Armazenamento {

    void armazenarPontosCompetidor(String nome, TipoPonto tipoPonto, Integer i);
    Map<TipoPonto, Integer> recuperarPontosCompetidor(String nome);
}

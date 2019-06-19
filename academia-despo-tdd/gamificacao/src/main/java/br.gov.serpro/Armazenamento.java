package br.gov.serpro;

import java.util.Map;

/**
 * Created by 27352403809 on 12/06/19.
 */
public interface Armazenamento {

    void armazenarPontosCompetidor(String nome, String tipoPonto, Integer i);
    Map<String, Integer> recuperarPontosCompetidor(String nome, String tipoPonto);
}

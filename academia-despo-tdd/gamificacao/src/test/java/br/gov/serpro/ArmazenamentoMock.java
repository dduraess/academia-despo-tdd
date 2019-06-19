package br.gov.serpro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by 27352403809 on 12/06/19.
 */
public class ArmazenamentoMock implements Armazenamento{

    private List<Competidor> competidores;

    @Override
    public void armazenarPontosCompetidor(String nome, String tipoPonto, Integer i) {
        competidores = new ArrayList<>();
        competidores.add(new Competidor(nome, tipoPonto, i));
    }

    @Override
    public Map<String, Integer> recuperarPontosCompetidor(String nome, String tipoPonto) {
        for (Competidor competidor:competidores) {
            if (competidor.getNome() == nome && !competidor.getPontuacao(tipoPonto).isEmpty()) {
                return competidor.getPontuacao(tipoPonto);
            }
        } throw new RuntimeException("Competidor não participou ou não tem esse tipo de ponto");
    }

}

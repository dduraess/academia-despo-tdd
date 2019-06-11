package br.gov.serpro;

import java.util.Map;

/**
 * Created by 27352403809 on 10/06/19.
 */
public class ArmazenamentoMock implements Armazenamento{

    private Map<TipoPonto, Integer> score;
    private String nomeCompetidor;

    public ArmazenamentoMock(String nomeCompetidor, TipoPonto tipoPonto, Integer pontos){
        score.put(tipoPonto, pontos);
        this.nomeCompetidor = nomeCompetidor;
    }

    public String computarScore(){
        return "O usuário " + nomeCompetidor + " recebeu " + score.entrySet().toString() + " pontos do tipo estrela";
    }

}

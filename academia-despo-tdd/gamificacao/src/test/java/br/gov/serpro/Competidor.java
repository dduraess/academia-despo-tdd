package br.gov.serpro;

import java.util.HashMap;
import java.util.Map;

public class Competidor implements Comparable<Competidor> {

    private String nome;
    private Map<String, Integer> pontuacao;

    public Competidor(String nome, String tipoPonto, Integer pontos){
        this.nome = nome;
        pontuacao = new HashMap<>();
        pontuacao.put(tipoPonto,pontos);
    }

    @Override
    public int compareTo(Competidor o) {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public Map<String, Integer> getPontuacao(String tipoPonto) {
        return pontuacao;
    }
}

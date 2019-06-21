package br.gov.serpro;

import java.util.HashMap;
import java.util.Map;

public class Usuario implements Comparable<Usuario> {

    private String nome;
    private Map<String, Integer> pontuacao;

    public Usuario(String nome, String tipoPonto, Integer pontos){
        this.nome = nome;
        pontuacao = new HashMap<>();
        pontuacao.put(tipoPonto,pontos);
    }

    @Override
    public int compareTo(Usuario o) {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public Map<String, Integer> getPontuacao() {
        return pontuacao;
    }
}

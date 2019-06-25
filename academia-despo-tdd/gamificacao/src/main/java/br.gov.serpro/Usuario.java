package br.gov.serpro;

import java.util.HashMap;
import java.util.Map;

public class Usuario implements Comparable<Usuario> {

    private String nome;

    private Map<TipoPonto, Integer> pontuacao;

    public Usuario(String nome){
        this.nome = nome;
        pontuacao = new HashMap<>();
        pontuacao.put(TipoPonto.MOEDA, 0);
        pontuacao.put(TipoPonto.ESTRELA, 0);
        pontuacao.put(TipoPonto.TOPICO, 0);
        pontuacao.put(TipoPonto.COMENTARIO, 0);
        pontuacao.put(TipoPonto.CURTIDA, 0);
    }

    @Override
    public int compareTo(Usuario o) {
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public Map<TipoPonto, Integer> getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Map<TipoPonto, Integer> pontuacao) {
        this.pontuacao = pontuacao;
    }
}

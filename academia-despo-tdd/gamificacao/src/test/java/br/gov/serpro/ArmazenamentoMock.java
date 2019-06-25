package br.gov.serpro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by 27352403809 on 12/06/19.
 */
public class ArmazenamentoMock implements Armazenamento{

    private List<Usuario> usuarios;

    public ArmazenamentoMock (){
        usuarios = new ArrayList<>();
    }

    @Override
    public void armazenarPontosCompetidor(String nome, TipoPonto tipoPonto, Integer i) {
        Usuario usuario = new Usuario(nome);
        usuarios.add(usuario);
        gravarPontosNoArquivo(usuario);
    }

    private void gravarPontosNoArquivo(Usuario usuario) {


    }

    @Override
    public Map<TipoPonto, Integer> recuperarPontosCompetidor(String nome) {

        Scanner leituraLinhaComSeparador = null;
        leituraLinhaComSeparador.useDelimiter(";");
        try {
            FileReader arquivo = new FileReader("scores");
            BufferedReader leitura = new BufferedReader(arquivo);
            while (leitura.readLine() != null) {
                leituraLinhaComSeparador = new Scanner(leitura.readLine());
                if (leituraLinhaComSeparador.next() == nome) {
                    return atribuirPontosLidos(leituraLinhaComSeparador);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (leituraLinhaComSeparador != null) leituraLinhaComSeparador.close();
        }

        Usuario usuario = new Usuario(nome);
        return usuario.getPontuacao();
    }

    private Map<TipoPonto, Integer>  atribuirPontosLidos(Scanner leituraLinhaComSeparador) {
        Usuario usuario = new Usuario(leituraLinhaComSeparador.next());
        List<String> listaPontuacaoUsuario = new ArrayList<>();
        while (leituraLinhaComSeparador.hasNext()) {
            listaPontuacaoUsuario.add(leituraLinhaComSeparador.next());
        }

        Map<TipoPonto, Integer> pontuacao = new HashMap<>();
        pontuacao.put(TipoPonto.MOEDA, Integer.parseInt(listaPontuacaoUsuario.get(1)));
        pontuacao.put(TipoPonto.ESTRELA, Integer.parseInt(listaPontuacaoUsuario.get(2)));
        pontuacao.put(TipoPonto.TOPICO, Integer.parseInt(listaPontuacaoUsuario.get(3)));
        pontuacao.put(TipoPonto.COMENTARIO, Integer.parseInt(listaPontuacaoUsuario.get(4)));
        pontuacao.put(TipoPonto.CURTIDA, Integer.parseInt(listaPontuacaoUsuario.get(5)));

        return  pontuacao;

    }

}

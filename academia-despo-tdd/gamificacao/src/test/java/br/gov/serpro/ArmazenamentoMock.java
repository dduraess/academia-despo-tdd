package br.gov.serpro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by 27352403809 on 12/06/19.
 */
public class ArmazenamentoMock implements Armazenamento{

    private List<Usuario> usuarios;

    public ArmazenamentoMock (){
        usuarios = new ArrayList<>();
    }

    @Override
    public void armazenarPontosCompetidor(String nome, String tipoPonto, Integer i) {
        Usuario usuario = new Usuario(nome, tipoPonto, i);
        usuarios.add(usuario);
        gravarPontosArquivo(usuario);
    }

    private void gravarPontosArquivo(Usuario usuario) {

    }

    @Override
    public Map<String, Integer> recuperarPontosCompetidor(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome() == nome) {
                return usuario.getPontuacao();
            }
        } throw new RuntimeException("Usuário não pontuou");
    }

}

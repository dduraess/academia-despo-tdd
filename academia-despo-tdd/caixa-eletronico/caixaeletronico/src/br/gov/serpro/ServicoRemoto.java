package br.gov.serpro;

import br.gov.serpro.CaixaEletronico.Operacao;

public interface ServicoRemoto {
	
	ContaCorrente recuperarConta(String conta);
	void persistirConta(ContaCorrente cc, Operacao op, Double valor);

}

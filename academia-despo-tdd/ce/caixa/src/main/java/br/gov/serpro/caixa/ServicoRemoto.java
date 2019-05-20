package br.gov.serpro.caixa;

import br.gov.serpro.caixa.CaixaEletronico.Operacao;

public interface ServicoRemoto {
	
	ContaCorrente recuperarConta(String conta);
	void persistirConta(ContaCorrente cc, Operacao op, Double valor);

}

package br.gov.serpro;

public class CaixaEletronico {
	
	private Hardware hw;
	private ServicoRemoto sr;
	private ContaCorrente cc;

	public CaixaEletronico(Hardware hw, ServicoRemoto sr) {
		this.hw = hw;
		this.sr = sr;
	}

	public String logar() {
		try {
			hw.pegarNumeroDaContaCartao();
			return "Usuário autenticado";
		} catch (RuntimeException e) {
			return "Não foi possível autenticar o usuário";
		}
	}

	public String sacar(Double valor) {
		iniciaContaLogada();
		try {
			sr.persistirConta(cc, Operacao.SAQUE, valor);
			hw.entregarDinheiro();
			return "Retire seu dinheiro";
		} catch (RuntimeException e) {
			return "Saldo insuficiente";
		}
	}

	private void iniciaContaLogada() {
		try {
			this.cc = sr.recuperarConta(hw.pegarNumeroDaContaCartao());
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
	enum Operacao {
		SAQUE, DEPOSITO
	}

}

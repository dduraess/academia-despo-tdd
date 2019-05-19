package br.gov.serpro;

public class ContaCorrente {
	
	private Double saldo=0.00;
	private static final Double LIMITE=500.00;

	public Double getSaldo() {
		return saldo+LIMITE;
	}

	public void sacar(Double valor) {
		this.saldo = saldo - valor;
	}
	
}

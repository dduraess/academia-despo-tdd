/**
 * 
 */
package br.gov.serpro;

/**
 * @author davison
 *
 */
public class HardwareMock implements Hardware {
	
	public boolean validadoNoHardware=false;
	private String contaLida;

	public HardwareMock(String leitura) {
		this.contaLida=leitura;
	}

	/* (non-Javadoc)
	 * @see br.gov.serpro.Hardware#pegarNumeroDaContaCartao()
	 */
	@Override
	public String pegarNumeroDaContaCartao() {
		validadoNoHardware = true;
		if (contaLida.equals("Erro!")) {
			throw new RuntimeException();
		} return contaLida;
	}

	@Override
	public void entregarDinheiro() {
		validadoNoHardware = true;
	}

}

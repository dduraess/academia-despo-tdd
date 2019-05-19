package br.gov.serpro;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CaixaEletronicoTest {
	
	private HardwareMock hardwareMock;
	private ServicoRemotoMock servicoRemotoMock;
	private CaixaEletronico caixaEletronico;
	
	@Before
	public void setUp() {
		servicoRemotoMock = new ServicoRemotoMock();
	}

	@Test
	public void testeLogarSucesso() {
		hardwareMock = new HardwareMock("1234-5");
		caixaEletronico = new CaixaEletronico(hardwareMock, servicoRemotoMock);
		assertEquals("Usuário autenticado", caixaEletronico.logar());
		assertTrue(hardwareMock.validadoNoHardware);
	}

	@Test
	public void testeLoginFalhou() {
		hardwareMock = new HardwareMock("Erro!");
		caixaEletronico = new CaixaEletronico(hardwareMock, servicoRemotoMock);
		assertEquals("Não foi possível autenticar o usuário", caixaEletronico.logar());
		assertTrue(hardwareMock.validadoNoHardware);
	}

	@Test
	public void testeSacarComSucesso() {
		hardwareMock = new HardwareMock("1234-5");
		caixaEletronico = new CaixaEletronico(hardwareMock, servicoRemotoMock);
		assertEquals("Retire seu dinheiro", caixaEletronico.sacar(100.00));
		assertTrue(servicoRemotoMock.persistiuConta);
		assertTrue(hardwareMock.validadoNoHardware);
	}

}

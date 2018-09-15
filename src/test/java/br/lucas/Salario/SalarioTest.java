package br.lucas.Salario;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class SalarioTest {
	
	private Salario salarioFuncionario;
	private CalculaSalario calculaSalario;

	@Before
	public void init() {
		salarioFuncionario = new Salario(160, 150.00, 3);
		calculaSalario = new CalculaSalario(salarioFuncionario);		
	}
	
	@Test
	public void testarSalarioBruto() {
		calculaSalario.calculaSalarioBruto();
		assertEquals(24150, calculaSalario.getSalarioBruto(), 0.001);
	}
	
	@Test
	public void testarDescontoINSS() {
		calculaSalario.calculaDescontoINSS();
		assertEquals(2173.50, calculaSalario.getDescontoINSS(), 0.001);		
	}
	
	@Test
	public void testarDescontoIR() {
		calculaSalario.calculaDescontoIR();
		assertEquals(1690.50, calculaSalario.getImpostoRenda(), 0.001);	
	}
	
	@Test
	public void testarSalarioLiquido() {
		calculaSalario.calculaSalarioLiquido();
		assertEquals(20286, calculaSalario.getSalarioLiquido(), 0.001);		
	}
}
	

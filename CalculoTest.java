import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculoTest {
	@Test
	void testExecutaCalculo() {
		float passaValor1 = 10;
		float passaValor2 = 5;
		float retornoEsperado = 15;
		
		Calculo c = new Calculo();
		float retornoFeito = c.soma(passaValor1,  passaValor2);
		assertEquals(retornoEsperado, retornoFeito);
	}
}

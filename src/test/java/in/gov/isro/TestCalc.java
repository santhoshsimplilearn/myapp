package in.gov.isro;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int result = calc.add(5, 5);
		assertEquals(10, result);
	}
	
	@Test
	public void testMul()
	{
		Calculator calc = new Calculator();
		int prod = calc.mul(5, 5);
		assertEquals(25,prod);
	}

}

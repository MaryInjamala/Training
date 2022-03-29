
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator calculator;
	
	@Before //Add this annotation to run this method before every test case.
	public void init() {
		 calculator = new Calculator(); //Arrange
	}
	
	@Test
	public void testSubtract() {
		int result = calculator.subtract(3, 3);
		assertEquals(0, result);
		
	}
	
	@Test
	public void testMul() {
		int result = calculator.mul(3, 3);
		assertEquals(9, result);
		
	}
	
	@Test
	public void testDiv() {
		float result = calculator.div(10, 5);
		assertEquals(2.0, result, 1);
		
	}
	
	@Test
	public void testDivideWithZero() {
		float result = calculator.div(10, 0);
		assertEquals(Double.POSITIVE_INFINITY, result, 1);
	}
	
	@Test
	public void testAdd() {
//		A-arrange, A-Act, A-assert
		
		int result = calculator.add(1, 2);//Act
		assertEquals(3, result); //Assert
	}
	@Test
	public void testAddwithZero() {
		int result = calculator.add(0, 2);
		assertEquals(2, result);
	}

}


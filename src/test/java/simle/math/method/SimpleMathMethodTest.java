package simle.math.method;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SimpleMathMethodTest {
	
	private static int a;
	private static int b;
	
	
	 @BeforeAll
	 static void setup() {
		 a = 17;
		 b = 5;
	 }

	 @Test
	 @DisplayName("testing sum of values")
	 void sumTest() {
	     int sum = SimpleMathMethod.sum(a, b);
	     assertEquals(22, sum);
	 }
	 
	 @Test
	 @DisplayName("testing subtraction of values")
	 void subtractionTest() {
	     int subtraction = SimpleMathMethod.subtraction(a, b);
	     assertEquals(12, subtraction);
	 }
	 
	 @Test
	 @DisplayName("testing multiplication of values")
	 void multiplicationTest() {
	     int multiplication = SimpleMathMethod.multiplication(a, b);
	     assertEquals(85, multiplication);
	 }
	 
	 @Test
	 @DisplayName("testing division of values")
	 void divisionTest() {
	     int division = SimpleMathMethod.division(a, b);
	     assertEquals(3, division);
	 }
}

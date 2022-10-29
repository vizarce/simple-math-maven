package simle.math.method;

public class SimpleMathMethod {
	
	
	public static int sum(int a, int b) {
		  return a + b;
	}
	
	public static int subtraction(int a, int b) {
		  return a - b;
	}
	
	public static int multiplication(int a, int b) {
		  return a * b;
	}
	
	public static int division(int a, int b) {
		  return a / b;
	}
	
	public static void main(String[] args) {
    System.out.println("Hello from Simple Java Math Methods!");
    int a = 17;
    int b = 5;
    System.out.println("a + b = " + sum(a, b));
    System.out.println("a - b = " + subtraction(a, b));
    System.out.println("a * b = " + multiplication(a, b));
    System.out.println("a + b = " + division(a, b));
  }
}

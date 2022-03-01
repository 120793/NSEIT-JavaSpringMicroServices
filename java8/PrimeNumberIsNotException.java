package corejavaexamples.java8;

public class PrimeNumberIsNotException extends RuntimeException {
	public PrimeNumberIsNotException() {
		System.out.println("The given number is not prime");
	}
}

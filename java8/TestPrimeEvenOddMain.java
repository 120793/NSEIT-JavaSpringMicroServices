package corejavaexamples.java8;

import java.util.Scanner;

public class TestPrimeEvenOddMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPrimeEvenOdd p = new TestPrimeEvenOdd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		try {
			p.checkPrime(num);

		} catch (PrimeNumberIsNotException e) {
			System.out.println("PrimeNumberIsNotException");
		}
		catch (EvenOddException e) {
			System.out.println("evenOddException");
	}

   }
}

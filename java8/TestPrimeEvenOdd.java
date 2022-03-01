package corejavaexamples.java8;

public class TestPrimeEvenOdd {

	int num, i;
	int count = 0;

	public void checkPrime(int num) {

		for (i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("the number is prime");
		} 
		else  {
			System.out.println("the number is not prime");
			throw new PrimeNumberIsNotException();
		}
		 if(num%2!=0) {
			System.out.println("the number is odd");
			//throw new EvenOddException();
			}
		else {
			System.out.println("the number is ewen");
            throw new EvenOddException();
		}

	}
	

}

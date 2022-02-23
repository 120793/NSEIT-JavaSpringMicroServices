package corejavaexamples;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, count=0,i;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the number");
	      num=sc.nextInt();
	      for(i=2;i<=num-1;i++) {
	    	  if(num%i==0) {
	    		  count++;
	    		  break;
	    	  }
	      }
	      if(count==0) {
		      System.out.println("Number is prime");
        }
	      else {
		      System.out.println("Number is not prime");

	      }
	}

}

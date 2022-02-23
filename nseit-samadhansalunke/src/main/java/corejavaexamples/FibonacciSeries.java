package corejavaexamples;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num,series1=-1,series2=1,nextnumber;
       System.out.println("enter the number");
       Scanner sc=new Scanner(System.in);
	      num=sc.nextInt();
	      nextnumber=series1+series2;
	      while(nextnumber<=num) {
	    	  System.out.println(nextnumber+"");
	    	  series1=series2;
	    	  series2=nextnumber;
	    	  nextnumber=series1 + series2;
	      }
	}

}

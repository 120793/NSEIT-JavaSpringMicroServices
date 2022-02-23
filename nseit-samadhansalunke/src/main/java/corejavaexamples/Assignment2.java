package corejavaexamples;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no, i,sum=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		 no=sc.nextInt();
		 
		for(i=0;i<=no;i++) {
			if(i%2==1) {
                System.out.println(""+i);
				sum=sum+i;
				}
		}
		System.out.println("Sum of all Odd Number is "+sum);

	       
	}
}



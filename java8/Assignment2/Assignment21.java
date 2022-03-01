/* Program to remove spaces present in the given String by using 
Function*/
package corejavaexamples.java8.Assignment2;

import java.util.Scanner;
import java.util.function.Function;

public class Assignment21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the String");
	      String s=sc.nextLine();
	      System.out.println("The given string is "+s);
	      
	      Function<String,String> f =str1->str1.replaceAll(" ", "");
	      System.out.println("After removing space String is: "+f.apply(s));
	        
	}

}

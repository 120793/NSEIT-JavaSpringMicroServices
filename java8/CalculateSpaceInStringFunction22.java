package corejavaexamples.java8;

import java.util.Scanner;
import java.util.function.Function;

public class CalculateSpaceInStringFunction22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the String");
	      String s=sc.nextLine();
	      System.out.println("The given string is "+s);
	      
	      Function<String,Integer> f =str1->str1.length()-str1.replaceAll(" ", "").length();
	      System.out.println("Total number of spaces in String is: "+f.apply(s));
	  }
}

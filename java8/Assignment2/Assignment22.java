/*2. Program to find Number of spaces present in the given String by 
using Function*/

package corejavaexamples.java8.Assignment2;

import java.util.Scanner;
import java.util.function.Function;

public class Assignment22 {

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

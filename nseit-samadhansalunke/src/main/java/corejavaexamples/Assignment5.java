package corejavaexamples;
import java.util.*;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(sumOfFibonacci(n-1));
}
   private static int sumOfFibonacci(int n) {
	  if(n<=0)
		  return 0;
	  if(n==1)
		  return 1;
	  return sumOfFibonacci(n-1)+sumOfFibonacci(n-2)+1;
	   }
   }


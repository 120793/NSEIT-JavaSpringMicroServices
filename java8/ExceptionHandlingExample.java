package corejavaexamples.java8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingExample {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
      int a=100,b=2,c;
      int ar[]= {1,2,3};
      try {
    	  System.out.println("Inside the try block.");
    	  System.out.println(ar[4]);

    	  c=a/b;
    	  System.out.println(c);
    	  System.out.println("After c value..");
      }
      catch(ArithmeticException e){
    	
    	  System.out.println("Inside the Array index catch block");
    	 
      }
      catch(ArrayIndexOutOfBoundsException e){
    	  System.out.println("Inside the Arithmetic  catch block");

      }
      finally {
    	  System.out.println("Inside the finally block");

      }
	  System.out.println("After the finally block");

      
	}

}

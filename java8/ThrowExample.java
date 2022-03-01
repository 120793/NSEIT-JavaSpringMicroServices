package corejavaexamples.java8;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  int a=100,b=20;
    	  System.out.println("Inside the try block..");
    	  if(a<b)
    		 throw new ArrayIndexOutOfBoundsException();
    	  else
     		 throw new NullPointerException();
    	  }
      catch(ArrayIndexOutOfBoundsException e) {
    	  System.out.println("Inside the ArrayIndexOutOfBoundsException block..");

      }
      catch(NullPointerException e) {
    	  System.out.println("Inside the NullPointerException block..");

      }
      finally {
    	  System.out.println("Inside the finally block..");

      }
	}

}

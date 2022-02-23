package corejavaexamples;

public class Overloading {
	public void test(int x,int y) {
		System.out.println("inside two int variable method..");
	    }
	  
	    public int test(int x) {
	    	System.out.println("inside one int variable method..");
	    	return 0;
	        }
	    public String test(int x,int y,int z) {
	    	System.out.println("inside three int variable method..");
	    	return null;
	        }
	    public void test(int x,char c) {
	    	System.out.println("inside one int & one char variable method..");
	        }

}

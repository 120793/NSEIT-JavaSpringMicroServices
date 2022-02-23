package corejavaexamples;

public class TestStaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample.org="NSEI Technologies Ltd";
		StaticExample t1= new StaticExample("kumar","IT");
		StaticExample t2= new StaticExample("pawan","QA");
		StaticExample t3= new StaticExample("sunil","Finance");
	     t1.showData();
	     t2.showData();
	     t3.showData();
	    
	     t2.org="NSEIT";
	     t1.showData();
	     t2.showData();
	     t3.showData();
	     StaticExample.shoeDetails();
	}

}

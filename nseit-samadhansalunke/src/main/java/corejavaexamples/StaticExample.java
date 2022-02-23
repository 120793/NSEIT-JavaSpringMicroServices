package corejavaexamples;

public class StaticExample {
	String name;
	  String dept;
	  static String org;
	  
	  public StaticExample(String name,String dept)
	  {
		  System.out.println("Inside the constructor...");
		  this.name=name;
		  this.dept=dept;
	  }
	  
	  public void showData() {
		  System.out.println("Name:"+name+" "+"dept: "+dept+" "+"org: "+org);
		  }
	  public static void shoeDetails() {
		  System.out.println("org: "+org);

	  }
	  static {
		  System.out.println("Inside the static block...");
	   }
	  {
		  System.out.println("Inside the non static block...");
	  }

}

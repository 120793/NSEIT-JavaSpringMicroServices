package corejavaexamples;

public class ThisExample {
   String name;
   String location;
   
   public ThisExample(String name, String location) {
	   System.out.println("Inside the parameterise constructor");
	   showDatails();
	   this.name=name;
	   this.location=location;
   }
   public ThisExample() {
	   this("kish","mum");
	   System.out.println("Inside the default constructor");
	   
	   name="Anil";
	   location="Pune";
	   }
  
public void showDatails() {
	// TODO Auto-generated method stub
	System.out.println("Name: "+name+" "+"location: "+location);
  }
}

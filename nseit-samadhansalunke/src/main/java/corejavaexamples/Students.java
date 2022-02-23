package corejavaexamples;

public class Students {
	 int htno;
     String name;
     String branch;
     
     Students(){
   	  System.out.println("Inside the default constructor");
   	  name ="Anil";
   	  branch="ECE";
     }
     
     Students(String n, String b){
   	  System.out.println("Inside the parameterized constructor");
   	  name=n;
   	  branch=b;
       }
     public void getData() {
   	  System.out.println("Inside ge data method");
       }
     public void PritData() {
   	  System.out.println("Name: "+name+" "+"Branch: "+branch);
       }
}

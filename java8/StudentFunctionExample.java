package corejavaexamples.java8;
import java.util.*;
import java.util.function.*;

class Student{
	String name;
	int marks;
	public Student(String name,int marks) {
		super();
		this.name=name;
		this.marks=marks;
	};
}
		
public class StudentFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       Function<Student,String>f=std->{
    	   String result=null;
    	   if(std.marks>80)
    		   result= "Distinction";
    	   else if (std.marks>=60 && std.marks<80)
    		   result= "Firstclass";
    	   else if (std.marks>=50 && std.marks<60)
    		   result ="Second class";
    	   else
    		   return"Fail";
    	   return result;
       };
       System.out.println("Enter name");
       String name=sc.nextLine();
       System.out.println("Enter marks");
       int marks=sc.nextInt();
       
       Student s=new Student(name,marks);
       String result=f.apply(s);
       System.out.println("The Result is: "+result);
   }
}


package corejavaexamples.java8;
import java.util.function.*;

import java.util.*;

class Employee{
	String name;
	String desg;
	int salary;
	public Employee(String employName,String employdesg,int string) {
		super();
		this.name=employName;
		this.desg=employdesg;
		this.salary=salary;
	}
	public void printEmpInfo() {
		System.out.println("Name: "+name+" " + "Desg: "+ desg+" "+ "salary: "+salary);
	}
}

public class EmployeeFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      Function<Employee,Employee> f=emp->{
	    	  if(emp.desg.equals("manager"))
	    		  emp.salary=emp.salary+1000;
	    	  else if(emp.desg.equals("clerk"))
	    		  emp.salary=emp.salary+500;
	    	  return emp;
	      };
	      System.out.println("Enter name");
	      String name=sc.nextLine();
	      System.out.println("Enter designation");
	      String desg=sc.nextLine();
	      System.out.println("Enter salary");
	      int sal=sc.nextInt();
	      Employee temp=new Employee(name,desg,sal);
	      temp.printEmpInfo();
	      Employee e=f.apply(temp);
	      System.out.println("After update...");
	      e.printEmpInfo();
	}

}

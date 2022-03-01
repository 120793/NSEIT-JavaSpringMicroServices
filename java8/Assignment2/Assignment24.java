//4.Progarm to perform Salary Increment for Employees by using 
//Predicate & Function

package corejavaexamples.java8.Assignment2;
import java.util.*;
import java.util.function.*;

class Employee{
	String name;
	double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}
public class Assignment24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Employee> l=new ArrayList();
       populate(l);
       
       System.out.println("Before Increament:");
       System.out.println(l);
       
       Predicate<Employee> p=e->e.salary<3500;
       Function<Employee,Employee> f=e->{
    	   e.salary=e.salary+477;
    	   return e;
       };
       System.out.println("After Implement:");
       ArrayList<Employee> l2= new ArrayList();
       for(Employee e:l) {
    	   if(p.test(e)) {
    		   l2.add(f.apply(e));
    	   }
       }
    System.out.println(l);
    System.out.println("Employee with increamented salary");
    System.out.println(l2);
	}
        public static void populate(ArrayList<Employee> l)
        {
        	l.add(new Employee("Sunny",1000));
        	l.add(new Employee("Bunny",2000));
        	l.add(new Employee("chinny",3000));
        	l.add(new Employee("pinny",4000));
        	l.add(new Employee("Vinny",5000));
        	l.add(new Employee("praveen",10000));
        	}

}

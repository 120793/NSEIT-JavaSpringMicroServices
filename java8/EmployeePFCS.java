package corejavaexamples.java8;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

class Emp{
	   int empid;
	   String empname;
       double salary;
	   
	   
	    public Emp(int empid,String empname,Double salary) {
		   this.empid=empid;
		   this.empname=empname;
		   this.salary=salary;
	   }
        public int getEmpid() {
			return empid;
		}


		public void setEmpid(int empid) {
			this.empid = empid;
		}


		public String getEmpname() {
			return empname;
		}


		public void setEmpname(String empname) {
			this.empname = empname;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Emp [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
		}
	
}
public class EmployeePFCS {
            

          public static  void main(String[] args) {
		// TODO Auto-generated method stub
        	List<Emp> em=new ArrayList();
        	em.add(new Emp(101,"Akash",20000.0));
        	em.add(new Emp(102,"Sanghpal",25000.0));
        	em.add(new Emp(103,"Ygehs",11000.0));
        	System.out.println(em);
            
        	Predicate<Emp> p =i -> i.getEmpid() > 10000;
    		List<Emp> em1 = em.stream().filter(i -> i.getEmpid() > 80).collect(Collectors.toList());
    		em1.forEach(System.out::println);
            
    		


	}

}

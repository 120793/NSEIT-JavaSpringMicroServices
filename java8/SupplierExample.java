package corejavaexamples.java8;
import java.util.function.*;
public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Supplier<Double> s=()->{
    	  return Math.random();  
       };
       System.out.println(s.get());
       System.out.println(s.get());

	}

}

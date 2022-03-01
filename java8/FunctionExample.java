package corejavaexamples.java8;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Double> f=radius->3.141*radius*radius;
	      System.out.println("The area of Circle is"+f.apply(5));
	      
	      Function<Integer,Integer> f1=side->side*side*side;
	      System.out.println("The area of Cube is"+f1.apply(5));

	}

}

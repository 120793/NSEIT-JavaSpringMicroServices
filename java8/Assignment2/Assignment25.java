//5. Write a demo program to demo on predicate chaining.

package corejavaexamples.java8.Assignment2;
import java.util.function.Predicate;
public class Assignment25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Predicate<Integer> greaterThan=num->num>=20;
      Predicate<Integer> lesserThan=num->num<=50;
      
      boolean result=greaterThan.and(lesserThan).test(40);
      System.out.println(result);
	}

}

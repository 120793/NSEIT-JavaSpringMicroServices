package corejavaexamples.java8;
import java.util.function.Predicate;
public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1= n-> n%2==0;
       System.out.println( "Even no: "+p1.test(2));
		Predicate<Integer> p2= n-> n>100;
	    System.out.println( ">100 "+p2.test(110));
	   
        Predicate<String> p3=str->str.length()>5 ;
	    System.out.println( "stringlength >5 "+p3.test("Sam"));

	    System.out.println( "Even no and >100: "+p1.and(p2).test(120));
        
		}

}


//Program to display names starts with 'K' by using Predicate

package corejavaexamples.java8.Assignment2;
import java.util.function.Predicate;
public class StartWithKDisplayPredicateFunctiion {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[] names= {"sam","Kumar","Akash","Kiran",};
        Predicate<String> startwithK=s->s.charAt(0)=='K';
        System.out.println("The names starts with K are");
         for(String s: names)
        {
        	if(startwithK.test(s)) 
        	{
                System.out.println(s);
        	}
        }
	}

}

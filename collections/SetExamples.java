package corejavaexamples.collections;
import java.util.*;
public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<String> hs= new LinkedHashSet();
     hs.add("India");
     hs.add("Japan");
     hs.add("China");
     hs.add("Nepal");
     System.out.println("Elemnts of LinkedHashSet" );
     System.out.println(hs);
     hs.add("India");
     
     Set<String> hs1= new HashSet();
     hs1.add("India");
     hs1.add("Japan");
     hs1.add("China");
     hs1.add("Nepal");
     System.out.println("Elemnts of HashSet" );
     System.out.println(hs1);
     hs.add("India");
     
     Set<String> hs2= new TreeSet();
     hs2.add("India");
     hs2.add("Japan");
     hs2.add("China");
     hs2.add("Nepal");
     System.out.println("Elemnts of TreeSet" );
     System.out.println(hs2);
     hs.add("India");
	}

}

package corejavaexamples.collections;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // ArrayList<String> ar=new ArrayList();
		LinkedList<String> ar=new LinkedList();
      //using add() method
        ar.add("India");
        ar.add("China");
        ar.add("Japan");
        System.out.println(ar);
        
        //using addAll () method
        ArrayList<String> ar1 = new ArrayList();
        ar1.add("America");
        ar1.add("Aus");
       ar.addAll(ar1);
        System.out.println(ar);
        
        //using removeAll() method
         ar.remove("China");
         System.out.println(ar);
         
         //using contains() method
         if(ar.contains("India"))
             System.out.println("India found in the list");
         else
             System.out.println("Not found in the list");

          //using size() method
         System.out.println(ar.size());
         
         //iterator method to traverse the elements from list.
         Iterator itr=ar.iterator();
         // Iterator has two methods hasNext(), next()
           System.out.println("Traversing using iterator");
           while(itr.hasNext())
               System.out.println(itr.next());
           
          //using enhanced for loop
           System.out.println("Traversing using for loop");
           for(String s:ar) {
        	   System.out.println(s);
           }

           //using enhanced forEach
           System.out.println("Traversing using forEach loop");
            ar.forEach(System.out::println);
         }

}

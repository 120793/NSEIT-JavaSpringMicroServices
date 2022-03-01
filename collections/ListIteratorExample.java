package corejavaexamples.collections;
import java.util.*;
import java.util.LinkedList;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<String> ar=new LinkedList();
      
      ar.add("India");
      ar.add("China");
      ar.add("Japan");
      ar.add("Nepal");
      ar.add("Nepal");
      
      System.out.println("List elements in forward directio");
      ListIterator ltr=ar.listIterator();
      while(ltr.hasNext()) 
    	  System.out.println(ltr.next());
    	 
      System.out.println("List element in backword direction");
      while(ltr.hasPrevious()) 
    	  System.out.println(ltr.previous());

      
      
	}

}

package corejavaexamples.collections;

import java.util.*;
import java.util.Map.Entry;

public class StudentHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> marks1=new ArrayList();
        ArrayList<Integer> marks2=new ArrayList();
        ArrayList<Integer> marks3=new ArrayList();
        
        marks1.add(98);
        marks1.add(25);
        marks1.add(35);
        marks1.add(80);
        
        marks2.add(66);
        marks2.add(45);
        marks2.add(76);
        marks2.add(89);
        
        marks3.add(34);
        marks3.add(65);
        marks3.add(87);
        marks3.add(85);
        
       
        
        HashMap results=new HashMap();
        results.put("Kishore",marks1);
        results.put("Sunil",marks2);
        results.put("Sam",marks3);
        
        System.out.println(results);
        
        Set<Map.Entry<String, List>>entries= results.entrySet();
        Iterator itr=entries.iterator();
        while(itr.hasNext()) {
        	Map.Entry<String,List> temp=(Entry<String, List>) itr.next();
        	List<Integer> marks=temp.getValue();
        	int sum=0;
        	for(Integer i:marks)
        		sum=sum+i;
        	
        	System.out.println("Name:"+temp.getKey()+""+"Total: "+sum);
        }
  }

}

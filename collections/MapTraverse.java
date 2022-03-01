package corejavaexamples.collections;

import java.util.*;
import java.util.Map.Entry;

public class MapTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> states1=new HashMap();
        states1.put("MH","Maharashtra");
        states1.put("KA","Karnaktaka");
        states1.put("TS","Telengana");
        states1.put("TN","Tamilnadu");
          System.out.println(states1);
          
          Set<Map.Entry<String, String>>entries=states1.entrySet();
           Iterator itr=entries.iterator();
           
           while(itr.hasNext()) {
        	   Map.Entry<String, String> temp=(Entry<String, String>) itr.next();
        	   System.out.println(temp.getKey()+"-->"+temp.getValue());
           }
           
           System.out.println("Elements using for loop");
           for(Map.Entry<String, String>t: states1.entrySet()) {
        	   System.out.println(t.getKey()+"-->"+t.getValue());
           }
	}

}


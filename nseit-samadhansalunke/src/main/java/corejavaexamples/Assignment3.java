package corejavaexamples;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
      int num=sc.nextInt();
      int a[]=new int[num];
      for(int i=0;i<num;i++) {
    	  a[i]=sc.nextInt();
      }
    	  System.out.println(display(a));
	}
    public static int display(int a[])
    {
    LinkedHashSet<Integer>h1=new LinkedHashSet<Integer>();
    int s=0;
    for(int i=0;i<a.length;i++) {
    	h1.add(a[i]);
    }
    Iterator<Integer> it=h1.iterator();
    while(it.hasNext()) {
    	int k=it.next();
    	if(k%2==0) {
    		s=s+k;
    	}
    }
    if(s>0)
    	return s;
    else
    	return -1;
    }
}

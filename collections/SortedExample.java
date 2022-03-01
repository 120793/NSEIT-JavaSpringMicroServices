package corejavaexamples.collections;
import java.util.*;
import java.util.stream.Collectors;
public class SortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList();
		ar.add(10);ar.add(5);ar.add(19);ar.add(4);ar.add(26);
		System.out.println(ar);
		Comparator<Integer> c = (x1,x2)->x1.compareTo(x2);
		List<Integer> result = ar.stream().sorted(c).collect(Collectors.toList());
		System.out.println(result);
		Integer m1 = ar.stream().max(c).get();
		//Integer m1 = ar.stream().min(c).get();

		System.out.println(m1);
		}

		
	}



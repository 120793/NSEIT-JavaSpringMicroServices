package corejavaexamples.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Stud {
	int marks;
	String name;

	public Stud(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	public int getStudmarks() {
		return marks;
	}

	public String getStudname() {
		return name;
	}

	@Override
	public String toString() {
		return "Stud [marks=" + marks + ", name=" + name + "]";
	}

}

public class StudentStreamExample31 {

	//private static Stream collectors;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Stud> ar = new ArrayList();
		ar.add(new Stud(50, "Sam"));
		ar.add(new Stud(80, "Mayur"));
		ar.add(new Stud(70, "Akash"));
		ar.add(new Stud(89, "Rohan"));
		ar.add(new Stud(95, "Sanghpal"));
		System.out.println(ar);

		//  stream filter using predicate
		Predicate<Stud> greaterthan80 =i -> i.getStudmarks() > 80;
		List<Stud> greaterthan801 = ar.stream().filter(i -> i.getStudmarks() > 80).collect(Collectors.toList());
		greaterthan801.forEach(System.out::println);

		
	}

}

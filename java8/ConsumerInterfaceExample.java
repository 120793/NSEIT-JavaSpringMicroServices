package corejavaexamples.java8;
import java.util.function.*;

public class ConsumerInterfaceExample {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Consumer <String> con = (t)->System.out.println(t);
        con.accept("Samadhan");
	}

}


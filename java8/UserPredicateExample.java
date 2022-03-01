package corejavaexamples.java8;
import java.util.*;
import java.util.function.Predicate;

class user{
	String username;
	String password;
	public user(String username,String password) {
		super();
		this.username=username;
		this.password=password;
	}
}
public class UserPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     Predicate<user>p=usr-> usr.username.equals("admin") && usr.password.equals("admin");
	     System.out.println("Enter user name");
	     String uname=sc.next();
	     System.out.println("Enter user password");
	     String password=sc.next();
	     user user=new user(uname,password);
	     if(p.test(user))
	         System.out.println("Valid user");
	     else
	         System.out.println("Invalid user");
	}

}

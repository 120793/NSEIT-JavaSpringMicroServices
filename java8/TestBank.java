package corejavaexamples.java8;
import java.util.*;
public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Bank bank=new Bank();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter amount to withdrow");
    int amount=sc.nextInt();
    try {
    	bank.withdrow(amount);
    	bank.checkBalance();
    }
    catch(InsufficientFundsException e) {
    	System.out.println(e);
    }
	}

}

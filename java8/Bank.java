package corejavaexamples.java8;

public class Bank {
    int Balance,
    balance=10000;
    public void withdrow(int amount) {
    	balance=balance-amount;
    	int tbal=balance-amount;
    	if(balance<amount && tbal<5000) {
    		balance=balance-amount;
    	}
    	else {
    		balance=balance-amount; 
    		throw new InsufficientFundsException();
    }

 }
	public void checkBalance() {
		
		System.out.println("The available Balance : " +balance);
	}
}

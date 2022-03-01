package corejavaexamples.java8;

public class InvalidBalanceException extends RuntimeException {
    public InvalidBalanceException() {
    	super("Balance must be more than 0");
    }
}

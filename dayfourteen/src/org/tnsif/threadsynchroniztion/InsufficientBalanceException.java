package org.tnsif.threadsynchroniztion;




public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		super("Insufficiant Balance");
	}
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
	
	



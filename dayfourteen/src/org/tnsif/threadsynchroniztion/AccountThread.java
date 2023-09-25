package org.tnsif.threadsynchroniztion;





public class AccountThread extends Thread{
	String type;
	Account acc;
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	int amount;
	
	public void run() {
		
			try {
				if(type.equals("deposit"))
					acc.deposite(amount);
				else if(type.equals("withdraw"))
					acc.withdraw(amount);
			} catch (DepositeLimitExceedException | InsufficientBalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public AccountThread() {}
	
	public AccountThread(Account acc) {
		this.acc = acc;
	}
}
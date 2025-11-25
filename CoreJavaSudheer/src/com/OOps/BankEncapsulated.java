package com.OOps;

 
class BankEncapsulated{
	private String accountHolderName;
	private String accountNumber;
	private double balance;
	
	
	public void setDetails( String accountHolderName,String accountNumber,double balance) {
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		if(balance>=0) {
			this.balance=balance;
		}
		else {
			System.out.println("please deposit some minimum balance :");
			this.balance=balance;
		}
	}
	
	void withdraw(double  amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
 		System.out.println("withdrawl amount :"+amount);
		System.out.println("current balance :"+balance);
		}else {
			System.out.println("Insufficient balance :");
		}
		
	}
	
	void  deposit(double  amount) {
		if(amount>0) {
		balance+=amount;
		System.out.println("deposited amount :"+amount);
		System.out.println("current balance :"+balance);
	}else {
		System.out.println("Deposit amount must be positive");
	}
	
}
	
	void getdetails() {
		System.out.println("Account Holder Name :"+accountHolderName);
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Initial balance:"+balance);
	}

	 public double getBalance() {
	        return balance;
	    }

}

 	 
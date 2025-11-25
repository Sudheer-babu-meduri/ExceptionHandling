package com.OOps;

public class BankEncapsulationLAB {

	private String accountHoldersName;
	private long balance;
	
	BankEncapsulationLAB( String name, long amount){
		
			
			accountHoldersName=name;
		if(amount>0) {
			this.balance=amount;
		}else {
			this.balance=0;
			System.out.println("initial balance can't be negative");
		}
	}
	void setName(String name) {
		if(name!=null  && !name.trim().isEmpty()) {
			
			accountHoldersName=name;
			
		}else {
			System.out.println("Invalid name");
		}
	}
	String getAccountHolderName() {
		return accountHoldersName;
	}
	double getBalance() {
		return balance;
	}
	
	void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposit amount :"+amount);
		}else {
			System.out.println("deposit amount must be positive!!!!!");
		}	
	}
	void withdraw(double amount) {
		if(amount<balance && amount>0) {
			balance-=amount;
			System.out.println("withdraw amount :"+amount);
		}else {
			System.out.println("Invalid withdraw amount!!!! ");
		}
	}
	
}



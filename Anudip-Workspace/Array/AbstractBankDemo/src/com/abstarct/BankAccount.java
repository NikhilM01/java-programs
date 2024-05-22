package com.abstarct;

abstract public class BankAccount {
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	
	//getter and setter
			//access modifier is always public
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//deposit 
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	
	
}

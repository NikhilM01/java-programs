package com.abstarct;

public class SavingAccount extends BankAccount {

	public SavingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		
	}

	@Override
	public void deposit(double amount) {
		setBalance((getBalance())+amount);
		System.out.println("Deposit of amount " + amount + " Sucessful. Current BAlance is " + getBalance());
		
	}

	@Override
	public void withdraw(double amount) {
		if(getBalance() < amount) {
			System.out.println(" Insufficient Amount");
		}else {
			setBalance((getBalance())-amount);
			System.out.println("Withdraw  of amount " + amount + " Sucessful. Current BAlance is " + getBalance());
		}
		
	}

}

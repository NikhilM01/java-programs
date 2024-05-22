package com.abstarct;

public class BankMain {

	public static void main(String[] args) {
		double bal1=1000;
		double bal2=3000;
		SavingAccount savingsAccount = new SavingAccount("S001", bal1);
		
		System.out.println(bal1);
		
		savingsAccount.deposit(500);
		savingsAccount.withdraw(400);
		
CurrentAccount currentAccount = new CurrentAccount("S001", bal2);
		
		System.out.println(bal2);
		
		currentAccount.deposit(500);
		currentAccount.withdraw(400);
	}

}

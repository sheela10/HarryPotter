package com.ninja.assignment;

public class Bank {

	public static void main(String[] args) {
		
		BankAccount customer1 = new BankAccount();
		
		customer1.setcustName("Adidas");
		customer1.setaccNumber("456ER383");
		
		customer1.deposit(56000);
		customer1.withdraw(5000);
		

	}

}

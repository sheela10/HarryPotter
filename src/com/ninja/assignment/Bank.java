package com.ninja.assignment;

public class Bank {

	public static void main(String[] args) {
		
		BankAccount customer1 = new BankAccount();
		
		customer1.setcustName("Adidas");
		customer1.setaccNumber("456ER383");
		customer1.setdepositAmt(560);
		customer1.setaccBalance(56000);
		customer1.setwithdrawAmt(590);
		
		customer1.deposit();
		customer1.withdraw();
		

	}

}

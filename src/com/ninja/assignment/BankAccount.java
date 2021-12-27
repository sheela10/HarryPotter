package com.ninja.assignment;

public class BankAccount {
	
	private String custName;
	private String accNumber;
	private double accBalance;
	//private double depositAmt;
	//private double withdrawAmt;
	
	public void setcustName(String Name) {
		custName = Name;
	}
	
	public void setaccNumber(String accNo) {
		accNumber = accNo;
	}
	
	public void setaccBalance(double accBal) {
		accBalance = accBal;
	}
	
	public void deposit(double depositAmt) {
		accBalance = accBalance + depositAmt;
		System.out.println("Account Balance after deposit :" +accBalance);
	}
	
	public void withdraw(double withdrawAmt) {
		if(accBalance >= withdrawAmt) {
			accBalance = accBalance - withdrawAmt;
		}else {
			System.out.println("Insufficient Funds");
		}
		System.out.println("Account Balance after withdrawal :" +accBalance);
	}

}

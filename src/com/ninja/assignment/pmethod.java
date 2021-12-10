package com.ninja.assignment;

import java.util.Scanner;

public class pmethod {
	
	public static boolean evennumber(int num) {
		
		return (num%2 ==0);
		
	}
	
	public static boolean palindrome(String s1) {
		
		StringBuffer s2 = new StringBuffer(s1);
		s2.reverse();
		String rstr = s2.toString();
		System.out.println("the value of reversed string: " +rstr);
		
		return (s1.equals(rstr));
	}

	public static void main(String[] args) {
		
		//******* Even Odd number ************
		
		Scanner value = new Scanner(System.in);
		System.out.println("\nEnter the number: ");
		int num = value.nextInt();
		
		if (evennumber(num)==true) {
			System.out.println("\nThe number "+ num +" is even number");
		} else {
			System.out.println("\nThe number "+ num +" is odd number");
		}
		
		//*********   Palindrome  ***************
		
		Scanner usrstr= new Scanner(System.in);
		System.out.println("\nEnter the String to check if it is a Palindrome : ");
		String s1 = usrstr.next();
		
		if(palindrome(s1)) {
			System.out.println("String entered in a Palindrome");
		}else {
			System.out.println("String entered is not a Palindrome");
		}
		
		
		usrstr.close();
		value.close();
		
	}

}

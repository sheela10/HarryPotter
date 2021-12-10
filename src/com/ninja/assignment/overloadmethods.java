package com.ninja.assignment;

import java.util.Scanner;

public class overloadmethods {
	
	public static double area(double var1, double var2) {
		double rect = var1 * var2;
		return rect;
	}
	
	public static double area(double var1) {
		return (3.14*var1*var1);
	}
	
	public static boolean equal(int var1, int var2) {
	
		boolean var3 = (var1==var2)? true:false;
		return var3;
	}
	
	public static boolean equal(String str1, String str2) {
		
		return(str1.equals(str2)) ;
	}
	

	public static void main(String[] args) {
		
		double length=10, width=9.8, radius=2;
		System.out.println("Area of Rectangle: " +area(length, width));
		System.out.println("Area of Circle: " +area(radius));	
		
		Scanner value= new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int val1 = value.nextInt();
		int val2 = value.nextInt();
		
		System.out.println("Enter the string values");
		String var3 = value.next();
		String var4 = value.next();
		
		
		if (equal(val1, val2)) {
			System.out.println("\nThe values entered are equal");
		} else {
			System.out.println("\nThe Values are not equal");
		}
		
		if(equal(var3,var4)) {
			System.out.println("The value of strings are equal");
		} else {
			System.out.println("The value of strings are not equal");
		}
		
		value.close();
		
		
		
	}
}

package com.ninja.assignment;

public class Box {
	
	private int len, width, height;
	
	public void setlvalues() {
		
	}
	
	Box() {
		len = 0;
		width = 0;
		height = 0;
		
	}
	
	Box(int length) {
		len = width = height = length;
		
	}
	
	Box(int length, int wid, int hgt){
		len = length;
		width = wid;
		height = hgt;
	}
	
	public void volume() {
		int vol = len * width * height;
		System.out.println("Length:Width:Height ==> " + len +":" + width +":" +height);
		System.out.println("Volume is : " +vol);
	}

}

package com.ninja.assignment;

public class BoxDemo {

	public static void main(String[] args) {
		Box b1=new Box();
		Box b2=new Box(21);
		Box b3=new Box(10,13,21);
		
		b1.volume();
		b2.volume();
		b3.volume();
		
	}

}

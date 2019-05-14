package com.java.practice;

public class Blocks {
	
	Blocks()
	{
		System.out.println("Constructor");
	}

	static
	{
	System.out.println("from static");	
	}
	{
	  System.out.println("NonStatic");
	}
	public static void main(String[] args) {
		Blocks b1=new Blocks();
		b1.met();
		
		Blocks b2= new Blocks();
		b2.met();
		

	}
	
	public void met()
	{
		System.out.println("method");
	}

}

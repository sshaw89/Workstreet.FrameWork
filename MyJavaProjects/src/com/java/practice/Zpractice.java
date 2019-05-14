package com.java.practice;

public class Zpractice {
	
	public static void main(String[] args) {
		sample1 ref=new sample1();
		ref.m1();
		ref.m2();
		System.out.println("print main");
			
		}

}
class sample{
	
	public static void m1() {
		System.out.println("print m1");
	}
}
class sample1 extends sample{
	
	public static void m2() {
		System.out.println("print m2");
	}
}

package com.selenium.test;

import org.testng.annotations.Test;
 
public class OrderOfExecution {

	@Test()
	
	public void xyz() {
		System.out.println("xyz");
	}
	@Test
	public void xyz1() {
		System.out.println("xyz1");
	}
	@Test
	public void abc() {
		System.out.println("abc");
	}
	@Test
	public void abc1() {
		System.out.println("abc1");
	}
	@Test
	public void pqr() {
		System.out.println("pqr");
	}
}

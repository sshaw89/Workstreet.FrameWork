package com.seleniumproject;

import org.testng.annotations.Test;

public class NewClass1 {
	@Test(priority=20)
	public void maintest() {
		System.out.println("priority 20");
	}
	@Test(priority=0)
	public void maintest1() {
		System.out.println("priority 0");
	}
	@Test(priority=-50)
	public void maintest2() {
		System.out.println("priority -50");
	}
	@Test(priority=1)
	public void main() {
		System.out.println("priority 1");
	}

}

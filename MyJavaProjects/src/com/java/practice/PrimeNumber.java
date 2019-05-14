package com.java.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter integer");
		int num=scan.nextInt();
		boolean flag=false;
		for (int i = 2; i <= num/2; i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if (!flag) {
			System.out.println(num+" is a prime number");
		} else {
			System.out.println(num+" is not a prime number");

		}

	}

}

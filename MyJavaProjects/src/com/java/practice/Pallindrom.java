package com.java.practice;

public class Pallindrom {

	public static void main(String[] args) {
		
		int rev=0,num=222,temp;
		temp=num;
		while(num>0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			
		}
		if(temp==rev) {
			System.out.println("it is pallindrom");
		}else {
			System.out.println("it is not pallindrome");
		}

	}

}

package com.java.practice;

public class Fibonachi {

	public static void main(String[] args) {
		int first=0,second=1,third=0;
		System.out.print(first+","+second);
		for (int i = 0; i < 7; i++) {
			third=first+second;
			System.out.print(","+third);
			first=second;
			second=third;
		}

	}

}

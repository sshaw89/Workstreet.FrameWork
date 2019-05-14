package com.java.practice;

public class FindLengthWithoutUsingLength {

	public static void main(String[] args) {
		String str="humsanchutiye";
		int count=0;
		for (char chr : str.toCharArray()) {
			count++;
		}
		System.out.println(count);

	}

}

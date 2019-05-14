package com.java.practice1;

public class ReverseString {

	public static void main(String[] args) {
		String str="the sky is blue";
		String[] arrstr=str.split(" ");
		String rev="";
		for(int i=arrstr.length-1;i>=0;i--) {
			rev=rev+arrstr[i]+" ";
		}
		System.out.println(rev);

	}

}

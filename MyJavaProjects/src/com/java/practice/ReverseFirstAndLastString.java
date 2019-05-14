package com.java.practice;

public class ReverseFirstAndLastString {

	public static void main(String[] args) {
		String str="sab sale haramkhor hain";
		reverseString(str);

	}
	public static void reverseString(String str) {
		String[] arraystring=str.split(" ");
		String rev="";
		for (int i = 0; i < arraystring.length; i++) {
			String reverse="";
			String strarray=arraystring[i];
			if(i==0 || i==arraystring.length-1) {
				for(int j=strarray.length()-1;j>=0;j--) {
					reverse=reverse+strarray.charAt(j);
				}
			}
			else {
				reverse=reverse+strarray;
			}
			rev=rev+reverse+" ";
		}
		System.out.println(rev);
	}

}

package com.java.practice;

public class StringReverse {
	public static void main(String[] args) {
		
		String str="i am subrat shaw";
		String[] arrstr=str.split(" ");
		String rev="";
		for (int i = arrstr.length-1 ; i >= 0; i--) {
			String reverse="";
			String arr=arrstr[i];
			if(i%2==0) {
			for (int j = arr.length()-1 ; j >= 0 ; j--) {
				
				reverse=reverse+arr.charAt(j);
			}
		}
			else
			{
				reverse=reverse+arr;
			}
			rev=rev+reverse+" ";
		}
		System.out.println(rev);
	}

}

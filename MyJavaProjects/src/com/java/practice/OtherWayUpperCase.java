package com.java.practice;
/**
 * 
 * @author Subrat
 *
 */
public class OtherWayUpperCase {
	/**
	 * 
	 * @param args
	 */
	static String str1="";
	public static void main(String[] args) {
		String str="i dont like you";
		String[] arrstr=str.split(" ");
		for (String st : arrstr) {
			String s1=st
					.substring(0,1)
					.toUpperCase()
					+st
					.substring(1);
			str1=str1+s1+" ";
		}
		System.out.println(str1);
	}

}

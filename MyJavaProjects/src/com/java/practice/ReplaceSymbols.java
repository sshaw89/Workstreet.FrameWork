package com.java.practice;

public class ReplaceSymbols {

	public static void main(String[] args) {
		String str="@#gt%67^%KUH*&8 7~?";
		str=str.replaceAll("[^a-zA-Z 0-9]", "");
		System.out.println(str);
		

	}

}

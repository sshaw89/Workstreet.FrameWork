package com.java.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Subrat
 *
 */

public class UpperCaseFirstletter {
	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//take the input from the console
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the String");
		//read the input String
		String input=bfr.readLine();
		//create object and get the length of the string
		StringBuilder build=new StringBuilder(input.length());
		//break the string using space
		String[] arr=input.split(" ");
		//iterate through the string
		for(int i=0 ; i<=arr.length ; i++) {
			build
			.append(arr[i]
					.toUpperCase().charAt(0)
					)
			.append(arr[i]
					.substring(1, arr.length))
			.append(arr[i].substring(arr.length).toUpperCase());
		}
		System.out.println(build);
	}

}

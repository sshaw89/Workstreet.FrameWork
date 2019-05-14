package com.java.practice;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5,7,8};
		int missingnumber=getMissingNumber(array,8);
		System.out.println("the missing number is : "+missingnumber);

	}
	private static int getMissingNumber(int[] array,int n) {
		int actual=0;
		int expected= n*(n+1)/2 ;
		for (int i : array) {
		actual=actual+i;	
		}
		return expected-actual ;
		
	}

}

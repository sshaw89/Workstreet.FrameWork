package com.java.practice;

import java.util.Arrays;

public class ShiftingOfNumbers {
	public static void main(String[] args) {
		int[] arr= {7,1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i <= 2; i++) {
			int temp=arr[arr.length-1];
			for (int j = arr.length-2; j >=0; j--) {
				arr[j+1]=arr[j];
			}
			arr[0]=temp;
			System.out.println(Arrays.toString(arr));
		}
		
	}
}

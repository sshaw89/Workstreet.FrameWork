package com.java.practice;

import java.util.ArrayList;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {7,8,9,10,11,12};
		ArrayList<Integer> al=new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			al.add(arr1[i]);
		}
		for (int j = 0; j < arr2.length; j++) {
			al.add(arr2[j]);
		}
		System.out.println(al);

	}

}

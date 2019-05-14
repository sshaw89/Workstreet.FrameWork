package com.java.practice;

public class SortAnArray {

	public static void main(String[] args) {
		int[] array= {5,2,3,1,8,4,7,6};
		System.out.println("Before Sorting");
		for (int i : array) {
			System.out.print(i+",");
		}
		System.out.println();
		bubbleSort(array);
		System.out.println("after sorting");
		for (int i : array) {
			System.out.print(i+",");
		}

	}
	public static void bubbleSort(int[] array) {
		int temp=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j-1]>array[j]) {
					 
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
					
				}
			}
			
		}
	}

}

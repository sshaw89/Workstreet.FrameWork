package arrays;

import java.util.Scanner;

public class ArraysTest1 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter size of array");
		int size  = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("add element");
		addToArray(arr);
		printarr(arr);
		

	}
	public static void addToArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
	}
	public static void printarr(int[] in) {
		for(int i = 0;i<in.length;i++) {
			System.out.println(in[i]);
		}
		
	}
}

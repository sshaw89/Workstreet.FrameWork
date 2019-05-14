package com.java.practice;

public class ZerosFirst {
	public static void main(String[] args) {
		int[] arr= {0,3,0,2,5,0,6,0,4,0,8,5,9,0};
		int count=0,i;
		for ( i = 0; i <= arr.length-1; i++) {
			if (arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
		while (count<arr.length) {
			arr[count++]=0;
		}
		for(int j=0;j<=arr.length-1;j++) {
			System.out.print(arr[j]+" , ");
		}
	}

}

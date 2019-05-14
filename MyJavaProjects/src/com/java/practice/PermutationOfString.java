package com.java.practice;

public class PermutationOfString {

	static String swap(String at,int i,int j) {
		char temp;
		char[] array=at.toCharArray();
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		return String.valueOf(array);
	}
	
	static void permutation(String str,int l,int h) {
		if(l==h) {
			System.out.println(str);
		}
		else {
		for (int i = l; i<=h; i++) {
			str=swap(str, l, i);
			permutation(str, l+1, h);
			str=swap(str, l, i);
			}
		}
	}
	
	public static void main(String[] args) {
		String str="abcd";
		int n=str.length();
		PermutationOfString permute=new PermutationOfString();
		permute.permutation(str, 0, n-1);
	}

}

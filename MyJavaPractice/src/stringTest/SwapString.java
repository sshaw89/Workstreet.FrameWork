package stringTest;

import java.util.Arrays;

public class SwapString {

	public static void main(String[] args) {
		String str="welcome to java selenium";
		String[] arr = str.split(" ");
		
		String s = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = s;
		// convert string array to string.
		String str1 = Arrays.toString(arr);
		System.out.println(str1.length());
		System.out.println(str1);
		}

}

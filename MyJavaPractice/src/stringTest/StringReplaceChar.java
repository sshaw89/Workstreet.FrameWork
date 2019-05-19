package stringTest;

import java.util.Arrays;

public class StringReplaceChar {
//we are replacing an string character with another character.
	public static void main(String[] args) {
		replcechar();
		System.out.println(replacechar());
		System.out.println(replaceCharacter("java" ,'j', 'm'));
		System.out.println(permutation("xxyz", "xyxz"));

	}
	public static void replcechar() {
		String str = "java";
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]=='a')
			{
				arr[i]='d';
			}
			System.out.println(arr[i]);
		}
		Arrays.toString(arr);  //convert array to string
		System.out.println(arr);
		
	}
	public static String replacechar() {
		String s = "avinesh";
		 String str1 = s.replaceAll("a", "d");
		// System.out.println(str1);
		 return str1;
	}
	public static String replaceCharacter(String str, char oldChar, char newChar) {
		String out = "";
		char[] ch = str.toCharArray();
		for(int i = 0; i<ch.length; i++) {
			if(ch[i]==oldChar) {
				ch[i] = newChar;
				}
			out = out+ch[i];
		}
		
		return out;
		
	}
	//to check string contains permutations
	public static boolean permutation(String in, String out) {
		if(in.contains(out));
		return true;
	}

}

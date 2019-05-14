package com.java.practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String string="subratshaw";
		System.out.println(duplicateRemove(string));

	}
	public static String duplicateRemove(String string) {
		Set<Character> set=new HashSet<>();
		StringBuffer sbf= new StringBuffer();
		for(int i=0;i<string.length();i++) {
			
			Character c=string.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sbf.append(c);
			}
		}
		return sbf.toString();
	}

}

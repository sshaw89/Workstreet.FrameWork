package com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String str="aabaacdaad";
		duplicateCount(str);

	}
	public static void duplicateCount(String str) {
		
		Map<Character, Integer> map=new HashMap<>();
		char[] ch=str.toCharArray();
		for (char c : ch) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				map.put(c, map.get(c)+1);
			}
		}
		Set<Map.Entry<Character, Integer>> entryset=map.entrySet();
		for (Entry<Character, Integer> entry : entryset) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
			
		}
		
	}

}

package com.java.practice;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		String string="amana";
		OccuranceOfCharacter chr=new OccuranceOfCharacter();
		chr.occurence(string);
	}
	public void occurence(String string) {
		
		char[] array=string.toCharArray();
		for (int i = 0; i < array.length; i++) {
			int count=0;
			for (int j = i; j < array.length; j++) {
				if (array[i]==array[j]) {
					count++;	
				}
			}
			if(count>1) {
				System.out.println(array[i]+" : "+count);
			}	
		}
	}
}

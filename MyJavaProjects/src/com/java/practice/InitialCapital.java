package com.java.practice;

public class InitialCapital {

	public static void main(String[] args) {
		String str="Mohan Das Gandhi";
		initials(str);

	}
	public static void initials(String str) {
		
		String[] starray=str.split(" ");
		String intial1="";
		for (int i = 0; i < starray.length; i++) {
			String initial="";
			String newarray=starray[i];
			for (int j = 0; j < starray.length; j++) {
				if(j==0) {
				initial=initial+newarray.charAt(0);
				}
				
			}
			
			intial1=intial1+initial;
		}
		System.out.println(intial1);
		
		
	}
	

}

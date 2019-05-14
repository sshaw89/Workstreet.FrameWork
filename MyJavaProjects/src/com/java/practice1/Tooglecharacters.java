package com.java.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tooglecharacters {

	public static void main(String[] args) throws Throwable {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     int i,s,k=0;
	     String a;
	     System.out.print("Enter a string : ");
	     a=br.readLine();
	     System.out.print("\nToggled cases are : ");
	     for(i=0;i<=a.length()-1;i++)
	     {
	         s=(int)a.charAt(i);
	         if(s!=' ')
	         {
	             if(s>=65 && s<=90)
	             k=s+32;
	             if(s>=97 && s<=122)
	             k=s-32;
	             System.out.print((char)k);
	            }
	            else
	            System.out.print("");
	        }
	       // System.out.print("\n");

	}

}

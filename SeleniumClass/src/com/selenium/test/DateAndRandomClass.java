package com.selenium.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DateAndRandomClass {

	public static void main(String[] args) {
	   Date d = new Date();
	   SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_YYYY_HH_MM_ss");
	   String s=sdf.format(d);
	   //String dateFormat = ("DD/MM/YY/");
	  // String formattedDate=dateFormat.format(d);
	   System.out.println(new Date().toString());
	   System.out.println(s);
	
	   Random red = new Random();
	   int i = red.nextInt(100);
	   System.out.println("avinesh_"+i);
	}
}

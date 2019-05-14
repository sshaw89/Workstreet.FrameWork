package com.java.practice;

import java.util.Set;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap map=new TreeMap<>();
		map.put(12, "subrat");
		map.put(13, "aman");
		map.put(14, "anurag");
		map.put(15, "rishi");
		Set set=map.keySet();
		for (Object object : set) {
			System.out.println(object+"--->"+map.get(object));
		}

	}

}

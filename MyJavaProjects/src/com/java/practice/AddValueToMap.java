package com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AddValueToMap {

	public static void main(String[] args) {
		Integer[] intarr= {1,2,3,4,5,6};
		String[] stringarr= {"aman","anurag","subrat","ragu","rishi","ektu"};
		Map<Integer[], String[]> map=new HashMap<>();
		map.put(intarr, stringarr);
		Set set=map.keySet();
		for (Object obj : set) {
			System.out.println(obj.hashCode()+"--->"+map.get(obj.hashCode()));
		}

	}

}

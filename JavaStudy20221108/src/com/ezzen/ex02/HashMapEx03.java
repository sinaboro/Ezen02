package com.ezzen.ex02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class HashMapEx03 {

	public static void main(String[] args) {
		TreeMap<String,  String> map = new TreeMap<>();
		
		map.put("kor", "국어");
		map.put("eng", "영어");
		map.put("math", "수학");
		map.put("com", "전산");
		map.put("com", "전산2");
		map.put("com", "전산3");
		map.put("sci", "영어");
		
		Set<String> set=  map.keySet();
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext())
			System.out.print(it.next() + "\t");
		System.out.println();

		it = set.iterator();
		while(it.hasNext())
			System.out.print(map.get(it.next()) + "\t");
		System.out.println();
		
		
		

	}

}

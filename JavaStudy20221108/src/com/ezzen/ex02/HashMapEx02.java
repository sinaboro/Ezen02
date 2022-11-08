package com.ezzen.ex02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		HashMap<String,  String> map = new HashMap<>();
		
		map.put("kor", "국어");
		map.put("eng", "영어");
		map.put("math", "수학");
		map.put("com", "전산");
		
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

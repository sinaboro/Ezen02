package com.ezzen.ex02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
		//키, 값 ==> Integer, String
//		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, String> map = new HashMap<>();
//		HashMap  map = new HashMap();
		
		map.put(15, "Baik");
		map.put(1, "kim");
		map.put(8, "Lee");
		map.put(10, "Hong");
		map.put(5, "park");
		map.put(2, "Jo");
//		map.put(10, 20);
		
		//String value = map.get(5);
//		Integer value = map.get(10);
//		int value = map.get(10);   //Integer --> int (언박싱)
		
//		System.out.println(map.get(1));
//		System.out.println(map.get(5));
//		System.out.println(map.get(8));
		
		//map.remove(5);
		
//		System.out.println(map.get(1));
//		System.out.println(map.get(8));
//		System.out.println(map.get(5));
		
//		for(String m : map)
//			System.out.println(m);

		Set<Integer> keySet = map.keySet();  //반복문 돌리면서 출력하기 위해서..
		 
		 for(int n : keySet)
			 System.out.print(n + "\t");
		 System.out.println();

		 for(int n : keySet)
			 System.out.print(map.get(n) + "\t");
		 System.out.println();
		 
		 //반복자......iterator
		 System.out.println("반복자-------");
		    Iterator<Integer> it= keySet.iterator();
		    while(it.hasNext())
//		    	System.out.print(it.next() + "\t");  //key
		    	System.out.print(map.get(it.next()) + "\t");  //value
		

	}

}

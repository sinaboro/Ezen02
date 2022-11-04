package com.ezen.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AsListEx01 {

	public static void main(String[] args) {
		
		String[] str = new String[5];
		str[0] = "kor1";
		str[1] = "kor2";
		str[2] = "kor3";
		str[3] = "kor4";
		str[4] = "kor5";
		
		String[] str2 = {"kor1","kor2", "kor3" , "kor4", "kor5" };
		System.out.println(Arrays.toString(str2));
		
		List<String> list = new ArrayList<>();
		list.add("kor1");
		list.add("kor2");
		list.add("kor3");
		list.add("eng");
		Iterator<String> t = list.iterator();
		while(t.hasNext()) 
			System.out.print(t.next() + " ,");
		
		System.out.println("\n-----------------------");
		
		List<String> list2 = Arrays.asList("kor", "eng", "math", "tot","avg");
		
		list2 = new ArrayList<>(list2);
		list2.add("aaaa");
		
		Iterator<String> t2 = list2.iterator();
		while(t2.hasNext()) 
			System.out.print(t2.next() + "\t");
		
	}

}

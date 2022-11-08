package com.exen.ex5;

import java.util.Arrays;
import java.util.Comparator;

//class Descending implements Comparator<String>{
//
//	@Override
//	public int compare(String o1, String o2) {
//			Comparable c1 = (Comparable)o1;
//			Comparable c2 = (Comparable)o2;
//			return c1.compareTo(c2)*-1;
//			//return o1.length() - o2.length();
//			 
//	}
//	
//}

class Descending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Comparable c1 = (Comparable) o1;
		Comparable c2 = (Comparable) o2;
		
		return c1.compareTo(c2)*-1;
	}
	
}

class Lengthing implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
}

public class ComparatorEx {

	public static void main(String[] args) {
		
		String[] strArr= {"cccccat", "dddDog", "lion", "tiger"};
		
		Arrays.sort(strArr);
		for(String s : strArr)
			System.out.print(s + "\t");
		System.out.println();

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		for(String s : strArr)
			System.out.print(s + "\t");
		System.out.println();
		
		Arrays.sort(strArr,  new Descending() );
		for(String s : strArr)
			System.out.print(s + "\t");
		System.out.println();

		Arrays.sort(strArr,  new Lengthing() );
		for(String s : strArr)
			System.out.print(s + "\t");
	}
	
	
	

}

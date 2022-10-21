package com.ezen.ex1;

public class Tests {

	static String change(String str) {
		 return  str += "456";
	}
	public static void main(String[] args) {
		 String str = "ABC123";
		System.out.println(str);
		str = change(str);
		System.out.println(str);
	}

}

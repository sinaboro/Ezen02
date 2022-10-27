package com.ezen.ex01;

class TV{
}
public class Tests {

	public static void main(String[] args) {
		String str = "korea";
		String str2 = "korea";
		String str3 = new String("korea");
		
		System.out.println(str == str2);//true
		System.out.println(str == str3);//false
		System.out.println(str2 == str3);//false
		System.out.println(str.equals(str3));

	}

}

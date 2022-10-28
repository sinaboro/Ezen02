package com.ezen.ex03;

import java.util.Arrays;
import java.util.StringJoiner;

class StringEx4 {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr   = animals.split(",");

		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0] + " ;" + arr[1]);
		
		String str = String.join("-", arr);
		System.out.println(str);

		StringJoiner sj = new StringJoiner(" * ", "[","]");
		for(String s : arr)
			sj.add(s);

		System.out.println(sj.toString());
		
		
		
	}
}

package com.exen.ex5;

import java.util.Arrays;
import java.util.Comparator;

class Desc implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2)*-1;
	}
}

public class ArraySort{

	public static void main(String[] args) {
		int[] num = {1,5,3,2,4};
		
		String[] str = {"aaa", "ab","cccd", "bbbbb", "aaaaac"};
		
		Arrays.sort(num);
		Arrays.sort(str);
		
		for(int n : num)
			System.out.print(n + "\t ");
		System.out.println();
		
		for(String s : str )
			System.out.print(s + "\t");
		System.out.println();
		
		Integer[] num2 = {1,5,3,2,4};
		Arrays.sort(num2, new Desc());
		
		for(int n : num2)
			System.out.print(n + "\t ");
		System.out.println();
	
	}
}

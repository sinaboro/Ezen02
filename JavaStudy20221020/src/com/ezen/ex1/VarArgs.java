package com.ezen.ex1;

public class VarArgs {

	public static void main(String[] args) {
		System.out.println(sum(1,2,3,4,5));
		System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
		System.out.println(sum(1,2,3));
	}
	
	static int sum(int... aa) {  //가변인자....
		int total = 0;
		
		for( int i : aa)
			total += i;
		
		return total;
	}
	
}

 

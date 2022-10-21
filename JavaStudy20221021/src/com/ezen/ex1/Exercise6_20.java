package com.ezen.ex1;

import java.util.Arrays;

public class Exercise6_20 {

	static void shuffle(int[] dest) {
		
		for(int i=0; i<dest.length; i++) {
			int j = (int)( Math.random()*dest.length);  //0~8
			int tmp = dest[i];
			dest[i] = dest[j];
			dest[j] = tmp;
		}
		//return dest;
	}
	
	public static void main(String[] args) {
		
//		Exercise6_20 s = new Exercise6_20();
		int[] original = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(original));
		
//		int[] result = s.shuffle(original);
		shuffle(original);
		
		//System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(original));
	}

}

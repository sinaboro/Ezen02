package com.ezen.ex01;


//StringBuilder 클래스 이용해서..........
//990915-1012999 ---> 990915 1012999 
public class TestEx2 {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7};
		int sum = sumOfAry(ar);
		
		System.out.println(sum);
		
		int[] num = 	makeNewIntAry(5);
	}
	
	static int sumOfAry(int[] ar) {
		   int sum = 0;
		   for(int i = 0; i < ar.length; i++)
		      sum += ar[i];
		   return sum;
	}
	
	static int[] makeNewIntAry(int len) {
		   int[] ar = new int[len];
		   return ar;
	}

}

package com.ezen.ex01;

//출력결과 
// sum = 45

public class Accumulator {
	
	static int sum;
	public static void main(String[] args) {
		for(int i=0; i<10; i++)
			Accumulator.add(i);
		Accumulator.showResult();
	}
	
	static void showResult() {
		System.out.println("sum : " + sum);
	}
	static void add(int i) {
		sum += i;
	}

}




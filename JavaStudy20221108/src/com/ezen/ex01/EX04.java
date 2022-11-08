package com.ezen.ex01;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int min = num1;
		int max = num1;
		// () ? 참 : 거짓
		max = (num1 > num2 ) ? (num1 > num3 ? num1 : num3) : ((num2 > num3)? num2 : num3); 
		min = (num1 > num2 ) ? (num2 > num3 ? num3 : num2) : ((num1 > num3)? num3 : num1); 
		

		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		System.out.println("평균 : " + (num1 + num2 + num3) / 3);
	}
}
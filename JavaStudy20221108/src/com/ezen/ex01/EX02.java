package com.ezen.ex01;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력");
		int num = sc.nextInt();

		if (num % 3 == 0) {
			System.out.println("3의 배수");
		} else {
			System.out.println("3의 배수아님");
		}
	}
}
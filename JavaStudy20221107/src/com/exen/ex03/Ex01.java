package com.exen.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		int number = input();
//		String binary = calculation(number);
//		print(binary);
		print(calculation(input()));
	}

	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("0~32767까지의 정수를 입력하세요.");
		int decimal = sc.nextInt();
		return decimal;
	}

	static String calculation(int num) {
		String num2 = Integer.toBinaryString(num);
		return num2;
	}

	static void print(String binary) {
		System.out.println(binary);
	}
}
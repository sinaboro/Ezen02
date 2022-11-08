package com.ezen.ex01;

import java.util.Scanner;

public class EX6_1 {

	public static void main(String[] args) {

		System.out.println("문자를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		System.out.println(input);
		int a = (int) (Math.random() * input.length());  //3

		char ch = input.charAt(a);
		
		if (ch >= 65 && ch <=90)
			System.out.println((a + 1) + "번째 문자는 대문자입니다.");

		else if (ch >= 'a' && ch <='z')
			System.out.println((a + 1) + "번째 문자는 소문자입니다.");

		else
			System.out.println("입력하신 문자는 알파벳이 아닙니다");

	}

}

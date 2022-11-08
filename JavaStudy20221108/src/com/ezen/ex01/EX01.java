package com.ezen.ex01;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 1개를 입력 하세요 : ");
		int num = sc.nextInt();

		if (num >= 50) {
			System.out.println("50이상 입니다.");
		} else {
			System.out.println("50미만 입니다.");
		}
	}
}
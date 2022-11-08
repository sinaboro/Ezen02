package com.exen.ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int year = input();
		if (cal(year) == true)
			leap_year();
		else
			no_leap_year();
	}

	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("년도 입력.");
		int year = sc.nextInt();
		return year;
	}

	static boolean cal(int num) {
		//if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		if ( ( num % 4 == 0 && num % 100 != 0) || num % 400 == 0)
			return true;
		 else
			return false;
	}

	static void leap_year() {
		System.out.println("윤년입니다.");
	}

	static void no_leap_year() {
		System.out.println("윤년이 아닙니다.");
	}

}
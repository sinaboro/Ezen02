package com.ezen.ex01;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {

		int kor, eng, math;

		System.out.println("국어, 영어, 수학 점수를 입력하세요");

		Scanner sc = new Scanner(System.in);

		System.out.println("국어점수>");
		kor = sc.nextInt();

		System.out.println("영어점수>");
		eng = sc.nextInt();

		System.out.println("수학점수>");
		math = sc.nextInt();

		int avg = (int)( (kor + eng + math) / 3.0);

		if (avg >= 90)
			System.out.println("A학점 입니다.");

		else if (avg >= 80)
			System.out.println("B학점 입니다.");

		else if (avg >= 70)
			System.out.println("C학점 입니다.");

		else if (avg >= 60)
			System.out.println("D학점 입니다.");

		else
			System.out.println("F학점 입니다.");

		System.out.println("총점" + (kor + eng + math));
		System.out.println("평균" + (kor + eng + math) / 3.0);

	}

}
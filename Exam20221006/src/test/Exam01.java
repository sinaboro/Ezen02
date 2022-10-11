package test;

import java.util.Scanner;

/*
 * 두 정수를 키보드로 입력받아서 합을 구하는 프로그램
 */
public class Exam01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int str1 =  sc.nextInt();
		int str2  = sc.nextInt();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1+str2);
		// float + long -> float + float -> float
		
	}
}

package test;

import java.util.Scanner;

/* 문제......
 * 키보드로 4000을 입력 받는다. (4000초)
 * 사칙연산을 이용해서 시 분 초 로 변경
 *   1시 6분 40초
 *   */
public class Exam05 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("초 입력 해주세요 : ");
//		int time = sc.nextInt();
		int time = 0;
		int hour=0;
		int minute=0;
		int second=0;
		
		second = time%60;  //초
		minute = time/60;
		hour = minute/60;  //시간
		minute = minute%60;  //분
		System.out.println("time : " + time);
		System.out.println(hour + "시 " + minute+"분 " + second+"초");
		//1시 6분 40초
		
		int a = 1000000;
//		int result1 =  (int)( (long)a * a  /  a);
		long result1 =   (long)a * a  /  a;
		//int * int ==> int
		//long * int -->  long * long -> long
		System.out.println(result1);
	}

}

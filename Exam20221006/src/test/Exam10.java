package test;

import java.util.Scanner;

/* 절대값 출력 프로그램 */
public class Exam10 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int num = 5;
		int result;
		
		
		if(num > 0 )
			result = num;
		else
			result = num*(-1);
		
		System.out.println("num : " + result);

		System.out.println("정수 입력 : ");
		int num2 = sc.nextInt();
		
		result =  num2>0  ?  num2 : num2*(-1);
		
		System.out.println("num2 : " + result);
	}

}

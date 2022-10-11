package ex1;

import java.util.Scanner;

/* 사칙연산 프로그램
 * 1 : +,  2 : -,  3: * ,  4:/
 * 정수 2개 입력, 사칙연산 기호 입력  => 3개 입력
 * 10,20, 4              10/20 = 0.5
 * 10, 20, 1              10+20 = 30
 * 10, 20 , 3            10*20 = 200 
  */
public class FlowEx2_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 2개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("연산기호 : + : 1, - : 2, *:3, /:4 : ");
		int sign = sc.nextInt();
		
		if(sign == 1)
			System.out.println(num1+num2);
		else if(sign == 2)
			System.out.println(num1-num2);
		else if(sign == 3)
			System.out.println(num1*num2);
		else if(sign == 4)
			System.out.println((double)num1/num2);  //실수
	      
		
		
	}
}

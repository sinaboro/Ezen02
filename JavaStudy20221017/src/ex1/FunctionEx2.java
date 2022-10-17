package ex1;

import java.util.Scanner;

/**
 * 함수 4가지 유형, 
 * 1.  반환X, 매개변수X
 * 2. 반환O, 매개변수O
 * 3.  반환X, 매개변수O
 * 4. 반환O, 매개변수X
 * 
 * 두개 정수 입력을 받아서, 나누기 기능을 하는 프로그램 작성
 * */
 
// 2.  반환O, 매개변수O
public class FunctionEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	
		double div  = 반환형매개변수있는함수(num1, num2);
		
		System.out.printf("%d / %d = %.1f\n", num1,  num2 , div);
		System.out.println(num1 + " / " + num2 + " = " + div);
		
		System.out.println("Main 함수 종료!!!");
	}
	
	static double 반환형매개변수있는함수(int n1, int n2){
		
		double result =  (double)n1 / n2;
		return  result; 
	}
}

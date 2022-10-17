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
 
// 4.  반환O, 매개변수X
public class FunctionEx4 {

	public static void main(String[] args) {
	
		double result  = 반환형만있는함수();
		
		System.out.println("result : " + result);
		System.out.println("Main 함수 종료!!!");
	}
	
	static double 반환형만있는함수(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력 : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		double result =  (double)n1 / n2;
		return result;
	}
}

package ex1;

import java.util.Scanner;

/*
 * 매개변수O(입력),  반환x(출력)
 * 함수 --> 원형, 정의, 호출(c언에서 구분..)
 */
public class functionEx5 {

	public static void main(String[] args) {
		System.out.println("함수 프로그램5!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 2 개: ");
		int x,y,z;
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int add = 매개변수2개반환있는함수(num1, num2);   //함수 호출.(메서드 호출)  int n = 100;
		
		System.out.println(num1 + " + " + num2 + " = " + add);
		System.out.println("main함수 종료!!!");
	}
	
	//     void(자리)는 반환타입을 결정, func1는 함수이름(변수 명명규칙과 동일)
	// void는 반환타입이 없다. 즉 return 하지 않는다.
	//                                                 매개변수
	static int 매개변수2개반환있는함수(int number1, int number2) {
		return number1+number2;
	}

}

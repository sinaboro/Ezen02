package ex1;

import java.util.Scanner;

/*
 * 매개변수O(입력),  반환x(출력)
 * 함수 --> 원형, 정의, 호출(c언에서 구분..)
 */
public class functionEx4 {

	public static void main(String[] args) {
		System.out.println("함수 프로그램3!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 : ");
		int num = sc.nextInt();
		System.out.println("main : " + num);
		//                          인자
		매개변수만있는함수(num);   //함수 호출.(메서드 호출)  int n = 100;
		
		System.out.println("main함수 종료!!!");
	}
	
	//     void(자리)는 반환타입을 결정, func1는 함수이름(변수 명명규칙과 동일)
	// void는 반환타입이 없다. 즉 return 하지 않는다.
	//                                                 매개변수
	static void 매개변수만있는함수(int number) {
		System.out.println("함수 : " + number*2);
	}

}

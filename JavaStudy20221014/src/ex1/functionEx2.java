package ex1;

import java.util.Scanner;

/*
 * 매개변수X(입력), 반환O(출력)
 * 함수 --> 원형, 정의, 호출(c언에서 구분..)
 */
public class functionEx2 {

	public static void main(String[] args) {
		System.out.println("함수 프로그램2!!!");
		int n = 반환타입있는함수();   //함수 호출.(메서드 호출)  int n = 100;
		
		System.out.println("main : "+ n*2);
	}
	
	//     void(자리)는 반환타입을 결정, func1는 함수이름(변수 명명규칙과 동일)
	// void는 반환타입이 없다. 즉 return 하지 않는다.
	static int 반환타입있는함수() {
		System.out.println(" 매개변수, 반환형 있는 함수 테스트!!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 : ");
		int num = sc.nextInt();
		System.out.println("func : " + num);
		
		return num;
	}

}

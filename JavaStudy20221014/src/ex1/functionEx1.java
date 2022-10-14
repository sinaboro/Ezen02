package ex1;

/* 인자, 매개변수
 * 매개변수X(입력), 반환X(출력)
 * 함수 --> 원형, 정의, 호출(c언에서 구분..)
 */
public class functionEx1 {

	public static void main(String[] args) {
		System.out.println("함수 프로그램!!!");
		func1();   //함수 호출.(메서드 호출)
		func1();   //함수 호출.(메서드 호출)
		System.out.println("프로그램 종료.........");
	}
	
	//     void(자리)는 반환타입을 결정, func1는 함수이름(변수 명명규칙과 동일)
	// void는 반환타입이 없다. 즉 return 하지 않는다.
	static void func1() {
		System.out.println(" 매개변수, 반환형 없는 함수 테스트!!!");
		
	}

}

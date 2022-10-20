package com.ezen.ex1;

public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d = new Data1();   //new Data1(); 인스턴스(객체)가 생성되면서  생성자를 요구한다. 
		// 그러나 Data1에 존재하지 않으면 자바가 기본생성자를 만들어준다.
		
		Data2 d2 = new Data2();  //new Data2() 생성되면서 기본생성자를 요구 한다..
		// 그러나 이번에는 자바는 기본생성자를 만들지 않는다. 이유는 사용자가 다른 생성자를 만들었기 때문에
		// 결론적으로 사용자는 기본생성자 외 생성자를 만들었을 때는 습관적으로 기본생성자를 만들자..!!!!!
	}

}

class Data1{   //생성자 존재하지 않음, 기본생성자를 java가 만들어줌.
	int value;   
}

class Data2{ //생성자를 사용자가 만들면 기본생성자를 java가 만들지 않음.
	int value;
	
	Data2() {}
	Data2(int x){  //인자값 하나 받는 생성자
		value= x;
	}
}
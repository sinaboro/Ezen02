package com.ezen.ex1;


//1. Tests 클래스를 생성한다.
//2. main method안에서 Tests 클래스로 객체(인스턴스)를 생성한다.
//3. main method안에서 객체를 몇개 생성했는지  갯수를 출력한다.
//예) 5개 인스턴스(객체)를 만들었으면 숫자 5가 출력되면 된다.
public class ClassVarEx1 {

	public static void main(String[] args) {
		System.out.println("객체 생성 갯수 출력 프로그램");
		
		Tests t1 = new Tests();
		t1.num = 100;
		System.out.println(t1.num);
		Tests t2 = new Tests();
		Tests t3  =  new Tests();
		Tests t4 = new Tests();
		Tests t5 = new Tests();
		Tests t6  = new Tests();
		
		
		
		System.out.println(Tests.number);
	}
}


class Tests{
	int num=0;
	static int number = 0;
	Tests(){
		number++;
	}
	
}
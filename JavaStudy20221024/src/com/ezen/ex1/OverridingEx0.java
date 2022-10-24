package com.ezen.ex1;

public class OverridingEx0 {

	public static void main(String[] args) {
		사람 임채리 = new 근로학생();
		//오버라이딩은 참조자료형 클래스를 접근 하는 것이 아니고
		// 참조대상 클래스 접근한다.
		 임채리.sleep();
	}

}

class 사람{
	String name;
	int age;
	 void sleep() {
		System.out.println("사람는 잠잔다.");
	}
}

class 학생 extends 사람{
	String major;  //전공
	void study() {
		System.out.println("학생은 공부하다.");
	}
	 void sleep() {
		System.out.println("학생은 잠잔다.");
	}
}

class 근로학생 extends 학생{
	String job;  //학내에서 하는 일
	void work() {
		System.out.println("근로학생은 일을 한다.");
	}
	
	
	@Override  //어노테이션
	 void sleep() {   
		super.sleep();
		System.out.println("근로학생은 잠잔다.");
	}
}

package com.ezen.ex02;



 interface  Person{
	 void eat();
	  void study();
}

class Student implements Person{
	public void study() {
		System.out.println("공부한다.");
	}

	@Override
	public void eat() {
		
	}
	
}

public class Exer01 {

	public static void main(String[] args) {
		//p참조변수는 Student 안 study 메소드 접근 불가
		Person p = new Student();
		p.study();
		
//		Person p2 = new Person();
		Student s1 = (Student)p;
		
//		s1 = (Student)p2;
//		s1.study();
		
		
	}
}



















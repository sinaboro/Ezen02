package com.ezen.ex01;



 abstract class Person{
	String name ;
	String age;
	abstract void eat() ;
	abstract void study();
}

 abstract class Student extends Person{
	String major;
	String no;
	//오버라이딩
	void study() {
		System.out.println("공부한다.");
	}
}
 class WorkStudent extends Student{

	@Override
	void eat() {
		
	}
	 
 }
public class Exer01 {

	public static void main(String[] args) {
		WorkStudent w = new WorkStudent();
		
		Person p = (Person)w;
	}
}



















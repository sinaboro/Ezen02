package com.ezen.ex04;

public class AbstractEx0 {

	public static void main(String[] args) {
		
		Person 황규성 = new Person("황규성");
		Student 최연정 = new Student();
		
		Tests 이우승 = new Tests();
		이우승.eat();
		
	}
}

//추상 클래스 ........미완성설계도
abstract class AbstractTest{
	int age;
	String name;
	abstract void eat() ;  //추상메소드 --> 바디 없음..
}

class Tests extends AbstractTest{
	public int height = 100;
	@Override
	void eat() {
		System.out.println("먹고 논다..");
	}
	
}

class Person{
	String name;
	int age;
	
	public Person(String name) {
		this.name = name;
	}
	final void eat() {
		System.out.println("사람은 먹는다.");
	}
}

 class Student extends Person{
	String major ; 
	String no;
	
	Student(String major){
		super("백수민");
		this.major = major;
	}
	
	public Student() {
		super("백수민");
	}
	void study() {
		System.out.println("학생은 공부한다");
	}
}
 
 class WorkStuent extends Student{
	 
 }
 
 
 
 
 
 
 
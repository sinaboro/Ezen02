package com.ezen.ex02;

public class PersonEx01 {

	public static void main(String[] args) {
		
		Student 백수민 = new Student();
		백수민.name = "백수민";
	}

}

class Person{
	String name;
	int age;
	
	public Person(String name) {
		this.name = name;
	}
	void eat() {
		System.out.println("사람은 먹는다.");
	}
}

class Student extends Person{
	String major ; 
	String no;
	
	public Student() {
		super("백수민");
	}
	void study() {
		System.out.println("학생은 공부한다");
	}
}
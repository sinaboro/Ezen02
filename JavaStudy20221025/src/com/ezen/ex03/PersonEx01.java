package com.ezen.ex03;

public class PersonEx01 {

	public static void main(String[] args) {
		
		Student 백수민 = new Student("자바");
		백수민.name = "백수민";
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
 
 
 
 
 
 
 
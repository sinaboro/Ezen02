package com.ezen.ex05;

public class Student extends Person{

	String major;
	
	public Student() { 
		System.out.println("student");
	}

	Student(String name, int age, String major){
	super(name, age);	
	this.major = major;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " 전공  :  " + major;
	}
}

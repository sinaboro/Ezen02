package com.ezen.ex01;

class Person2{
	int num=10;
}

class Student extends Person2{
	int num2 = 20;
}
class WorkStudent extends Student{
	int num3 = 30;
}

public class Tests2 {

	public static void main(String[] args) {
		
		Student s = new Student();
		Person2 p = s;
		((Student)p).num2 = 20;
		Student s2 = (Student)p;
		
	}

}

package com.ezen.ex01;

public class PersonEx01 {

	public static void main(String[] args) {
		Person 김대철 = new Person();
		//김대철.name = "김대철";
		김대철.setName("김대철");
		//김대철.age = 150;
		김대철.setAge(150);
		
		Student 백수민 = new Student();
		//백수민.name = "백수민";
		백수민.setName("백수민");
		//백수민.age = -50
		백수민.setAge(-50);
	}

}

class Person{
	private String name;
	private int age;
	
	void setAge(int age) {
		if(age<0 || age>120) 
			System.out.println("나이 입력 요구 확인 바람...");
		else 
			this.age = age;
	}
	 void setName(String name) {
		 this.name = name;
	 }
	void eat() {
		System.out.println("사람은 먹는다. " + age + name);
	}
}

class Student extends Person{
	String major ; 
	String no;
	
	void study() {
		System.out.println("학생은 공부한다 " );
	}
}
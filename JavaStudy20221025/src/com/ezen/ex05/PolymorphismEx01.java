package com.ezen.ex05;

public class PolymorphismEx01 {

	public static void main(String[] args) {
		Person p = new Person();
		p.work();
		p = new OfficeJob();
		p.work();
		
		p = new Student();
		p.work();
		
		p = new SprotsMan();
		p.work();
		//p.run();
		
	}
}

class Person{
	private String name;
	private int age;
	void  work() {
		System.out.println("사람은 일한다.");
	}
	//void run() {};
}

class Student extends Person{  //학생
	void work() {
		System.out.println("공부한다.");
	}
}
class SprotsMan extends Person{
	void work() {
		System.out.println("운동한다.");
	}
	
	void run() {
		System.out.println("달린다.");
	}
}
class OfficeJob extends Person{  //사무직
	void work() {
		System.out.println("사무실에서 일한다.");
	}
}

class Worker extends Person{  //노동자
	void work() {
		System.out.println("현장에게 일한다.");
	}
}


package com.ezen.ex07;


class Person{
	
}
//사람 중 학생
class Student extends Person{  //학생
	
}
//학생 중 근로 학생
class WorkStudent extends Student{  
	
}

public class PolymorphismEx01 {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		Student st = new Student();
		WorkStudent ws  = new WorkStudent();
		
		
		// 참조변수는  자기 자신을 참조할 수 있으며, 또한 자신을 상속한 클래스는 
		// 참조가능
		p = p;
		p = st;
		p = ws;
		
		st = st;
		st = ws;
		//st = p; 하위클래스가 상위클래스 참조불가
		
		ws = ws;
		//ws = st;
		//ws = p;
		
		
	}
}
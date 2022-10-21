package com.ezen.ex1;

class Person{  //사람
	
	String name;
	int age;
	
	Person(){
		System.out.println("Person");
	}
	
}

//Student클래스는 Person클래스를 상속 받았다.
class Student extends Person{ //학생
	
	String no; //학번 
	String major; //전공
	
	Student(){
		System.out.println("Student");
	}
	
}


public class InheritanceEx0 {

	public static void main(String[] args) {
		
		Student 백수민 = new Student();
		백수민.name = "백수민";
		백수민.age = 25;
		백수민.no = "5001";
		백수민.major = "java";
		
		System.out.println(백수민.name);
		
		
	}

}

//class AlbaStudent {    //학생중  학내에서 알바하는 친구
//	
//	String no; //학번 
//	String major; //전공
//	String job;
//	
//	
//}
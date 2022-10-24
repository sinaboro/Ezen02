package com.ezen.ex1;

public class InheritanceEx0 {

	public static void main(String[] args) {
		
		Person 김대철 = new Person("김대철", 53);
		System.out.println(김대철.name);
		System.out.println("---------------------");
		
		
		Student 이상호 = new Student("이상호", 28,"java", "1111");
		System.out.println(이상호.name);
		System.out.println(이상호.age);
		System.out.println(이상호.major);
		System.out.println(이상호.no);
		System.out.println("--------------------");
		
		Student 이예찬 = new Student("이예찬", 25, "java", "2222");
		System.out.println(이예찬.name);
		System.out.println(이예찬.age);
		System.out.println(이예찬.major);
		System.out.println(이예찬.no);
		
		System.out.println("--------------------");
		SportsMan 손흥민 = new SportsMan("손흥민", 30, "축구");
		System.out.println(손흥민.name);
		System.out.println(손흥민.age);
		System.out.println("-------------------");
		SportsMan 김하성 = new SportsMan("김하성",27, "야구선수");
		System.out.println(김하성.name);
		System.out.println(김하성.sports);
		System.out.println("-------------------");
		SportsMan 김연아 = new SportsMan();
		System.out.println(김연아.name);
		System.out.println("-------------------");
		//ctrl+shift+_
		WorkStudent 김정환 = new WorkStudent("김정환",24, "java", "3333", "껌붙이기");
		
		System.out.println(김정환.name);
		System.out.println(김정환.job);

		System.out.println("=======================");
		
		//사람클래스 최영태는 사람클래스만 참조할 수 있다.
		Person 최영태  = new WorkStudent("최영태", 29, "java", "5555", "껌티기");
		
		//근로학생 클래스로 생성한 홍길동은 근로학생만 참조할 수 있다........
		//WorkStudent 홍길동  = new Person(); (x)
		
	}

}

//사람
class Person{
	String name;
	int  age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void sleep() {
		System.out.println("잠을 잔다..");
	}
	void eat() {
		System.out.println("먹는다");
	}
}

//사람 중에 학생
class Student extends Person{
	
	String major ;  //전공
	String no; //학번
	
	public Student() {
		this(null, 0, null, null);
	}
	
	public Student(String major, String no) {
		this(null, 0, major, no);
	}
	public Student(String name, int age,String major, String no) {
		super(name, age);
		this.major = major;
		this.no = no;
	}
	
	void study() {
		System.out.println("공부한다.");
	}
}

//학생 중에 학내에서 일하는 근로 학생
class WorkStudent extends Student{
	String job; //학내에서 일하는 종류
	
	void work() {
		System.out.println("일한다.");
	}
	public WorkStudent(String name, int age, String major, String no, String job) {
		super(name, age, major,no);
		this.job = job;
	}
}

class SportsMan extends Person{
	String sports ; //운동종목

	public SportsMan() {
		this(null, 0, null);
	}
	public SportsMan(String name, int age , String sports) {
		super(name, age);
		this.sports = sports;
	}
	void 운동한다() {
		System.out.println("운동한다.");
	}
}

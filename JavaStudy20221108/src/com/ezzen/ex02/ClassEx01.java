package com.ezzen.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {
		this(null, 0,0,0);
	}
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int sum() {
		return kor+eng+math; 
	}
	
	double avg() {
		return ((int)(sum()/3.0*100))/100.0;
	}
	
	@Override
	public String toString() {
		return name + ", " + kor + "," + eng + ", "
				+ math + ", " + sum() + ", " + avg();
	}
}
public class ClassEx01 {

	public static void main(String[] args) {
		List<Student> st = new ArrayList<>();
		
		st.add(new Student("황규성", 20,30,25));
		st.add(new Student("이우승", 98,100,99));
		st.add(new Student("최연정", 10,19,78));
		st.add(new Student("신건우", 35,45,58));
		st.add(new Student("이성희", 10,29,64));
		
	 	Iterator<Student> it = st.iterator();
	 	while(it.hasNext())
	 		System.out.println(it.next());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.ezzen.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	String getName() {
		return name;
	}
	int getKor() {
		return kor;
	}
	int getEng() {
		return eng;
	}
	int getMath() {
		return math;
	}
	
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
		return name + ", " + kor + "," + eng + ", "  + math + ", " + sum() + ", " + avg();
	}
}

class TeamClass extends Student {
	
	private int sci;
	private int com;
	
	public TeamClass() {	}
	
	public TeamClass(String name, int kor, int eng, int math, int sci, int com) {
		super(name, kor, eng, math);
		this.sci = sci;
		this.com = com;
	}
	
	@Override
	public int sum() {
		return super.sum()+sci+com;
			
	}
	
	@Override
	public double avg() {
		return sum()/5.0;
	}
	
	@Override
	public String toString() {
	//	super.toString();
//		return super.toString() + sci + ",  " + com;
		return  getName() + "," + getKor() + "," + getEng() + "," 
		+ getMath() + "," +sci +"," + com+ "," + sum() +"," + avg(); 
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
	 	
	 	System.out.println("--------------------------");
	 	List<TeamClass> tc = new ArrayList<>();
		
		tc.add(new TeamClass("최빵빵",100,80,70,50,40));
		tc.add(new TeamClass("김대철",0,20,0,0,0));
		tc.add(new TeamClass("김빵빵",100,98,97,30,40));
		tc.add(new TeamClass("이빵빵 ",10,20,30,0,0));
		
		Iterator<TeamClass> it2 = tc.iterator();
		while(it2.hasNext())
			System.out.println(it2.next().toString());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

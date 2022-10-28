package com.ezen.ex03;

//다음 클래스 정의에서 PersonalInfo의 clone 메소드 호출 시 
//깊은 복사가 이뤄지도록 clone메소드를 오버라이딩 하시오..
class Business implements Cloneable{
	private String company;
	private String work;
	
	public Business(String company, String work) {
		this.company = company;
		this.work = work;
	}
	
	public void showBusinessInfo() {
		System.out.println("회사 : " + company);
		System.out.println("업무 : " + work);
	}
}

class PersonalInfo implements Cloneable{
	private String name;
	private int age;
	private Business bz;
	
	public PersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(company, work);
	}

	public void showPersonalInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		bz.showBusinessInfo();
	}
}
public class TestEx00 {

	public static void main(String[] args) {
	}
}

package com.ezen.ex05;

class Person {

	private String name;
	private int age;
	
	public Person() {
		System.out.println("person");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "이름 : " + name + " 나이 : " + age; 
	}
}

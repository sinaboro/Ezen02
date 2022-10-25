package com.ezen.ex04;

public class SingletonEx01 {

	public static void main(String[] args) {
		//SingletonTest s =new SingletonTest();
		//s.sleep();
	}

}

class SingletonTest{
	int age;

	private SingletonTest() {
	}
	void sleep() {
		System.out.println("잔다..");
	}
}

package com.ezen.ex02;

class Apple{
	public String toString() {
		return "I am an apple.";
	}
}

class Orange{
	@Override
	public String toString() {
		return "I am an orange";
	}
}

class Box{
	private Object ob;
	public void set(Object a) { ob = a ; }
	public Object get() { return ob; }
}

public class FruitEx02 {

	public static void main(String[] args) {
		Box aBox = new Box();
		Box bBox = new Box();
		
		aBox.set(new Apple());
		bBox.set(new Orange());
		
		Apple a  = (Apple)aBox.get();
		Orange b = (Orange)bBox.get(); //ob를 b에게 전달
		
		Box sBox = new Box();
		sBox.set(10);
		
	  Integer i	= (Integer)sBox.get();
		
		 
		
	}

//	class Person {}
//	class Student extends Person {}
//	class WorkStudent extends Student{}
//	
//	Person p = new Student();
//	
//	Person p2 = new Person();
//	
//	Student s =  (Student)p2;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

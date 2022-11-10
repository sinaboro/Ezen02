package com.ezen.ex02;

class Apple{
	@Override
	public String toString() {
		return "I am an apple";
	}
}

class Orange{
	@Override
	public String toString() {
		return "I am an orange";
	}
}

class Box{
	private Object ap;
	
	void set(Object a) {
		ap = a;
	}
	Object get() {
		return ap;
	}
}

class Person{
	@Override
	public String toString() {
		return "사람이다.";
	}
}

public class FruitAndBox2 {

	public static void main(String[] args) {
		
		Box box = new Box();
		
		box.set(new Apple());
		
		Apple ap = (Apple)box.get();
		System.out.println(ap);
		
		box.set(new Orange());
		Orange or  = (Orange)box.get();
		System.out.println(or);
		
		box.set(new Person());
		Person p = (Person)box.get();
		System.out.println(p);
		
//		aBox.set(new Apple());
//		oBox.set(new Orange());
//		
//		Apple a  = aBox.get();
//		System.out.println(a);
//		
//		Orange o = oBox.get();
//		System.out.println(o);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

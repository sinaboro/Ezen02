package com.ezen.ex03;

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

class Box<T > {
	private T ap;
	void set(T a) {
		ap = a;
	}
	T get() {
		return ap;
	}
}

class Person{
	@Override
	public String toString() {
		return "사람이다.";
	}
}

public class FruitAndBox3 {

	public static void main(String[] args) {
		
		Box<Apple> box = new Box();
		
		box.set(new Apple());
		Apple ap = box.get();
		System.out.println(ap);
	
		
		Box<Orange> oBox = new Box();
		oBox.set(new Orange());
		Orange o = oBox.get();
		System.out.println(o);
		
		Box<Person> p = new Box();
		p.set(new Person());
		Person pp = p.get();
		System.out.println(pp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

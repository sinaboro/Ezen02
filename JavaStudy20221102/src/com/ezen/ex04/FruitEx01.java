package com.ezen.ex04;

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

public class FruitEx01 {

	public static void main(String[] args) {
		Box aBox = new Box();
		Box bBox = new Box();
//		aBox.set(new Apple());
//		System.out.println(aBox.get());
		aBox.set("Apple");      //new Apple()
		bBox.set("Orange");  //new Orange()
	
		System.out.println(aBox.get());
		System.out.println(bBox.get());
		
	}
}

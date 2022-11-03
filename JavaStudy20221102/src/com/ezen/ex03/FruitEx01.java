package com.ezen.ex03;

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
		
		aBox.set("Apple");      //set( new Apple())
		bBox.set("Orange");  //new Orange()
		Apple a = (Apple)aBox.get();
		//String  a  = (String)aBox.get();
		//Orange b = (Orange)bBox.get(); //ob를 b에게 전달
		
	}
}

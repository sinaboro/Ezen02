package com.ezen.ex01;

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

class AppleBox{
	private Apple  ap;
	public void set(Apple a) {
		ap = a ;
	}
	public Apple get() { return ap; }
}

class OrangeBox{
	private Orange or ;
	public void set(Orange o) { or = o ; }
	public Orange get() { return or; }
}

public class FruitEx01 {

	public static void main(String[] args) {
		
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple a = aBox.get();
	    Orange b= oBox.get();
	    System.out.println(a);
	}
	
}

package com.ezen.ex01;

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

class AppleBox{
	private Apple ap;
	
	void set(Apple a) {
		ap = a;
	}
	Apple get() {
		return ap;
	}
}

class OrangeBox{
	private Orange or;
	
	void set(Orange o) {
		or = o;
	}
	Orange get() {
		return or;
	}
}

public class FruitAndBox {

	public static void main(String[] args) {
		
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple a  = aBox.get();
		System.out.println(a);
		
		Orange o = oBox.get();
		System.out.println(o);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

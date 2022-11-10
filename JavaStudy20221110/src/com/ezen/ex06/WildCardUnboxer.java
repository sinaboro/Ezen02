package com.ezen.ex06;

class Box<T>{
	private T ob;
	public void set(T o) { 	ob =o; 	}
	public T get() { return ob; }
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer {
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
	
	public static <T>  void peekBox(Box<?> box) {
		System.out.println(box);
	}
	
}
public class WildCardUnboxer {

	public static void main(String[] args) {
		Box<String> box = new Box();
		box.set("Sweet");
		Unboxer.peekBox(box);

		Box<Integer> iBox = new Box();
		iBox.set(20);
		Unboxer.peekBox(iBox);
		
		
	}
}




















package com.ezen.ex09;

//상한 제한 목적.........
class Box<T>{
	private T ob;
	public void set(T o) { 	ob =o; 	}
	public T get() { return ob; }
}

class Toy{
	@Override
	public String toString() {
		return "Toy.......";
	}
}

class BoxHandler{
	public static void outBox(Box<? extends Toy> box) {
		Toy t = box.get();
		//box.set(new Toy());  왜? error 날까?
		System.out.println(t);
	}
	public static void inBox(Box<Toy> box, Toy n) {
		box.set(n);
		
	}
}

public class WildCardUnboxer {

	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}
}




















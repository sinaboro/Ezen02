package com.ezen.ex05;

class Box<T>{
	private T ob;
	public void set(T o) { 	ob =o; 	}
	public T get() { return ob; }
}
class BoxFactory{
	public static  <T extends Number> Box<T> makeBox(T o){  //제네릭 메소드
		Box<T> box = new Box<T>();
		box.set(o);
		System.out.println("Boxed data : " + o.intValue());
		return box;
	}
}
class unboxer {
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println("Unboxed data : " + box.get().intValue());
		return box.get();
	}
}
public class GenericMethodEx01 {

	public static void main(String[] args) {
		Box<Integer> sBox = BoxFactory.<Integer>makeBox(8888);
//		Box<Integer> sBox = BoxFactory.<Integer>makeBox(new Integer(8888));
		int n = unboxer.<Integer>openBox(sBox);
		System.out.println("Returned data : " + n);
	}
}

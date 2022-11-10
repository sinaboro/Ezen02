package com.ezen.ex03;

class Box<T>{
	private T ob;
	public void set(T o) { 	ob =o; 	}
	public T get() { return ob; }
}

class BoxFactory{
	//                    반환타입  함수명(매개변수)
	public static  <T> Box<T> makeBox(T o){  //제네릭 메소드
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}
}
public class GenericMethodEx01 {

	public static void main(String[] args) {
		Box<String> sBox = BoxFactory.makeBox("Sweet");
		//sBox = BoxFactory.makeBox(12345);
		
		System.out.println(sBox.get());
		
		Box<Double> dBox = BoxFactory.makeBox(7.85);
		System.out.println(dBox.get());
	}

}

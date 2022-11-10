package com.ezen.ex04;

class Box<T>{
	private T ob;
	public void set(T o) { 	ob =o; 	}
	public T get() { return ob; }
}

class BoxFactory{
	public static  <T> T makeBox(Box<T> o){  //제네릭 메소드
		return o.get();
	}
}
public class GenericMethodEx01 {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("Sweet");
		
		String str = BoxFactory.<String>makeBox(box);
		System.out.println(str);
	}

}

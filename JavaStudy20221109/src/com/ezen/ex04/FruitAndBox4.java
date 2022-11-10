package com.ezen.ex04;

import com.ezen.ex01.FruitAndBox;

class Box<T extends Number> {  //정수 실수 담는 박스...
	private T ap;
	void set(T a) {
		ap = a;
	}
	T get() {
		return ap;
	}
}


public class FruitAndBox4 {

	public static void main(String[] args) {
		
		Box<Integer> i = new Box();
		i.set(10);
		
		Box<Double> d = new Box();
		d.set(10.5);
		
//		Box<String> s = new Box();
//		s.set("kor");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

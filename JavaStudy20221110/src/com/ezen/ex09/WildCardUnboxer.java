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
											     //get가능, set불가
													//Toy 이거나 Toy 상속한 아이들 만 가능
	public static void outBox(Box<? extends Toy> box) {  
		Toy t = box.get();
		//box.set(new Toy());  왜? error 날까?
		System.out.println(t);
	}
	                                            // Toy 이거나 Object
												//set가능, get불가..
	public static void inBox(Box< ? super Toy> box, Toy n) {
		box.set(n);
	//	Toy toy = box.get();
	}
}

public class WildCardUnboxer {

	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
                  //Toy, Object
		BoxHandler.outBox(box);
		BoxHandler.inBox(box, new Toy());
	}
	
	// 1) a값을 b 이동    2  
	//2) b값을 a 이동    6 3
	//3) 상관없다...       5 4                    set                                     get
	public static void moveBox(Box<? super Toy>  a, Box<? extends Toy> b) {
		
	}
}




















package com.ezen.ex1;

class Parent{
	int x =  100;  //200
	
	Parent() {
		this(200);
		System.out.println("Parent()");
	}
	Parent(int x){
		this.x  = x;
		System.out.println("Parent(int x)");
	}
	
	int getX() { return x; }
}

class Child extends Parent{
	int x = 3000;  //1000
	Child(){
		super(500);
//		this(1000);
		System.out.println("Child()");
	}
	Child(int x ){
		this.x = x;
		System.out.println("Child(int x)");
	}
}

public class Exercise7_5 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.getX());
	}

}

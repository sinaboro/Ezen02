package com.ezen.ex1;

public class ClassVarEx2 {

	public static void main(String[] args) {
		Tests2 t = new Tests2();
		t.ivfunc();
		
		Tests3.cv = 100;
	}
}

class Tests3{
	
	int iv = 0;
	static int cv = 0;
	
	void ivfunc() {
		iv = 0;
		cv = 0;
		testfunc();
		cvfunc();
		System.out.println("------");
	}
	
	static void cvfunc() {
		
		cv = 100;
		testfunc();
	}
	
	static void testfunc() {
		cv = 200;
		cvfunc();
//		iv = 100;
//		ivfunc();
	}
}

class Tests2{
	
	int iv = 0;
	static int cv = 0;
	
	void ivfunc() {
		iv = 0;
		cv = 0;
		testfunc();
		cvfunc();
		System.out.println("------");
	}
	
	static void cvfunc() {
		
		cv = 100;
		testfunc();
	}
	
	static void testfunc() {
		cv = 200;
		cvfunc();
//		iv = 100;
//		ivfunc();
	}
}
	

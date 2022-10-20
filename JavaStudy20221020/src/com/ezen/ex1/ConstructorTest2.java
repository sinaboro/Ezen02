package com.ezen.ex1;

public class ConstructorTest2 {

	public static void main(String[] args) {
		Data3 d = new Data3();   
		
		Data3 d2 = new Data3(2, 100, "test");
		System.out.println(d2);
		
		Data3  d3 = new Data3(1);
		System.out.println(d3);
	
		Data3  d4 = new Data3(1, 50);
		System.out.println(d4);
	
	}
}
class Data3{   
	int value;
	int number;
	String msg;
	
	Data3(){}; //기본생성자는 무조건 만들자!!
	
	Data3(int value, int number, String msg){
		this.value = value;
		this.number = number;
		this.msg = msg;
	}
	
	Data3(int value){
		this(value,0, null);
		//this.value  = value;
	};
	
	Data3(int value, int number){
		this(value, number, null);
//		this.value  = value;
//		this.number = number;
	};
	
	public String toString() {
		return  value + " , " + number + " , " + msg;
	}
}



package com.ezen.ex01;

class Person{
	long id;
	
	Person(long id){
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person)
			return id ==  ((Person)obj).id;
		else
			return false;
	}
	@Override
	public String toString() {
		return id + "";
	}
}

class EqualsEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(1111);
		Person p2 = new Person(1111);
		String p3 = "1111";
		
		if(p1 == p2)
			System.out.println("p1과 p2는 같은 사람!!");
		else
			System.out.println("p1과 p2는 다른 사람!!");
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람!!");
		else
			System.out.println("p1과 p2는 다른 사람!!");
		
		if(p1.equals(p3)) System.out.println("----------------");
		
		System.out.println(p1);
	} // main
} 


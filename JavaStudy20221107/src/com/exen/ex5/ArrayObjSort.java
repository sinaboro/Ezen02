package com.exen.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person implements Comparable{
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " , " + age;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
//		if(this.age > p.age)
//			return 1;
//		else if(this.age < p.age)
//			return -1;
//		else 
//			return 0;
		return this.age - p.age;
		//return p.age - this.age;
	}
}

public class ArrayObjSort {

	public static void main(String[] args) {
		Integer x=15;
		Integer y=5;
		
		System.out.println( x.compareTo(y) );
		
		List<Person> list = new ArrayList<>();
	
		
		list.add(new Person("강감찬", 50));
		list.add(new Person("강감찬", 50));
		list.add(new Person("강감찬", 50));
		
		//Arrays.sort(per);
		
		for(Person p : list)
			System.out.println(p + "\t");
	}

}

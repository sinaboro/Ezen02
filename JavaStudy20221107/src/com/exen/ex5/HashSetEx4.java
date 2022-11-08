package com.exen.ex5;
import java.util.*;

class HashSetEx4 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add(new String("111"));
		set.add(new String("111"));
		
		set.add(new Person2("David",10));
		set.add(new Person2("David",10));

		System.out.println(set);
	}
}

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age==tmp.age;
	}

	public int hashCode() {
		//return (name+age).hashCode();
		return Objects.hash(name, age);
	}

	public String toString() {
		return name +":"+ age;
	}
}

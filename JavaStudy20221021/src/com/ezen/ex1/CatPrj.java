package com.ezen.ex1;

public class CatPrj {

	//야홍, 뽀양, 강산, 로이
	public static void main(String[] args) {
		Cat 야홍 = new Cat("야홍", 3);
		Cat 야홍2 = new Cat();
		
		System.out.println(야홍);
		
		Cat 뽀양 = new Cat("뽀양", 4, false, 3.2);
		System.out.println(뽀양.toString());
		
		야홍.character("미친개");
		뽀양.character("평화주의자");
		
		Cat 강산 = new Cat("강산", 1, false, 3.5);
		System.out.println(강산.toString());
		강산.character("태어나 보니 고양이");
		
		Cat 강산2 = new Cat(강산);
		
		System.out.println(강산2);
		
		강산2.age = 2;
		
		System.out.println(강산2);
		System.out.println(강산);
	}

}


class Cat{
	String name;
	static String servant ;  //집사
	int age;
	boolean sex;
	double weight;
	
	Cat() {}
	Cat(String name){
		this(name, 0, false, 0.0);
	}
	
	Cat(String name, int age){
		this(name, age, false, 0.0);
	}
	
	Cat( Cat copy){
		this(copy.name, copy.age, copy.sex, copy.weight);
	}
	
	Cat(String name, int age, boolean sex, double weight){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight   = weight;
		this.servant = "김대철"; //servant = "김대철";
	}
	@Override
	public String toString() {
		return name + ",  " + age + "살,  " +  ( (sex) ? "여아" : "남아") + ", " + weight + "kg";
	}
	
	void character(String character_) {
		System.out.println(character_ + " 성질을 가지고 있다.");
	}
	
	void sleep(int sleep_) {
		System.out.println(name + "는 " + sleep_ + "잠을 잔다.");
	}

	void 예방접종일(String name, int day) {
		System.out.println(name+"은 접종일은 " + day +"입니다.");
	}
	
	
}
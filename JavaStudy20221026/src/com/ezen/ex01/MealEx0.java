package com.ezen.ex01;

abstract class 주식문화{
	abstract void 먹는다(); 
}

class 중국인 extends 주식문화{

	@Override
	void 먹는다() {
		
	}
	
}

class 한국인 extends 주식문화{
	@Override
	void 먹는다() {
		System.out.println("한국인은 밥이 주식");
	}
}

class 미국인 extends 주식문화{
	@Override
	void 먹는다() {
		System.out.println("미국인은 빵이 주식..");
	}
}

class 동남아 extends 주식문화{
	@Override
	void 먹는다() {
		System.out.println("동남아인은 국수가 주식...");
	}
}

public class MealEx0 {

	public static void main(String[] args) {
		주식문화  한 = new 한국인();
		한.먹는다();
		
		한 = new 미국인();
		한.먹는다();
		
		한 = new 동남아();
		한.먹는다();
	}

}






















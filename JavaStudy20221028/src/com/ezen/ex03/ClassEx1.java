package com.ezen.ex03;

final class Card{
	String kind;
	int num;
	
	public Card() {
		this("SPADE", 1);
	}

	public Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		return kind + " : " + num;
	}
}

public class ClassEx1 {
	public static void main(String[] args) {
		Card c = new Card("HEART",3);
		Card c2;
	
		try {
			c2 = Card.class.newInstance();
			System.out.println("c2 : " + c2);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	
		Class cObj = c.getClass();
		
		System.out.println(c);
		//System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
		
		String str = "korea";
		
		String str2 = str.replace("rea", "REA");
		System.out.println(str2);
		
		
		
	}
}

package com.ezen.ex01;

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}
	
	
}

class CardToString {
	public static void main(String[] args) {
		Card c1 = new Card("kind", 10);
		Card c2 = new Card("space", 20);

		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}

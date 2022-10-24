package com.ezen.ex1;

import com.ezen.ex2.Circle3;

public class CircleEx0 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.r=5;
		c.p.x = 10;
		c.p.y = 20;
		System.out.println(c.p.x);
		
		Circle3 cir = new Circle3();
		System.out.println(cir.x);
	}

}

class Point{
	int x;
	int y;
}

class Circle {
	int r;
	Point p =  new Point();
}

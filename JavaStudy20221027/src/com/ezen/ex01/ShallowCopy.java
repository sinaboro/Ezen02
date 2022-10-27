package com.ezen.ex01;

class Point  implements Cloneable{
	private int xPos;
	private int yPos;
	
	public Point(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	@Override
	public String toString() {
		return "Point [xPos=" + xPos + ", yPos=" + yPos + "]";
	}
	public void changePos(int x,int y) {
		xPos = x;
		yPos = y;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Rectangle implements Cloneable{
	private Point upperLeft;
	private Point lowerRight;
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}

	public void changePos(int x1,int y1, int  x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2,y2);
	}
	
	@Override
	public String toString() {
		return "Rectangle [upperLeft=" + upperLeft + ", lowerRight=" + lowerRight + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ShallowCopy {

	public static void main(String[] args) {
		Rectangle org  = new Rectangle(1, 1, 9, 9);
		Rectangle cpy;
		
		try {
			cpy = (Rectangle)org.clone();
			org.c
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

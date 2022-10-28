package com.ezen.ex03;

class Point  implements Cloneable{
	private int xPos;
	private int yPos;
	
	public Point(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}
	public void showPosition() {
		System.out.printf("[%d , %d] ",xPos, yPos);
		System.out.println();
	}
	public void changePos(int x, int y) {
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
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	
	public void showPosition() {
		System.out.print("좌측 상단 : ");
		upperLeft.showPosition();
		System.out.print("우측 하단 : ");
		lowerRight.showPosition();
		System.out.println();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Rectangle copy = (Rectangle)super.clone();
		
		copy.upperLeft = (Point)upperLeft.clone();
		copy.lowerRight = (Point)lowerRight.clone();
		return copy;
	}
}

public class DeepCopy {

	public static void main(String[] args) {
		
		Rectangle org  = new Rectangle(1, 1, 9, 9);
		Rectangle cpy;
		
		int num = 100;
		Object obj = num;
		
		try {
			cpy = (Rectangle)org.clone();
			org.changePos(2, 2, 7, 7);
			cpy.showPosition();
			org.showPosition();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
package com.ezen.ex01;

class Point implements Cloneable{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]", x,y);
		System.out.println();
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class InstatceCloning {

	public static void main(String[] args) {
		
		Point org = new Point(5, 10);
		Point cpy;
		
		try {
			cpy = (Point)org.clone();
			org.x = 100;
			org.y = 200;
			
			cpy.showPosition();
			org.showPosition();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}

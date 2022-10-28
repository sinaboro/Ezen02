package com.ezen.ex01;

import com.ezen.ex02.Point;

//MakerInterface
class Point  implements Cloneable{
	 int xPos;
	 int yPos;
	
	public Point(int xPos, int yPos) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]\n", xPos, yPos);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class InstanceClone {

	public static void main(String[] args) {
		
		Point org = new Point(3,5);
		Point cpy;
		
		try {
			cpy = (Point)org.clone();
			org.showPosition();
			cpy.showPosition();
			org.xPos = 10;
			org.yPos = 20;
			
			org.showPosition();
			cpy.showPosition();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}

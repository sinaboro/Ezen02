package ex1;

import java.util.Arrays;

public class Array00 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++)
			ball[i] = i+1;
		
		int tmp=0;
		int j = 0;
		for(int i=0; i<6; i++) {//i -> 0,1,2,3,4,5,6(탈출)
			j = (int)(Math.random()*45);  //0~44  7
			tmp = ball[i];  //tmp(1)
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		
		for(int i=0; i<6; i++)
			System.out.printf("ball[%d]= %d\n",i, ball[i]);
	}

	
	
	
	
	
	
}

package ex1;

public class ArrayEx00 {

	public static void main(String[] args) {
		
		int[] score = new int[2];
		
		for(int i=0; i<6; i++) {
			int n = (int)(Math.random()*45)+1;
			score[i] =n;
		}
		for(int i=0; i<6; i++) {
			System.out.print(score[i] + ", ");
		}
		
		
			
	}

}

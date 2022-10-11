package ex1;

import java.util.Scanner;

// 로또....(1 ~ 45)
public class FlowEx7_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	   for(int i=0;  i<6;  i++) {
			int com = (int)(Math.random()*45)+1;
			                    //0~ 44
			System.out.print(com + ", ");
	   }
		
	}

}

package ex1;

import java.util.Scanner;

/* 점수따른 학점 출력 
 * 90 : A,   80 : B, 70 : C, 60: D,  F 
  */
public class FlowEx2_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//중첩 if문
		if(num>=90)
			System.out.println("학점 A");
		
		else {
			if(num >= 80)
				System.out.println("학점 B");
			
			else {
				if(num >= 70)
					System.out.println("학점 C");
				
				else {
					if(num >= 60)
						System.out.println("학점 D");
					else
						System.out.println("학점 F");
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

package test;

import java.util.Scanner;


public class Exam07 {

	public static void main(String[] args) {
		
		System.out.println( 5>2  && 2 < 5 );
		System.out.println( 5>2  && 2 > 5 );
		
		int num = 3;
		
		if( num%2 == 0 && num % 3 ==0)
			System.out.println("2의 배수이면서 동시에 3의 배수");

		if( num%2 == 0 || num % 3 ==0)
			System.out.println("2의 배수이거나 3의 배수");
		
	}

}

package ex1;

import java.util.Scanner;

class FlowEx2 {
	public static void main(String[] args) {  
		int input;

		System.out.print("숫자를 하나 입력하세요.>");

		Scanner scanner = new Scanner(System.in);  //객체
		
//		String tmp = scanner.nextLine();     // 11 0101 "5"
//		input = Integer.parseInt(tmp);   //101 ==> 5
		input = scanner.nextInt();

		if(input==0)  //참
			System.out.println("입력하신 숫자는 0입니다.");	
		else {  //거짓
			System.out.println("입력하신 숫자는 0이 아닙니다.");		
			System.out.println("입력하신 숫자는 "+ input +"입니다.");
		}
		
		
	}
}

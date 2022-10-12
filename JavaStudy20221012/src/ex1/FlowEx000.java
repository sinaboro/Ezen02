package ex1;

import java.util.Scanner;

/*
 * 정수 3개를 입력받아서,,  최대값과 최소값을 구하는 프로그램 작성
 */
public class FlowEx000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int in1 = sc.nextInt();
		int in2 = sc.nextInt();
		int in3 = sc.nextInt();
		int max=0,  min=0;
		
		System.out.println(in1 + ", " + in2 + ", " + in3);
		
		if( in1 > in2 && in1 > in3) {
			max  = in1;
			min = (in2>in3) ?  in3 : in2;
		}else if( in2 > in1 && in2> in3) {
			max  = in2;
			min = (in1>in3) ?  in3 : in1;
		}else if(in3 > in1 && in3> in2) {
			max = in3;
			min = (in1>in2) ?  in2 : in1;
		}
			
		
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
	}

}

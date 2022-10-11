package ex1;

import java.util.Scanner;

/* 점수따른 학점 출력 
 * 90 : A,   80 : B,     70 : C, 60: D, F 
  */
public class FlowEx2_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
	    int num = sc.nextInt();
	    /*
	     * 99/10 = 9.9  , 9
	     */
	    switch(num/10){
	    case 10:
	    case 9 :
	    	System.out.println("A학점");
	    	break;
	    case 8:
	    	System.out.println("B학점");
	    	break;
	    case 7:
	    	System.out.println("C학점");
	    	break;
	    case 6:
	    	System.out.println("D학점");
	    	break;
	   	default :
	   		System.out.println("F학점");
	    }
	    
	    System.out.println("program 종료!!");
	}
	
}

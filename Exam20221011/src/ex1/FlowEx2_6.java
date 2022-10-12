package ex1;

import java.util.Scanner;

public class FlowEx2_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
	    String str = sc.nextLine();
	    
	    switch(str){
	    case "aaa":
	    	System.out.println("aaa번 입력");
	    	break;
	    case "bbb":
	    	System.out.println("bbb번 입력");
	    	break;
	    case "ccc":
	    	System.out.println("ccc번 입력");
	    	break;
	    case "ddd":
	    	System.out.println("ddd번 입력");
	    	break;
	   	default :
	   		System.out.println("그 외 입력");
	    }
	    
	    System.out.println("program 종료!!");
	}
	
}

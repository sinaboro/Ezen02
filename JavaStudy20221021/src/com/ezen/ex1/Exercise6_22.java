package com.ezen.ex1;


public class Exercise6_22 {

	public static void main(String[] args) {
		
		String str  = "123";
		System.out.println( str + " , " + isNumber(str));

		str  = null;
		System.out.println( str + " , " + isNumber(str));

		str  = "123o";
		System.out.println( str + " , " + isNumber(str));
	}

	static boolean isNumber(String str){
		
		if (str == null || str.equals("")) return false;
		
		for(int i=0; i<str.length(); i++) {
			char tmp = str.charAt(i);
			if(tmp < '0' || tmp > '9' ) return false;
		}
		return true;
		
//		boolean chk = false;
//		for(int i=0; i<str.length(); i++) {
//			char tmp = str.charAt(i);
//			if(tmp >= '0' && tmp <= '9' ) 
//				chk = true;
//			else {
//				chk = false;
//				break;
//			}
//		}
//		return chk;
	}
	
}



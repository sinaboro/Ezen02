package com.ezen.ex03;

class ExceptionEx2 {
	public static void main(String args[]) {
		int number = 100;
		int result = 0;
		int[] arr = new int[50];
		for(int i=0; i < 100; i++) {
			
			try {
				result = number / (int)(Math.random() * 10);
				System.out.println(result);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	} 
}

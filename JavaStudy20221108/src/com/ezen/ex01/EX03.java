package com.ezen.ex01;

import java.util.Scanner;

public class EX03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학년을 입력해주세요(예)1~4학년) >>");
		int grade = sc.nextInt();
		
		System.out.println("점수 >> ");
		sc = new Scanner(System.in);
		int jumsu = sc.nextInt();


       if(jumsu <0 || jumsu >100)
    	   System.out.println("점수는 0 ~ 100 사이 입력!!");
       else if(grade == 4 && jumsu >=70)
    	   System.out.println("4학년 합격!!");
       else if(grade < 4 && jumsu >=60)
    	   System.out.println("1~3학년 합격!!");
       else 
       		System.out.println("정신 차리자....");
       
       
       
       
       
       
       
       
       
       
       

	}
}
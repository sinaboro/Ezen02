package test;

import java.util.Scanner;
// ���� ������(if ��)
// if��,    if~else,     if~elseif~elseif~ else
public class Exam11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		
//		if(num>0)
//			System.out.println("���");
//		if(num == 0)
//			System.out.println("zero");
//		if(num < 0)
//			System.out.println("����");
		
//		if(num>0)
//			System.out.println("���");
//		else if(num == 0)
//			System.out.println("zero");
//		else if(num < 0)
//			System.out.println("����");
		if(num>90)
			System.out.println("A");
		else if(num > 80)
			System.out.println("B");
		else if(num > 70)
			System.out.println("C");
		else if(num > 60)
			System.out.println("D");
		else
			System.out.println("F");
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

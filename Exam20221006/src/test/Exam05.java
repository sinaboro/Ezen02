package test;

import java.util.Scanner;

/* ����......
 * Ű����� 4000�� �Է� �޴´�. (4000��)
 * ��Ģ������ �̿��ؼ� �� �� �� �� ����
 *   1�� 6�� 40��
 *   */
public class Exam05 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("�� �Է� ���ּ��� : ");
//		int time = sc.nextInt();
		int time = 0;
		int hour=0;
		int minute=0;
		int second=0;
		
		second = time%60;  //��
		minute = time/60;
		hour = minute/60;  //�ð�
		minute = minute%60;  //��
		System.out.println("time : " + time);
		System.out.println(hour + "�� " + minute+"�� " + second+"��");
		//1�� 6�� 40��
		
		int a = 1000000;
//		int result1 =  (int)( (long)a * a  /  a);
		long result1 =   (long)a * a  /  a;
		//int * int ==> int
		//long * int -->  long * long -> long
		System.out.println(result1);
	}

}

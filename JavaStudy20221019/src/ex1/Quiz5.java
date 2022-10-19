package ex1;

import java.util.ArrayList;
import java.util.List;

public class Quiz5 {

	public static void main(String[] args) {
		int[] number = new int[40];  //랜덤하게 40개 저장(1~40숫자)
		
		int[] odd = new int[40];  //짝수만
		int[] even = new int[40];  //홀수만
		int index1, index2;
		index1 = index2= 0;
		
		for(int i=0; i<number.length; i++)
			number[i] = i+1;
		
		for(int i=0; i<number.length; i++) {
			int index =  (int)(Math.random()*40);
			int tmp = number[i];
			number[i] = number[index];
			number[index] = tmp;
		}
		
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i] + ", ");
		}
		System.out.println("\n---------------------------------");
		
		for(int i=0; i<number.length; i++) {
			if(number[i] % 2 == 0 )
				odd[index1++] = number[i];
			else
				even[index2++] = number[i];
		}
		
		int[] odd2 = new int[index1];
		System.arraycopy(odd, 0, odd2, 0, index1);
		int[] even2 = new int[index2];
		System.arraycopy(even, 0, even2, 0, index2);
		
		System.out.println();
		for(int i=0; i<odd.length; i++) {
			System.out.print(odd[i] + ", ");
		}
		System.out.println();
		for(int i=0; i<odd2.length; i++) {
			System.out.print(odd2[i] + ", ");
		}
		System.out.println();
		for(int i=0; i<even.length; i++) {
			System.out.print(even[i] + ", ");
		}
		System.out.println();
		for(int i=0; i<even2.length; i++) {
			System.out.print(even2[i] + ", ");
		}
		
		//내림차순 정렬
	}

}

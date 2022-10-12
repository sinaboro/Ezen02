package ex1;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		int[] score = new int[] {50,60,70,80,90};
		int k = 1;



		int tmp = score[k+2] + score[4];  // int tmp = score[3] + score[4]

	    // for문으로 배열의 모든 요소를 출력한다.
		for(int i=0; i < 5; i++) {
			System.out.printf("score[%d]:%d%n",i, score[i]);		
		}

		System.out.printf("tmp:%d%n", tmp);
		//System.out.printf("score[%d]:%d%n",7,score[7]); //index의 범위를 벗어난 값
		System.out.println(score.length);
	}

}

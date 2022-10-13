package ex1;

public class Array000 {

	public static void main(String[] args) {
		int[]  num = new int[10];
		int sum=0; 
		
		//배열 저장(random 이용.. 1~100사이)
		for(int i=0; i<num.length; i++)
			num[i] = (int)(Math.random()*100) + 1;
		
		//배열 출력
		for(int i=0; i<num.length; i++)
			System.out.print(num[i] + ", ");
		
		//배열 총합 과 평균 구해서 출력
		for(int i=0; i<num.length; i++) 
			sum  +=  num[i];
		
		System.out.print("\n총합 : " + sum);
		System.out.print(",  \t평균 : " + (double)sum/num.length);
		
		//최대값 , 최소값 출력
		int max = num[0];
		int min = num[0];
		for(int i=1; i<num.length; i++) {
			if(max < num[i])  max = num[i];
			if(min > num[i])  min = num[i];
		}
		System.out.print("\n최대값 : " + max);
		System.out.print(", \t최소값 : " + min);
		
		System.out.println("\n----------------------");
		for(int i=0; i<num.length; i++)
			System.out.print(num[i] + ", ");
		System.out.println("\n----------------------");
	
		//작은순서에서 큰순서대로 정렬 (오름차순)
		for(int i=0; i<num.length-2; i++) {
			for(int j=0; j<num.length-1; j++) {
				//for(int j=0; j<num.length-1-i; j++) {
				if(num[j]>num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<num.length; i++)
			System.out.print(num[i] + ", ");
	}

}

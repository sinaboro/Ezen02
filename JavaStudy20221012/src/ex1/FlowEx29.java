package ex1;

public class FlowEx29 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			System.out.printf("i = %d ", i);
			int tmp = i ; //tmp는 for안에서만 사용가능(지역변수)
		//	System.out.println("tmp%10%3 : " + tmp%10%3);
			do {
		
				if( tmp%10%3 == 0 && tmp%10 != 0 )
					System.out.print("짝");
				
			}while( (tmp /= 10) != 0);
			System.out.println();
			
		}
	}

}

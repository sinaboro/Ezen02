package ex1;

public class FlowEx28_1 {

	public static void main(String[] args) {
		
		int sum, i;
		sum =0;
		i = 100;
		
		do {
			sum += i;
			i++;
		}while(i<=10);
		System.out.println("do : " + sum);
	}

}

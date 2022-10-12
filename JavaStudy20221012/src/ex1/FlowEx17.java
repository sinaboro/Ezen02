package ex1;

public class FlowEx17 {
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;  i<=10; i++) {
				sum += i;
		}
		System.out.println("for : " + sum);
		
		sum = 0;
		int i=0;
		while(i <= 10) { 
			sum += i;
			i++;
		}
		
		System.out.println("while : " + sum);
		
		
	}
}

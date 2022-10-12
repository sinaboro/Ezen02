package ex1;

public class FlowEx17_1 {
	public static void main(String[] args) {

		int i=2;
		while(i<=3){
			int j=1;
			while(j<=5) {
				System.out.println(i + " * " + j + " = " + i*j);
				j++;
			}
			i++;
			System.out.println();
		}
		
		boolean flag = true;
		
		int k=0;
		while(flag) {
			
			System.out.println("----------------");
			if(k++>10)
				flag = false;
		}
	}
}

package ex1;

class FlowEx1 {
	public static void main(String[] args) { 
	
		int x= 0;

		System.out.printf("x=%d 일때, 참인 것은%n", x);

		if(x==0) 		
			System.out.println("x==0");
		
		if(0 != 0) System.out.println("x!=0");
		
		if(!(x==0)) {
			System.out.println("!(x==0)");
		}
		
		if(!(x != 0)) {
			System.out.println("!(x!=0)");
			System.out.println("if문 테스트중..........");
		}
		System.out.println();

		x = 1;
		System.out.printf("x=%d 일때, 참인 것은%n", x);

		if(x==0) 
			System.out.println("x==0");
		
		
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
	}
}

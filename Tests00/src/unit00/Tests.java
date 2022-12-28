package unit00;

import java.util.Calendar;

interface Calculable{
	public void calculate(int x, int y);
}

class Lamda implements Calculable{

	@Override
	public void calculate(int x, int y) {
		System.out.println(x+y);
	}
	
}
public class Tests {
	public static void main(String[] args) {
		
		Tests test = new Tests();
		
//		test.action( (x,y)-> System.out.println(x+y) );
		test.action( new Lamda());
	}
	
	
	
	public void action(Calculable calculable) { 
		int x =10;
		int y = 4;
		calculable.calculate(x, y);
	}
}

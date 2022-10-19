package ex1;

public class TvEx1 {

	public static void main(String[] args) {
		
		
//		Tv2 tv = new Tv2();
		
//		tv.channel = 11;
//		System.out.println(tv.channel);
		System.out.println(Tv2.cv);
		for(int i=0; i<10; i++) {
			;
		}
	}

}

class Tv2{
	String color;
	boolean power;
	int channel;
	static int cv =100;
	
	void power() {
		power = !power;
	}
	
	void channelup() { channel++;}
	void channeldown() { channel--;}
}




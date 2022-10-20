package ex1;

public class TvEx1 {

	static int num = 1;
	
	public static void main(String[] args) {
		
		
//	 Tv2 tv = new Tv2();
		
	//	tv.channel = 11;
//	System.out.println(tv.channel);
		//System.out.println(Tv2.channel);
		float num = 4/0;
		System.out.println(Tv2.cv);
		System.out.println(TvEx1.num);
		for(int i=0; i<10; i++) {
			;
		}
		
	}

}

class Tv2{
	String color;  //iv
	boolean power;  //iv
	 int channel; //iv
	static int cv =10000; //cv
	
	void power() {
		int num=10;   //lv
		power = !power;
	}
	
	void channelup() { channel++;}
	void channeldown() { channel--;}
}




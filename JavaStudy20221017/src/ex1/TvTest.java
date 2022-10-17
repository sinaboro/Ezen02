package ex1;

public class TvTest { 
	public static void main(String args[]) { 
		Tv t = new Tv("파랑");                  // Tv인스턴스를 참조하기 위한 변수 t를 선언       
		//t = new Tv();          // Tv인스턴스(객체)를 생성한다. 
	   t.show();
	   
	   Tv t2  = new Tv("검정", false);
	   Tv t3  = new Tv("노란", false, 11);
	   
	   Tv t4 =  new Tv(); //디폴트생성자
	} 
}

class Tv { 
    // Tv의 속성(멤버변수) 
    String color;           	// 색상 
    boolean power;         	// 전원상태(on/off) 
    int channel;           	// 채널 

    //디폴트 생성자
    Tv(){
    	System.out.println("디폴트생성자");
    }
    Tv(String c){
    	color = c;
    	System.out.println("1개 매개변수 생성자");
    }
    Tv(String c, boolean p){
    	color = c;
    	power = p;
    	System.out.println("2개 매개변수 생성자");
    }
    Tv(String c, boolean p, int ch){
    	color = c;
    	power = p;
    	channel = ch;
    	System.out.println("3개 매개변수 생성자");
    }
    
    
    
    // Tv의 기능(메서드) 
    void power()   { power = !power; }  // TV를 켜거나 끄는 기능을 하는 메서드  
    void channelUp()   {  ++channel; }  // TV의 채널을 높이는 기능을 하는 메서드 
    void channelDown() { --channel; }   // TV의 채널을 낮추는 기능을 하는 메서드  
    void show() {
    	System.out.println(color + ", " + power + ", " + channel);
    }
}


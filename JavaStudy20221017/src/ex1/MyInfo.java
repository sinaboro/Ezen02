package ex1;

public class MyInfo {

	public static void main(String[] args) {
		//              참조변수
		MyWedding 박서준 = new MyWedding(183.2, 75.4, "잘 생겼다.", "배우");
		박서준.set이름("박서준");
		박서준.set재산(100);
		박서준.money();
		박서준.show();
	}

}

class MyWedding{
	
	 long 재산;
	double 키;
	double 몸무게;
	String 이름;
	String  가치관;
	String 직업;
	
	//생성자...
	MyWedding(double h, double w, String n, String j){
		키  = h;
		몸무게 = w;
	   가치관  = n;
	   직업  = j;
	}
	void set이름(String n) {
		이름 = n;
	}
	void set재산(long n) {
		재산 = n;
	}
	
	void song() {
		System.out.println( 이름 + "노래를 잘한다.");
	}
	
	void sports() {
		System.out.println( 이름 + "운동을 잘한다.");
	}
	
   void money() {
	   System.out.println(이름 +  "은 " + 재산 + "억을  보유하고 있다.");
   }
  
   void show() {
	   System.out.println(이름 + " , " + 키 + ", " + 몸무게 + " , " + 가치관 + " , " + 직업 + " , " + 재산 + "억");
   }
}
package ex1;

public class ClassEx1 {

	public static void main(String[] args) {
		
		int num ;
		
		Sung 백수민 = new Sung("백수민", 96,95,99);
		백수민.총점();
		백수민.평균();
		
		백수민.show();
		
		Sung 황규성 = new Sung("황규성", 50,45,60);
		황규성.총점();
		황규성.평균();
		황규성.show();
	}

}

class Sung{
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	//생성자
	Sung(String n, int k, int e, int m){
		name = n;
		kor = k;
		eng = e;
		math = m;
	}
	void 총점() {
		total =  kor+eng+math;
	}
	
	void 평균() {
		avg =  total/3.0;
	}
	
	void show() {
		System.out.print(" name : " + name);
		System.out.print(" kor : " + kor);
		System.out.print(" eng : " + eng);
		System.out.print(" math : " + math);
		System.out.print(" total : " + total);
		System.out.printf(" avg : %.1f " , avg);
		System.out.println();
	}
}

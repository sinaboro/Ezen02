package ex1;

public class Exercise6_4 {
		public static void main(String[] args) {
			Student 홍길동 = new Student(); //디폴트 생성자 호출...
			
			홍길동.name="홍길동";
			홍길동.ban = 1;
			홍길동.no=1;
			홍길동.kor=100;
			홍길동.eng=60;
			홍길동.math  = 76;
			
			System.out.println("이름 : " + 홍길동.name); 
			System.out.println("총점 : " + 홍길동.getTotal());
			System.out.println("평균 : " + 홍길동.getAverage());
			System.out.println("-------------------------------------");
			
			Student 백수민 = new Student("백수민",2,2,100, 100,99);
            System.out.println(백수민.info());
		}
}

class Student {
	
	String name;  //학생이름
	int ban;  //반
	int no; //번호
	int kor;
	int eng;
	int math;
	
	Student() {	}
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban  = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		return name +", "+ban+", "+no+", "+kor+", "+eng+", "+math + ", " 
					+ getTotal() + ", " + getAverage() ;
	}
	int getTotal() {
		//int sum =kor+eng+math;
		//return sum;
		return kor+eng+math;
	}
	
	float getAverage() {
//		float avg = getTotal()/3.0;
		//float avg = getTotal() / 3.0f;
		return (int)(getTotal() / 3.0f*100+0.5f)/100f;
	};
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

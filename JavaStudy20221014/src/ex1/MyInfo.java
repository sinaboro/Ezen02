package ex1;

public class MyInfo {

	public static void main(String[] args) {
		ClassInfo 김대철  = new ClassInfo();
		김대철.setName("김대철");
		김대철.setAddress("안산");
		김대철.setTrafic("자차");
		김대철.setTime(30);
		김대철.show();
		
		System.out.println();
		ClassInfo 임채리 = new ClassInfo();
		임채리.setName("임채리");
		임채리.setAddress("수원");
		임채리.setTrafic("버스");
		임채리.setTime(25);
		임채리.show();
	}

}


class ClassInfo{
	String name;
	String address;
	String trafic;
	int time;
	
	void setName(String n) {
		name = n;
	}
	void setAddress(String a) {
		address = a;
	}
	void setTrafic(String t) {
		trafic = t;
	}
	void setTime(int ti) {
		time = ti;
	}
	void show() {
		System.out.print(" 이름 : " + name);
		System.out.print(",  주소 : " + address);
		System.out.print(",  교통편 : " + trafic);
		System.out.print(",  시간 : " + time + "분");
	}
}
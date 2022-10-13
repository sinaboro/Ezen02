package ex1;

public class ArrayEx11 {
	public static void main(String[] args) {
		
		
		String str = "201010-2234567";
		
		char ch = str.charAt(7);
		
		if(ch == '1')
			System.out.println("남");
		else if(ch == '2')
			System.out.println("여");
		
		System.out.println("----------------------");
		
		String str2 = "abcdef";
		String tmp = str2.substring(0, 5);
		
		System.out.println(tmp);
		System.out.println(tmp.length());
	} // main의 끝
}



















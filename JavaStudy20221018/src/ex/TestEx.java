package ex;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;


public class TestEx {

	public static void main(String[] args) {
		String[] names = new String[3];
		names[0] = new String("kim");
		names[1] = new String("park");
		names[2] = new String("lek");
		
		for(int i=0; i<names.length; i++)
			System.out.println("names[" + i + "] : " + names[i]);
		
		String tmp = names[2].substring(1);  //0,1
		
		System.out.println("tmp : " + tmp);
		
		names[2] = "hong";
		
		System.out.println("tmp : " + tmp);
		System.out.println("names[2] : " + names[2]);
		
		
	}
}

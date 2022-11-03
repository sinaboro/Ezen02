package com.ezen.ex05;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {
		List<String> lists = new ArrayList<>();
		
		lists.add("Toy");
		lists.add("Box");
		lists.add("Robot");
		
		for(String  str : lists)
			System.out.print (str + '\t');
		System.out.println();
		
		lists.remove(0);
		
		for(int i=0; i<lists.size(); i++)
			System.out.print(lists.get(i) + '\t' );
		System.out.println();
		
	}

}

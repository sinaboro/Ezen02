package com.exen.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하십시오: ");
		String name = sc.nextLine();
		System.out.println(inputName(name));
	}

	static String inputName(String name) {
		List<String> nameList = new ArrayList<>(Arrays.asList("min10013", "smb10013", "qortnals"));
		for (String i : nameList) {
			if (name.equals(i))
				return "중복입니다.";
		}
		return "가능합니다.";
	}

}
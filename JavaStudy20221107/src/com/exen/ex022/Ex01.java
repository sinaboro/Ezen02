package com.exen.ex022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("서울, 대전, 대구, 인천, 부산");
		System.out.printf("검색하고자 하는 지역을 입력하세요_> ");
		String local = sc.nextLine();
		zip(local);
	}
	
	static void zip(String local) {
		String[] seoul = { "서울", "11880" };
		String[] daejeon = { "대전", "22880" };
		String[] daegu = { "대구", "33880" };
		String[] incheon = { "인천", "44880" };
		String[] busan = { "부산", "55880" };

		switch (local) {
		case "서울": {
			System.out.println("서울의 우편번호는 " + seoul[1] + "입니다.");
			break;
			}
		case "대전": {
			System.out.println("대전의 우편번호는 " + daejeon[1] + "입니다.");
			break;
			}
		case "대구": {
			System.out.println("대구의 우편번호는 " + daegu[1] + "입니다.");
			break;
			}
		case "인천": {
			System.out.println("인천의 우편번호는 " + incheon[1] + "입니다.");
			break;
			}
		case "부산": {
			System.out.println("부산의 우편번호는 " + busan[1] + "입니다.");
			break;
			}
		}
	}
}
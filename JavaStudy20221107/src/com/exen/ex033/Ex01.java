package com.exen.ex033;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		binaryPrint( binaryTransform( binaryInput() ) ); //1111

	}

	static int binaryInput() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력: ");
		int bin = sc.nextInt();

		return bin;
	}

	static String binaryTransform(int num) {
		return Integer.toBinaryString(num);
	}

	static void binaryPrint(String value) {
		final int WIDTH = 16;

		String fValue = String.format("%0" + WIDTH + "d", Integer.valueOf(value));
		System.out.println(fValue.substring(0, WIDTH / 4) + " " + fValue.substring(WIDTH / 4, (WIDTH / 4) * 2) + " "
				+ fValue.substring((WIDTH / 4) * 2, (WIDTH / 4) * 3) + " "
				+ fValue.substring((WIDTH / 4) * 3, (WIDTH / 4) * 4));
	}

}
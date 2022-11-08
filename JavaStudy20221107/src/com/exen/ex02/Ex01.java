package com.exen.ex02;

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
		System.out.println("ex) 천안시 서북구 두정중1길 26");
		System.out.print("주소를 양식에 맞게 입력하십시오: ");
		String address = sc.nextLine();

		System.out.println(zipCodeSearch(address));

	}

	static String zipCodeSearch(String address) {

		final int CITY = 0;
		final int GU = 1;
		final int STREET = 2;
		final int NUMBER = 3;
		final int ZIP = 4;

		List<List<String>> addressList = new ArrayList<List<String>>();

		List<String> address1 = Arrays.asList("천안시", "서북구", "성정두정로", "130", "31102"); // 신대초 31102
		List<String> address2 = Arrays.asList("천안시", "서북구", "두정중1길", "26", "31101"); // 두정중 31101
		List<String> address3 = Arrays.asList("천안시", "서북구", "과수원길", "27", "31079"); // 오성고 31079

		addressList.add(address1);
		addressList.add(address2);
		addressList.add(address3);
                                                                   //천안시 서북구 두정중1길 26
		List<String> adList = Arrays.asList(address.split(" "));

		for (List<String> i : addressList) 
			if (i.get(CITY).equals(adList.get(CITY))) 
				if (i.get(GU).equals(adList.get(GU)))
					if (i.get(STREET).equals(adList.get(STREET))) 
						if (i.get(NUMBER).equals(adList.get(NUMBER))) 
							return "해당 주소의 우편번호: " + i.get(ZIP);
			else
				return "기록된 주소 없음";
		return null;
	}
}
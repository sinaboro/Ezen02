package com.ezen.ex03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {

	public static void main(String[] args) {
		
		//.com으로 된 이메일 찾아라....
		String[] str = {"abcd12", "123456", "afdsaf", "ko23ea", "abcdef"};
		
		String regex = "[^0-9]";
		
		for(String data : str)
			System.out.printf("%s \t %S\n", data, data.replaceAll(regex, "*"));

	}
}
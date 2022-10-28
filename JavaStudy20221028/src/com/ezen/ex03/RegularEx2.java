package com.ezen.ex03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx2 {

	public static void main(String[] args) {
		
		//.com으로 된 이메일 찾아라....
		String str = "12Kample@naver.com, test02@gmail.com,  test01@ezen.co.kr"
				                     + ", test03@hrd.go.kr, apple@apple.org";
		
		String regex = "([\\w]*@[\\w]*.com)";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find())
			System.out.println(matcher.group());
	}

}

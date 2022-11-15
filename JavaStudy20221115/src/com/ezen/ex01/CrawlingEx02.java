package com.ezen.ex01;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingEx02 {

	public static void main(String[] args) {
		
		String url = "https://finance.naver.com/sise/sise_market_sum.naver";
		Document doc = null;
		
		try {
			
			doc = Jsoup.connect(url).get();
//			System.out.println(doc);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//class  type_2는  중복된 데이타가 있을 수 있으므로 배열로 넘겨준다.
		Elements  elements = doc.getElementsByAttributeValue("class", "type_2");
		//System.out.println(elements);
		
		//배열 0번째 데이타를 Element element 저장
		Element element = elements.get(0);
//		System.out.println(element);
		
		Elements elements2 = element.select("td a");
		//System.out.println(elements2);
		
		//삼성전자 글자 출력
		 Element element2 = elements2.get(0);
		 System.out.println(element2);
		 System.out.println(element2.text());
		 
		 String no = element2.attr("href");
//		 System.out.println(no);
		 
		 System.out.println(
				 no.substring(no.lastIndexOf("=")+1)
		);
		 
		Elements price  = element.select("td.number");
		System.out.println(price.get(0).text());
//		 System.out.println(price.get(0).text());
		 
		 
		 
		 
		 
		 
		 
		
		
		
	}

}

package com.ezen.ex04;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingEx01 {

	private static Elements Elements;

	public static void main(String[] args) {
		
		String url = "https://finance.naver.com/sise/sise_market_sum.naver";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
			//System.out.println(doc);
		}catch(Exception e) {
			e.printStackTrace();
		}
		 
		Elements elements = doc.getElementsByAttributeValue("class", "type_2");
//		System.out.println(elements);
		Element element=elements.get(0);
//		System.out.println(element);
		
//		Elements elements2 = element.getElementsByAttributeValue("class", "no");
		Elements elements2 = element.select("td a");
//		System.out.println(elements2);
		Element element2 = elements2.get(0);
		System.out.println(element2.text());
		String no = element2.attr("href");
//		System.out.println(no);
//		no.substring(no.lastIndexOf("=")+1);
//		System.out.println(no.lastIndexOf("="));
		System.out.println(no.substring(no.lastIndexOf("=")+1));
		
		//가격
		Elements price = element.select("td.number");
		System.out.println(price.get(0).text());
	}

}

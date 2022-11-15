package com.ezen.ex05;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingEx01 {

	public static void main(String[] args) {
		
		String url = "https://sports.news.naver.com/kfootball/index";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
//			System.out.println(doc);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Elements elements = doc.select("div.home_news");   //.==> class , # ==> id
		//System.out.println(elements);
		
		String name = elements.select("h2").text();
		System.out.println(name);
		System.out.println("-----------------------------------");
		
		for(Element el : elements.select("li")) {
			System.out.print(el.text());
			System.out.println();
		}
		
		
	}

}

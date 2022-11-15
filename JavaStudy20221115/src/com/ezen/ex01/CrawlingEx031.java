package com.ezen.ex01;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingEx031 {

	public static void main(String[] args) throws IOException {

		int pages = 5;

		for (int i = 0; i < pages; i++) {

//네이버->경제 > 금융카테고리

			String url = "https://news.naver.com/main/list.naver?mode=LS2D&sid2=259&sid1=101&mid=shm&date=20220501&page="
					+ i;
			Document doc = Jsoup.connect(url).get(); // 사이트 정보 읽어 온다.
			Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");
			Element element = elements.get(0);

			Elements photoelements = element.getElementsByAttributeValue("class", "photo");
			for (int j = 0; j < photoelements.size(); j++) {
				Element newelements = photoelements.get(j);
				Elements a_newelements = newelements.select("a");
				Element a_newelement = a_newelements.get(0);
				String newUrl = a_newelement.attr("href"); // 기사링크
				Elements imgelements = newelements.select("img");
				Element imgelement = imgelements.get(0);
				String imgUrl = imgelement.attr("src"); // 이미지 링크

				String title = imgelement.attr("alt"); // 기사 제목

				Document detailDoc = Jsoup.connect(newUrl).get(); // 기사 제목클릭 상세 기사로 이동주소
				Element contentemement = detailDoc.getElementById("dic_area");
				String content = contentemement.text();
				System.out.println(title);
				System.out.println(content);
				System.out.println();
			}
		}
	}
}
package com.ezen.ex01;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingEx04 {

	public static void main(String[] args) throws IOException {
			
		CrawlingEx04 craw =  new CrawlingEx04();
		craw.seoulHotel();
		
	}
	
	public void seoulHotel(){
		
		try {
			int k=1;
			for(int i=1; i<=32; i++) {
				Document doc=Jsoup.connect("https://korean.visitseoul.net/hotels?curPage="+i).get();
				Elements poster=doc.select("ul.article-list li.item div.thumb img"); // 썸네일 이미지
				Elements link=doc.select("ul.article-list li.item a"); // 썸네일장소 세부설명 링크
				Elements title=doc.select("ul.article-list li.item div.infor-element span.title"); // 호텔이름
				Elements score=doc.select("div.infor-element-inner span.trip-ico img"); //평점
				Elements score2 = doc.select("span.trip-text"); //리뷰수
				
				for(int j=0; j<poster.size(); j++) {
					try {
						   System.out.println("번호:"+k);
						   System.out.println(title.get(j).text());
						   System.out.println(poster.get(j).attr("src"));
						   System.out.println(link.get(j).attr("href"));
//						   System.out.println("score-alt" + score.get(j).attr("alt"));
						   String score3 = score2.get(j).text() ;
						   System.out.println("리뷰수 : " + score3.split(" ")[0] );
						   
						   Document doc2=Jsoup.connect("https://korean.visitseoul.net"+link.get(j).attr("href")).get(); 
						   Element address=doc2.select("div.detail-map-infor dl dd").get(0); //dd = 호텔 주소
						   Elements images=doc2.select("div.wide-slide div.item"); // 호텔 내부 이미지사진
						   
						   //** 신봉재님......
						   Elements score4=doc2.select("div.tripadvisor-wrap p.trip-infor img"); //평점
		                   System.out.println("리뷰 평점 : " + (score4.get(0).attr("alt")).split(":")[1]);
						   //                                                     ---------------------
		                   //                                                          평점:4.5
		                   //                                                         (평점:4.5).split(":") ==> 평점  4.5
						   String simg="";
						   for(int m=0;m<images.size();m++)
						   {
//							   System.out.println(images.get(m).attr("style"));
							   String temp=images.get(m).attr("style");
							   // background-image:url(http://media-cdn.tripadvisor.com/media/photo-s/10/f5/38/a8/twin-rom--v17512289.jpg)"
							   // http://media-cdn.tripadvisor.com/media/photo-s/10/f5/38/a8/twin-rom--v17512289.jpg
							   temp=temp.substring(temp.indexOf("(")+1,temp.lastIndexOf(")"));
							   simg+=temp+"^";
						   }
						   simg=simg.substring(0,simg.lastIndexOf("^"));
						   System.out.println("주소:"+address.text());
						   
						   System.out.println();
						   k++;
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} // 서울 호텔목록 페이지
		
	}

	public void seoulAttractions() {
		
	}
	
	
	

}

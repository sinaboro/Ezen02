
package com.ezen.ex01;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Yes24 {
	
	public static void main(String[] args){
	
		Yes24 yes = new Yes24(); 
		yes.menuStart();

	}

	public void Yes24Book() {
		
		DBBooks dbb = DBBooks.newInstance(); 
		//DBBooks의 객체를 생성하기 위해서 newInstance를 호출, 
		//DBBooks의 생성자로 private를 사용하여 접근을 막아놨기 때문에 newInstance 메서드를 사용하여 접근함.

		
	try {
		
		int k=1;
		
		for(int i=1;i<=8;i++) //메인페이지를 작성하기 위한 for문
		{
		   Document doc = Jsoup.connect("http://www.yes24.com/24/category/"
		   		+ "bestseller?categorynumber=001&sumgb=09&pagenumber="+i).get();
		   //Yes24_월간 베스트 셀러 홈페이지를 불러오기 위한 링크
		   
		   Elements Title = doc.select(".goodsTxtInfo p:eq(0) a:eq(0)");
		   //Yes24_월간 베스트 셀러의 제목을 불러오는 소스
		   
		   Elements Price = doc.select(".priceB");
		   //Yes24_월간 베스트 셀러의 가격을 불러오는 소스 
		   
		   Elements Summary = doc.select(".read");
		   //Yes24_월간 베스트 셀러의 줄거리를 불러오는 소스 

		   
		   for(int j=0; j<Title.size(); j++){
		   //상세페이지를 작성하기 위한 for문
		
			   try { 
				   
				   Document doc2=Jsoup.connect("http://www.yes24.com/"+Title.get(j).attr("href")).get();
				   //Yes24 도서 상세페이지를 불러오기 위한 링크
				   
				   Element Category = doc2.select("dl.yesAlertDl li:eq(0) a").get(1);
				   //Yes24_월간 베스트 셀러의 카테고리를 불러오는 소스

				   Element Author = doc2.select(".gd_auth").get(0);// 책 저자
				   //Yes24_월간 베스트 셀러의 저자를 불러오는 소스

				   Element Pub = doc2.select(".gd_pub").get(0);// 책 출판사
				   //Yes24_월간 베스트 셀러의 출판사를 불러오는 소스

				   Element Grade = doc2.select(".yes_b").get(0); //평점
				   //Yes24_월간 베스트 셀러의 평점을 불러오는 소스

				 
				   
				   System.out.println("순위 : " + k);
				   System.out.println("카테고리 : " + Category.text()
			);
				   System.out.println("제목 : " + Title.get(j).text());
				   System.out.println("가격 : " + Price.get(j).text());
				   System.out.println("줄거리 : " + Summary.get(j).text());
				   System.out.println("저자 : " + Author.text().split("정보")[0]); 
				   System.out.println("출판사 : "  + Pub.text());
				   System.out.println("평점: " + Grade.text());
				   
				   System.out.println("-----------------------------------------");
				 
				   k++; //k값(순위)를 1씩 증가 
				   
	               Yes24VO vo = new Yes24VO();
	               //Insert 메서드를 호출하기 위한 객체 생성
				    
	               
	               // 데이터 초기화와 저장 
	               vo.setCategory(Category.text());
				   vo.setTitle(Title.get(j).text());
				   vo.setPrice(Price.get(j).text());
				   vo.setSummary(Summary.get(j).text());
				   vo.setAuthor(Author.text().split("정보")[0]);
				   vo.setPub(Pub.text());
				   vo.setGrade(Grade.text());
				   
				   
			   	   dbb.Yes24Insert(vo); 
			   	   //크롤링해서 가져온 정보를 vo를 통해서 데이터베이스에 넣는다.
			   	   }
			   	   catch(Exception e) {}
			   }
		   
		   }
		}
			   		   
	catch(Exception e) {}
		}
	

	private int method() {
		System.out.println(">> 원하는 작업을 선택해 주세요.<<");
		System.out.println("0.프로그램 종료 1.크롤링 및 데이터저장 2.화면 구현");
		System.out.print(">> ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.nextLine();
    
		return input;
	}
 
	public void menuStart() {
		while (true) {
			int choice = method();
       
			switch (choice) {
			case 1:
				Yes24Book();
				break;
			case 2:
				DBBooks db = DBBooks.newInstance();
				db.MenuBookStart();
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
    }
 }}
	


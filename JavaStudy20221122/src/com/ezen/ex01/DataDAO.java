package com.ezen.ex01;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DataDAO {
   
   private Connection conn = null;
   private PreparedStatement pstmt =null;
   private ResultSet rs=null;
   private static DataDAO dao;
   private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
   private final String user = "scott";
   private final String pwd  = "1234";
   
   private DataDAO() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
//         System.out.println("-------Class.forName-----------");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
   }
   
   public void getConnection() {
      try {
         conn = DriverManager.getConnection(url,user,pwd);
//         System.out.println("-----------DriverManager---------------");
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   
   public void disConnection() {
      try {
         if(pstmt != null) pstmt.close();
         if(conn != null) conn.close();
//         System.out.println("-----------DriverManager disConnection---------------");
      }catch(Exception e) {
         e.printStackTrace();
      }
   }
   
   public static DataDAO newInstance() {
      if(dao == null) 
         dao = new DataDAO();
      
      return dao;
   }
   public void Setting() {
	   DropTable();
	   CreateTable();
	   DropSequence();
	   CreateSequence();
   }
   public void DropTable() {
      try {
         //1. DB연결
         getConnection();
         
         //2. sql문 작성
         String sql = "DROP table MovieTable";
         
         //3. 오라클로 sql문장 전송
         pstmt = conn.prepareStatement(sql);
         
         pstmt.executeUpdate();
         
         
      } catch (SQLException e) {
         System.out.println();
      }finally {
         disConnection();
      }
   }
   
   public void CreateTable() {
      try {
            //1. DB연결
            getConnection();
               
            //2. sql문 작성
            String sql = "create table MovieTable ("
                  + "NO NUMBER(4) PRIMARY KEY,"
                  + "title NVARCHAR2 (50),"
                  + "rate NVARCHAR2 (300),"
                  + "genre NVARCHAR2 (100),"
                  + "dir NVARCHAR2 (50),"
                  + "act NVARCHAR2 (100),"
                  + "times NVARCHAR2 (100),"
                  + "dates NVARCHAR2 (100),"
                  + "adds NVARCHAR2 (20),"
                  + "review NVARCHAR2 (2000),"
                  + "summary NVARCHAR2 (2000)"
                  + ")";
            //3. 오라클로 sql문장 전송
            pstmt = conn.prepareStatement(sql);              
            pstmt.executeUpdate();             
               
         } catch (SQLException e) {
            e.printStackTrace();
         }finally {
            disConnection();         }      }
   
   public void DropSequence() {
      try {
         //1. DB연결
         getConnection();
         
         //2. sql문 작성
         String sql = "DROP SEQUENCE MovieTable_sql";
         
         //3. 오라클로 sql문장 전송
         pstmt = conn.prepareStatement(sql);        
         pstmt.executeUpdate();         
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disConnection();     }   }
   
   public void CreateSequence() {
      try {
               //1. DB연결
               getConnection();
               
               //2. sql문 작성
               String sql = "CREATE SEQUENCE MovieTable_sql INCREMENT BY 1 START WITH 1";

               //3. 오라클로 sql문장 전송
               pstmt = conn.prepareStatement(sql);
               pstmt.executeUpdate();               
            } catch (SQLException e) {
               e.printStackTrace();
            }finally {
               disConnection();
            }
         }
   
   public void CrawlingMovie(){
      System.out.println("<크롤링 하는 중입니다...>");
      List<MovieVO> list = new ArrayList<>();
      DataDAO dao = DataDAO.newInstance(); // 변경
      try {
      for(int i=0;i<1;i++) {
          Document doc = Jsoup.connect("https://movie.naver.com/movie/running/current.naver").get(); //홈페이지
          Elements link2=doc.select("div.thumb a"); // 썸네일
         for(int j=0; j<20; j++) { // 실전에서는 link2.size 
          Document doc2=Jsoup.connect("https://movie.naver.com/movie/running/current.naver"+link2.get(j).attr("href")).get(); // 상세주소    
          Elements link4=doc2.select("p.con_tx"); //줄거리
          Element lin4=link4.get(0);
          
          Elements link3=doc2.select("div.score_result li:eq(0) div.score_reple p"); //리뷰
          
          Elements title1 = doc2.select("h3.h_movie a"); // 영화제목
          Element title2 = title1.get(0);
          
          Elements rate1 = doc2.select("span.st_off span.st_on"); //평점
          Element rate2 = rate1.get(0);
      
          Elements genre1 = doc2.select("dl.info_spec dd span:eq(0)"); //장르(개요)
          Element genre2 = genre1.get(0);
         
          Elements dir1    = doc2.select("dl.info_spec dd:eq(3)"); //감독
          Element dir2 = dir1.get(0);
          
          Elements act1 = doc2.select("dl.info_spec dd:eq(5) p"); //배우
          Element act2 = act1.get(0);
          String act3 = act2.text();
 
          Elements time1 = doc2.select("dl.info_spec dd span:eq(2)"); //상영시간
          Element time2 = time1.get(0);
          
          Elements date1 = doc2.select("dl.info_spec dd span:eq(3)"); //개봉날짜
          
          MovieVO mvo = new MovieVO(); // MovieVO 객체 생성
          
          mvo.setnum(j+1); //번호
          mvo.settitle(title2.text()); // 영화 제목
          mvo.setrate(rate2.text()); // 네티즌 평점
          mvo.setgenre(genre2.text());  // 개요 
          mvo.setdir(dir2.text()); // 감독
          if(!act3.contains("["));
          mvo.setact(act2.text()); //출연
          mvo.settimes(time2.text()); // 영화 시간
          mvo.setdates(date1.text()); // 영화 개봉일
          mvo.setadds(""); // 직접 추가한 내용이 아니기 때문에 공백
          mvo.setreview(link3.text()); // 관람객 리뷰
          mvo.setsummary(lin4.text()); // 줄거리 요약
         
          list.add(mvo); 
          
          dao.InsertMovie(mvo);
         }
         System.out.println("<크롤링 하는 중입니다...>");
      }
      }catch (IOException e) {
         e.printStackTrace();
      }       
   }
  
   public void ListMovie() {
      try {
         //1. DB연결
         getConnection();
         
         //2. sql문 작성
         String sql = "select * from MovieTable order by no";
         
         //3. 오라클로 sql문장 전송
         pstmt = conn.prepareStatement(sql);
         
         //4. 호출
         ResultSet rs = pstmt.executeQuery(); 
         
         //5. 데이터를 읽기
         while(rs.next()) {
//         MovieVO mvo = new MovieVO();
         
         System.out.println("번   호 : " + rs.getInt("no"));
         System.out.println("영화제목 : " + "《"+rs.getString("title")+"》");
         System.out.println("평   점 : " + rs.getString("rate"));
         System.out.println("장   르 : " + rs.getString("genre"));
         System.out.println("감   독 : " + rs.getString("dir"));
         System.out.println("배   우 : " + rs.getString("act"));
         System.out.println("영화시간 : " + rs.getString("times"));
         System.out.println("개봉날짜 : " + rs.getString("dates"));
         System.out.println();
         System.out.println();
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disConnection();
      } 
   }
   
   public void AddMovie() {
      try {
         //1. DB연결
         getConnection();
         
         //2. sql문 작성
         String sql = "insert into MovieTable values(Movietable_sql.nextval, ?,?,?,?,?,?,?)";
         
         //3. 오라클로 sql문장 전송
         pstmt = conn.prepareStatement(sql);
         
         //4. ? 값 저장
         MovieVO mvo = new MovieVO();
          
          Scanner sc1 = new Scanner(System.in);
          System.out.print(">영화제목   : ");
          mvo.settitle(sc1.nextLine()); // 영화 제목
          System.out.print(">평점 : ");
          mvo.setrate(sc1.nextLine()); // 네티즌 평점
          System.out.print(">장르   : ");
          mvo.setgenre(sc1.nextLine());  // 개요 
          System.out.print(">감독   : ");
          mvo.setdir(sc1.nextLine()); // 감독
          System.out.print(">배우   : ");
          mvo.setact(sc1.nextLine()); //출연
          System.out.print(">상영시간   : ");
          mvo.settimes(sc1.nextLine()); // 영화 시간
          System.out.print(">개봉일  : ");
          mvo.setdates(sc1.nextLine()); // 영화 개봉일
          mvo.setadds("추가");
          
          InsertMovie(mvo);
         
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disConnection();
      }
   }  
   public void InsertMovie(MovieVO se) {
      try {
         //1. DB연결
         getConnection();
         
         //2. sql문 작성
         String sql = "insert into MovieTable values(Movietable_sql.nextval, ?,?,?,?,?,?,?,?,?,?)";
         
         //3. 오라클로 sql문장 전송
         pstmt = conn.prepareStatement(sql);
           
         //4. ? 값 저장
         pstmt.setString(1, se.gettitle());
         pstmt.setString(2, se.getrate());
         pstmt.setString(3, se.getgenre());
         pstmt.setString(4, se.getdir());
         pstmt.setString(5, se.getact());
         pstmt.setString(6, se.gettimes());
         pstmt.setString(7, se.getdates());
         pstmt.setString(8, se.getadds());
         pstmt.setString(9, se.getreview());
         pstmt.setString(10, se.getsummary());
         
         //5. 전송된 값을 커밋 또는 업데이트
         pstmt.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disConnection();
      }
   }  
   public void DeleteMovie() {
      try {
         String scP;
         String scY = "Y";
         String scN = "N";
         
         ViewMovie();
         
         System.out.println("전체 삭제 하시겠습니까? Y / N");
         do {
         Scanner sc = new Scanner(System.in);
         scP = sc.next();
         
         if(!scP.equals(scY) && !scP.equals(scN))
         System.out.println("잘못 입력했습니다 다시 입력해주세요 Y / N");
         } while(!scP.equals(scY) && !scP.equals(scN));
     
         if(scP.equals(scY)) {
            System.out.println("정말 전체 삭제 하시겠습니까? Y / N");
            Scanner sc2 = new Scanner(System.in);
            scP=sc2.next();
            if(scP.equals(scY))
            AllDeleteMovie();
         }
         
         else if(scP.equals(scN)) {
            
         //1. DB연결
         getConnection();
         
         //2. sql문 작성
         String sql = "Delete from MovieTable where no = ?"; // 엔드로 "추가" 항목만 
         
         //3. 오라클로 sql문장 전송
         pstmt = conn.prepareStatement(sql);
           
         //4. ? 값 저장         
         Scanner sc2 = new Scanner(System.in);
         System.out.println("삭제할 목록의 번호 입력>>");
          int bno = Integer.parseInt(sc2.next());
          
          pstmt.setInt(1,bno);         
          pstmt.executeUpdate();         
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disConnection();
      }
   }
   
   public void AllDeleteMovie() {
      try {
         //1. DB연결
         getConnection();
         
         //2. sql문 작성
         String sql = "Delete from MovieTable where adds = '추가'"; // "항목"
         
         //3. 오라클로 sql문장 전송
         pstmt = conn.prepareStatement(sql);
         
            //4. 업데이트
          pstmt.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disConnection();
      }
   }
   
   public void ViewMovie() {
      try {
         getConnection();
         
         String sql = "Select * from MovieTable where adds = '추가'";
         
         pstmt = conn.prepareStatement(sql);        
         pstmt.executeUpdate();
         
         ResultSet rs = pstmt.executeQuery();  
         
         while(rs.next()) {
            System.out.println("번   호 : " + rs.getInt("no") + "\t");
            System.out.println("영   화 : " +rs.getString("title") + "\t");
            System.out.println("평   점 : " +rs.getString("rate") + "\t");
            System.out.println("장   르 : " +rs.getString("genre") + "\t");
            System.out.println("감   독 : " +rs.getString("dir") + "\t");
            System.out.println("배   우 : " +rs.getString("act") + "\t");
            System.out.println("상영시간 : " +rs.getString("times") + "\t");
            System.out.println("개봉날짜 : " +rs.getString("dates") + "\t");
            System.out.println("추가항목 : " +rs.getString("adds") + "\t");
            System.out.println();
            System.out.println();
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disConnection();
      }
   }  
   public void SerachMovie() {
      try {
         //1. DB연결
         getConnection();

         //2. sql문 작성
         String sql = "select * from MovieTable where (TITLE || GENRE || ACT || DIR) LIKE ?";
         System.out.println("<영화제목, 장르, 배우, 감독 내에서 하나를 입력해주세요>");
         //3. 오라클로 sql문장 전송
         pstmt = conn.prepareStatement(sql);
         
         //4. 호출
         Scanner sc = new Scanner(System.in);
         String bno = '%'+sc.next()+'%';
         pstmt.setString(1,bno);
         
         ResultSet rs = pstmt.executeQuery();
         
         //5. 데이터를 읽기         
         while(rs.next()) {
        	 System.out.println("번   호 : " + rs.getInt("no"));
             System.out.println("영화제목 : " + "《"+rs.getString("title")+"》");
             System.out.println("평   점 : " + rs.getString("rate"));
             System.out.println("장   르 : " + rs.getString("genre"));
             System.out.println("감   독 : " + rs.getString("dir"));
             System.out.println("배   우 : " + rs.getString("act"));
             System.out.println("영화시간 : " + rs.getString("times"));
             System.out.println("개봉날짜 : " + rs.getString("dates"));
             System.out.println();
             System.out.println();
         }        
         System.out.println("선택한 장르를 상세보기 하실 수 있습니다.");
         Serach2Movie();        
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disConnection();      }   }
   
   public void Serach2Movie() {
      try {
         //1. DB연결
         getConnection();
         
         //2. sql문 작성
         System.out.println("상세보기 할 영화의 번호를 입력해 주세요.");
         String sql = "select no,title,review,summary from MovieTable where no = ?";
         //3. 오라클로 sql문장 전송
         pstmt = conn.prepareStatement(sql);
         
         //4. 호출
         Scanner sc = new Scanner(System.in);
         int bno = sc.nextInt();
         pstmt.setInt(1,bno);         
         ResultSet rs = pstmt.executeQuery();
         
         //5. 데이터를 읽기        
         while(rs.next()) {
         System.out.println("번   호 : " + rs.getInt("no"));
         System.out.println("영화제목 : " + "《"+rs.getString("title")+"》");
         System.out.println("리   뷰 : " + rs.getString("review"));
         System.out.println("줄 거 리 : " + rs.getString("summary"));
         }
         System.out.println("선택한 장르를 상세보기 하실 수 있습니다.");
         sc = new Scanner(System.in); 
         
         // 선택한 영화 내용 상세보기
         } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disConnection();
      }
   }  
   public void RandomMovie() {
      try {
         //1. DB연결
         getConnection();
         
         //2. sql문 작성
         String sql = "select * from MovieTable where RATE>'관람객 평점 7.00'"
         		+ "AND RATE !='관람객 평점 없음' order by DBMS_RANDOM.RANDOM";
         
         //3. 오라클로 sql문장 전송
         pstmt = conn.prepareStatement(sql);
         
         //4. 호출
         ResultSet rs = pstmt.executeQuery(); 
         
         //5. 데이터를 읽기
         while(rs.next()) {
         MovieVO mvo = new MovieVO();
         mvo.setnum(rs.getInt("no"));
         mvo.settitle(rs.getString("title"));
         mvo.setrate(rs.getString("rate"));
         mvo.setgenre(rs.getString("genre"));
         mvo.setdir(rs.getString("dir"));
         mvo.setact(rs.getString("act"));
         mvo.settimes(rs.getString("times"));
         mvo.setdates(rs.getString("dates"));
         mvo.setadds(rs.getString("adds"));
         
         System.out.println("번   호 : " + mvo.getnum() + "\t");
         System.out.println("영화제목 : " + mvo.gettitle());
         System.out.println("평   점 : " + mvo.getrate());
         System.out.println("장   르 : " + mvo.getgenre());
         System.out.println("감   독 : " + mvo.getdir());
         System.out.println("배   우 : " + mvo.getact());
         System.out.println("상영시간 : "  + mvo.gettimes());
         System.out.println("개봉날짜 : " + mvo.getdates());
         System.out.println("추가 된 항목 : " + mvo.getadds());
         System.out.println();
         break;
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disConnection();
      }      
   }
   
   public void ChoiceMyList() {
	   System.out.println("=================================================================");
	      System.out.println("=            ★마       이       리       스       트★   	        =");
	      System.out.println("=                                                               =");
	      System.out.println("=  1.리스트 테이블 생성     2.리스트       3.영화 추가      4.검색	        =");
	      System.out.println("=  5.삭제               6.리스트 테이블 삭제      7.이전 목록으로 돌아가기	=");
	      System.out.println("=                               		 	        =");
	      System.out.println("=================================================================");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      if(num==1)
         CreateMyList();
      else if(num==2)
         ViewMyList();
      else if(num==3)
         InsertMyList();
      else if(num==4)
         SerachMyList();
      else if(num==5)
         DeleteMyList();
      else if(num==6)
         AllDeleteMyList();
      else if(num==7);
         }
   
   public void CreateMyList() {
      try {
            //1. DB연결
            getConnection();
               
            //2. sql문 작성
            String sql = "create table Movie_MyList as select*from MovieTable where 1<>1";
               
            //3. 오라클로 sql문장 전송
            pstmt = conn.prepareStatement(sql);               
            pstmt.executeUpdate();       
         } catch (SQLException e) {
            e.printStackTrace();
         }finally {
            disConnection();
         }
      }
   
   public void ViewMyList() {
      try {
         //1. DB연결
         getConnection();
         
         //2. sql문 작성
         String sql = "select * from Movie_MyList order by no";
         
         //3. 오라클로 sql문장 전송
         pstmt = conn.prepareStatement(sql);
         
         //4. 호출
         ResultSet rs = pstmt.executeQuery(); 
//         System.out.println(rs);
         
         //5. 데이터를 읽기         
         while(rs.next()) {
            System.out.println("번   호 : " + rs.getInt("no"));
            System.out.println("영화제목 : " + "《"+rs.getString("title")+"》");
            System.out.println("평   점 : " + rs.getString("rate"));
            System.out.println("장   르 : " + rs.getString("genre"));
            System.out.println("감   독 : " + rs.getString("dir"));
            System.out.println("배   우 : " + rs.getString("act"));
            System.out.println("영화시간 : " + rs.getString("times"));
            System.out.println("개봉날짜 : " + rs.getString("dates"));
            System.out.println();
            System.out.println();
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disConnection();
      }      
   }
   
   public void InsertMyList() {
      try {
    	  ListMovie();
            //1. DB연결
            getConnection();
               
            //2. sql문 작성
            System.out.println("☞추가할 영화의 번호를 입력해주새요.");
            String sql = "insert into Movie_MyList\r\n"
                  + "select * from MovieTable\r\n"
                  + "where no = ?";
               
            //3. 오라클로 sql문장 전송
            pstmt = conn.prepareStatement(sql);
            
            Scanner sc = new Scanner(System.in);
            int bno = sc.nextInt();
            pstmt.setInt(1,bno);
            
            pstmt.executeUpdate();   
         } catch (SQLException e) {
            e.printStackTrace();
         }finally {
            disConnection();
         }
      }
   
   public void SerachMyList() {
      try {
         //1. DB연결
         getConnection();
         
         //2. sql문 작성
         String sql=null;        
         sql = "select * from Movie_MyList where (TITLE || GENRE || ACT || DIR) LIKE ?";
         System.out.println("<영화제목, 장르, 배우, 감독 내에서 하나를 입력해주세요>");
         
         //3. 오라클로 sql문장 전송
         pstmt = conn.prepareStatement(sql);
         
         //4. 호출
         Scanner sc = new Scanner(System.in);
         String bno = '%'+sc.next()+'%';
         pstmt.setString(1,bno);        
         ResultSet rs = pstmt.executeQuery();
         
         //5. 데이터를 읽기        
         while(rs.next()) {
        	  System.out.println("번   호 : " + rs.getInt("no"));
              System.out.println("영화제목 : " + "《"+rs.getString("title")+"》");
              System.out.println("평   점 : " + rs.getString("rate"));
              System.out.println("장   르 : " + rs.getString("genre"));
              System.out.println("감   독 : " + rs.getString("dir"));
              System.out.println("배   우 : " + rs.getString("act"));
              System.out.println("영화시간 : " + rs.getString("times"));
              System.out.println("개봉날짜 : " + rs.getString("dates"));
              System.out.println();
              System.out.println(); }        
         System.out.println("선택한 장르를 상세보기 하실 수 있습니다.");
      
         Serach2MyList();         
  
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disConnection();      }   }
   
   public void Serach2MyList() {
      try {
         //1. DB연결
         getConnection();
         
         //2. sql문 작성
         String sql=null;
         sql = "select no,title,review,summary from Movie_MyList where no = ?";
//         System.out.println("제목이나 장르 혹은 배우나 감독의 이름을 입력해주세요");
//         System.out.println("영화제목 이름을 입력 해 주세요");
         //3. 오라클로 sql문장 전송
         pstmt = conn.prepareStatement(sql);
         
         //4. 호출         
         Scanner sc = new Scanner(System.in);
         int bno = sc.nextInt();
         pstmt.setInt(1,bno);
         
         ResultSet rs = pstmt.executeQuery();
         
         //5. 데이터를 읽기        
         while(rs.next()) {
         System.out.print(rs.getInt("no") + "\t");
         System.out.print(rs.getString("title") + "\t");
         System.out.print(rs.getString("review") + "\t");
         System.out.print(rs.getString("summary") + "\t");
         System.out.println();
         System.out.println();
         }
         
         // 선택한 영화 내용 상세보기
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disConnection();
      }
   }
   
   public void DeleteMyList() {
      
      try {
         String scP;
         String scY = "Y";
         String scN = "N";
         
         ViewMovie();
         
         System.out.println("전체 삭제 하시겠습니까? Y / N");
         do {
         Scanner sc = new Scanner(System.in);
         scP = sc.next();
         
         if(!scP.equals(scY) && !scP.equals(scN))
         System.out.println("잘못 입력했습니다 다시 입력해주세요 Y / N");
         } while(!scP.equals(scY) && !scP.equals(scN));
   
         if(scP.equals(scY)) {
            System.out.println("정말 전체 삭제 하시겠습니까? Y / N");
            Scanner sc2 = new Scanner(System.in);
            scP=sc2.next();
            if(scP.equals(scY))
               AllDeleteMyList();
         }        
         else if(scP.equals(scN)) {
        	 
         //1. DB연결
         getConnection();
         
         //2. sql문 작성
         String sql = "Delete from Movie_MyList where no = ?"; 
         // 엔드로 "추가" 항목만 
         
         //3. 오라클로 sql문장 전송
         pstmt = conn.prepareStatement(sql);
        
         //4. ? 값 저장    
         Scanner sc2 = new Scanner(System.in);
         System.out.println("삭제할 목록의 번호 입력>>");
          int bno = Integer.parseInt(sc2.next());          
          pstmt.setInt(1,bno);
          pstmt.executeUpdate();
         }        
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disConnection();
      }
   }   
   public void AllDeleteMyList() {
      try {
         //1. DB연결
         getConnection();
         
         //2. sql문 작성
         String sql = "Delete from Movie_MyList"; // "항목"
         
         //3. 오라클로 sql문장 전송
         pstmt = conn.prepareStatement(sql);
         
          //4. 업데이트
          pstmt.executeUpdate();
                  
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         disConnection();      }  }  } 
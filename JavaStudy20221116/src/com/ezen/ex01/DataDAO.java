package com.ezen.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataDAO {
	
	private Connection conn = null;
	private PreparedStatement pstmt =null;
//	private ResultSet rs;
	private static DataDAO dao;
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String user = "scott";
	private final String pwd  = "1234";
	
	private DataDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url,user,pwd);
			System.out.println("-----------DriverManager---------------");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void disConnection() {
		try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static DataDAO newInstance() {
		if(dao == null) 
			dao = new DataDAO();
		
		return dao;
	}
	
	public void seoulLocationInsert(SeoulLocationVO se) {
		try {
			//1. DB연결
			getConnection();
			
			//2. sql문 작성
			String sql = "insert into SeoulLcation values(seoul_sql.nextval, ?,?,?,?,?,?)";
			
			//3. 오라클로 sql문장 전송
			pstmt = conn.prepareStatement(sql);
		   	//4. ? 값 저장
			
			pstmt.setString(1, se.getTitle());
			pstmt.setString(2, se.getTitleInof());
			pstmt.setString(3, se.getAddress());
			pstmt.setString(4, se.getPhone());
			pstmt.setString(5, se.getInfoTime());
			pstmt.setString(6, se.getTaffic());
			
			//5. 전송된 값을 커밋 또는 업데이트
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disConnection();
		}
		
	}
	
	
	
}

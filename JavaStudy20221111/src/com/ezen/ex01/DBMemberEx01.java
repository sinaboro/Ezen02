package com.ezen.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBMemberEx01 {
	
	private static final String driver  = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user  = "scott";
	private static final String pwd = "1234";
	
	public static void main(String[] args) {
		Connection conn;
		Statement stmt;
		ResultSet rs;
		
		try {
			Class.forName(driver);
			System.out.println("드라이브 로드  성공");
			
			conn =  DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 연결 성공");
			
			stmt = conn.createStatement();
			
			String sql = "insert into member values('0009', '한무', 170, 58, 55)";
			
			int num = stmt.executeUpdate(sql);
			System.out.println("insert 성공  :  " + num);
			System.out.println("------------------------------------");
			String sql2 = "select * from member order by id";
			rs = stmt.executeQuery(sql2);
			System.out.println("아이디      이름     키     몸무게    나이 ");
			while(rs.next()) {
				System.out.print(rs.getString("id") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getInt("height") + "\t");
				System.out.print(rs.getInt("weight") + "\t");
				System.out.print(rs.getInt("age") + "\t");
				System.out.println();
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

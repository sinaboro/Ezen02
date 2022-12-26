package com.ezen.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	
	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String user= "scott";
	private final String pass= "1234";
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private  static EmpDAO emp;
	
	private EmpDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("------------------");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static EmpDAO Instance() {
		if(emp == null)
			emp = new EmpDAO();
		
		return emp;
	}
	
	public List<EmpVO> empSelect() {
		
		List<EmpVO> list = new ArrayList<>();

		
		String sql = "select * from emp order by empNo";
		
		try {
			conn = DriverManager.getConnection(url,user,pass);
			pstmt = conn.prepareStatement(sql);
//			System.out.println("pstmt : " + pstmt);
			
			rs = pstmt.executeQuery();
//			System.out.println("rs : " + rs);
			
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setMgr(rs.getInt(4));
				vo.setDate(rs.getString(5));
				vo.setSal(rs.getInt(6));
				vo.setComm(rs.getInt(7));
				vo.setDeptno(rs.getInt(8));
//				System.out.println(vo);
				list.add(vo);
//				System.out.print(rs.getString(1) + "\t");
//				System.out.print(rs.getString(2)+ "\t");
//				System.out.print(rs.getString(3)+ "\t");
//				System.out.print(rs.getString(4)+ "\t");
//				System.out.print(rs.getString(5)+ "\t");
//				System.out.print(rs.getString(6)+ "\t");
//				System.out.print(rs.getString(7)+ "\t");
//				System.out.print(rs.getString(8));
//				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
}

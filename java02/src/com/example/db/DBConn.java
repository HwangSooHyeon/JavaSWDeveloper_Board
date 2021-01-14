package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.example.vo.CustomerVO;

public class DBConn {
	
	// ctrl+shift+o로 import
	private Connection conn = null;

	// 생성자를 호출하면 DB에 접속까지 구현
	public DBConn() {
		
		try {
			// 1. 드라이브 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. DB접속
			conn = DriverManager.getConnection("jdbc:oracle:thin:@1.234.5.158:11521:xe", "id18", "pw18");
			
			// 3. autocommit 설정 해제
			conn.setAutoCommit(false);
			
			// 4. 오류가 발생되지 않으면 아래가 수행됨
			System.out.println("db에 접속되었습니다.");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// DB문은 미리 try/catch를 쓰고 작성해야함
	// 서버가 정상적으로 동작하고 있지 않을 수가 있기 때문(환경적인 요소)
	public int insertCustomer(CustomerVO obj) throws SQLException{
		try {
			String sql = "INSERT INTO CUSTOMERTBL(CST_ID, CST_NAME, CST_AGE, CST_DATE)"+
						 " VALUES(?, ?, ?, CURRENT_DATE)";
			
			// 위 물음표에 해당하는 값을 넣는 과정
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, obj.getId());
			pstmt.setString(2, obj.getName());
			pstmt.setInt(3, obj.getAge());
			
			// INSERT, UPDATE, DELETE SQL 문에서 사용함
			// executeUpdate는 int형을 반환하므로 result로 받아옴
			// (몇개의 statement가 성공했는지 알려줌, 0 or 1이상)
			int result = pstmt.executeUpdate();
			conn.commit();
			return result;
			
		}catch(Exception e){
			e.printStackTrace();
			conn.rollback();
			return 0;
		}
		
	}
	
	// 고객 정보 수정 (고객아이디, 고객이름, 나이, 가입일자(바꿀 수 없음))
	public int updateCustomer(CustomerVO obj) throws SQLException {
		try {
			String sql = "UPDATE CUSTOMERTBL SET CST_NAME=?, CST_AGE=?"+
						 " WHERE CST_ID=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, obj.getName());
			pstmt.setInt(2, obj.getAge());
			pstmt.setString(3, obj.getId());
			
			int result = pstmt.executeUpdate();
			conn.commit();
			return result;
			
		}catch(Exception e) {
			e.printStackTrace();
			conn.rollback();
			return 0;
		}
	}
	
	// 고객 정보 삭제 (고객 아이디가 일치하는 것 삭제)
	public int deleteCustomer(CustomerVO obj) throws SQLException {
		try {
			String sql = "DELETE FROM CUSTOMERTBL WHERE CST_ID=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, obj.getId());
			
			int result = pstmt.executeUpdate();
			conn.commit();
			return result;
			
		}catch(Exception e) {
			e.printStackTrace();
			conn.rollback();
			return 0;
		}
		
	}
	
	// 고객 목록
	// int[] a = {1,2,3,4};
	public ArrayList<CustomerVO> selectCustomer() {
		try {
			String sql = "SELECT * FROM CUSTOMERTBL";
			Statement pstmt = conn.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			// int result = pstmt.executeUpdate(); // INSERT UPDATE DELETE
			ResultSet rs = pstmt.executeQuery(sql);   // SELECT
			
			// 고객 정보를 리스트로 보관할 변수
			ArrayList<CustomerVO> customerList = new ArrayList<CustomerVO>();
			
			while(rs.next()) {	// 1줄 씩 가져옴
				// rs에서 가져온 값을 customerVO객체로 만듦
				CustomerVO obj = new CustomerVO(
						rs.getString("CST_ID"),
						rs.getString("CST_NAME"),
						rs.getInt("CST_AGE"),
						rs.getString("CST_DATE"));
				
				// 배열에 추가함
				customerList.add(obj);
			}
			return customerList;			
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

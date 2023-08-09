package ex05_select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import connect.DB_Connect;
import dto.UserDto;

public class Ex01_selectOne {

  // select 결과 행이 1개(0개)인 경우
  public static void main(String[] args) {
    
    // 조회할 사용자 번호(USER_NO) 입력
    Scanner sc = new Scanner(System.in);
    System.out.print("조회할 USER_NO >>> ");
    int user_no = sc.nextInt();
    sc.close();
    
    // Connection 객체 선언
    Connection con = null;
    
    // PreparedStatement 객체 선언
    PreparedStatement ps = null;
    
    // ResultSet 객체 선언 (검색 결과 처리)
    ResultSet rs = null;
    
    try {
      con = DB_Connect.getConnection();
      String sql = "";
      sql += "SELECT USER_NO, USER_ID, USER_NAME, JOINED_AT";
      sql += "  FROM USER_T";
      sql += " WHERE USER_NO = ?";
      
      // PreparedStatement 객체 생성
      ps = con.prepareStatement(sql);
      
      // 쿼리문에 변수 넣기
      ps.setInt(1, user_no);
      
      // 쿼리문 실행
      rs = ps.executeQuery();
      
      // 검색 결과를 저장할 UserDto 객체 선언
      UserDto user = null;
      // 검색 결과 행이 1개인 경우 if로 체크
      if(rs.next()) {
        
        // 검색 결과 행 -> UserDto  객체 생성  (가공)
        user = new UserDto();
        user.setUser_no(rs.getInt("USER_NO"));
        user.setUser_id(rs.getString("USER_ID"));
        user.setUser_name(rs.getString("USER_NAME"));
        user.setJoined_at(rs.getDate("JOINED_AT"));
        
      }
      
      System.out.println(user);
      
    }catch(Exception e) {
      e.printStackTrace();
    }finally {
      try {
        if(rs != null) rs.close();
        if(ps != null) ps.close();
        if(con != null) con.close();
      }catch(Exception e) {
        e.printStackTrace();
      }
    }
    
  }

}
